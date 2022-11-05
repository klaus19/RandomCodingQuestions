package Matrix;

import java.util.Arrays;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {

        int sum =0;
        int j=mat.length-1;
        for(int i=0;i<mat.length;i++){
                if (i==j){
                    sum+=mat[i][j];
                    j--;
                    continue;
                }
                sum+=mat[i][j]+mat[i][j--];
            }
             return sum;
        }

    public static void main(String[] args) {
        MatrixDiagonalSum msd = new MatrixDiagonalSum();
        int[][]arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(msd.diagonalSum(arr));
    }

}
