package Systemdesign;

public class AnotherMain {

    public static void main(String[] args){
        System.out.println("Second main function");

        Observable iphone=new Iphone(5);
        iphone.add(3);
        iphone.addObserver(new User("shashi"));
        iphone.addObserver(new User("toms"));
        iphone.addObserver(new User("abc"));
        iphone.addObserver(new User("def"));
        iphone.addObserver(new User("ghi"));
        iphone.addObserver(new User("klm"));

        iphone.remove(8);
//        iphone.showObserver();

        iphone.add(3);
    }
}
