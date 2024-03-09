import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int prev = 0;
        int curr = 1;
        int pointer = 2;
        while(pointer<=n){

            int temp = curr;
            curr = curr+prev;
            prev = temp;

            pointer++;
        }

        System.out.println(curr);

    }
}
