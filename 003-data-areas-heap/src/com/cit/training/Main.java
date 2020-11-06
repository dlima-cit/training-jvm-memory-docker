package com.cit.training;

public class Main {

    public static void main(String[] args) {
        int[] values;

        values = new int[5];

        values[0] = 10;
        values[1] = 20;
        values[4] = 50;

        /*
         * the code above is equivalent to
         * values = new int [] {10, 20, 0, 0, 50}
         */

        add3ToEach(values);

        for (int i = 0; i < values.length; i++) {
            System.out.println("Element at index " + i +
                    " : " + values[i]);
        }

    }

    private static void add3ToEach(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] += 3;
        }
    }
}
