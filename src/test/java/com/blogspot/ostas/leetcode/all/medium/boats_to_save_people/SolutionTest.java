package com.blogspot.ostas.leetcode.all.medium.boats_to_save_people;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: people = [1,2], limit = 3
    Output: 1
    Explanation: 1 boat (1, 2)
    Example 2:
    Input: people = [3,2,2,1], limit = 3
    Output: 3
    Explanation: 3 boats (1, 2), (2) and (3)
    Example 3:
    Input: people = [3,5,3,4], limit = 5
    Output: 4
    Explanation: 4 boats (3), (3), (4), (5)
      Constraints:
    1 <= people.length <= 5 * 104
    1 <= people[i] <= limit <= 3 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] people = new int[]{1, 2};
        int limit = 3;
        int expected = 1;
        var result = solution.numRescueBoats(people, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] people = new int[]{3, 2, 2, 1};
        int limit = 3;
        int expected = 3;
        var result = solution.numRescueBoats(people, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] people = new int[]{3, 5, 3, 4};
        int limit = 5;
        int expected = 4;
        var result = solution.numRescueBoats(people, limit);
        assertThat(result).isEqualTo(expected);
    }

}
