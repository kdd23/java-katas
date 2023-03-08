package org.basement.codes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitcountingTest {

    @Test
    public void testGame () {
        assertEquals(2, Bitcounting.countBits(10));
        assertEquals(5, Bitcounting.countBits(1234));
        assertEquals(1, Bitcounting.countBits(4));
        assertEquals(2, Bitcounting.countBits(9));
        assertEquals(3, Bitcounting.countBits(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCounting () {
        assertEquals(2, Bitcounting.countBits(-10));
    }
}