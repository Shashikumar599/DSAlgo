package ChainofResponsibility;

public class MainClass {
    public static void main(String args[]){
        LogHandler logobj=new InfoHandler(new DebugHandler(new ErrorHandler(null)));

        logobj.log(LogHandler.error,"eror in division");
        logobj.log(LogHandler.debug,"debugging");
        logobj.log(LogHandler.info,"logging infomation");
    }
}
