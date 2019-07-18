package org.athenian;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.athenian.LetterCount.*;
import static org.athenian.Palindrome.isPalindromeLoop;
import static org.athenian.Palindrome.isPalindromeRecursion;

public class JavaTests {

    @Test
    public void palindromeLoopTests() {
        assertThat(isPalindromeLoop("")).isTrue();
        assertThat(isPalindromeLoop("a")).isTrue();
        assertThat(isPalindromeLoop("bb")).isTrue();
        assertThat(isPalindromeLoop("bc")).isFalse();
        assertThat(isPalindromeLoop("cdc")).isTrue();
        assertThat(isPalindromeLoop("cde")).isFalse();
        assertThat(isPalindromeLoop("abcdcba")).isTrue();
        assertThat(isPalindromeLoop("abcdebs")).isFalse();
    }

    @Test
    public void palindromeRecursionTests() {
        assertThat(isPalindromeRecursion("")).isTrue();
        assertThat(isPalindromeRecursion("a")).isTrue();
        assertThat(isPalindromeRecursion("bb")).isTrue();
        assertThat(isPalindromeRecursion("bc")).isFalse();
        assertThat(isPalindromeRecursion("cdc")).isTrue();
        assertThat(isPalindromeRecursion("cde")).isFalse();
        assertThat(isPalindromeRecursion("abcdcba")).isTrue();
        assertThat(isPalindromeRecursion("abcdebs")).isFalse();
    }

    @Test
    public void letterCountLoopTests() {
        assertThat(letterCountLoop('a', "")).isEqualTo(0);
        assertThat(letterCountLoop('a', "a")).isEqualTo(1);
        assertThat(letterCountLoop('a', "bb")).isEqualTo(0);
        assertThat(letterCountLoop('a', "abbc")).isEqualTo(1);
        assertThat(letterCountLoop('a', "abbca")).isEqualTo(2);
    }

    @Test
    public void letterCountStreamTests() {
        assertThat(letterCountStream('a', "")).isEqualTo(0);
        assertThat(letterCountStream('a', "a")).isEqualTo(1);
        assertThat(letterCountStream('a', "bb")).isEqualTo(0);
        assertThat(letterCountStream('a', "abbc")).isEqualTo(1);
        assertThat(letterCountStream('a', "abbca")).isEqualTo(2);
    }

    @Test
    public void letterCountRecursiveTests() {
        assertThat(letterCountRecursion('a', "")).isEqualTo(0);
        assertThat(letterCountRecursion('a', "a")).isEqualTo(1);
        assertThat(letterCountRecursion('a', "bb")).isEqualTo(0);
        assertThat(letterCountRecursion('a', "abbc")).isEqualTo(1);
        assertThat(letterCountRecursion('a', "abbca")).isEqualTo(2);
    }
}