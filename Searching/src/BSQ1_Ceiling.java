public class BSQ1_Ceiling {
    public static void main(String[] args) {

        int arr[] = {2,2,4,4,4,4};
        int target = 3;
        System.out.println(ceiling(arr,target));
    }

    static int ceiling(int[] arr, int target){


        int start = 0;
        int end = arr.length-1;

        if(target>arr[end])
            return -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target == arr[mid])
                return mid;

            if(target> arr[mid])
                start = mid+1;

            if(target < arr[mid])
                end = mid -1 ;
        }

        return start;
    }
}
