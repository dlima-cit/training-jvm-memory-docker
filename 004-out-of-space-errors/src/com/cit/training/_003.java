package com.cit.training;

import java.util.ArrayList;
import java.util.List;

public class _003 {

    public static void main(String[] args) {
        int[] values;

        values = new int[5];

        /*List<int []> listOfValues = new ArrayList<>();
        while (listOfValues.size() < Integer.MAX_VALUE) {
            values = new int[5];
            listOfValues.add(values);
        }*/

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
