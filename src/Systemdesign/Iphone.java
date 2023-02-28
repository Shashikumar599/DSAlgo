package Systemdesign;

import java.util.ArrayList;

public class Iphone implements Observable {

    ArrayList<Observer> Observers;
    int stock;

    public Iphone(){
        Observers=new ArrayList<>();
    }
    public Iphone(int stock){
        Observers=new ArrayList<>();
        this.stock=stock;
    }
    @Override
    public void add(int p) {
        if(stock==0)
            notifyobserver();
        stock+=p;
        System.out.println("No of Iphone present "+stock);
    }

    @Override
    public void remove(int p) {
        stock-=p;
        stock=Math.max(stock,0);
        System.out.println("No of Iphone present "+stock);
    }

    @Override
    public void notifyobserver() {
            for(Observer observer:Observers){
                observer.notifyme();
            }
    }

    @Override
    public void addObserver(Observer observer) {
        Observers.add(observer);
    }

    @Override
    public void showObserver() {
        for (Observer observer:Observers){
            System.out.print(observer.toString() +" ");
        }
        System.out.println();
    }
}
