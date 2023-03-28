package org.root.javakatas.codes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class NarcissisticNumberTest {
    private static final int[] NARCISSISTIC_INTS = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634,
            8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818,
            9800817, 9926315, 24678050, 24678051, 88593477, 146511208,
            472335975, 534494836, 912985153
    };

    @Test
    void fixedTests () {
        assertTrue(NarcissisticNumber.isNarcissistic(153), "153 is narcissistic");
        assertTrue(NarcissisticNumber.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(NarcissisticNumber.isNarcissistic(112), "112 is not narcissistic");
        assertFalse(NarcissisticNumber.isNarcissistic(10), "10 is not narcissistic");
        assertFalse(NarcissisticNumber.isNarcissistic(Integer.MAX_VALUE), Integer.MAX_VALUE + " is not narcissistic");
    }

    @Test
    void randomTests () {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int nrTests = 100_000;
        int[] testCases = Arrays.copyOf(NARCISSISTIC_INTS, nrTests);
        for (int i = NARCISSISTIC_INTS.length; i < nrTests; i++)
            testCases[i] = rnd.nextInt(Integer.MAX_VALUE);
        for (int i = 0; i < nrTests; i++) {
            int idx = rnd.nextInt(nrTests);
            int tmp = testCases[i];
            testCases[i] = testCases[idx];
            testCases[idx] = tmp;
        }

        for (int n : testCases) {
            boolean expected = Arrays.binarySearch(NARCISSISTIC_INTS, n) >= 0;
            assertEquals(expected, NarcissisticNumber.isNarcissistic(n), String.format("%d is %snarcissistic", n, expected ? "" : "not "));
        }
    }

    @Test
    public void isNarcissisticN153 () {
        assertTrue(NarcissisticNumber.isNarcissistic(153));
    }

    @Test
    public void isNarcissisticN12 () {
        assertFalse(NarcissisticNumber.isNarcissistic(12));
    }

    @Test
    public void isNarcissisticN1938 () {
        assertFalse(NarcissisticNumber.isNarcissistic(1938));
    }

    @Test
    public void isNarcissisticN41 () {
        assertFalse(NarcissisticNumber.isNarcissistic(45));
    }

}