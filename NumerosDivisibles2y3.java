public class NumerosDivisibles2y3 {


    public static void main(String[] args) {
        
        for(int n = 1; n <= 100; ++n) {
        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println(n);

        }

        }
    }
}
