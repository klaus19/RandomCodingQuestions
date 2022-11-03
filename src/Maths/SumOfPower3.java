package Maths;

//Check if Number is a Sum of Powers of Three
public class SumOfPower3 {

    //n=91
    public boolean checkPowersOfThree(int n) {
        return n < 2 || (n % 3 != 2 && checkPowersOfThree(n / 3));


    }

    public static void main(String[] args) {
        SumOfPower3 sp = new SumOfPower3();
        int n = 91;
        System.out.println(sp.checkPowersOfThree(n));
    }

}
