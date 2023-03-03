package ChainofResponsibility;

public class DebugHandler extends LogHandler{
    DebugHandler(LogHandler NextLogHandler) {
        super(NextLogHandler);
    }
    public void log(int level,String message){
        if(level==debug){
            System.out.println("Debug message is "+ message);
        }
        else {
            super.log(level,message);
        }
    }
}
