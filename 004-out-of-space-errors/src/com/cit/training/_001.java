package com.cit.training;

public class _001 {

    public static void main(String args[]) {
        int max = 10;
        for (int i = 0; i < max; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        // if (true) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else {
            return n;
        }
    }

}
