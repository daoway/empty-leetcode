package com.blogspot.ostas.leetcode.all.hard.guess_the_word;

import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
        Example 1:
    Input: secret = "acckzz", words = ["acckzz","ccbazz","eiowzz","abcczz"], allowedGuesses = 10
    Output: You guessed the secret word correctly.
    Explanation:
    master.guess("aaaaaa") returns -1, because "aaaaaa" is not in wordlist.
    master.guess("acckzz") returns 6, because "acckzz" is secret and has all 6 matches.
    master.guess("ccbazz") returns 3, because "ccbazz" has 3 matches.
    master.guess("eiowzz") returns 2, because "eiowzz" has 2 matches.
    master.guess("abcczz") returns 4, because "abcczz" has 4 matches.
    We made 5 calls to master.guess, and one of them was the secret, so we pass the test case.
    Example 2:
    Input: secret = "hamada", words = ["hamada","khaled"], allowedGuesses = 10
    Output: You guessed the secret word correctly.
    Explanation: Since there are two words, you can guess both.
      Constraints:
    1 <= words.length <= 100
    words[i].length == 6
    words[i] consist of lowercase English letters.
    All the strings of wordlist are unique.
    secret exists in words.
    10 <= allowedGuesses <= 30
    */

    @Test
    void test_0() {
//		var solution = new Solution();
//		String[] words = new String[] {};
//		Master master = new Master();
//		solution.findSecretWord(words, master);
    }
}
