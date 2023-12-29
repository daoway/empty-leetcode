package com.blogspot.ostas.leetcode.all.hard.number_of_excellent_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,1], k = 3
    Output: 5
    Explanation: The excellent pairs are the following:
    - (3, 3). (3 AND 3) and (3 OR 3) are both equal to (11) in binary. The total number of set bits is 2 + 2 = 4, which is greater than or equal to k = 3.
    - (2, 3) and (3, 2). (2 AND 3) is equal to (10) in binary, and (2 OR 3) is equal to (11) in binary. The total number of set bits is 1 + 2 = 3.
    - (1, 3) and (3, 1). (1 AND 3) is equal to (01) in binary, and (1 OR 3) is equal to (11) in binary. The total number of set bits is 1 + 2 = 3.
    So the number of excellent pairs is 5.
    Example 2:
    Input: nums = [5,1,1], k = 10
    Output: 0
    Explanation: There are no excellent pairs for this array.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= k <= 60
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        long expected = 5;
        var result = solution.countExcellentPairs(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 1, 1};
        int k = 10;
        long expected = 0;
        var result = solution.countExcellentPairs(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
