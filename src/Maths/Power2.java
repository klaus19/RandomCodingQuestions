package Maths;

public class Power2 {

    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        if(n%2==0)
            return isPowerOfTwo(n/2);
        else
            return false;
    }

    public static void main(String[] args) {
        Power2 p2 = new Power2();
        int n=4;
        System.out.println(p2.isPowerOfTwo(n));
    }
}
