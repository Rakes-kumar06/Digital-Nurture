import React from 'react';

// The Login Button Component[cite: 7]
export function LoginButton(props) {
    return (
        <button onClick={props.onClick}>
            Login
        </button>
    );
}

// The Logout Button Component[cite: 7]
export function LogoutButton(props) {
    return (
        <button onClick={props.onClick}>
            Logout
        </button>
    );
}