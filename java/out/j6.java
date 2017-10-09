
import java.io.*;

public class j6 {
    public static void main(String[] args){
        BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String s_choice;
        int n_total;

        try{
            System.out.println("number: ");
            n = Integer.parseInt(In.readLine());
            System.out.println("sum or product?");
            s_choice = In.readLine();
            if(s_choice.equals("sum")){
                n_total = 0;
                for(int i=1; i<n+1; i++){
                    n_total += i;
                }
                System.out.printf("Total: %d\n", n_total);
            }
            else if(s_choice.equals("product")){
                n_total = 1;
                for(int i=1; i<n+1; i++){
                    n_total *= i;
                }
                System.out.printf("Total: %d\n", n_total);
            }
            else{
                System.out.println("Wrong choice!");
            }
        }
        catch(Exception e){
        }
    }

}
