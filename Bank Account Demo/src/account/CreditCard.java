/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author kmhasan
 */
public class CreditCard {

    private long accountId;
    private String accountName;
    private String address;
    private double balance;
    private double creditLimit;

    public CreditCard(long accountId, String accountName, String address, double creditLimit) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.address = address;
        this.balance = 0;
        this.creditLimit = creditLimit;
    }

    public boolean withdraw(long amount) {
        if (amount <= creditLimit + balance && amount > 0) {
            balance = balance - amount;
            return true;
        } else {
            System.err.printf("You do not have sufficient balance\n");
            return false;            
        }
    }

    public boolean deposit(long amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            System.err.println("Depositing negative amount is not allowed\n");
            return false;
        }
    }

    public void print() {
        System.out.printf("Id: %d Name: %s Balance: %.2f\n", accountId, accountName, balance);
    }

    public long getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
