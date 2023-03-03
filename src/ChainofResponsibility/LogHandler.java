package ChainofResponsibility;

public abstract class LogHandler {
    public static int info=1;
    public static int debug=2;
    public static int error=3;
    LogHandler NextLogHandler;

    LogHandler(LogHandler NextLogHandler){
        this.NextLogHandler=NextLogHandler;
    }
    public void log(int level,String message){
        if(NextLogHandler!=null){
            NextLogHandler.log(level,message);
        }
    }
}
