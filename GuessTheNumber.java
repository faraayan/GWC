import java.util.Scanner;
public class GuessTheNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //choose range of numbers
        System.out.println("What number can I choose up to?");
        int max = in.nextInt();
        //generate random number
        int num = (int)(Math.random()*max-1)+1;
        System.out.println(num);
        boolean notGuessed = true;
        while(notGuessed){
            //keeps asking user to guess a number
            System.out.println("Guess a number between 1 and " + max + ".");
            int guessedNum = in.nextInt();
            //User wins if their guess is equal to the chosen num
            if(guessedNum == num){
                System.out.println("You win! The number I chose was " + num + ".");
                notGuessed = false;
            }else{
                //if num isn't guessed correctly, the computer will give a hint
                if(guessedNum < num){
                    System.out.println("The number is higher than " + guessedNum + ".");
                }else{
                    System.out.println("The number is lower than " + guessedNum + ".");
                }
            }
        }
    }
}