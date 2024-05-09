/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 11:10 AM - 5/9/2024
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color changed to red");
    }
}
