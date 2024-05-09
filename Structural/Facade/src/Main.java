/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 10:24 AM - 5/9/2024
 **/
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
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

class ShapeMaker {

    private Shape circle;
    private Shape rectangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}