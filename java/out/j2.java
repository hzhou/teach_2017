
import java.io.*;

public class j2 {
    public static void main(String[] args){
        BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
        String s_name;

        System.out.println("Name: ");
        try{
            s_name = In.readLine();
            System.out.printf("Hello %s\n", s_name);
        }
        catch(Exception e){
        }
    }

}
