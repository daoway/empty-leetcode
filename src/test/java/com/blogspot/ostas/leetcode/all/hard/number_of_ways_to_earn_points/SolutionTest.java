package com.blogspot.ostas.leetcode.all.hard.number_of_ways_to_earn_points;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = 6, types = [[6,1],[3,2],[2,3]]
    Output: 7
    Explanation: You can earn 6 points in one of the seven ways:
    - Solve 6 questions of the 0th type: 1 + 1 + 1 + 1 + 1 + 1 = 6
    - Solve 4 questions of the 0th type and 1 question of the 1st type: 1 + 1 + 1 + 1 + 2 = 6
    - Solve 2 questions of the 0th type and 2 questions of the 1st type: 1 + 1 + 2 + 2 = 6
    - Solve 3 questions of the 0th type and 1 question of the 2nd type: 1 + 1 + 1 + 3 = 6
    - Solve 1 question of the 0th type, 1 question of the 1st type and 1 question of the 2nd type: 1 + 2 + 3 = 6
    - Solve 3 questions of the 1st type: 2 + 2 + 2 = 6
    - Solve 2 questions of the 2nd type: 3 + 3 = 6
    Example 2:
    Input: target = 5, types = [[50,1],[50,2],[50,5]]
    Output: 4
    Explanation: You can earn 5 points in one of the four ways:
    - Solve 5 questions of the 0th type: 1 + 1 + 1 + 1 + 1 = 5
    - Solve 3 questions of the 0th type and 1 question of the 1st type: 1 + 1 + 1 + 2 = 5
    - Solve 1 questions of the 0th type and 2 questions of the 1st type: 1 + 2 + 2 = 5
    - Solve 1 question of the 2nd type: 5
    Example 3:
    Input: target = 18, types = [[6,1],[3,2],[2,3]]
    Output: 1
    Explanation: You can only earn 18 points by answering all questions.
      Constraints:
    1 <= target <= 1000
    n == types.length
    1 <= n <= 50
    types[i].length == 2
    1 <= counti, marksi <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int target = 6;
        int[][] types = new int[][]{{6, 1}, {3, 2}, {2, 3}};
        int expected = 7;
        var result = solution.waysToReachTarget(target, types);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int target = 5;
        int[][] types = new int[][]{{50, 1}, {50, 2}, {50, 5}};
        int expected = 4;
        var result = solution.waysToReachTarget(target, types);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int target = 18;
        int[][] types = new int[][]{{6, 1}, {3, 2}, {2, 3}};
        int expected = 1;
        var result = solution.waysToReachTarget(target, types);
        assertThat(result).isEqualTo(expected);
    }

}
