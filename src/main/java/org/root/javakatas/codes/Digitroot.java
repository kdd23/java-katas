package org.root.javakatas.codes;

/**
 * https://www.codewars.com/kata/541c8630095125aba6000c00
 */
public class Digitroot {

    public static int digitRoot1 (char... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += Integer.parseInt(String.valueOf(number));
        }
        return String.valueOf(sum).length() > 1 ? digitRoot1(String.valueOf(sum).toCharArray()) : sum;
    }

    static int digitRoot2 (int number) {
        int result = 0;
        while (number > 0) {
            int mod = number % 10;
            number = number / 10;
            result += mod;
        }
        return result / 10 == 0 ? result : digitRoot2(result);
    }

}
