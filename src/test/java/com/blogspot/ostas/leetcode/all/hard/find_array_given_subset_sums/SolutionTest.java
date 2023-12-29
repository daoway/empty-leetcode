package com.blogspot.ostas.leetcode.all.hard.find_array_given_subset_sums;

import org.junit.jupiter.api.Test;

import static com.blogspot.ostas.leetcode.all.common.Utils.generatePermutations;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, sums = [-3,-2,-1,0,0,1,2,3]
    Output: [1,2,-3]
    Explanation: [1,2,-3] is able to achieve the given subset sums:
    - []: sum is 0
    - [1]: sum is 1
    - [2]: sum is 2
    - [1,2]: sum is 3
    - [-3]: sum is -3
    - [1,-3]: sum is -2
    - [2,-3]: sum is -1
    - [1,2,-3]: sum is 0
    Note that any permutation of [1,2,-3] and also any permutation of [-1,-2,3] will also be accepted.
    Example 2:
    Input: n = 2, sums = [0,0,0,0]
    Output: [0,0]
    Explanation: The only correct answer is [0,0].
    Example 3:
    Input: n = 4, sums = [0,0,5,5,4,-1,4,9,9,-1,4,3,4,8,3,8]
    Output: [0,-1,4,5]
    Explanation: [0,-1,4,5] is able to achieve the given subset sums.
      Constraints:
    1 <= n <= 15
    sums.length == 2n
    -104 <= sums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[] sums = new int[]{-3, -2, -1, 0, 0, 1, 2, 3};
        int[] expected1 = new int[]{1, 2, -3};
        int[] expected2 = new int[]{-1, -2, 3};
        var result = solution.recoverArray(n, sums);
        assertThat(result)
                .satisfiesAnyOf(
                        k -> assertThat(result).isIn(generatePermutations(expected1)),
                        k -> assertThat(result).isIn(generatePermutations(expected2))
                );
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[] sums = new int[]{0, 0, 0, 0};
        int[] expected = new int[]{0, 0};
        var result = solution.recoverArray(n, sums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int[] sums = new int[]{0, 0, 5, 5, 4, -1, 4, 9, 9, -1, 4, 3, 4, 8, 3, 8};
        int[] expected = new int[]{0, -1, 4, 5};
        var result = solution.recoverArray(n, sums);
        assertThat(result).isIn(generatePermutations(expected));
    }

}
