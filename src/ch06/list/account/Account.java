package ch06.list.account;

public class Account {
    private String accountNumber;   // 계좌번호
    private double balance;         // 잔액

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        if (amount > 0) {
            System.out.println(this.balance);
            System.out.println("입금액은 :" + amount + "원 입니다."
            + "\n 현재 잔액은 " + amount + "입니다.");
        }
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        if (balance >= amount) {
            System.out.println("출금액은 " + amount + "입니다."
            + "\n 현재 잔액은 " + balance + "원 입니다." );
            System.out.println(this.balance);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}


