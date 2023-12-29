package com.blogspot.ostas.leetcode.all.easy.delete_columns_to_make_sorted;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: strs = ["cba","daf","ghi"]
    Output: 1
    Explanation: The grid looks as follows:
      cba
      daf
      ghi
    Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
    Example 2:
    Input: strs = ["a","b"]
    Output: 0
    Explanation: The grid looks as follows:
      a
      b
    Column 0 is the only column and is sorted, so you will not delete any columns.
    Example 3:
    Input: strs = ["zyx","wvu","tsr"]
    Output: 3
    Explanation: The grid looks as follows:
      zyx
      wvu
      tsr
    All 3 columns are not sorted, so you will delete all 3.
      Constraints:
    n == strs.length
    1 <= n <= 100
    1 <= strs[i].length <= 1000
    strs[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] strs = new String[]{"cba", "daf", "ghi"};
        int expected = 1;
        var result = solution.minDeletionSize(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] strs = new String[]{"a", "b"};
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
