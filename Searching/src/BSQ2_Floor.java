public class BSQ2_Floor {
    public static void main(String[] args) {

        int arr[] = {2,4,6,8,10,12};
        int target = 9;
        System.out.println(floor(arr,target));
    }

    static int floor(int[] arr, int target){


        int start = 0;
        int end = arr.length-1;

        if(target<arr[start])
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

        return end;
    }
}