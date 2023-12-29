package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_operations_to_move_all_balls_to_each_box;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: boxes = "110"
    Output: [1,1,3]
    Explanation: The answer for each box is as follows:
    1) First box: you will have to move one ball from the second box to the first box in one operation.
    2) Second box: you will have to move one ball from the first box to the second box in one operation.
    3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.
    Example 2:
    Input: boxes = "001011"
    Output: [11,8,5,4,3,4]
      Constraints:
    n == boxes.length
    1 <= n <= 2000
    boxes[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String boxes = "110";
        int[] expected = new int[]{1, 1, 3};
        var result = solution.minOperations(boxes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String boxes = "001011";
        int[] expected = new int[]{11, 8, 5, 4, 3, 4};
        var result = solution.minOperations(boxes);
        assertThat(result).isEqualTo(expected);
    }

}
