package Maths;

public class CountOperations {

    public int countOperations(int num1, int num2) {

        int count=0;
        while (num1>0 && num2>0){
            if (num1>num2){
                num1=num1-num2;
                count++;
            }else{
                num2=num2-num1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountOperations cs = new CountOperations();
        int no1=2,no2=3;
        System.out.println(cs.countOperations(no1,no2));
    }
}
