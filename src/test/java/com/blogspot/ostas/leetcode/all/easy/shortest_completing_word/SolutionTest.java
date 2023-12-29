package com.blogspot.ostas.leetcode.all.easy.shortest_completing_word;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: licensePlate = "1s3 PSt", words = ["step","steps","stripe","stepple"]
    Output: "steps"
    Explanation: licensePlate contains letters 's', 'p', 's' (ignoring case), and 't'.
    "step" contains 't' and 'p', but only contains 1 's'.
    "steps" contains 't', 'p', and both 's' characters.
    "stripe" is missing an 's'.
    "stepple" is missing an 's'.
    Since "steps" is the only word containing all the letters, that is the answer.
    Example 2:
    Input: licensePlate = "1s3 456", words = ["looks","pest","stew","show"]
    Output: "pest"
    Explanation: licensePlate only contains the letter 's'. All the words contain 's', but among these "pest", "stew", and "show" are shortest. The answer is "pest" because it is the word that appears earliest of the 3.
      Constraints:
    1 <= licensePlate.length <= 7
    licensePlate contains digits, letters (uppercase or lowercase), or space ' '.
    1 <= words.length <= 1000
    1 <= words[i].length <= 15
    words[i] consists of lower case English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String licensePlate = "1s3 PSt";
        String[] words = new String[]{"step", "steps", "stripe", "stepple"};
        String expected = "steps";
        var result = solution.shortestCompletingWord(licensePlate, words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String licensePlate = "1s3 456";
        String[] words = new String[]{"looks", "pest", "stew", "show"};
        String expected = "pest";
        var result = solution.shortestCompletingWord(licensePlate, words);
        assertThat(result).isEqualTo(expected);
    }

}
