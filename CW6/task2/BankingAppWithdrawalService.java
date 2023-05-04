package org.example.CW6.task2;

public class BankingAppWithdrawalService {
    private NewClass account; // все классы наследующиеся от account будут выполняться

    public BankingAppWithdrawalService(NewClass account) {
        this.account = account;
    }

    public void withdraw(float amount) {
        account.withdraw( amount );
    }
}
