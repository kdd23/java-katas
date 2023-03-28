package org.root.javakatas.codes;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PigLatinTest {
    private static String join (String delim, String... parts) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < parts.length - 1; i++) {
            builder.append(parts[i]).append(delim);
        }
        if (parts.length > 0) {
            builder.append(parts[parts.length - 1]);
        }
        return builder.toString();
    }

    public static String generateRandomChars (String candidateChars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
        return sb.toString();
    }

    public static String C (String Z) {
        return Z.replaceAll("(\\w)(\\w*)(\\s|$)", "$2$1ay$3");
    }

    @Test
    public void FixedTests () {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("ctaAay steay abulafay", PigLatin.pigIt("Acta est fabula"));
        assertEquals("arbaBay onnay acitfay hilosophumpay", PigLatin.pigIt("Barba non facit philosophum"));
        assertEquals("ctaAay steay abulafay", PigLatin.pigIt("Acta est fabula"));
        assertEquals("ucullusCay onnay acitfay onachummay", PigLatin.pigIt("Cucullus non facit monachum"));
        assertEquals("uraDay exlay edsay exlay", PigLatin.pigIt("Dura lex sed lex"));
        assertEquals("rrareEay umanumhay steay", PigLatin.pigIt("Errare humanum est"));
        assertEquals("luctuatFay ecnay ergiturmay", PigLatin.pigIt("Fluctuat nec mergitur"));
        assertEquals("uttaGay avatcay apidemlay", PigLatin.pigIt("Gutta cavat lapidem"));
        assertEquals("icHay teay uncnay", PigLatin.pigIt("Hic et nunc"));
        assertEquals("nIay inovay eritasvay", PigLatin.pigIt("In vino veritas"));
        assertEquals("uxLay niay enebristay ucetlay", PigLatin.pigIt("Lux in tenebris lucet"));
        assertEquals("orituriMay olumusnay orimay", PigLatin.pigIt("Morituri nolumus mori"));
        assertEquals("orituriMay olumusnay orimay", PigLatin.pigIt("Morituri nolumus mori"));
        assertEquals("uncNay steay ibendumbay", PigLatin.pigIt("Nunc est bibendum"));
        assertEquals("Oay emporatay oay oresmay !", PigLatin.pigIt("O tempora o mores !"));
        assertEquals("anemPay teay ircensescay", PigLatin.pigIt("Panem et circenses"));
        assertEquals("uisQay ustodietcay psosiay ustodescay ?", PigLatin.pigIt("Quis custodiet ipsos custodes ?"));
        assertEquals("equiescatRay niay acepay", PigLatin.pigIt("Requiescat in pace"));
        assertEquals("icSay ransittay loriagay undimay", PigLatin.pigIt("Sic transit gloria mundi"));
        assertEquals("imeoTay anaosDay teay onaday erentesfay", PigLatin.pigIt("Timeo Danaos et dona ferentes"));
        assertEquals("ltimaUay ecatnay", PigLatin.pigIt("Ultima necat"));
        assertEquals("eniVay idivay icivay", PigLatin.pigIt("Veni vidi vici"));
    }

    @Test
    public void RandomTests () {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String[] s = new String[random.nextInt(6) + 1];
            for (int j = 0; j < s.length; j++) {
                s[j] = generateRandomChars(
                        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", random.nextInt(10) + 3);
            }
            String X = join(" ", s);
            assertEquals(C(X), PigLatin.pigIt(X));
        }
    }

}