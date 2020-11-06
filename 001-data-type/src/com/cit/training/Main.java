package com.cit.training;

import java.math.BigDecimal;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        boolean boolVar = true;
        short shortVar = 45;
        float floatVar = -87.12f;

        BigDecimal bigDecVar = new BigDecimal("34.09874534895739457349538457");
        Float[] wrapperArray = { Float.valueOf(-96.12f), 87.1f, new Float(60.17) };
        Supplier<Integer> interfaceVar = () -> 12;
        CharSequence[] interfaceArray = { new String("value1"), new StringBuffer("ABC"), "test",
                new StringBuilder("123ok") };
    }

}
