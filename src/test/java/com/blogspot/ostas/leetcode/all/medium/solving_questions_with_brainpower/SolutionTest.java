package com.blogspot.ostas.leetcode.all.medium.solving_questions_with_brainpower;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: questions = [[3,2],[4,3],[4,4],[2,5]]
    Output: 5
    Explanation: The maximum points can be earned by solving questions 0 and 3.
    - Solve question 0: Earn 3 points, will be unable to solve the next 2 questions
    - Unable to solve questions 1 and 2
    - Solve question 3: Earn 2 points
    Total points earned: 3 + 2 = 5. There is no other way to earn 5 or more points.
    Example 2:
    Input: questions = [[1,1],[2,2],[3,3],[4,4],[5,5]]
    Output: 7
    Explanation: The maximum points can be earned by solving questions 1 and 4.
    - Skip question 0
    - Solve question 1: Earn 2 points, will be unable to solve the next 2 questions
    - Unable to solve questions 2 and 3
    - Solve question 4: Earn 5 points
    Total points earned: 2 + 5 = 7. There is no other way to earn 7 or more points.
      Constraints:
    1 <= questions.length <= 105
    questions[i].length == 2
    1 <= pointsi, brainpoweri <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] questions = new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}};
        long expected = 5;
        var result = solution.mostPoints(questions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] questions = new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        long expected = 7;
        var result = solution.mostPoints(questions);
        assertThat(result).isEqualTo(expected);
    }

}
