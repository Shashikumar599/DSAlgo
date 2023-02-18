package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread1 extends Thread{
    String task;
    public Thread1(String s){
        super(s);
        task=s;
    }

    @Override
    public void run() {

        SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
        for(int i=0;i<5;i++) {
            Date dt = new Date();
            System.out.println(task +" is running time is  "+ sdf.format(dt));
            try{
            Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            };
//            System.out.println(Thread.currentThread().getName()+" is complete time is  "+ sdf.format(dt));
        }
        Date dt = new Date();
        System.out.println("\n"+task+" is complete time is  "+ sdf.format(dt));
    }
}
