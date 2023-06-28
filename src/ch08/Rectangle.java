package ch08;


// 인터페이스 여러개 사용 가능 implements 뒤에 붙이기
// 항상 인터페이스 사용하면 구현해줘야 됨.
public class Rectangle implements Shape , Drawable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return  width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void drawLines() {

    }
}
