package com.blogspot.ostas.leetcode.all.medium.max_chunks_to_make_sorted;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [4,3,2,1,0]
    Output: 1
    Explanation:
    Splitting into two or more chunks will not return the required result.
    For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.
    Example 2:
    Input: arr = [1,0,2,3,4]
    Output: 4
    Explanation:
    We can split into two chunks, such as [1, 0], [2, 3, 4].
    However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.
      Constraints:
    n == arr.length
    1 <= n <= 10
    0 <= arr[i] < n
    All the elements of arr are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{4, 3, 2, 1, 0};
        int expected = 1;
        var result = solution.maxChunksToSorted(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 0, 2, 3, 4};
        int expected = 4;
        var result = solution.maxChunksToSorted(arr);
        assertThat(result).isEqualTo(expected);
    }

}
