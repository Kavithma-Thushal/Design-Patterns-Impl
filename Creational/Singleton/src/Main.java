/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 9:28 AM - 5/9/2024
 **/
public class Main {
    public static void main(String[] args) {
        SingletonObj instance1 = SingletonObj.getInstance();
        SingletonObj instance2 = SingletonObj.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}

class SingletonObj {

    // private static instance
    private static SingletonObj instance;

    // private constructor
    private SingletonObj() {
        System.out.println("Object is Created...!");
    }

    // public static method to get instance
    public static SingletonObj getInstance() {
        if (instance == null) {
            instance = new SingletonObj();
        }
        return instance;
    }
}
