package Tictactoe;

import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;

    char [][] board;

    Game(Player p1,Player p2){
        board=new char[3][3];

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                board[i][j]='_';
            }
        }
        this.p1=p1;
        this.p2=p2;
    }
    void StartGame(){
        for(int i=0;i<9;i++){
            Player p;
            if(i%2==0){
                p=p1;
            }
            else{
                p=p2;
            }
            for(int k=0;k<3;k++){
                for(int l=0;l<3;l++){
                    System.out.print(board[k][l]+" ");
                }
                System.out.println();
            }

           while(true) {
               boolean g=true;
            try {
//                System.out.println(board);

                System.out.println(p.Playername + " enter position ");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                String[] values = s.split(",");
                int inputRow = Integer.valueOf(values[0]);
                int inputColumn = Integer.valueOf(values[1]);
                if (inputColumn<0 || inputColumn>2 || inputRow<0 ||inputRow>2 || board[inputRow][inputColumn] !='_') {
//                    System.out.println(p.Playername + " Invalid position Please enter again");
                    throw new InvalidInputException(p.Playername+ "Please enter valid position");
                }
                board[inputRow][inputColumn]= p.symbol;
            }
            catch (Exception e){
                g=false;
                System.out.println(e);
            }
            finally {
                if(g)
                {
                    break;
                }
            }
           }
           String s=Winner();
           if(s!=""){
               System.out.println("Winner is "+s);
               break;
           }
        }
    }
    String Winner(){
//        System.out.println("entered in winner");
        int r1 = 0,r2=0,r3=0,c1=0,c2=0,c3=0,d1=0,d2=0;
        for(int i=0;i<=2;i++){

            if(board[0][i]== p1.symbol){
                r1++;
            }
            else if(board[0][i]== p2.symbol){
                r1--;
            }

            if(board[1][i]== p1.symbol){
                r2++;
            }
            else if(board[1][i]== p2.symbol){
                r2--;
            }

            if(board[2][i]== p1.symbol){
                r3++;
            }
            else if(board[2][i]== p2.symbol){
                r3--;
            }

            if(board[i][0]== p1.symbol){
                c1++;
            }
            else if(board[i][0]== p2.symbol){
                c1--;
            }

            if(board[i][1]== p1.symbol){
                c2++;
            }
            else if(board[i][1]== p2.symbol){
                c2--;
            }

            if(board[i][2]== p1.symbol){
                c3++;
            }
            else if(board[i][2]== p2.symbol){
                c3--;
            }

            if(board[i][i]== p1.symbol){
                d1++;
            }
            else if(board[i][i]== p2.symbol){
                d1--;
            }

            if(board[2-i][i]== p1.symbol){
                d2++;
            }
            else if(board[2-i][i]== p2.symbol){
                d2--;
            }

        }
//        System.out.println(r1+" "+r2+" "+d1);
        if(r1==3 || r2==3 || r3==3 || c1==3 || c2==3 || c3==3 || d1==3 || d2==3){
            return p1.Playername;
        }
        else if(r1==-3 || r2==-3 || r3==-3 || c1==-3 || c2==-3 || c3==-3 || d1==-3 || d2==-3){
            return p2.Playername;
        }
        return "";
    }
}
