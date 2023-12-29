package com.blogspot.ostas.leetcode.all.hard.number_of_visible_people_in_a_queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: heights = [10,6,8,5,11,9]
    Output: [3,1,2,1,1,0]
    Explanation:
    Person 0 can see person 1, 2, and 4.
    Person 1 can see person 2.
    Person 2 can see person 3 and 4.
    Person 3 can see person 4.
    Person 4 can see person 5.
    Person 5 can see no one since nobody is to the right of them.
    Example 2:
    Input: heights = [5,1,2,3,10]
    Output: [4,1,1,1,0]
      Constraints:
    n == heights.length
    1 <= n <= 105
    1 <= heights[i] <= 105
    All the values of heights are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] heights = new int[]{10, 6, 8, 5, 11, 9};
        int[] expected = new int[]{3, 1, 2, 1, 1, 0};
        var result = solution.canSeePersonsCount(heights);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] heights = new int[]{5, 1, 2, 3, 10};
        int[] expected = new int[]{4, 1, 1, 1, 0};
        var result = solution.canSeePersonsCount(heights);
        assertThat(result).isEqualTo(expected);
    }

}
