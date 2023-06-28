package ch05.singleton;

import ch05.singleton.Singleton;

public class Test1 {
    public void test() {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(s1.multiply(arr));
    }
}