package com.blogspot.ostas.leetcode.all.medium.all_divisions_with_the_highest_score_of_a_binary_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,0,1,0]
    Output: [2,4]
    Explanation: Division at index
    - 0: numsleft is []. numsright is [0,0,1,0]. The score is 0 + 1 = 1.
    - 1: numsleft is [0]. numsright is [0,1,0]. The score is 1 + 1 = 2.
    - 2: numsleft is [0,0]. numsright is [1,0]. The score is 2 + 1 = 3.
    - 3: numsleft is [0,0,1]. numsright is [0]. The score is 2 + 0 = 2.
    - 4: numsleft is [0,0,1,0]. numsright is []. The score is 3 + 0 = 3.
    Indices 2 and 4 both have the highest possible division score 3.
    Note the answer [4,2] would also be accepted.
    Example 2:
    Input: nums = [0,0,0]
    Output: [3]
    Explanation: Division at index
    - 0: numsleft is []. numsright is [0,0,0]. The score is 0 + 0 = 0.
    - 1: numsleft is [0]. numsright is [0,0]. The score is 1 + 0 = 1.
    - 2: numsleft is [0,0]. numsright is [0]. The score is 2 + 0 = 2.
    - 3: numsleft is [0,0,0]. numsright is []. The score is 3 + 0 = 3.
    Only index 3 has the highest possible division score 3.
    Example 3:
    Input: nums = [1,1]
    Output: [0]
    Explanation: Division at index
    - 0: numsleft is []. numsright is [1,1]. The score is 0 + 2 = 2.
    - 1: numsleft is [1]. numsright is [1]. The score is 0 + 1 = 1.
    - 2: numsleft is [1,1]. numsright is []. The score is 0 + 0 = 0.
    Only index 0 has the highest possible division score 2.
      Constraints:
    n == nums.length
    1 <= n <= 105
    nums[i] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 1, 0};
        List<Integer> expected = List.of(2, 4);
        var result = solution.maxScoreIndices(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 0};
        List<Integer> expected = List.of(3);
        var result = solution.maxScoreIndices(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1};
        List<Integer> expected = List.of(0);
        var result = solution.maxScoreIndices(nums);
        assertThat(result).isEqualTo(expected);
    }

}
