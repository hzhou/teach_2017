
import java.util.Random;
import java.io.*;

public class j9 {
    public static void main(String[] args){
        Random Rand;
        int n;
        BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
        int n_guess;

        Rand = new Random();
        n = Rand.nextInt(100);
        while(true){
            try{
                System.out.println("Make a guess:");
                n_guess = Integer.parseInt(In.readLine());
                if(n_guess < n){
                    System.out.println("Too small");
                }
                else if(n_guess > n){
                    System.out.println("Too big");
                }
                else{
                    System.out.println("You got it");
                    break;
                }
            }
            catch(Exception e){
            }
        }
    }

}
