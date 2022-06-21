package org.buntu.testpin;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PINModeTest {
    PINMode pin = null;

    @Before
    public void before () {
        pin = new PINMode();
    }

    @Test
    public void validPins () {
        assertEquals(true, pin.validatePin("1234"));
        assertEquals(true, pin.validatePin("0000"));
        assertEquals(true, pin.validatePin("1111"));
        assertEquals(true, pin.validatePin("123456"));
        assertEquals(true, pin.validatePin("098765"));
        assertEquals(true, pin.validatePin("000000"));
        assertEquals(true, pin.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters () {
        assertEquals(false, pin.validatePin("a234"));
        assertEquals(false, pin.validatePin(".234"));
    }

    @Test
    public void invalidLengths () {
        assertEquals(false, pin.validatePin("1"));
        assertEquals(false, pin.validatePin("12"));
        assertEquals(false, pin.validatePin("123"));
        assertEquals(false, pin.validatePin("12345"));
        assertEquals(false, pin.validatePin("1234567"));
        assertEquals(false, pin.validatePin("-1234"));
        assertEquals(false, pin.validatePin("1.234"));
        assertEquals(false, pin.validatePin("00000000"));
    }
}