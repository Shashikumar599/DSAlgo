package ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    Internet realInternet;
    List<String>Banned;

    ProxyInternet(){
        realInternet=new RealInternet();
        Banned=new ArrayList<>();
    }
    public void Bansite(String role,String server) throws Exception {
        if(role!="Admin"){
            throw new Exception("Acess denied");
        }
        Banned.add(server);
    }
    @Override
    public void connectto(String server) throws Exception {
        try{
        if(Banned.contains(server)){
            throw new Exception("Acess denied");
        }
        realInternet.connectto(server);}
        catch (Exception e){
            System.out.println(e);
        }
    }
}
