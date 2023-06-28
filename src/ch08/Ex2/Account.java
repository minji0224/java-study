package ch08.Ex2;

public class Account implements Taxable, Bankable {
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

    @Override
    public double calculateTax() {
        return balance * 0.1;
    }

    @Override
    public void deposit(double amount) {
        this.balance = amount + balance;
        if (amount > 0) { // 어마운트가 추가 되면)
            System.out.println("입금액은 " + amount + "입니다." + "\n 현재 잔액은 " +
                    getBalance() + "입니다.");
        }
    }

    @Override
    public void withdraw(double amount) {
        this.balance = balance - amount;
        if (amount <= balance) {
            System.out.println("출금액은 " + amount + "입니다." + "\n 현재 잔액은 " +
                    getBalance() + "입니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}



