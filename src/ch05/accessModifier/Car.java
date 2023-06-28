package ch05.accessModifier;

//  protected랑 private 차이점
// 프라이빗은 해당 클래스 내에서 밖에 못씀

// 차량 정보
public class Car {

    // 다른 클래스에서는 매서드로만 접근한다.
    // public 매서드 ( public 어떤 클래스에서도 접근 가능하다)
    public void startEngine() {
        BankAccount account = new BankAccount();

        // account.deductFounds : 다른 클래스에서 접근 불가능함(pirvate 매서드이기 때문에)

        Animal animal = new Animal();
        animal.eat();// protected 매서드임
        // de) CourseService 클래스에 쓸 수 없음

        System.out.println("Engine started!");
    }
}
