package com.bankapp;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdvancedBankAccountTest {
    private BankAccount account;

    @Before
    public void setUp() {
        System.out.println("Executing @Before: Initializing fresh BankAccount object...");
        account = new BankAccount();
    }

    @After
    public void tearDown() {
        System.out.println("Executing @After: Cleaning up resources...\n");
        account = null; 
    }

    @Test
    public void testDepositUsingAAAPattern() {
        System.out.println("Running testDepositUsingAAAPattern...");
        
        int startingBalance = 500;
        int deposit = 250;
        int expectedResult = 750;

        int actualResult = account.addFunds(startingBalance, deposit);

        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testSmallDeposit() {
        System.out.println("Running testSmallDeposit...");
        
        int expected = 10;
        int actual = account.addFunds(5, 5);
        assertEquals(expected, actual);
    }
}
