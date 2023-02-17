import HashMapp.MyHashmap;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyHashmap<Integer,String> map=new MyHashmap();

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
        System.out.println(map.getValue(-4));


    }
}