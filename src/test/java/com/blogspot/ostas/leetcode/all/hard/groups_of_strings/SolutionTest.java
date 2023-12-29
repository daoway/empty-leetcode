package com.blogspot.ostas.leetcode.all.hard.groups_of_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["a","b","ab","cde"]
    Output: [2,3]
    Explanation:
    - words[0] can be used to obtain words[1] (by replacing 'a' with 'b'), and words[2] (by adding 'b'). So words[0] is connected to words[1] and words[2].
    - words[1] can be used to obtain words[0] (by replacing 'b' with 'a'), and words[2] (by adding 'a'). So words[1] is connected to words[0] and words[2].
    - words[2] can be used to obtain words[0] (by deleting 'b'), and words[1] (by deleting 'a'). So words[2] is connected to words[0] and words[1].
    - words[3] is not connected to any string in words.
    Thus, words can be divided into 2 groups ["a","b","ab"] and ["cde"]. The size of the largest group is 3.
    Example 2:
    Input: words = ["a","ab","abc"]
    Output: [1,3]
    Explanation:
    - words[0] is connected to words[1].
    - words[1] is connected to words[0] and words[2].
    - words[2] is connected to words[1].
    Since all strings are connected to each other, they should be grouped together.
    Thus, the size of the largest group is 3.
      Constraints:
    1 <= words.length <= 2 * 104
    1 <= words[i].length <= 26
    words[i] consists of lowercase English letters only.
    No letter occurs more than once in words[i].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"a", "b", "ab", "cde"};
        int[] expected = new int[]{2, 3};
        var result = solution.groupStrings(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"a", "ab", "abc"};
        int[] expected = new int[]{1, 3};
        var result = solution.groupStrings(words);
        assertThat(result).isEqualTo(expected);
    }

}
