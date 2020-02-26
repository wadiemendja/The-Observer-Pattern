package observer;

import java.util.ArrayList;

public  class subject implements ISubject {

    private int flag;
    ArrayList<Observer> observers = new ArrayList();

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        for (int i = 0; i < observers.size(); i++) {
            notifyOb(observers.get(i));
        }
    }

    @Override
    public void register(Observer x) {
        observers.add(x);
    }

    @Override
    public void unregister(Observer x) {
        observers.remove(x);
    }

    @Override
    public void notifyOb(Observer x) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }
}
