import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println(isArmstrong(in.nextInt()));

        for (int i = 100; i <=999 ; i++) {
            if(isArmstrong(i))
                System.out.println(i);
        }
    }

    static boolean isArmstrong(int n) {

        int sum = 0;
        int num = n;
        while(n>0){
            sum = (int) (sum + Math.pow(n%10,3));
            n/=10;
        }
        return sum == num;
    }
}
