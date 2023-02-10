import HashMapp.MyHashmap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyHashmap<Integer,String> map=new MyHashmap();
        map.add(1,"Shashi");
        map.add(2,"Prateek");
        map.add(3,"tomo");
        map.add(4,"viju");
        System.out.println(map.getValue(3));
        System.out.println(map.getValue(4));


        map.remove(3);
        if(map.getValue(3)==null){
            System.out.println("Key ,value deletd succesfully");
        }
    }
}