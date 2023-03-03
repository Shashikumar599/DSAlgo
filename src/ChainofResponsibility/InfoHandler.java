package ChainofResponsibility;

public class InfoHandler extends LogHandler{
    InfoHandler(LogHandler NextLogHandler) {
        super(NextLogHandler);
    }
    public void log(int level,String message){
        if(level==info){
            System.out.println("Info"+message);
        }
        else {
            super.log(level,message);
        }
    }
}
