/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.demo;

/**
 *
 * @author kmhasan
 */
public class BankAccount {

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    private int accountNumber;
    private String accountName;
    private String address;
    private double balance;
    private static int totalAccounts;

    
    public BankAccount(int accountNumber, String accountName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.address = address;
        this.balance = balance;
        totalAccounts++;
    }

    public BankAccount(String accountName, String address, double balance) {
        this.accountNumber = totalAccounts + 1;
        this.accountName = accountName;
        this.address = address;
        this.balance = balance;
        totalAccounts++;
    }

    public int getAccountNumber() {
        return accountNumber;
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

    public String toString() {
        return accountNumber + ": " + accountName;
        /*
        return "accountNumber:" + accountNumber + "\n"
                + "accountName:" + accountName + "\n"
                + "address:" + address.replaceAll("\n", ";") + "\n"
                + "balance:" + balance;
         */
    }

    public String getAllData() {
        return "accountNumber:" + accountNumber + "\n"
                + "accountName:" + accountName + "\n"
                + "address:" + address.replaceAll("\n", ";") + "\n"
                + "balance:" + balance;
    }

    public void withdraw(int amount) {

    }

    public void deposit(int amount) {

    }
}
