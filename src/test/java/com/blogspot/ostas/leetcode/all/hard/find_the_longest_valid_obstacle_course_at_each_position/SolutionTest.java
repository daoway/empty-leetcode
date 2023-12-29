package com.blogspot.ostas.leetcode.all.hard.find_the_longest_valid_obstacle_course_at_each_position;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: obstacles = [1,2,3,2]
    Output: [1,2,3,3]
    Explanation: The longest valid obstacle course at each position is:
    - i = 0: [1], [1] has length 1.
    - i = 1: [1,2], [1,2] has length 2.
    - i = 2: [1,2,3], [1,2,3] has length 3.
    - i = 3: [1,2,3,2], [1,2,2] has length 3.
    Example 2:
    Input: obstacles = [2,2,1]
    Output: [1,2,1]
    Explanation: The longest valid obstacle course at each position is:
    - i = 0: [2], [2] has length 1.
    - i = 1: [2,2], [2,2] has length 2.
    - i = 2: [2,2,1], [1] has length 1.
    Example 3:
    Input: obstacles = [3,1,5,6,4,2]
    Output: [1,1,2,3,2,2]
    Explanation: The longest valid obstacle course at each position is:
    - i = 0: [3], [3] has length 1.
    - i = 1: [3,1], [1] has length 1.
    - i = 2: [3,1,5], [3,5] has length 2. [1,5] is also valid.
    - i = 3: [3,1,5,6], [3,5,6] has length 3. [1,5,6] is also valid.
    - i = 4: [3,1,5,6,4], [3,4] has length 2. [1,4] is also valid.
    - i = 5: [3,1,5,6,4,2], [1,2] has length 2.
      Constraints:
    n == obstacles.length
    1 <= n <= 105
    1 <= obstacles[i] <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] obstacles = new int[]{1, 2, 3, 2};
        int[] expected = new int[]{1, 2, 3, 3};
        var result = solution.longestObstacleCourseAtEachPosition(obstacles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] obstacles = new int[]{2, 2, 1};
        int[] expected = new int[]{1, 2, 1};
        var result = solution.longestObstacleCourseAtEachPosition(obstacles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] obstacles = new int[]{3, 1, 5, 6, 4, 2};
        int[] expected = new int[]{1, 1, 2, 3, 2, 2};
        var result = solution.longestObstacleCourseAtEachPosition(obstacles);
        assertThat(result).isEqualTo(expected);
    }

}
