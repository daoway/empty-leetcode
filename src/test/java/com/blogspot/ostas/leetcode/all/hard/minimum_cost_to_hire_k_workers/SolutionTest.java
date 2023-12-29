package com.blogspot.ostas.leetcode.all.hard.minimum_cost_to_hire_k_workers;

import org.junit.jupiter.api.Test;

import static com.blogspot.ostas.leetcode.all.common.Utils.round;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: quality = [10,20,5], wage = [70,50,30], k = 2
    Output: 105.00000
    Explanation: We pay 70 to 0th worker and 35 to 2nd worker.
    Example 2:
    Input: quality = [3,1,10,10,1], wage = [4,8,2,2,7], k = 3
    Output: 30.66667
    Explanation: We pay 4 to 0th worker, 13.33333 to 2nd and 3rd workers separately.
      Constraints:
    n == quality.length == wage.length
    1 <= k <= n <= 104
    1 <= quality[i], wage[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] quality = new int[]{10, 20, 5};
        int[] wage = new int[]{70, 50, 30};
        int k = 2;
        double expected = 105.00000;
        var result = solution.mincostToHireWorkers(quality, wage, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] quality = new int[]{3, 1, 10, 10, 1};
        int[] wage = new int[]{4, 8, 2, 2, 7};
        int k = 3;
        double expected = 30.66667;
        var result = solution.mincostToHireWorkers(quality, wage, k);
        assertThat(round(result)).isEqualTo(expected);
    }

}
