package org.example.CW6.task2;

public abstract class Account {
    protected float balance; // завели счет для пополнения и снятие каких либо сумм
    protected abstract void deposit(float amount);

    protected abstract void withdraw(float amount);
}
