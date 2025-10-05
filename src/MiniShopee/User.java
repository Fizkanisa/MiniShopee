/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniShopee;

/**
 *
 * @author zettopiaa
 */
public class User {
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }   
}
