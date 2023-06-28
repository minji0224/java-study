package ch05.singleton;

public class Main {
    public static void main(String[] args) {
      //  Singleton s1 = new Singleton();   // private 생성자라 객체 생성이 안됨.


        // staic으로만 쓸 때와 다른 점은
        // 우리가 필요한 시점에 생성할 수 있음.
      // getInstance() 메서드로 생성하기
//        Singleton s1 = Singleton.getInstance(); // 이때 객체생성이 되고
//        Singleton s2 = Singleton.getInstance(); // 이전 생성된 것을 반환하는 것
//        Singleton s3 = Singleton.getInstance(); // 이전 생성된 것을 반환하는 것
//        System.out.println(s1);  // ch05.singleton.Singleton@682a0b20
//        System.out.println(s2);  // ch05.singleton.Singleton@682a0b20
//        System.out.println(s3);  // ch05.singleton.Singleton@682a0b20
//        int[] arr = {1,2, 3, 4, 5,};
//        s1.multiply(arr);
//        s2.multiply(arr);

        Test1 t1 = new Test1();        // 여기서도 싱글턴 쓰고 있고
        t1.test();

        Test2 t2 = new Test2();        // 여기서도 싱글턴 쓰고 있는데
        t2.test();

        // 객체는 1회만 생성되어 있음.
    }
}
