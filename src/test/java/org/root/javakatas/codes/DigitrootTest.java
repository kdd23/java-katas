package org.root.javakatas.codes;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitrootTest {
    private final Random random = new Random();

    @Test
    public void Test1 () {
        assertEquals(7, Digitroot.digitRoot2(16), "Nope!");
    }

    @Test
    public void Test2 () {
        assertEquals(6, Digitroot.digitRoot2(195), "Nope!");
    }

    @Test
    public void Test3 () {
        assertEquals(2, Digitroot.digitRoot2(992), "Nope!");
    }

    @Test
    public void Test4 () {
        assertEquals(9, Digitroot.digitRoot2(99999999), "Nope!");
    }

    @Test
    public void Test5 () {
        assertEquals(9, Digitroot.digitRoot2(167346), "Nope!");
    }

    @Test
    public void Test6 () {
        assertEquals(1, Digitroot.digitRoot2(10), "Nope!");
    }

    @Test
    public void Test7 () {
        assertEquals(0, Digitroot.digitRoot2(0), "Nope! Should work for 0");
    }

    @Test
    public void Test8 () {
        System.out.println("100 Random Tests");
        for (int i = 0; i < 100; i++) {
            int n = random.nextInt(1000000);
            assertEquals(PrivateTestClass.digital_root(n), Digitroot.digitRoot2(n), "Nope! Should work for " + n);
        }
    }

    // Reference implementation for the random test cases
    private static class PrivateTestClass {
        public static int digital_root (int n) {
            return n > 0 ? 1 + (n - 1) % 9 : 0;
        }
    }
}