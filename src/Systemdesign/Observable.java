package Systemdesign;

public interface Observable {

     void add(int p);
     void remove(int p);

     void notifyobserver();
     void addObserver(Observer observer);

     void showObserver();
}
