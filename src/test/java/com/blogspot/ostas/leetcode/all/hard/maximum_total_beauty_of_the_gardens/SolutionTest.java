package com.blogspot.ostas.leetcode.all.hard.maximum_total_beauty_of_the_gardens;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: flowers = [1,3,1,1], newFlowers = 7, target = 6, full = 12, partial = 1
    Output: 14
    Explanation: Alice can plant
    - 2 flowers in the 0th garden
    - 3 flowers in the 1st garden
    - 1 flower in the 2nd garden
    - 1 flower in the 3rd garden
    The gardens will then be [3,6,2,2]. She planted a total of 2 + 3 + 1 + 1 = 7 flowers.
    There is 1 garden that is complete.
    The minimum number of flowers in the incomplete gardens is 2.
    Thus, the total beauty is 1 * 12 + 2 * 1 = 12 + 2 = 14.
    No other way of planting flowers can obtain a total beauty higher than 14.
    Example 2:
    Input: flowers = [2,4,5,3], newFlowers = 10, target = 5, full = 2, partial = 6
    Output: 30
    Explanation: Alice can plant
    - 3 flowers in the 0th garden
    - 0 flowers in the 1st garden
    - 0 flowers in the 2nd garden
    - 2 flowers in the 3rd garden
    The gardens will then be [5,4,5,5]. She planted a total of 3 + 0 + 0 + 2 = 5 flowers.
    There are 3 gardens that are complete.
    The minimum number of flowers in the incomplete gardens is 4.
    Thus, the total beauty is 3 * 2 + 4 * 6 = 6 + 24 = 30.
    No other way of planting flowers can obtain a total beauty higher than 30.
    Note that Alice could make all the gardens complete but in this case, she would obtain a lower total beauty.
      Constraints:
    1 <= flowers.length <= 105
    1 <= flowers[i], target <= 105
    1 <= newFlowers <= 1010
    1 <= full, partial <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] flowers = new int[]{1, 3, 1, 1};
        long newFlowers = 7;
        int target = 6;
        int full = 12;
        int partial = 1;
        long expected = 14;
        var result = solution.maximumBeauty(flowers, newFlowers, target, full, partial);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] flowers = new int[]{2, 4, 5, 3};
        long newFlowers = 10;
        int target = 5;
        int full = 2;
        int partial = 6;
        long expected = 30;
        var result = solution.maximumBeauty(flowers, newFlowers, target, full, partial);
        assertThat(result).isEqualTo(expected);
    }

}
