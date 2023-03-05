package ProxyDesignPattern;

public class RealInternet implements Internet{
    @Override
    public void connectto(String server) {
        System.out.println("connnection made "+server);
    }
}
