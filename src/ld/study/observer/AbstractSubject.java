package ld.study.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{
    private Vector<Observer> vector  = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumes = vector.elements();
        while(enumes.hasMoreElements()){
            enumes.nextElement().update();
        }
    }

}
