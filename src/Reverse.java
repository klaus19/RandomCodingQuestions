import java.awt.font.FontRenderContext;

public class Reverse {

     public static void getReverse(int[]nums,int n){

          n = nums.length;
          int temp;

         for (int i=0;i<nums.length/2;i++){

              temp = nums[i];
             nums[i]= nums[n-i-1];
             nums[n-i-1]=temp;
         }
          //printed array
         System.out.println("Reversed aRRAY IS :");
         for (int k=0;k<n;k++){
             System.out.println(nums[k]);
         }
     }


    public static void main(String[] args) {

         int[]arr = new int[]{1,2,3};
         getReverse(arr,arr.length);
    }
}
