/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 9:28 AM - 5/9/2024
 **/
public class Main {
    public static void main(String[] args) {
        SingletonObject instance1 = SingletonObject.getInstance();
        SingletonObject instance2 = SingletonObject.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}

class SingletonObject {
    // private static instance
    private static SingletonObject instance;

    // private constructor
    private SingletonObject() {
        System.out.println("Object created");
    }

    // public static method to get instance
    public static SingletonObject getInstance() {
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }
}
