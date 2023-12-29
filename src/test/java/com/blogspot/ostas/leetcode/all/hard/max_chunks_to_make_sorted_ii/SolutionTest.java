package com.blogspot.ostas.leetcode.all.hard.max_chunks_to_make_sorted_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [5,4,3,2,1]
    Output: 1
    Explanation:
    Splitting into two or more chunks will not return the required result.
    For example, splitting into [5, 4], [3, 2, 1] will result in [4, 5, 1, 2, 3], which isn't sorted.
    Example 2:
    Input: arr = [2,1,3,4,4]
    Output: 4
    Explanation:
    We can split into two chunks, such as [2, 1], [3, 4, 4].
    However, splitting into [2, 1], [3], [4], [4] is the highest number of chunks possible.
      Constraints:
    1 <= arr.length <= 2000
    0 <= arr[i] <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{5, 4, 3, 2, 1};
        int expected = 1;
        var result = solution.maxChunksToSorted(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{2, 1, 3, 4, 4};
        int expected = 4;
        var result = solution.maxChunksToSorted(arr);
        assertThat(result).isEqualTo(expected);
    }

}
