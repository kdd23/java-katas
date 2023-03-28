package org.root.javakatas.codes;

import java.util.ArrayList;
import java.util.Collections;

/**
 * https://www.codewars.com/kata/526571aae218b8ee490006f4
 * <p>
 * Write a function that takes an integer as input,
 * and returns the number of bits that are equal to one in the
 * binary representation of that number. You can guarantee that input
 * is non-negative.
 * <p>
 * Example: The binary representation of 1234 is 10011010010,
 * so the function should return 5 in this case
 */
public class Bitcounting {

    public static int countBits (int n) {
        int divisor = 2;
        ArrayList<Integer> list = new ArrayList<>();
        if (n > 0) {
            while (n > 0) {
                int r = n % divisor;
                n /= divisor;
                list.add(r);
            }
            Collections.reverse(list);
            return (int) list.stream()
                    .filter(item -> item.equals(1)).count();
        }
        throw new IllegalArgumentException("Number is negative");
    }
}
