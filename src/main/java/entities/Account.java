/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import model.exceptions.DomainExceptions;


public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainExceptions {
        if(balance == 0){
            throw new DomainExceptions("The initial balance can not be zero");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    
    public void deposit(Double amount){
        balance += amount;
    }
    
    public void withdraw(Double amount)throws DomainExceptions{
        if(amount > balance ){
            throw new DomainExceptions("Not enough balance.");
        }
        if(amount > withdrawLimit){
            throw new DomainExceptions("The amount exceeds the withdraw limit.");
        }
        if(balance == 0){
            throw new DomainExceptions("Empty Account!");
        }
        
        balance -= amount;
    }
    
    
}
