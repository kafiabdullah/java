/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.demo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author kmhasan
 */
public class Transaction {
    private BankAccount bankAccount;
    private TransactionType transactionType;
    private LocalDate transactionDate;
    private LocalTime transactionTime;
    private double amount;

    public Transaction(BankAccount bankAccount, TransactionType transactionType, LocalDate transactionDate, LocalTime transactionTime, double amount) {
        this.bankAccount = bankAccount;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.amount = amount;
    }

    public String getAllData() {
        return bankAccount.getAccountNumber() + ";" +
                transactionType.toString() + ";" +
                transactionDate.toString() + ";" +
                transactionTime.toString() + ";" + 
                amount;
    }
}
