/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.account.demo;

import account.CurrentAccount2;
import account.CurrentAccount;
import account.CreditCard;
import account.BankAccount;

/**
 *
 * @author kmhasan
 */
public class BankAccountDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(2331, "Rajon Bardhan", "Moghbazar", 5000);
        BankAccount b2 = new BankAccount(6587, "Md. Ashiqur Rahman", "Notun Bazaar", 6000);
        CurrentAccount b3 = new CurrentAccount(8741, "Md. Hasan Tareque", "Shantinagar", 1000);
        CreditCard b4 = new CreditCard(4200, "Md. Rakibul Hasan", "Uttara", 50000);
        CurrentAccount2 b5 = new CurrentAccount2(5568, "Sadman Sakib", "Dhanmondi", 5000);
        
        b1.deposit(5000);
        b1.withdraw(1000);
        
        b2.deposit(5000);
        b2.withdraw(10000);
        
        b3.deposit(1000);
        b3.withdraw(500);
        
        b4.withdraw(500);
        b4.withdraw(10000);
        b4.withdraw(20000);
        b4.deposit(500);
        b4.withdraw(20000);
        
        b5.withdraw(1000);
        
        b1.print();
        b2.print();
        b3.print();
        b4.print();
        b5.print();
    }
    
}
