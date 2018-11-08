/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import account.BankAccount;
import account.BankAccount;

/**
 *
 * @author kmhasan
 */
public class CurrentAccount2 extends BankAccount {
    
    public CurrentAccount2(long accountId, String accountName, String address, double balance) {
        super(accountId, accountName, address, balance);
    }
    
    @Override
    public boolean withdraw(long amount) {
        if (amount + 15 <= balance && amount > 0) {
            balance = balance - amount - 15;
            return true;
        } else {
            System.err.printf("You do not have sufficient balance\n");
            return false;
        }        
    }
}
