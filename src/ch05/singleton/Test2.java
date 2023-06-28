package ch05.singleton;

import ch05.singleton.Singleton;

public class Test2 {
    public void test(){
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);

        System.out.println(s2.multiply(1,2));
    }
}
