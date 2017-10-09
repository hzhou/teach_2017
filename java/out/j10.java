public class j10 {
    public static void main(String[] args){
        int n_year;
        int count;

        n_year = 2017;
        count = 0;
        while(true){
            if(n_year % 4 == 0 && (n_year % 100 != 0 || n_year % 400 == 0)){
                System.out.println(n_year);
                count++;
                if(count >= 20){
                    break;
                }
            }
            n_year++;
        }
    }

}
