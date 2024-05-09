/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 11:10 AM - 5/9/2024
 **/
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
