package com.cit.training;

// https://sketch.io/sketchpad/

public class Main {

    public static void main(String args[]) {
        int max = 10;
        for (int i = 0; i < max; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else {
            return n;
        }
    }

}
