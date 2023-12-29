package com.blogspot.ostas.leetcode.all.easy.shuffle_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
    Output: "leetcode"
    Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
    Example 2:
    Input: s = "abc", indices = [0,1,2]
    Output: "abc"
    Explanation: After shuffling, each character remains in its position.
      Constraints:
    s.length == indices.length == n
    1 <= n <= 100
    s consists of only lowercase English letters.
    0 <= indices[i] < n
    All values of indices are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        String expected = "leetcode";
        var result = solution.restoreString(s, indices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abc";
        int[] indices = new int[]{0, 1, 2};
        String expected = "abc";
        var result = solution.restoreString(s, indices);
        assertThat(result).isEqualTo(expected);
    }

}
