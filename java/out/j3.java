
import java.io.*;

public class j3 {
    public static void main(String[] args){
        BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
        String s_name;

        System.out.println("Name: ");
        try{
            s_name = In.readLine();
            if(s_name.equals("Alice") || s_name.equals("Bob")){
                System.out.printf("Hello %s\n", s_name);
            }
            else{
                System.out.println("Hello Stranger");
            }
        }
        catch(Exception e){
        }
    }

}
