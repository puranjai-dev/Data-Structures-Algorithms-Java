import java.util.Arrays;

public class ArraysMaxAndReverse {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int [] arr1 = new int[1];
//        System.out.println(Arrays.toString(arr1));

//        String[] arr = new String[5];
//        System.out.println(Arrays.toString(arr));

//        int[][] arr = new int[3][];
//        System.out.println(arr.length);

        int[] arr = {1,-22,0,44,55,33333};
        System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(max(arr));

    }

    private static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max)
             max = arr[i];
        }
        return max;
    }

    private static int[] reverse(int[] arr) {

        if(arr.length==0)
            return arr;
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }
}
