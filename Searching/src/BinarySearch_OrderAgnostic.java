public class BinarySearch_OrderAgnostic {


        public static void main(String[] args) {
            int[] arr = {100,90,10,0,-2,-4,-100};
            int[] arr1 = {10,20,30,40,50,60,70,80,90};
            int target = -2;
            System.out.println(binarySearch(arr,target));
            System.out.println(binarySearch(arr1,target));
        }

        private static int binarySearch(int[] arr, int target) {

            int start = 0;
            int end = arr.length-1;
            boolean isAsc = arr[start] < arr[end];

            while(start<=end){
                int mid = start + (end-start)/2;

                if(target==arr[mid])
                    return mid;

                if (isAsc) {

                    if (target > arr[mid])
                        start = mid + 1;

                    if(target<arr[mid])
                        end = mid-1;
                } else {

                    if(target > arr[mid])
                        end = mid -1;

                    if(target< arr[mid])
                        start = mid+1;
                }


            }

            return -1;
        }

    }

