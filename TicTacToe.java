import java.util.Scanner;
public class TicTacToe{
    public static char[][] location = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
        };
    public static void main(String[] args){
        printBoard();
        int turns = 9;
        int x_row = 0;
        int x_col = 0;
        String position;
        boolean player_x_turn = true;
        Scanner in = new Scanner(System.in);
        System.out.println("What is player X's name? ");
        String player_x = in.nextLine();
        System.out.println("What is player O's name? ");
        String player_o = in.nextLine();
        String whichPlayer = player_x;
        for(int i = 1; i<=9; i++){
            if(player_x_turn){
                position = ("\nIt is currently " + player_x + "'s turn");
            }else{
                position = ("\nIt is currently " + player_o + "'s turn");
                System.out.print(position);
                System.out.println("What row would you like to mark? ");
                x_row = in.nextInt();
                System.out.println("What column would you like to mark?");
                x_col = in.nextInt();
            }
        }
        while(location[x_row -1][x_col -1] != ' '){
            System.out.print(whichPlayer + ", that spot has already been taken. \nPlease pick again");
            System.out.println("What row would you like to mark? ");
            x_row = in.nextInt();
            System.out.println("What column would you like to mark?");
            x_col = in.nextInt();
        }
        if(whichPlayer == player_x){
            location[x_row-1][x_col-1] = 'X';
        }else{
            location[x_row-1][x_col-1] = 'O';
        }
        if(whichPlayer == player_x){
            whichPlayer = player_o;
        }else{
            whichPlayer = player_x;
        }
        printBoard();
        for(int i = 1; i<=3; i++){
            if((location[i-1][0] == location[i-1][1] && location[i-1][1] == location[i-1][2]) || (location[0][i-1] == location[1][i-1] && location[1][i-1] == location[2][i-1])){
                if(location.equals('X')){
                    System.out.print(player_x + " won the game!");
                    break;
                }else if(location.equals('O')){
                    System.out.print(player_o + " won the game!");
                    break;
                }
            }
            if((location[0][0] == location[1][1] && location[1][1] == location[2][2]) || (location[0][2] == location[1][1] && location[1][1] == location[2][0])){
                if(location.equals('X')){
                    System.out.print(player_x + " won the game!");
                    break;
                }else if(location.equals('O')){
                    System.out.print(player_o + " won the game!");
                    break;
                }
            }
        }
    }
    public static void printBoard(){
      //prints top
      System.out.print(location[0][0] + "|" + 
      location[0][1] + "|" + location[0][2]);
      //prints line
      System.out.print("------");
      System.out.print(location[1][0] + "|" + 
      location[1][1] + "|" + location[1][2]);
      System.out.print("------");
      System.out.print(location[2][0] + "|" + 
      location[2][1] + "|" + location[2][2]);
    }
}