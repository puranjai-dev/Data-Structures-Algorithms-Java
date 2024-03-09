import java.util.Arrays;

public class LSQ4_2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {4,5,6},
                {1,2,3},
                {7,8,9}
        };

        int target = 8;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j])
                    return new int[]{i, j};
            }
        }
            return new int[] {-1,-1};


    }
}
