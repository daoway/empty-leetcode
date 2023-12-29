package com.blogspot.ostas.leetcode.all.hard.smallest_missing_genetic_value_in_each_subtree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: parents = [-1,0,0,2], nums = [1,2,3,4]
    Output: [5,1,1,1]
    Explanation: The answer for each subtree is calculated as follows:
    - 0: The subtree contains nodes [0,1,2,3] with values [1,2,3,4]. 5 is the smallest missing value.
    - 1: The subtree contains only node 1 with value 2. 1 is the smallest missing value.
    - 2: The subtree contains nodes [2,3] with values [3,4]. 1 is the smallest missing value.
    - 3: The subtree contains only node 3 with value 4. 1 is the smallest missing value.
    Example 2:
    Input: parents = [-1,0,1,0,3,3], nums = [5,4,6,2,1,3]
    Output: [7,1,1,4,2,1]
    Explanation: The answer for each subtree is calculated as follows:
    - 0: The subtree contains nodes [0,1,2,3,4,5] with values [5,4,6,2,1,3]. 7 is the smallest missing value.
    - 1: The subtree contains nodes [1,2] with values [4,6]. 1 is the smallest missing value.
    - 2: The subtree contains only node 2 with value 6. 1 is the smallest missing value.
    - 3: The subtree contains nodes [3,4,5] with values [2,1,3]. 4 is the smallest missing value.
    - 4: The subtree contains only node 4 with value 1. 2 is the smallest missing value.
    - 5: The subtree contains only node 5 with value 3. 1 is the smallest missing value.
    Example 3:
    Input: parents = [-1,2,3,0,2,4,1], nums = [2,3,4,5,6,7,8]
    Output: [1,1,1,1,1,1,1]
    Explanation: The value 1 is missing from all the subtrees.
      Constraints:
    n == parents.length == nums.length
    2 <= n <= 105
    0 <= parents[i] <= n - 1 for i != 0
    parents[0] == -1
    parents represents a valid tree.
    1 <= nums[i] <= 105
    Each nums[i] is distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] parents = new int[]{-1, 0, 0, 2};
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{5, 1, 1, 1};
        var result = solution.smallestMissingValueSubtree(parents, nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] parents = new int[]{-1, 0, 1, 0, 3, 3};
        int[] nums = new int[]{5, 4, 6, 2, 1, 3};
        int[] expected = new int[]{7, 1, 1, 4, 2, 1};
        var result = solution.smallestMissingValueSubtree(parents, nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] parents = new int[]{-1, 2, 3, 0, 2, 4, 1};
        int[] nums = new int[]{2, 3, 4, 5, 6, 7, 8};
        int[] expected = new int[]{1, 1, 1, 1, 1, 1, 1};
        var result = solution.smallestMissingValueSubtree(parents, nums);
        assertThat(result).isEqualTo(expected);
    }

}
