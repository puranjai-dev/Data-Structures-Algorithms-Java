public class LSQ6_RichestCustomer1672 {

    public static void main(String[] args) {
        int[][] arr = {
                {3,4,5},
                {2,2,3},
                {1,1,1}
        };

        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {

        int max_wealth = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length;i++){

            int sum = 0;
            for(int j=0;j<accounts[i].length;j++)
                sum += accounts[i][j];

            if(sum>max_wealth)
                max_wealth=sum;

        }

        return max_wealth;
    }
}
