package ch05;

public class Utils {
//    // 05. 클래스-연습문제-02.메서드 5개를 작성
//    // 문제 1 : 두 개의 정수를 매개변수로 받아서, 그 합을 반환하는 sum이라는 이름의 메서드를 작성하세요.
//    /*
//    1. 매서드니 public 깔고
//    2. sum이라는 이름 넣고 int sum
//    3. 매개변수의 이름 넣고 a
//    4. 매개변수의 타입을 넣고 int a
//    5. 합을 넣는 변수 만들고
//    6. 반환하기(return)
//    6. 반환값이 정수기때문에 public int 쓰기.
//     */
//    public int sum(int num1, int num2){
//        int value = num1 + num2;
//        System.out.println("결과는 " + value + "입니다");
//        return value;
//    }
//
//    // 문제 3: 정수 배열을 매개변수로 받아서 배열의 모든 요소를 더한 값을 반환하는 메서드를 작성하세요.
//    // 요소 (어레이 Arr)
//    // 배열: int[] arr = new int[5];     // int[] arr(값 안정하고 선언만 우선 한 것)
//    // 배열: 타입에 저장할 수 있는 갯수를 지정하는 것
//    public int sumArr(int[] arr) {
//        int sum = 0;
//        for(int val : arr){
//            // 누산(accumulation)
//            sum = sum + val;
//            // sum += val; 이거랑 같은것
//        }
//        return sum;
//        // 반환될 sum은 정수값이기 때문에 pubilc int로 씀(값이 커지면 long으로 대체)
//    }

    private String name;

    private int age;

    private String mailAdress;


    public Utils(String name, int age, String mailAdress) {
        this.name = name;
        this.age = age;
        this.mailAdress = mailAdress;
    }

    public void displayStudentDetails() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일 주소: " + mailAdress);
    }

    public void ageUp() {
        age++;
    }

    public void setmailAdress (String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public String getmailAdress () {
        return mailAdress;
    }



    }

