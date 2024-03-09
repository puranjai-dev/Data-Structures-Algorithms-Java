public class LSQ5_EvenDigits1295 {

    public static void main(String[] args) {
        int[] arr = {18,234,34,1234};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int num_with_even=0;
        for(int i=0; i<nums[i]; i++){
            if(nodigits(nums[i]))
                num_with_even++;
        }

        return num_with_even;
    }

    public static boolean nodigits (int no){
//        int digits = 0;
//
//
//        while(no!=0){
//            no/=10;
//            digits++;
//        }
//
//        return digits%2==0;

        return ((int) (Math.log10(no) + 1)) % 2 == 0;
    }
}
