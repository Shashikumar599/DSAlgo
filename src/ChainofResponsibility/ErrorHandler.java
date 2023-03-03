package ChainofResponsibility;

public class ErrorHandler extends LogHandler{
    ErrorHandler(LogHandler NextLogHandler) {
        super(NextLogHandler);
    }
    public void log(int level,String message){
        if(level==error){
            System.out.println("Error message "+message);
        }
        else
        {
            super.log(level,message);
        }
    }
}
