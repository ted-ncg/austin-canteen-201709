package com.visa.ncg.canteen;

public class Account {

  private int balance = 0;

  public void deposit(int amount) {
    balance += amount;
  }

  public void withdraw(int amount) {
    balance -= amount;
  }

  public int balance() {
    return balance;
  }
}
