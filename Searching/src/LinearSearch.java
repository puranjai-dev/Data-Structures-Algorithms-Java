public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {14, 15, 2, 1, 0};
        System.out.println(linear_search(arr, 1));

    }

    static int linear_search(int[] arr, int target){
        if(arr.length==0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}