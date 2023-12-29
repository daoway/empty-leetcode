package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_days_to_make_m_bouquets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
    Output: 3
    Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
    We need 3 bouquets each should contain 1 flower.
    After day 1: [x, _, _, _, _]   // we can only make one bouquet.
    After day 2: [x, _, _, _, x]   // we can only make two bouquets.
    After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
    Example 2:
    Input: bloomDay = [1,10,3,10,2], m = 3, k = 2
    Output: -1
    Explanation: We need 3 bouquets each has 2 flowers, that means we need 6 flowers. We only have 5 flowers so it is impossible to get the needed bouquets and we return -1.
    Example 3:
    Input: bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
    Output: 12
    Explanation: We need 2 bouquets each should have 3 flowers.
    Here is the garden after the 7 and 12 days:
    After day 7: [x, x, x, x, _, x, x]
    We can make one bouquet of the first three flowers that bloomed. We cannot make another bouquet from the last three flowers that bloomed because they are not adjacent.
    After day 12: [x, x, x, x, x, x, x]
    It is obvious that we can make two bouquets in different ways.
      Constraints:
    bloomDay.length == n
    1 <= n <= 105
    1 <= bloomDay[i] <= 109
    1 <= m <= 106
    1 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] bloomDay = new int[]{1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int expected = 3;
        var result = solution.minDays(bloomDay, m, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] bloomDay = new int[]{1, 10, 3, 10, 2};
        int m = 3;
        int k = 2;
        int expected = -1;
        var result = solution.minDays(bloomDay, m, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] bloomDay = new int[]{7, 7, 7, 7, 12, 7, 7};
        int m = 2;
        int k = 3;
        int expected = 12;
        var result = solution.minDays(bloomDay, m, k);
        assertThat(result).isEqualTo(expected);
    }

}
