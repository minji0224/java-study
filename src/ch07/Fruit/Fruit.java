package ch07.Fruit;

public class Fruit {

    public String getColor() {
        return "";
    }


    public void showFruit() {
        System.out.println("과일의 색깔은 " + getColor());
    }
}

class Apple extends Fruit {
    @Override
    public String getColor(){
        return "Red";
    }

    @Override
    public void showFruit() {
        super.showFruit();
        System.out.println("과일의 이름은 사과였답니다~");
    }
}

class Banana extends Fruit {
    @Override
    public String getColor(){
        return "Yellow";
    }

    @Override
    public void showFruit() {
        super.showFruit();
        System.out.println("과일의 이름은 바나나였답니다~");
    }
}




