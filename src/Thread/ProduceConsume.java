package Thread;

public class ProduceConsume {

    int n=0;
    synchronized public void produce(){
        n++;
        System.out.println("item "+n+" is produced ");
        notifyAll();
    }
    synchronized public void consume()  {
        if(n==0) {
            System.out.println("No item to consume");
            try{
                wait();
            }
            catch(Exception e){}
        }
        System.out.println("item  "+n +" is consumed");
//        n--;
    }
}
