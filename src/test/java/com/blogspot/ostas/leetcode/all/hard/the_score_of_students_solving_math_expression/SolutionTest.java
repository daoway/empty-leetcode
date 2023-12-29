package com.blogspot.ostas.leetcode.all.hard.the_score_of_students_solving_math_expression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "7+3*1*2", answers = [20,13,42]
    Output: 7
    Explanation: As illustrated above, the correct answer of the expression is 13, therefore one student is rewarded 5 points: [20,13,42]
    A student might have applied the operators in this wrong order: ((7+3)*1)*2 = 20. Therefore one student is rewarded 2 points: [20,13,42]
    The points for the students are: [2,5,0]. The sum of the points is 2+5+0=7.
    Example 2:
    Input: s = "3+5*2", answers = [13,0,10,13,13,16,16]
    Output: 19
    Explanation: The correct answer of the expression is 13, therefore three students are rewarded 5 points each: [13,0,10,13,13,16,16]
    A student might have applied the operators in this wrong order: ((3+5)*2 = 16. Therefore two students are rewarded 2 points: [13,0,10,13,13,16,16]
    The points for the students are: [5,0,0,5,5,2,2]. The sum of the points is 5+0+0+5+5+2+2=19.
    Example 3:
    Input: s = "6+0*1", answers = [12,9,6,4,8,6]
    Output: 10
    Explanation: The correct answer of the expression is 6.
    If a student had incorrectly done (6+0)*1, the answer would also be 6.
    By the rules of grading, the students will still be rewarded 5 points (as they got the correct answer), not 2 points.
    The points for the students are: [0,0,5,0,0,5]. The sum of the points is 10.
      Constraints:
    3 <= s.length <= 31
    s represents a valid expression that contains only digits 0-9, '+', and '*' only.
    All the integer operands in the expression are in the inclusive range [0, 9].
    1 <= The count of all operators ('+' and '*') in the math expression <= 15
    Test data are generated such that the correct answer of the expression is in the range of [0, 1000].
    n == answers.length
    1 <= n <= 104
    0 <= answers[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "7+3*1*2";
        int[] answers = new int[]{20, 13, 42};
        int expected = 7;
        var result = solution.scoreOfStudents(s, answers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "3+5*2";
        int[] answers = new int[]{13, 0, 10, 13, 13, 16, 16};
        int expected = 19;
        var result = solution.scoreOfStudents(s, answers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "6+0*1";
        int[] answers = new int[]{12, 9, 6, 4, 8, 6};
        int expected = 10;
        var result = solution.scoreOfStudents(s, answers);
        assertThat(result).isEqualTo(expected);
    }

}
