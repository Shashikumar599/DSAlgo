package ProxyDesignPattern;

public class MainClass {
    public static void main(String [] args) throws Exception {
        ProxyInternet internet=new ProxyInternet();

        internet.connectto("abc.com");

//        internet.Bansite("Admin","abc.com");
          internet.Bansite("Admin","abc.com");

        internet.connectto("abc.com");
    }
}
