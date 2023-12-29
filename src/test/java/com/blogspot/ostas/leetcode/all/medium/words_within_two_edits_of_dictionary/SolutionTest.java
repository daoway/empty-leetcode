package com.blogspot.ostas.leetcode.all.medium.words_within_two_edits_of_dictionary;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: queries = ["word","note","ants","wood"], dictionary = ["wood","joke","moat"]
    Output: ["word","note","wood"]
    Explanation:
    - Changing the 'r' in "word" to 'o' allows it to equal the dictionary word "wood".
    - Changing the 'n' to 'j' and the 't' to 'k' in "note" changes it to "joke".
    - It would take more than 2 edits for "ants" to equal a dictionary word.
    - "wood" can remain unchanged (0 edits) and match the corresponding dictionary word.
    Thus, we return ["word","note","wood"].
    Example 2:
    Input: queries = ["yes"], dictionary = ["not"]
    Output: []
    Explanation:
    Applying any two edits to "yes" cannot make it equal to "not". Thus, we return an empty array.
      Constraints:
    1 <= queries.length, dictionary.length <= 100
    n == queries[i].length == dictionary[j].length
    1 <= n <= 100
    All queries[i] and dictionary[j] are composed of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] queries = new String[]{"word", "note", "ants", "wood"};
        String[] dictionary = new String[]{"wood", "joke", "moat"};
        List<String> expected = List.of("word", "note", "wood");
        var result = solution.twoEditWords(queries, dictionary);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] queries = new String[]{"yes"};
        String[] dictionary = new String[]{"not"};
        List<String> expected = List.of();
        var result = solution.twoEditWords(queries, dictionary);
        assertThat(result).isEqualTo(expected);
    }

}
