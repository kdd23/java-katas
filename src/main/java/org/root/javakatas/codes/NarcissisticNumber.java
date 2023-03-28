package org.root.javakatas.codes;

/**
 * https://www.codewars.com/kata/5287e858c6b5a9678200083c/
 */
public class NarcissisticNumber {

	public static boolean isNarcissistic (int number) {
		String[] intToString = String.valueOf(number).split("(?!^)");
		int base = intToString.length;
		int sum = 0;
		for (String s : intToString) {
			int e = Integer.parseInt(s);
			int pow = (int) Math.pow(e, base);
			sum += pow;
		}
		return sum == number;
	}
}
