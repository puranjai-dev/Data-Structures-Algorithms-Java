import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverse = 0;
        while (num!=0){
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
