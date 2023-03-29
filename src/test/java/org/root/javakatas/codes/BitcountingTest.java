package org.root.javakatas.codes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitcountingTest {

    @Test
    public void testGame10 () {
        assertEquals(2, Bitcounting.countBits(10));
    }

    @Test
    public void testGame1234 () {
        assertEquals(5, Bitcounting.countBits(1234));
    }

    @Test
    public void testGame4 () {
        assertEquals(1, Bitcounting.countBits(4));
    }

    @Test
    public void testGame9 () {
        assertEquals(2, Bitcounting.countBits(9));
    }

    @Test
    public void testGame7 () {
        assertEquals(3, Bitcounting.countBits(7));
    }

    @Test
    public void testNegativeCounting () {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> Bitcounting.countBits(-10), "Negative numbers not allowed");
        Assertions.assertNotEquals(2, exception.getMessage());
    }
}