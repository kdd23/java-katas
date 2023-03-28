package org.root.javakatas.codes;

/**
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f
 */
public class PigLatin {
    private static final String SPACE = " ";

    public static String pigIt (String str) {
        String pattern = "[^a-zA-Z0-9]";
        String[] words = str.split(" ");
        String suffix = "ay";
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].matches(pattern))
                newWord.append(words[i].substring(1)).append(words[i].charAt(0)).append(suffix);
            else {
                newWord.append(words[i]);
            }
            if (i < words.length - 1) {
                newWord.append(SPACE);
            }
        }
        return newWord.toString();
    }
}
