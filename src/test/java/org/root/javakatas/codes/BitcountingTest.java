package org.root.javakatas.codes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitcountingTest {

    @Test
    public void testGame10 () {
        assertEquals(2, Bitcounting.countBits(10));
    }

    public void testGame1234 () {
        assertEquals(5, Bitcounting.countBits(1234));
    }

    public void testGame4 () {
        assertEquals(1, Bitcounting.countBits(4));
    }

    public void testGame9 () {
        assertEquals(2, Bitcounting.countBits(9));
    }

    public void testGame7 () {
        assertEquals(3, Bitcounting.countBits(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCounting () {
        assertEquals(2, Bitcounting.countBits(-10));
    }
}