package com.blogspot.ostas.leetcode.all.easy.next_greater_element_i;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
    Output: [-1,3,-1]
    Explanation: The next greater element for each value of nums1 is as follows:
    - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
    - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
    - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
    Example 2:
    Input: nums1 = [2,4], nums2 = [1,2,3,4]
    Output: [3,-1]
    Explanation: The next greater element for each value of nums1 is as follows:
    - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
    - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
      Constraints:
    1 <= nums1.length <= nums2.length <= 1000
    0 <= nums1[i], nums2[i] <= 104
    All integers in nums1 and nums2 are unique.
    All the integers of nums1 also appear in nums2.
      Follow up: Could you find an O(nums1.length + nums2.length) solution?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        int[] expected = new int[]{-1, 3, -1};
        var result = solution.nextGreaterElement(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 4};
        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{3, -1};
        var result = solution.nextGreaterElement(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
