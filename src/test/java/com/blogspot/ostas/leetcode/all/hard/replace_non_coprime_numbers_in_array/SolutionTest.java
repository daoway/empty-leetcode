package com.blogspot.ostas.leetcode.all.hard.replace_non_coprime_numbers_in_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [6,4,3,2,7,6,2]
    Output: [12,7,6]
    Explanation:
    - (6, 4) are non-coprime with LCM(6, 4) = 12. Now, nums = [12,3,2,7,6,2].
    - (12, 3) are non-coprime with LCM(12, 3) = 12. Now, nums = [12,2,7,6,2].
    - (12, 2) are non-coprime with LCM(12, 2) = 12. Now, nums = [12,7,6,2].
    - (6, 2) are non-coprime with LCM(6, 2) = 6. Now, nums = [12,7,6].
    There are no more adjacent non-coprime numbers in nums.
    Thus, the final modified array is [12,7,6].
    Note that there are other ways to obtain the same resultant array.
    Example 2:
    Input: nums = [2,2,1,1,3,3,3]
    Output: [2,1,1,3]
    Explanation:
    - (3, 3) are non-coprime with LCM(3, 3) = 3. Now, nums = [2,2,1,1,3,3].
    - (3, 3) are non-coprime with LCM(3, 3) = 3. Now, nums = [2,2,1,1,3].
    - (2, 2) are non-coprime with LCM(2, 2) = 2. Now, nums = [2,1,1,3].
    There are no more adjacent non-coprime numbers in nums.
    Thus, the final modified array is [2,1,1,3].
    Note that there are other ways to obtain the same resultant array.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 105
    The test cases are generated such that the values in the final array are less than or equal to 108.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{6, 4, 3, 2, 7, 6, 2};
        List<Integer> expected = List.of(12, 7, 6);
        var result = solution.replaceNonCoprimes(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 1, 1, 3, 3, 3};
        List<Integer> expected = List.of(2, 1, 1, 3);
        var result = solution.replaceNonCoprimes(nums);
        assertThat(result).isEqualTo(expected);
    }

}
