import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {

        if(n<2)
            return false;
        int c = 2;
        while(c*c<=n){
            if(n%c==0)
                return false;
            c++;
        }
        return true;
    }
}
