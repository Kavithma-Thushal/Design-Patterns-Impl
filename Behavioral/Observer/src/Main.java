import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Design-Patterns-Impl
 * @since : 11:54 AM - 5/9/2024
 **/
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);

        System.out.println("State : 10");
        subject.setState(10);
        System.out.println("State : 5");
        subject.setState(5);
    }
}

abstract class Observer {

    public Subject subject;

    public abstract void update();
}

class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary : " + subject.getState());
    }
}

class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa : " + Integer.toString(subject.getState()).toUpperCase());
    }
}
