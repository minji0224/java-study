package ch05.accessModifier;

public class BankAccount {
    private int balance;  // private 필드 ( 어떤 데이터가 있는지 공개하지 않겠다)


    //private 매ㅓ드
    // 클래스 만든 사람만 가져다 쓸라고 만든 것.
    private void deductFunds(int amount) {
        if (amount <= balance) {
            balance = amount;
        } else {
            // insfficient : 불충분
            System.out.println("Insufficient Funds!");
        }
    }
}
