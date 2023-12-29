package com.blogspot.ostas.leetcode.all.medium.count_collisions_of_monkeys_on_a_polygon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 6
    Explanation: There are 8 total possible movements.
    Two ways such that they collide at some point are:
    - Monkey 1 moves in a clockwise direction; monkey 2 moves in an anticlockwise direction; monkey 3 moves in a clockwise direction. Monkeys 1 and 2 collide.
    - Monkey 1 moves in an anticlockwise direction; monkey 2 moves in an anticlockwise direction; monkey 3 moves in a clockwise direction. Monkeys 1 and 3 collide.
    It can be shown 6 total movements result in a collision.
    Example 2:
    Input: n = 4
    Output: 14
    Explanation: It can be shown that there are 14 ways for the monkeys to collide.
      Constraints:
    3 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 6;
        var result = solution.monkeyMove(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int expected = 14;
        var result = solution.monkeyMove(n);
        assertThat(result).isEqualTo(expected);
    }

}
