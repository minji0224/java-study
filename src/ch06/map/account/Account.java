package ch06.map.account;

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
    void  setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // 계좌 객체에 잔액 증가(입금)
    public void deposit(double amount) {
        this.balance =  balance + amount;
        if (amount > 0) {
            System.out.println(this.balance);
            System.out.println("입금액은 :" + amount + "원 입니다."
            + "\n 현재 잔액은 " + amount + "입니다.");
        }
    }
    /*
    this.balance += amout;
     */




    // 계좌 객체에 잔액 차감(출금)
    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance = balance - amount;
            System.out.println("출금액은 " + amount + "입니다."
            + "\n 현재 잔액은 " + balance + "원 입니다." );
            System.out.println(this.balance);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}


