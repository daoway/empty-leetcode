package com.blogspot.ostas.leetcode.all.medium.find_palindrome_with_fixed_length;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: queries = [1,2,3,4,5,90], intLength = 3
    Output: [101,111,121,131,141,999]
    Explanation:
    The first few palindromes of length 3 are:
    101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202, ...
    The 90th palindrome of length 3 is 999.
    Example 2:
    Input: queries = [2,4,6], intLength = 4
    Output: [1111,1331,1551]
    Explanation:
    The first six palindromes of length 4 are:
    1001, 1111, 1221, 1331, 1441, and 1551.
      Constraints:
    1 <= queries.length <= 5 * 104
    1 <= queries[i] <= 109
    1 <= intLength <= 15
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] queries = new int[]{1, 2, 3, 4, 5, 90};
        int intLength = 3;
        long[] expected = new long[]{101, 111, 121, 131, 141, 999};
        var result = solution.kthPalindrome(queries, intLength);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] queries = new int[]{2, 4, 6};
        int intLength = 4;
        long[] expected = new long[]{1111, 1331, 1551};
        var result = solution.kthPalindrome(queries, intLength);
        assertThat(result).isEqualTo(expected);
    }

}
