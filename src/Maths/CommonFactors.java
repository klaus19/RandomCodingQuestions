package Maths;

public class CommonFactors {
    public int getcommonFactors(int a, int b) {
        int res = 0;
        int max = Math.min(a, b);
        for (int i = 1; i <= max; i++)
            if (a % i == 0 && b % i == 0) res++;
        return res;
    }

    public static void main(String[] args) {
        CommonFactors cm = new CommonFactors();
        int n1 = 6, n2=12;
        System.out.println(cm.getcommonFactors(n1,n2));
    }
}
