package com.cognizant.spring_learn.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    private static final String JWT_SECRET = "my_ultra_secure_secret_key_32_characters_long!";

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader(value = "Authorization", required = false) String authHeader) {
        LOGGER.info("Start of authentication request");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or Invalid Authorization Header");
        }

        String base64Credentials = authHeader.substring(6);
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);

        String[] values = credentials.split(":", 2);
        String username = values[0];
        String password = values[1];

        LOGGER.debug("Attempting authentication for user: {}", username);

        if ("user".equals(username) && "pwd".equals(password)) {
            String jwtToken = generateJwtToken(username);

            Map<String, String> response = new HashMap<>();
            response.put("token", jwtToken);

            LOGGER.info("Authentication successful. Token generated.");
            return response;
        } else {
            throw new RuntimeException("Unauthorized: Invalid username or password");
        }
    }

    private String generateJwtToken(String username) {
        try {
            String header = "{\"alg\":\"HS256\",\"typ\":\"JWT\"}";

            long now = System.currentTimeMillis() / 1000;
            long exp = now + 1200;
            String payload = "{\"sub\":\"" + username + "\",\"iat\":" + now + ",\"exp\":" + exp + "}";

            String encodedHeader = Base64.getUrlEncoder().withoutPadding().encodeToString(header.getBytes(StandardCharsets.UTF_8));
            String encodedPayload = Base64.getUrlEncoder().withoutPadding().encodeToString(payload.getBytes(StandardCharsets.UTF_8));

            String signatureInput = encodedHeader + "." + encodedPayload;

            Mac sha256HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKey = new SecretKeySpec(JWT_SECRET.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
            sha256HMAC.init(secretKey);

            byte[] rawSignature = sha256HMAC.doFinal(signatureInput.getBytes(StandardCharsets.UTF_8));
            String encodedSignature = Base64.getUrlEncoder().withoutPadding().encodeToString(rawSignature);

            return signatureInput + "." + encodedSignature;
        } catch (Exception e) {
            throw new RuntimeException("Failed while constructing security signatures", e);
        }
    }
}