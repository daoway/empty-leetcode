package com.blogspot.ostas.leetcode.all.medium.move_pieces_to_obtain_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: start = "_L__R__R_", target = "L______RR"
    Output: true
    Explanation: We can obtain the string target from start by doing the following moves:
    - Move the first piece one step to the left, start becomes equal to "L___R__R_".
    - Move the last piece one step to the right, start becomes equal to "L___R___R".
    - Move the second piece three steps to the right, start becomes equal to "L______RR".
    Since it is possible to get the string target from start, we return true.
    Example 2:
    Input: start = "R_L_", target = "__LR"
    Output: false
    Explanation: The 'R' piece in the string start can move one step to the right to obtain "_RL_".
    After that, no pieces can move anymore, so it is impossible to obtain the string target from start.
    Example 3:
    Input: start = "_R", target = "R_"
    Output: false
    Explanation: The piece in the string start can move only to the right, so it is impossible to obtain the string target from start.
      Constraints:
    n == start.length == target.length
    1 <= n <= 105
    start and target consist of the characters 'L', 'R', and '_'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String start = "_L__R__R_";
        String target = "L______RR";
        boolean expected = true;
        var result = solution.canChange(start, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String start = "R_L_";
        String target = "__LR";
        boolean expected = false;
        var result = solution.canChange(start, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String start = "_R";
        String target = "R_";
        boolean expected = false;
        var result = solution.canChange(start, target);
        assertThat(result).isEqualTo(expected);
    }

}
