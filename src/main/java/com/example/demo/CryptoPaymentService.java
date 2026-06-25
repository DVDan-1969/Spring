package com.example.demo;

public class CryptoPaymentService implements TransactionService{
    @Override
    public void processTransaction(double amount) {
        System.out.println("Crypto payment completed: " + amount);
    }
}
