package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_increments_on_subarrays_to_form_a_target_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = [1,2,3,2,1]
    Output: 3
    Explanation: We need at least 3 operations to form the target array from the initial array.
    [0,0,0,0,0] increment 1 from index 0 to 4 (inclusive).
    [1,1,1,1,1] increment 1 from index 1 to 3 (inclusive).
    [1,2,2,2,1] increment 1 at index 2.
    [1,2,3,2,1] target array is formed.
    Example 2:
    Input: target = [3,1,1,2]
    Output: 4
    Explanation: [0,0,0,0] -> [1,1,1,1] -> [1,1,1,2] -> [2,1,1,2] -> [3,1,1,2]
    Example 3:
    Input: target = [3,1,5,4,2]
    Output: 7
    Explanation: [0,0,0,0,0] -> [1,1,1,1,1] -> [2,1,1,1,1] -> [3,1,1,1,1] -> [3,1,2,2,2] -> [3,1,3,3,2] -> [3,1,4,4,2] -> [3,1,5,4,2].
      Constraints:
    1 <= target.length <= 105
    1 <= target[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] target = new int[]{1, 2, 3, 2, 1};
        int expected = 3;
        var result = solution.minNumberOperations(target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] target = new int[]{3, 1, 1, 2};
        int expected = 4;
        var result = solution.minNumberOperations(target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] target = new int[]{3, 1, 5, 4, 2};
        int expected = 7;
        var result = solution.minNumberOperations(target);
        assertThat(result).isEqualTo(expected);
    }

}
