package Maths;

public class NumberSteps {

    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 != 0) {
                num = num - 1;
                steps++;
            } else {
                num = num / 2;
                steps++;
            }

        }
        return steps;
    }

    public static void main(String[] args) {
        NumberSteps ns  = new NumberSteps();
        int n=14;
        System.out.println(ns.numberOfSteps(n));
    }
}
