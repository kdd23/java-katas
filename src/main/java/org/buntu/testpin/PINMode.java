package org.buntu.testpin;

public class PINMode {


    public static boolean validatePin (String pin) {
        String pattern = "([0-9]{6}|([0-9]{4}))";
        boolean validate = false;
        try {
            Integer.parseInt(pin);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number format" + ex);
            return validate;
        }
        return pin.matches(pattern);
    }
}
