package Tictactoe;

public class MainClass {
    public static void main(String [] args){
        System.out.println("Main method");

        Player p1=new Player("Tomo",'X');
        Player p2=new Player("mb",'O');

        Game g=new Game(p1,p2);

        g.StartGame();
    }
}
