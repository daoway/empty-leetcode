package com.blogspot.ostas.leetcode.all.hard.delete_columns_to_make_sorted_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: strs = ["babca","bbazb"]
    Output: 3
    Explanation: After deleting columns 0, 1, and 4, the final array is strs = ["bc", "az"].
    Both these rows are individually in lexicographic order (ie. strs[0][0] <= strs[0][1] and strs[1][0] <= strs[1][1]).
    Note that strs[0] > strs[1] - the array strs is not necessarily in lexicographic order.
    Example 2:
    Input: strs = ["edcba"]
    Output: 4
    Explanation: If we delete less than 4 columns, the only row will not be lexicographically sorted.
    Example 3:
    Input: strs = ["ghi","def","abc"]
    Output: 0
    Explanation: All rows are already lexicographically sorted.
      Constraints:
    n == strs.length
    1 <= n <= 100
    1 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] strs = new String[]{"babca", "bbazb"};
        int expected = 3;
        var result = solution.minDeletionSize(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] strs = new String[]{"edcba"};
        int expected = 4;
        var result = solution.minDeletionSize(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] strs = new String[]{"ghi", "def", "abc"};
        int expected = 0;
        var result = solution.minDeletionSize(strs);
        assertThat(result).isEqualTo(expected);
    }

}
