package Systemdesign;

public class User implements Observer{
    String username;

    public User(String username){
        this.username=username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    @Override
    public void notifyme() {
        System.out.println(username+" notification recieved");
    }
}
