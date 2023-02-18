package Thread;

public class Thread3 extends Thread{
    private ProduceConsume produceConsume;

    public Thread3(ProduceConsume produceConsume){
        this.produceConsume=produceConsume;
    }
    @Override
    public void run() {
        produceConsume.produce();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
