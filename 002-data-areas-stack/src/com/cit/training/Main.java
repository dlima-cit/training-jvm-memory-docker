package com.cit.training;

// https://sketch.io/sketchpad/

public class Main {

    public static void main(String args[]) {
        int max = 10;
        for (int i = 0; i < max; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    private static int fib(int n) {
        if (n > 1) {
            return fib(n - 1) + fib(n - 2);
        } else {
            return n;
        }
    }

}
