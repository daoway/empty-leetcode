package com.blogspot.ostas.leetcode.all.medium.query_kth_smallest_trimmed_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = ["102","473","251","814"], queries = [[1,1],[2,3],[4,2],[1,2]]
    Output: [2,2,1,0]
    Explanation:
    1. After trimming to the last digit, nums = ["2","3","1","4"]. The smallest number is 1 at index 2.
    2. Trimmed to the last 3 digits, nums is unchanged. The 2nd smallest number is 251 at index 2.
    3. Trimmed to the last 2 digits, nums = ["02","73","51","14"]. The 4th smallest number is 73.
    4. Trimmed to the last 2 digits, the smallest number is 2 at index 0.
       Note that the trimmed number "02" is evaluated as 2.
    Example 2:
    Input: nums = ["24","37","96","04"], queries = [[2,1],[2,2]]
    Output: [3,0]
    Explanation:
    1. Trimmed to the last digit, nums = ["4","7","6","4"]. The 2nd smallest number is 4 at index 3.
       There are two occurrences of 4, but the one at index 0 is considered smaller than the one at index 3.
    2. Trimmed to the last 2 digits, nums is unchanged. The 2nd smallest number is 24.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i].length <= 100
    nums[i] consists of only digits.
    All nums[i].length are equal.
    1 <= queries.length <= 100
    queries[i].length == 2
    1 <= ki <= nums.length
    1 <= trimi <= nums[i].length
      Follow up: Could you use the Radix Sort Algorithm to solve this problem? What will be the complexity of that solution?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] nums = new String[]{"102", "473", "251", "814"};
        int[][] queries = new int[][]{{1, 1}, {2, 3}, {4, 2}, {1, 2}};
        int[] expected = new int[]{2, 2, 1, 0};
        var result = solution.smallestTrimmedNumbers(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] nums = new String[]{"24", "37", "96", "04"};
        int[][] queries = new int[][]{{2, 1}, {2, 2}};
        int[] expected = new int[]{3, 0};
        var result = solution.smallestTrimmedNumbers(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

}
