package com.blogspot.ostas.leetcode.all.easy.find_the_highest_altitude;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: gain = [-5,1,5,0,-7]
    Output: 1
    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
    Example 2:
    Input: gain = [-4,-3,-2,-1,4,3,2]
    Output: 0
    Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
      Constraints:
    n == gain.length
    1 <= n <= 100
    -100 <= gain[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] gain = new int[]{-5, 1, 5, 0, -7};
        int expected = 1;
        var result = solution.largestAltitude(gain);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] gain = new int[]{-4, -3, -2, -1, 4, 3, 2};
        int expected = 0;
        var result = solution.largestAltitude(gain);
        assertThat(result).isEqualTo(expected);
    }

}
