package com.blogspot.ostas.leetcode.all.hard.find_a_value_of_a_mysterious_function_closest_to_target;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [9,12,3,7,15], target = 5
    Output: 2
    Explanation: Calling func with all the pairs of [l,r] = [[0,0],[1,1],[2,2],[3,3],[4,4],[0,1],[1,2],[2,3],[3,4],[0,2],[1,3],[2,4],[0,3],[1,4],[0,4]], Winston got the following results [9,12,3,7,15,8,0,3,7,0,0,3,0,0,0]. The value closest to 5 is 7 and 3, thus the minimum difference is 2.
    Example 2:
    Input: arr = [1000000,1000000,1000000], target = 1
    Output: 999999
    Explanation: Winston called the func with all possible values of [l,r] and he always got 1000000, thus the min difference is 999999.
    Example 3:
    Input: arr = [1,2,4,8,16], target = 0
    Output: 0
      Constraints:
    1 <= arr.length <= 105
    1 <= arr[i] <= 106
    0 <= target <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{9, 12, 3, 7, 15};
        int target = 5;
        int expected = 2;
        var result = solution.closestToTarget(arr, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1000000, 1000000, 1000000};
        int target = 1;
        int expected = 999999;
        var result = solution.closestToTarget(arr, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 4, 8, 16};
        int target = 0;
        int expected = 0;
        var result = solution.closestToTarget(arr, target);
        assertThat(result).isEqualTo(expected);
    }

}
