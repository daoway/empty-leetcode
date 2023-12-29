package com.blogspot.ostas.leetcode.all.easy.count_hills_and_valleys_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,4,1,1,6,5]
    Output: 3
    Explanation:
    At index 0: There is no non-equal neighbor of 2 on the left, so index 0 is neither a hill nor a valley.
    At index 1: The closest non-equal neighbors of 4 are 2 and 1. Since 4 > 2 and 4 > 1, index 1 is a hill.
    At index 2: The closest non-equal neighbors of 1 are 4 and 6. Since 1 < 4 and 1 < 6, index 2 is a valley.
    At index 3: The closest non-equal neighbors of 1 are 4 and 6. Since 1 < 4 and 1 < 6, index 3 is a valley, but note that it is part of the same valley as index 2.
    At index 4: The closest non-equal neighbors of 6 are 1 and 5. Since 6 > 1 and 6 > 5, index 4 is a hill.
    At index 5: There is no non-equal neighbor of 5 on the right, so index 5 is neither a hill nor a valley.
    There are 3 hills and valleys so we return 3.
    Example 2:
    Input: nums = [6,6,5,5,4,1]
    Output: 0
    Explanation:
    At index 0: There is no non-equal neighbor of 6 on the left, so index 0 is neither a hill nor a valley.
    At index 1: There is no non-equal neighbor of 6 on the left, so index 1 is neither a hill nor a valley.
    At index 2: The closest non-equal neighbors of 5 are 6 and 4. Since 5 < 6 and 5 > 4, index 2 is neither a hill nor a valley.
    At index 3: The closest non-equal neighbors of 5 are 6 and 4. Since 5 < 6 and 5 > 4, index 3 is neither a hill nor a valley.
    At index 4: The closest non-equal neighbors of 4 are 5 and 1. Since 4 < 5 and 4 > 1, index 4 is neither a hill nor a valley.
    At index 5: There is no non-equal neighbor of 1 on the right, so index 5 is neither a hill nor a valley.
    There are 0 hills and valleys so we return 0.
      Constraints:
    3 <= nums.length <= 100
    1 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 1, 1, 6, 5};
        int expected = 3;
        var result = solution.countHillValley(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{6, 6, 5, 5, 4, 1};
        int expected = 0;
        var result = solution.countHillValley(nums);
        assertThat(result).isEqualTo(expected);
    }

}
