public class MaximumWealth {

    public int maximumWealth(int[][] accounts) {
//        int maximumWealth = accounts[0][0];
//        int max = maximumWealth;
//        for(int i=0;i< accounts.length;i++)
//            for (int j=1;j< accounts.length;j++)
//              maximumWealth = Math.max(maximumWealth,accounts[i][j]);
//              max = maximumWealth;
//                return max;

        int output = 0;
        for(int i =0;i<accounts.length;i++){
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            output = Math.max(output,sum);
        }
        return output;
    }

    public static void main(String[] args) {
        MaximumWealth ms  = new MaximumWealth();
        int[][]arr = new int[][]{{1,2,3},{3,2,1}};
        System.out.println(ms.maximumWealth(arr));
    }
}
