/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 10:49 AM - 5/9/2024
 **/
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("\nCircle normal border");
        circle.draw();
        System.out.println("\nCircle red border");
        redCircle.draw();
        System.out.println("\nRectangle red border");
        redRectangle.draw();
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle is drawing");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle is drawing");
    }
}
