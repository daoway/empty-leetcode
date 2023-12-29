package com.blogspot.ostas.leetcode.all.easy.divide_a_string_into_groups_of_size_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcdefghi", k = 3, fill = "x"
    Output: ["abc","def","ghi"]
    Explanation:
    The first 3 characters "abc" form the first group.
    The next 3 characters "def" form the second group.
    The last 3 characters "ghi" form the third group.
    Since all groups can be completely filled by characters from the string, we do not need to use fill.
    Thus, the groups formed are "abc", "def", and "ghi".
    Example 2:
    Input: s = "abcdefghij", k = 3, fill = "x"
    Output: ["abc","def","ghi","jxx"]
    Explanation:
    Similar to the previous example, we are forming the first three groups "abc", "def", and "ghi".
    For the last group, we can only use the character 'j' from the string. To complete this group, we add 'x' twice.
    Thus, the 4 groups formed are "abc", "def", "ghi", and "jxx".
      Constraints:
    1 <= s.length <= 100
    s consists of lowercase English letters only.
    1 <= k <= 100
    fill is a lowercase English letter.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcdefghi";
        int k = 3;
        char fill = 'x';
        String[] expected = new String[]{"abc", "def", "ghi"};
        var result = solution.divideString(s, k, fill);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        String[] expected = new String[]{"abc", "def", "ghi", "jxx"};
        var result = solution.divideString(s, k, fill);
        assertThat(result).isEqualTo(expected);
    }

}
