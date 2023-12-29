package com.blogspot.ostas.leetcode.all.hard.gcd_sort_of_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [7,21,3]
    Output: true
    Explanation: We can sort [7,21,3] by performing the following operations:
    - Swap 7 and 21 because gcd(7,21) = 7. nums = [21,7,3]
    - Swap 21 and 3 because gcd(21,3) = 3. nums = [3,7,21]
    Example 2:
    Input: nums = [5,2,6,2]
    Output: false
    Explanation: It is impossible to sort the array because 5 cannot be swapped with any other element.
    Example 3:
    Input: nums = [10,5,9,3,15]
    Output: true
    We can sort [10,5,9,3,15] by performing the following operations:
    - Swap 10 and 15 because gcd(10,15) = 5. nums = [15,5,9,3,10]
    - Swap 15 and 3 because gcd(15,3) = 3. nums = [3,5,9,15,10]
    - Swap 10 and 15 because gcd(10,15) = 5. nums = [3,5,9,10,15]
      Constraints:
    1 <= nums.length <= 3 * 104
    2 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{7, 21, 3};
        boolean expected = true;
        var result = solution.gcdSort(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 2, 6, 2};
        boolean expected = false;
        var result = solution.gcdSort(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{10, 5, 9, 3, 15};
        boolean expected = true;
        var result = solution.gcdSort(nums);
        assertThat(result).isEqualTo(expected);
    }

}
