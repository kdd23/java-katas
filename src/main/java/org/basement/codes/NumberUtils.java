package org.basement.codes;

import java.util.stream.Stream;

/**
 * A Narcissistic Number (or Armstrong Number) is a positive number<br>
 * which is the sum of its own digits, each raised to the power of <br>
 * the number of digits in a given base.<br>
 * In this Kata, we will restrict ourselves to decimal (base 10).<br>
 * https://www.codewars.com/kata/5287e858c6b5a9678200083c/
 */
public class NumberUtils {

    public static boolean isNarcissistic (int number) {
        String intToString = String.valueOf(number);
        int base = intToString.length();
        return Stream.of(intToString.split("(?!^)"))
                .map(e -> (int) Math.pow(Integer.parseInt(e), base))
                .reduce(0, Integer::sum).equals(number);
    }
}
