package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_eaten_apples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: apples = [1,2,3,5,2], days = [3,2,1,4,2]
    Output: 7
    Explanation: You can eat 7 apples:
    - On the first day, you eat an apple that grew on the first day.
    - On the second day, you eat an apple that grew on the second day.
    - On the third day, you eat an apple that grew on the second day. After this day, the apples that grew on the third day rot.
    - On the fourth to the seventh days, you eat apples that grew on the fourth day.
    Example 2:
    Input: apples = [3,0,0,0,0,2], days = [3,0,0,0,0,2]
    Output: 5
    Explanation: You can eat 5 apples:
    - On the first to the third day you eat apples that grew on the first day.
    - Do nothing on the fouth and fifth days.
    - On the sixth and seventh days you eat apples that grew on the sixth day.
      Constraints:
    n == apples.length == days.length
    1 <= n <= 2 * 104
    0 <= apples[i], days[i] <= 2 * 104
    days[i] = 0 if and only if apples[i] = 0.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] apples = new int[]{1, 2, 3, 5, 2};
        int[] days = new int[]{3, 2, 1, 4, 2};
        int expected = 7;
        var result = solution.eatenApples(apples, days);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] apples = new int[]{3, 0, 0, 0, 0, 2};
        int[] days = new int[]{3, 0, 0, 0, 0, 2};
        int expected = 5;
        var result = solution.eatenApples(apples, days);
        assertThat(result).isEqualTo(expected);
    }

}
