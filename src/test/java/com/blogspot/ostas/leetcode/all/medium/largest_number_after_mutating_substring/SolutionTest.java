package com.blogspot.ostas.leetcode.all.medium.largest_number_after_mutating_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "132", change = [9,8,5,0,3,6,4,2,6,8]
    Output: "832"
    Explanation: Replace the substring "1":
    - 1 maps to change[1] = 8.
    Thus, "132" becomes "832".
    "832" is the largest number that can be created, so return it.
    Example 2:
    Input: num = "021", change = [9,4,3,5,7,2,1,9,0,6]
    Output: "934"
    Explanation: Replace the substring "021":
    - 0 maps to change[0] = 9.
    - 2 maps to change[2] = 3.
    - 1 maps to change[1] = 4.
    Thus, "021" becomes "934".
    "934" is the largest number that can be created, so return it.
    Example 3:
    Input: num = "5", change = [1,4,7,5,3,2,5,6,9,4]
    Output: "5"
    Explanation: "5" is already the largest number that can be created, so return it.
      Constraints:
    1 <= num.length <= 105
    num consists of only digits 0-9.
    change.length == 10
    0 <= change[d] <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "132";
        int[] change = new int[]{9, 8, 5, 0, 3, 6, 4, 2, 6, 8};
        String expected = "832";
        var result = solution.maximumNumber(num, change);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "021";
        int[] change = new int[]{9, 4, 3, 5, 7, 2, 1, 9, 0, 6};
        String expected = "934";
        var result = solution.maximumNumber(num, change);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "5";
        int[] change = new int[]{1, 4, 7, 5, 3, 2, 5, 6, 9, 4};
        String expected = "5";
        var result = solution.maximumNumber(num, change);
        assertThat(result).isEqualTo(expected);
    }

}
