package com.blogspot.ostas.leetcode.all.medium.count_the_hidden_sequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: differences = [1,-3,4], lower = 1, upper = 6
    Output: 2
    Explanation: The possible hidden sequences are:
    - [3, 4, 1, 5]
    - [4, 5, 2, 6]
    Thus, we return 2.
    Example 2:
    Input: differences = [3,-4,5,1,-2], lower = -4, upper = 5
    Output: 4
    Explanation: The possible hidden sequences are:
    - [-3, 0, -4, 1, 2, 0]
    - [-2, 1, -3, 2, 3, 1]
    - [-1, 2, -2, 3, 4, 2]
    - [0, 3, -1, 4, 5, 3]
    Thus, we return 4.
    Example 3:
    Input: differences = [4,-7,2], lower = 3, upper = 6
    Output: 0
    Explanation: There are no possible hidden sequences. Thus, we return 0.
      Constraints:
    n == differences.length
    1 <= n <= 105
    -105 <= differences[i] <= 105
    -105 <= lower <= upper <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] differences = new int[]{1, -3, 4};
        int lower = 1;
        int upper = 6;
        int expected = 2;
        var result = solution.numberOfArrays(differences, lower, upper);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] differences = new int[]{3, -4, 5, 1, -2};
        int lower = -4;
        int upper = 5;
        int expected = 4;
        var result = solution.numberOfArrays(differences, lower, upper);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] differences = new int[]{4, -7, 2};
        int lower = 3;
        int upper = 6;
        int expected = 0;
        var result = solution.numberOfArrays(differences, lower, upper);
        assertThat(result).isEqualTo(expected);
    }

}
