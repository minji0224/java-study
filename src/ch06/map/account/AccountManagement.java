package ch06.map.account;

import java.util.*;

public class AccountManagement {

    // ArrayList 변경
    private Map<String, Account> accounts;  // 계좌 목록 리스트
    private Scanner scanner;        // 사용자 키보드 입력 객체


    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement() {
        accounts = new HashMap<>();  // 계좌목록 맵 생성
        scanner = new Scanner(System.in);    // 사용자 입력 객체 생성
    }


    public void addAccount(String accountNumber, double balance) {
        Account acc = new Account(accountNumber, balance);
        accounts.put(accountNumber, acc);   // 계좌 추가
    }

//    public void showAccountsList() {
//        // 출력할 때는 해시맵 -> 트리맵으로 변환한 다음에 값 목록 가져와서 출력
//        for (Account acc : new TreeMap<>(accounts.values())) {
//            if (acc.getAccountNumber().equals(acc.getAccountNumber())) {
//                System.out.println("계좌번호: " + acc.getAccountNumber() + ", " + "잔액: " + acc.getBalance());
//            }
//        }
//    }
//
//        public void deposit(String accountNumber, double amount) {
//            Account acc = findAccount(accountNumber);
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
//        private Account findAccount(Account accounts) { // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드
//            for (Account account : accounts) {
//                if (account = account.getAccountNumber()) {
//                    break;
//                } else if (i.getAccountNumber().equals(accounts)) {
//                    findAccount = i;
//                }
//            }
//            return findAccount;
//        }
//        /*
//        선생님 풀이
//        for (int i = 0; i < numAccounts ; 2++) {
//          if(accounts[i].getAccountNumber().equals(accountNumber)) {
//          return accounts[i];
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
//                        showaccounts();
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
////    }

    }





