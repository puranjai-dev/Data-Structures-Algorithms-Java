import java.util.Scanner;

public class LSQ1SearchInAString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Puranjai";
        char c = in.next().trim().charAt(0);
        System.out.println(search(str,c));
    }

    static int search(String str, char c){
        if (str.length()==0)
            return -1;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c)
                return i;

        }

        return -1;
        }
    }

