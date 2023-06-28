package ch06.list.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagement {

    // ArrayList 변경
    private List<Account> accountList;  // 계좌 목록 리스트
    private Scanner scanner;        // 사용자 키보드 입력 객체


    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement() {
        accountList = new ArrayList<Account>();  // 계좌목록 리스트생성한 것
        scanner = new Scanner(System.in);    // 사용자 입력 객체 생성
    }
}

//        public void addAccount(String accountNumber, double balance) {
//            Account acc = new Account(accountNumber, balance)
//            accountList.add(acc); // 계좌객체를 생성한 후 배열의 가장 처음 빈 공간을 추가한다.
//        }
//
//        public void showAccountList() {
//            for (Account acc : accountList) {
//                if(acc.getAccountNumber().equals(accountNumber)){
//                System.out.println("계좌번호: " + acc.getAccountNumber() + ", " + "잔액: " + acc.getBalance());
//            }
//        }
////
//
//        // 입금
//        public void deposit(String accountNumber, double amount) {
//            Account account = findAccount(accountNumber);
//            account.deposit(amount);
//            // null일 경우 넣기
//        }
//        /*
//        Account acc = findAccount(accountNumber);
//        if (acc != null) {
//        acc. deposit(amount);
//        }
//         */
//
//        public void withdraw(String accountNumber, double amount) {
//            Account account = findAccount(accountNumber);
//            account.withdraw(amount);
//            // null일 경우 넣기
//            }
//
//              /*
//        Account acc = findAccount(accountNumber);
//        if (acc != null) {
//        acc.withdraw(amount);
//        }
//         */
//
//
//
//
//        private Account findAccount(Account accountList) { // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드
//            for (Account account : accountList) {
//                if (account = account.getAccountNumber()) {
//                    break;
//                } else if (i.getAccountNumber().equals(accountList)) {
//                    findAccount = i;
//                }
//            }
//            return findAccount;
//        }
//        /*
//        선생님 풀이
//        for (int i = 0; i < numAccounts ; 2++) {
//          if(accountList[i].getAccountNumber().equals(accountNumber)) {
//          return accountList[i];
//        }
//        } return null;
//         */
//
//
//
//
//        public void run() {
//            while (true) {
//                // UX, 기능목록 출력
//                System.out.println("\n=== 계좌 관리 프로그램 ===");
//                System.out.println("1. 계좌 추가");
//                System.out.println("2. 계좌 목록 조회");
//                System.out.println("3. 입금");
//                System.out.println("4. 출금");
//                System.out.println("0. 종료");
//                System.out.print("원하는 기능을 선택하세요: ");
//
//
//                // 메뉴번호 받기
//                int choice = scanner.nextInt();
//                scanner.nextLine(); // 개행 문자 제거(엔터입력값 제거해주는 것)
//
//                if (choice == 0) {
//                    System.out.println("프로그램을 종료합니다.");
//                    break;
//                }
//
//                switch (choice) {
//                    case 1:
//                        System.out.print("계좌번호: ");
//                        String accountNumber = scanner.nextLine();
//                        System.out.print("잔액: ");
//                        double balance = scanner.nextDouble();
//                        scanner.nextLine(); // 개행 문자 제거
//                        addAccount(accountNumber, balance);
//                        break;
//                    case 2:
//                        showAccountList();
//                        break;
//                    case 3:
//                        System.out.print("계좌번호: ");
//                        accountNumber = scanner.nextLine();
//                        System.out.print("입금액: ");
//                        double depositAmount = scanner.nextDouble();
//                        scanner.nextLine(); // 개행 문자 제거
//                        deposit(accountNumber, depositAmount);
//                        break;
//                    case 4:
//                        System.out.print("계좌번호: ");
//                        accountNumber = scanner.nextLine();
//                        System.out.print("출금액: ");
//                        double withdrawAmount = scanner.nextDouble();
//                        scanner.nextLine(); // 개행 문자 제거
//                        withdraw(accountNumber, withdrawAmount);
//                        break;
//                    default:
//                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
//                        break;
//                }
//            }
//        }
//    }


