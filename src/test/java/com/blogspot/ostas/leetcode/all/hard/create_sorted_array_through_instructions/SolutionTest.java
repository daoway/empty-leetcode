package com.blogspot.ostas.leetcode.all.hard.create_sorted_array_through_instructions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: instructions = [1,5,6,2]
    Output: 1
    Explanation: Begin with nums = [].
    Insert 1 with cost min(0, 0) = 0, now nums = [1].
    Insert 5 with cost min(1, 0) = 0, now nums = [1,5].
    Insert 6 with cost min(2, 0) = 0, now nums = [1,5,6].
    Insert 2 with cost min(1, 2) = 1, now nums = [1,2,5,6].
    The total cost is 0 + 0 + 0 + 1 = 1.
    Example 2:
    Input: instructions = [1,2,3,6,5,4]
    Output: 3
    Explanation: Begin with nums = [].
    Insert 1 with cost min(0, 0) = 0, now nums = [1].
    Insert 2 with cost min(1, 0) = 0, now nums = [1,2].
    Insert 3 with cost min(2, 0) = 0, now nums = [1,2,3].
    Insert 6 with cost min(3, 0) = 0, now nums = [1,2,3,6].
    Insert 5 with cost min(3, 1) = 1, now nums = [1,2,3,5,6].
    Insert 4 with cost min(3, 2) = 2, now nums = [1,2,3,4,5,6].
    The total cost is 0 + 0 + 0 + 0 + 1 + 2 = 3.
    Example 3:
    Input: instructions = [1,3,3,3,2,4,2,1,2]
    Output: 4
    Explanation: Begin with nums = [].
    Insert 1 with cost min(0, 0) = 0, now nums = [1].
    Insert 3 with cost min(1, 0) = 0, now nums = [1,3].
    Insert 3 with cost min(1, 0) = 0, now nums = [1,3,3].
    Insert 3 with cost min(1, 0) = 0, now nums = [1,3,3,3].
    Insert 2 with cost min(1, 3) = 1, now nums = [1,2,3,3,3].
    Insert 4 with cost min(5, 0) = 0, now nums = [1,2,3,3,3,4].
    Insert 2 with cost min(1, 4) = 1, now nums = [1,2,2,3,3,3,4].
    Insert 1 with cost min(0, 6) = 0, now nums = [1,1,2,2,3,3,3,4].
    Insert 2 with cost min(2, 4) = 2, now nums = [1,1,2,2,2,3,3,3,4].
    The total cost is 0 + 0 + 0 + 0 + 1 + 0 + 1 + 0 + 2 = 4.
      Constraints:
    1 <= instructions.length <= 105
    1 <= instructions[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] instructions = new int[]{1, 5, 6, 2};
        int expected = 1;
        var result = solution.createSortedArray(instructions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] instructions = new int[]{1, 2, 3, 6, 5, 4};
        int expected = 3;
        var result = solution.createSortedArray(instructions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] instructions = new int[]{1, 3, 3, 3, 2, 4, 2, 1, 2};
        int expected = 4;
        var result = solution.createSortedArray(instructions);
        assertThat(result).isEqualTo(expected);
    }

}
