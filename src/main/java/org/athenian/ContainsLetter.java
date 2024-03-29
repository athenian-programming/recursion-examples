package org.athenian;

public class ContainsLetter {

    public static boolean containsLetterLoop(char c, String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.substring(i, i + 1).equals(Character.toString(c)))
                return true;

        return false;
    }

    public static boolean containsLetterRecursion(char c, String s) {
        if (s.isEmpty())
            return false;

        String firstLetter = s.substring(0, 1);
        if (firstLetter.equals(Character.toString(c)))
            return true;

        return containsLetterRecursion(c, s.substring(1));
    }

    public static boolean containsLetterStream(char c, String s) {
        return s.chars()
                .filter(value -> value == c)
                .findAny()
                .isPresent();
    }
}
