
import java.io.*;

public class j5 {
    public static void main(String[] args){
        BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int n_total;

        System.out.println("number: ");
        try{
            n = Integer.parseInt(In.readLine());
            n_total = 0;
            for(int i=1; i<n+1; i++){
                if(i % 3 == 0 || i % 5 == 0){
                    n_total += i;
                }
            }
            System.out.printf("Total: %d\n", n_total);
        }
        catch(Exception e){
        }
    }

}
