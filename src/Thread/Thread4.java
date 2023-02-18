package Thread;

public class Thread4 extends Thread{
    private ProduceConsume produceConsume;

    public Thread4(ProduceConsume produceConsume){
        this.produceConsume=produceConsume;
    }

    public void run(){
        produceConsume.consume();
    }
}
