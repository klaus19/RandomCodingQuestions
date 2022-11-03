package Maths;

public class Power4 {

    public boolean getPower4(int n){
        if(n==0) return false;
        while(n%4==0)
            n/=4;
        return (n==1);
    }

    public static void main(String[] args) {
        Power4 p = new Power4();
        int n=4;
        System.out.println(p.getPower4(n));
    }
}
