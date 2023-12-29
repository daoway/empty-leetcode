package com.blogspot.ostas.leetcode.all.easy.number_of_beautiful_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,5,1,4]
    Output: 5
    Explanation: There are 5 beautiful pairs in nums:
    When i = 0 and j = 1: the first digit of nums[0] is 2, and the last digit of nums[1] is 5. We can confirm that 2 and 5 are coprime, since gcd(2,5) == 1.
    When i = 0 and j = 2: the first digit of nums[0] is 2, and the last digit of nums[2] is 1. Indeed, gcd(2,1) == 1.
    When i = 1 and j = 2: the first digit of nums[1] is 5, and the last digit of nums[2] is 1. Indeed, gcd(5,1) == 1.
    When i = 1 and j = 3: the first digit of nums[1] is 5, and the last digit of nums[3] is 4. Indeed, gcd(5,4) == 1.
    When i = 2 and j = 3: the first digit of nums[2] is 1, and the last digit of nums[3] is 4. Indeed, gcd(1,4) == 1.
    Thus, we return 5.
    Example 2:
    Input: nums = [11,21,12]
    Output: 2
    Explanation: There are 2 beautiful pairs:
    When i = 0 and j = 1: the first digit of nums[0] is 1, and the last digit of nums[1] is 1. Indeed, gcd(1,1) == 1.
    When i = 0 and j = 2: the first digit of nums[0] is 1, and the last digit of nums[2] is 2. Indeed, gcd(1,2) == 1.
    Thus, we return 2.
      Constraints:
    2 <= nums.length <= 100
    1 <= nums[i] <= 9999
    nums[i] % 10 != 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 5, 1, 4};
        int expected = 5;
        var result = solution.countBeautifulPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{11, 21, 12};
        int expected = 2;
        var result = solution.countBeautifulPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

}
