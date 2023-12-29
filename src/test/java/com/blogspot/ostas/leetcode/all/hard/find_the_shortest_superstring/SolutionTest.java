package com.blogspot.ostas.leetcode.all.hard.find_the_shortest_superstring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["alex","loves","leetcode"]
    Output: "alexlovesleetcode"
    Explanation: All permutations of "alex","loves","leetcode" would also be accepted.
    Example 2:
    Input: words = ["catg","ctaagt","gcta","ttca","atgcatc"]
    Output: "gctaagttcatgcatc"
      Constraints:
    1 <= words.length <= 12
    1 <= words[i].length <= 20
    words[i] consists of lowercase English letters.
    All the strings of words are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"alex", "loves", "leetcode"};
        String expected = "alexlovesleetcode";
        var result = solution.shortestSuperstring(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"catg", "ctaagt", "gcta", "ttca", "atgcatc"};
        String expected = "gctaagttcatgcatc";
        var result = solution.shortestSuperstring(words);
        assertThat(result).isEqualTo(expected);
    }

}
