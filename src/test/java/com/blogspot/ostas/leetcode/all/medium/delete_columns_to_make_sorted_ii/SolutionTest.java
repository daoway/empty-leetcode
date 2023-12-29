package com.blogspot.ostas.leetcode.all.medium.delete_columns_to_make_sorted_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: strs = ["ca","bb","ac"]
    Output: 1
    Explanation:
    After deleting the first column, strs = ["a", "b", "c"].
    Now strs is in lexicographic order (ie. strs[0] <= strs[1] <= strs[2]).
    We require at least 1 deletion since initially strs was not in lexicographic order, so the answer is 1.
    Example 2:
    Input: strs = ["xc","yb","za"]
    Output: 0
    Explanation:
    strs is already in lexicographic order, so we do not need to delete anything.
    Note that the rows of strs are not necessarily in lexicographic order:
    i.e., it is NOT necessarily true that (strs[0][0] <= strs[0][1] <= ...)
    Example 3:
    Input: strs = ["zyx","wvu","tsr"]
    Output: 3
    Explanation: We have to delete every column.
      Constraints:
    n == strs.length
    1 <= n <= 100
    1 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] strs = new String[]{"ca", "bb", "ac"};
        int expected = 1;
        var result = solution.minDeletionSize(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] strs = new String[]{"xc", "yb", "za"};
        int expected = 0;
        var result = solution.minDeletionSize(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] strs = new String[]{"zyx", "wvu", "tsr"};
        int expected = 3;
        var result = solution.minDeletionSize(strs);
        assertThat(result).isEqualTo(expected);
    }

}
