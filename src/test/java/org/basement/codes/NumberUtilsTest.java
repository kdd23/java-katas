package org.basement.codes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberUtilsTest {

    @Test
    public void isNarcissisticN153 () {
        assertTrue(NumberUtils.isNarcissistic(153));
    }

    @Test
    public void isNarcissisticN12 () {
        assertFalse(NumberUtils.isNarcissistic(12));
    }

    @Test
    public void isNarcissisticN1938 () {
        assertFalse(NumberUtils.isNarcissistic(1938));
    }

    @Test
    public void isNarcissisticN41 () {
        assertFalse(NumberUtils.isNarcissistic(45));
    }
}