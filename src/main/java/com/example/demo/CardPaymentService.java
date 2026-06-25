package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CardPaymentService implements TransactionService {
    @Override
    public void processTransaction(double amount){

        System.out.println("Card Payment completed: " + amount);
   }
}
