import java.util.*;
public class Password{
    static char[] PW(int len){
        System.out.println("Generating password: ");
        System.out.println("Your password is: ");
        
        String numbers = "0123456789";
        
        Random rndm_method = new Random();
        char[] pw = new char[len];
        for(int i = 0; i<len; i++){
            pw[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return pw;
    }
    public static void main(String[] args){
        int length = 5;
        System.out.println(PW(length));
    }
}