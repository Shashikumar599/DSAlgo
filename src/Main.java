import HashMapp.MyHashmap;
import Thread.*;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");


//        Thread b=new Thread(new Thread2());
//        a.start();

        Thread A=new Thread1("A");
        Thread B=new Thread1("B");
        Thread C=new Thread1("C");
        Thread D=new Thread1("D");
//        System.out.println(A.getName());

        ExecutorService pl = Executors.newFixedThreadPool(10);

        ProduceConsume produceConsume=new ProduceConsume();
        Thread a=new Thread3(produceConsume);
        Thread b=new Thread4(produceConsume);

        for(int i=0;i<10;i++){
            if(i%2==0)
            pl.execute(a);
            else
                pl.execute(b);
        }





//        System.out.println(Thread.currentThread().getName());
//        pl.execute(A);
//        pl.execute(B);
//        pl.execute(C);
//        pl.execute(D);


        pl.shutdown();
//        ExecutorService pl1 = Executors.newFixedThreadPool(3);
//        pl1.execute(A);
//        pl1.execute(B);
//        pl1.execute(C);
//        pl1.execute(D);
//        pl1.shutdown();
//        a.join();
//        b.start()
//
//        ;
//        System.out.println(Thread.currentThread().getName());


       /* MyHashmap<Integer,String> map=new MyHashmap();

        map.add(1,"Shashi");
        map.add(2,"Prateek");
        map.add(3,"tomo");
        map.add(4,"viju");
        map.add(-4,"frost");
        map.add(-1,"Shashi");
        map.add(-2,"Prateek");
        map.add(-3,"tomo");
        map.add(-4,"viju");
        map.add(-5,"frost");
        map.add(10,"Shashi");
        map.add(20,"Prateek");
        map.add(30,"tomo");
        map.add(40,"viju");
        map.add(-40,"frost");
        map.add(-10,"Shashi");
        map.add(-20,"Prateek");
        map.add(-30,"tomo");
        map.add(-40,"viju");
        map.add(-50,"frost");
        System.out.println(map.getValue(1));
        System.out.println(map.getValue(2));
        System.out.println(map.getValue(3));
        System.out.println(map.getValue(4));
        System.out.println(map.getValue(-4));

//        Iterator iterator=map.


        map.remove(3);
        map.remove(4);
        map.remove(-4);
        if(map.getValue(3)==null){
            System.out.println("Key ,value deletd succesfully");
        }

        System.out.println(map.getValue(1));
        System.out.println(map.getValue(2));
        System.out.println(map.getValue(3));
        System.out.println(map.getValue(4));
        System.out.println(map.getValue(-40));
        System.out.println(map.getValue(10));
        System.out.println(map.getValue(20));
        System.out.println(map.getValue(30));
        System.out.println(map.getValue(40));
        System.out.println(map.getValue(-4));*/


    }
}