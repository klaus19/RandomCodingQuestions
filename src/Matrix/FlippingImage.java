package Matrix;

import java.util.Arrays;

public class FlippingImage {

    public int[][] flipAndInvertImage(int[][] A) {
        flipImage(A);
        invertImage(A);
        return A;
    }

    private void invertImage(int[][] A) {
        for (int i=0;i< A.length;i++){
            for (int j=0;j<A[i].length;j++){
                if (A[i][j]==0){
                    A[i][j]=1;
                }else{
                    A[i][j]=0;
                }
            }
        }
    }

    private void flipImage(int[][] A) {

        for (int i=0;i<A.length;i++){
            int n = A[i].length-1;
            int j=0;
            while (j<n){
                int temp = A[i][j];
                A[i][j] = A[i][n];
                A[i][n] = temp;
                j++;
                n--;
            }
        }
    }

    public static void main(String[] args) {
        FlippingImage fp = new FlippingImage();
        int[][]arr = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(fp.flipAndInvertImage(arr)));
    }
}
