package Maths;

import java.util.HashSet;

public class HappyNumber {

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            if (!set.contains(n))
                set.add(n);
            else
                return false;

            int sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
        }

        return true;
    }

    public static void main(String[] args) {
        HappyNumber hp = new HappyNumber();
        int n=19;
        System.out.println(hp.isHappy(n));
    }
}
