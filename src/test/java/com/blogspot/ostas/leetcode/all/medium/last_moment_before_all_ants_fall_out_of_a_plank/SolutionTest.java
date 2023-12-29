package com.blogspot.ostas.leetcode.all.medium.last_moment_before_all_ants_fall_out_of_a_plank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, left = [4,3], right = [0,1]
    Output: 4
    Explanation: In the image above:
    -The ant at index 0 is named A and going to the right.
    -The ant at index 1 is named B and going to the right.
    -The ant at index 3 is named C and going to the left.
    -The ant at index 4 is named D and going to the left.
    The last moment when an ant was on the plank is t = 4 seconds. After that, it falls immediately out of the plank. (i.e., We can say that at t = 4.0000000001, there are no ants on the plank).
    Example 2:
    Input: n = 7, left = [], right = [0,1,2,3,4,5,6,7]
    Output: 7
    Explanation: All ants are going to the right, the ant at index 0 needs 7 seconds to fall.
    Example 3:
    Input: n = 7, left = [0,1,2,3,4,5,6,7], right = []
    Output: 7
    Explanation: All ants are going to the left, the ant at index 7 needs 7 seconds to fall.
      Constraints:
    1 <= n <= 104
    0 <= left.length <= n + 1
    0 <= left[i] <= n
    0 <= right.length <= n + 1
    0 <= right[i] <= n
    1 <= left.length + right.length <= n + 1
    All values of left and right are unique, and each value can appear only in one of the two arrays.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[] left = new int[]{4, 3};
        int[] right = new int[]{0, 1};
        int expected = 4;
        var result = solution.getLastMoment(n, left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int[] left = new int[]{};
        int[] right = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        int expected = 7;
        var result = solution.getLastMoment(n, left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 7;
        int[] left = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        int[] right = new int[]{};
        int expected = 7;
        var result = solution.getLastMoment(n, left, right);
        assertThat(result).isEqualTo(expected);
    }

}
