package com.blogspot.ostas.leetcode.all.easy.robot_return_to_origin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: moves = "UD"
    Output: true
    Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
    Example 2:
    Input: moves = "LL"
    Output: false
    Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
      Constraints:
    1 <= moves.length <= 2 * 104
    moves only contains the characters 'U', 'D', 'L' and 'R'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String moves = "UD";
        boolean expected = true;
        var result = solution.judgeCircle(moves);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String moves = "LL";
        boolean expected = false;
        var result = solution.judgeCircle(moves);
        assertThat(result).isEqualTo(expected);
    }

}
