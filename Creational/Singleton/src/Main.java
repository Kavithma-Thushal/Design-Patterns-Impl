/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 9:28 AM - 5/9/2024
 **/
public class Main {
    public static void main(String[] args) {
        SingletonObj instance1 = SingletonObj.getSingletonOjb();
        SingletonObj instance2 = SingletonObj.getSingletonOjb();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}

class SingletonObj {

    // private static instance
    private static SingletonObj singletonObj;

    // private constructor
    private SingletonObj() {
        System.out.println("Object Created");
    }

    // public static method to get instance
    public static SingletonObj getSingletonOjb() {
        if (singletonObj == null) {
            singletonObj = new SingletonObj();
        }
        return singletonObj;
    }
}
