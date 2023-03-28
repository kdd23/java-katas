package org.root.javakatas.codes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PINModeTest {

    @Test
    public void validPins1 () {
        assertFalse(PINMode.validatePin("1"));
    }

    @Test
    public void validPins1111 () {
        assertTrue(PINMode.validatePin("1111"));
    }

    public void validPins1234 () {
        assertTrue(PINMode.validatePin("1234"));
    }

    public void validPins0000 () {
        assertTrue(PINMode.validatePin("0000"));
    }

    public void validPins123456 () {
        assertTrue(PINMode.validatePin("123456"));
    }

    public void validPins098765 () {
        assertTrue(PINMode.validatePin("098765"));
    }

    public void validPins000000 () {
        assertTrue(PINMode.validatePin("000000"));
    }

    public void validPins090909 () {
        assertTrue(PINMode.validatePin("090909"));
    }

    @Test
    public void nonDigitCharactersA234 () {
        assertFalse(PINMode.validatePin("a234"));
    }

    public void nonDigitCharactersDot234 () {
        assertFalse(PINMode.validatePin(".234"));
    }

    public void invalidLengths12 () {
        assertFalse(PINMode.validatePin("12"));
    }

    public void invalidLengths123 () {
        assertFalse(PINMode.validatePin("123"));
    }

    public void invalidLengths12345 () {
        assertFalse(PINMode.validatePin("12345"));
    }

    public void invalidLengths1234567 () {
        assertFalse(PINMode.validatePin("1234567"));
    }

    public void invalidLengthsMinus1234 () {
        assertFalse(PINMode.validatePin("-1234"));
    }

    public void invalidLengths1Dot234 () {
        assertFalse(PINMode.validatePin("1.234"));
    }

    public void invalidLengths00000000 () {
        assertFalse(PINMode.validatePin("00000000"));
    }
}