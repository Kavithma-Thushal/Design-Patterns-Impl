/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 11:30 AM - 5/9/2024
 **/
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdder());
        System.out.println(context.executeStrategy(20, 10));

        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(20, 10));
    }
}

interface Strategy {
    public int deOperation(int num1, int num2);
}

class OperationAdder implements Strategy {

    @Override
    public int deOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationSubstract implements Strategy {
    @Override
    public int deOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.deOperation(num1, num2);
    }
}