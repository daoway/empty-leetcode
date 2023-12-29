package com.blogspot.ostas.leetcode.all.hard.remove_boxes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: boxes = [1,3,2,2,2,3,4,3,1]
    Output: 23
    Explanation:
    [1, 3, 2, 2, 2, 3, 4, 3, 1]
    ----> [1, 3, 3, 4, 3, 1] (3*3=9 points)
    ----> [1, 3, 3, 3, 1] (1*1=1 points)
    ----> [1, 1] (3*3=9 points)
    ----> [] (2*2=4 points)
    Example 2:
    Input: boxes = [1,1,1]
    Output: 9
    Example 3:
    Input: boxes = [1]
    Output: 1
      Constraints:
    1 <= boxes.length <= 100
    1 <= boxes[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] boxes = new int[]{1, 3, 2, 2, 2, 3, 4, 3, 1};
        int expected = 23;
        var result = solution.removeBoxes(boxes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] boxes = new int[]{1, 1, 1};
        int expected = 9;
        var result = solution.removeBoxes(boxes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] boxes = new int[]{1};
        int expected = 1;
        var result = solution.removeBoxes(boxes);
        assertThat(result).isEqualTo(expected);
    }

}
