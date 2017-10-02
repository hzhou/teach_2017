
import java.util.*;

public class j8 {
    public static void main(String[] args){
        ArrayList<Integer> primes;
        int i;
        boolean is_prime;

        primes = new ArrayList<>();
        i = 2;
        while(true){
            is_prime = true;
            for(int j : primes){
                if(i % j == 0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime){
                System.out.println(i);
                primes.add(i);
            }
            i++;
        }
    }

}
