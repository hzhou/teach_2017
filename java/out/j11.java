public class j11 {
    public static void main(String[] args){
        double tf_sum;

        tf_sum = 0.0;
        for(int i=1; i<1000000; i+=2){
            tf_sum += 1.0 / (2 * i - 1);
            tf_sum -= 1.0 / (2 * i + 1);
        }
        tf_sum *= 4;
        System.out.printf("sum: %.10f\n", tf_sum);
    }

}
