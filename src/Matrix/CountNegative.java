package Matrix;

import java.util.Arrays;

public class CountNegative {

    public int countNegatives(int[][] grid) {

        int m = grid.length, n = grid[0].length;
        int r = m - 1, c = 0, count = 0;
        while(r >= 0 && c < n) {
            if(grid[r][c] < 0) {
                -- r;
                count += n - c;
            }
            else
                c ++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountNegative cp = new CountNegative();
        int[][]arr = new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][]nums = new int[][]{{3,2},{1,0}};
        System.out.println(cp.countNegatives(arr));
        System.out.println(cp.countNegatives(nums));
    }
}
