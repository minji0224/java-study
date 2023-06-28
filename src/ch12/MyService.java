package ch12;

public class MyService extends Thread {
    private String name;
    public MyService(String name) {
        this.name = name;
    }

    // Thread 클래스를 상속 받고, run 메서드를 구현하면
    // tun메서드가 실행될 때 추가적인 스레드가 생성된다.
    // 아래 메서드는 60회 출력하고 1초(1000ms)마다 멈추는 것
    @Override
    public void run() {
        for (int i = 1; i <= 60; i++) {
            System.out.println("스레드 : " + name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


//    랜덤으로 돌아가는 방법
//    public void run() {   // i <= (int) (Math.random() * 1000);
//        for (int i = 1; i <= (int) (Math.random() * 1000); i++) {
//            System.out.println("스레드 : " + name + ": " + i);
//            try {
//                Thread.sleep((int) (Math.random() * 1000));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }



    // 주석추가
}
