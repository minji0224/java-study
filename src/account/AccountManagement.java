package account;

import java.util.Scanner;

public class AccountManagement {
        private Account[] accountList;  // 계좌 목록 배열
        private int numAccounts;        // 계좌의 개수
        private Scanner scanner;        // 사용자 키보드 입력 객체

        // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
        public AccountManagement(int maxSize) {
            accountList = new Account[maxSize];  // (맥스사이즈)계좌 목록 배열을 생성한 것
            numAccounts = 0;                     // 현재 생성된 계좌의 개수
            scanner = new Scanner(System.in);    // 사용자 입력 객체 생성
        }

        public void addAccount(String accountNumber, double balance) {
            Account account = new Account(accountNumber, balance);   // 계좌번호와 초기 입금액을 입력 받고
            accountList[numAccounts] = account; // 계좌객체를 생성한 후 배열의 가장 처음 빈 공간을 추가한다.
            numAccounts++;

            /*
            선생님 풀이
            (매개변수) : 데이터타입에 있는 그 매개변수를 받는 것
            Account acc = new Account(매개변수);
            배열은 배열이 저장되는 그 크기를 증가시켜야되니까 필드에 개수 값을 만들고 배열값 증가 시긴다.
            accountList[numAccounts] = acc;
            sout(accountList[numAccounts] get.accountNumber);  실행되는지 확인
            numAccounts++;
             */
        }

        public void showAccountList() {
            for (Account show : accountList) {
                System.out.println("계좌번호: " + show.getAccountNumber() + ", " + "잔액: " + show.getBalance());
            }
            //향상된 for문에서 break;를 안쓰면 빈공간까지 계속 가기때문에 break를 넣어줘야됨.

            /*
            선생님 풀이 (첫번째 방법)
            for(Account acc : accountList {
              if(acc != null) {                                 // null이 아닐 경우를
              sout("계좌번호: " + acc.getAccountNumber() + ", " + "잔액: " + acc.getBalance())
              } else {                                          // null일 경우
              sout("계좌가 없습니다")
              break;
              }

              (두번째 방법)
              for (int i = 0; i < numAccounts ; 2++) {
               sout("계좌번호: " + accountList[i].getAccountNumber() + ", " + "잔액: " + accountList[i].getBalance())
               }
             */
        }

        // 입금
        public void deposit(String accountNumber, double amount) {
            Account account = findAccount(accountNumber);
            account.deposit(amount);
            // null일 경우 넣기
        }
        /*
        Account acc = findAccount(accountNumber);
        if (acc != null) {
        acc. deposit(amount);
        }
         */

        public void withdraw(String accountNumber, double amount) {
            Account account = findAccount(accountNumber);
            account.withdraw(amount);
            // null일 경우 넣기
            }

              /*
        Account acc = findAccount(accountNumber);
        if (acc != null) {
        acc.withdraw(amount);
        }
         */




        private Account findAccount(String accountNumber) { // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드
            Account findAccount = null;
            for (Account i : accountList) {
                if (i == null) {
                    break;
                } else if (i.getAccountNumber().equals(accountNumber)) {
                    findAccount = i;
                }
            }
            return findAccount;
        }
        /*
        선생님 풀이
        for (int i = 0; i < numAccounts ; 2++) {
          if(accountList[i].getAccountNumber().equals(accountNumber)) {
          return accountList[i];
        }
        } return null;
         */




        public void run() {
            while (true) {
                // UX, 기능목록 출력
                System.out.println("\n=== 계좌 관리 프로그램 ===");
                System.out.println("1. 계좌 추가");
                System.out.println("2. 계좌 목록 조회");
                System.out.println("3. 입금");
                System.out.println("4. 출금");
                System.out.println("0. 종료");
                System.out.print("원하는 기능을 선택하세요: ");


                // 메뉴번호 받기
                int choice = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 제거(엔터입력값 제거해주는 것)

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.print("계좌번호: ");
                        String accountNumber = scanner.nextLine();
                        System.out.print("잔액: ");
                        double balance = scanner.nextDouble();
                        scanner.nextLine(); // 개행 문자 제거
                        addAccount(accountNumber, balance);
                        break;
                    case 2:
                        showAccountList();
                        break;
                    case 3:
                        System.out.print("계좌번호: ");
                        accountNumber = scanner.nextLine();
                        System.out.print("입금액: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); // 개행 문자 제거
                        deposit(accountNumber, depositAmount);
                        break;
                    case 4:
                        System.out.print("계좌번호: ");
                        accountNumber = scanner.nextLine();
                        System.out.print("출금액: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); // 개행 문자 제거
                        withdraw(accountNumber, withdrawAmount);
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                        break;
                }
            }
        }
    }


