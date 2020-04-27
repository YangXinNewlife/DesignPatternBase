package observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @author yangxin_ryan
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int State;

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
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
