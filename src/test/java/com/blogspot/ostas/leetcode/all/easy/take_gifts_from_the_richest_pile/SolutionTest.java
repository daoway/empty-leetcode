package com.blogspot.ostas.leetcode.all.easy.take_gifts_from_the_richest_pile;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: gifts = [25,64,9,4,100], k = 4
    Output: 29
    Explanation:
    The gifts are taken in the following way:
    - In the first second, the last pile is chosen and 10 gifts are left behind.
    - Then the second pile is chosen and 8 gifts are left behind.
    - After that the first pile is chosen and 5 gifts are left behind.
    - Finally, the last pile is chosen again and 3 gifts are left behind.
    The final remaining gifts are [5,8,9,4,3], so the total number of gifts remaining is 29.
    Example 2:
    Input: gifts = [1,1,1,1], k = 4
    Output: 4
    Explanation:
    In this case, regardless which pile you choose, you have to leave behind 1 gift in each pile.
    That is, you can't take any pile with you.
    So, the total gifts remaining are 4.
      Constraints:
    1 <= gifts.length <= 103
    1 <= gifts[i] <= 109
    1 <= k <= 103
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] gifts = new int[]{25, 64, 9, 4, 100};
        int k = 4;
        long expected = 29;
        var result = solution.pickGifts(gifts, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] gifts = new int[]{1, 1, 1, 1};
        int k = 4;
        long expected = 4;
        var result = solution.pickGifts(gifts, k);
        assertThat(result).isEqualTo(expected);
    }

}
