package org.root.javakatas.codes;

/**
 * https://www.codewars.com/kata/55f8a9c06c018a0d6e000132
 */
public class PINMode {
    public static boolean validatePin (String pin) {
        String pattern = "([0-9]{6}|([0-9]{4}))";
        boolean validate = false;
        try {
            Integer.parseInt(pin);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number format" + ex);
            return false;
        }
        return pin.matches(pattern);
    }
}
