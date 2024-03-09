import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch>=97 && ch<=122)
            System.out.println("lowercase");

        if (ch>=65 && ch<=90)
            System.out.println("UPPERCASE");

        /*

        OR

         if (ch>='a' && ch<='z')
            System.out.println("lowercase");

        else
            System.out.println("UPPERCASE");

         */


    }
}
