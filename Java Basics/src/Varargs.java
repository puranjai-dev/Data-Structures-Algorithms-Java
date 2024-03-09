import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        varargs(10,20,"a","b");
    }

    static void varargs(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
}
