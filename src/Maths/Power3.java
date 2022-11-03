package Maths;

public class Power3 {

    public boolean isPowerOfThree(int n) {
        if (n<1)return false;
        if (n==1) return true;

        return n%3 ==0 && isPowerOfThree(n/3);
    }

    public static void main(String[] args) {
        Power3 ps = new Power3();
        int n=8;
        System.out.println(ps.isPowerOfThree(n));
    }
}
