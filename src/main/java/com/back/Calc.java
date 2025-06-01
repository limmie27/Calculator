package com.back;

public class Calc {
    public static int run(String expression) {
        if (expression.contains(" + ")) {
            String[] bits = expression.split(" \\+ ");
            int sum = 0;
            for (String bit : bits) {
                sum += Integer.parseInt(bit);
            }
            return sum;
        } else if (expression.contains(" - ")) {
            String[] bits = expression.split(" - ");
            return Integer.parseInt(bits[0]) - Integer.parseInt(bits[1]);
        }

        return 0;
    }
}
