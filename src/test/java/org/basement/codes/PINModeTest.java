package org.basement.codes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PINModeTest {

    @Test
    public void validPins () {
        assertTrue(PINMode.validatePin("1234"));
        assertTrue(PINMode.validatePin("0000"));
        assertTrue(PINMode.validatePin("1111"));
        assertTrue(PINMode.validatePin("123456"));
        assertTrue(PINMode.validatePin("098765"));
        assertTrue(PINMode.validatePin("000000"));
        assertTrue(PINMode.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters () {
        assertFalse(PINMode.validatePin("a234"));
        assertFalse(PINMode.validatePin(".234"));
    }

    @Test
    public void invalidLengths () {
        assertFalse(PINMode.validatePin("1"));
        assertFalse(PINMode.validatePin("12"));
        assertFalse(PINMode.validatePin("123"));
        assertFalse(PINMode.validatePin("12345"));
        assertFalse(PINMode.validatePin("1234567"));
        assertFalse(PINMode.validatePin("-1234"));
        assertFalse(PINMode.validatePin("1.234"));
        assertFalse(PINMode.validatePin("00000000"));
    }
}