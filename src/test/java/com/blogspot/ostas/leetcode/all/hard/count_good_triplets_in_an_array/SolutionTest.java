package com.blogspot.ostas.leetcode.all.hard.count_good_triplets_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [2,0,1,3], nums2 = [0,1,2,3]
    Output: 1
    Explanation:
    There are 4 triplets (x,y,z) such that pos1x < pos1y < pos1z. They are (2,0,1), (2,0,3), (2,1,3), and (0,1,3).
    Out of those triplets, only the triplet (0,1,3) satisfies pos2x < pos2y < pos2z. Hence, there is only 1 good triplet.
    Example 2:
    Input: nums1 = [4,0,1,3,2], nums2 = [4,1,0,2,3]
    Output: 4
    Explanation: The 4 good triplets are (4,0,3), (4,0,2), (4,1,3), and (4,1,2).
      Constraints:
    n == nums1.length == nums2.length
    3 <= n <= 105
    0 <= nums1[i], nums2[i] <= n - 1
    nums1 and nums2 are permutations of [0, 1, ..., n - 1].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{2, 0, 1, 3};
        int[] nums2 = new int[]{0, 1, 2, 3};
        long expected = 1;
        var result = solution.goodTriplets(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{4, 0, 1, 3, 2};
        int[] nums2 = new int[]{4, 1, 0, 2, 3};
        long expected = 4;
        var result = solution.goodTriplets(nums1, nums2);
        assertThat(result).isEqualTo(expected);
    }

}
