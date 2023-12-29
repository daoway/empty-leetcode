package com.blogspot.ostas.leetcode.all.medium.jump_game_vii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "011010", minJump = 2, maxJump = 3
    Output: true
    Explanation:
    In the first step, move from index 0 to index 3.
    In the second step, move from index 3 to index 5.
    Example 2:
    Input: s = "01101110", minJump = 2, maxJump = 3
    Output: false
      Constraints:
    2 <= s.length <= 105
    s[i] is either '0' or '1'.
    s[0] == '0'
    1 <= minJump <= maxJump < s.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "011010";
        int minJump = 2;
        int maxJump = 3;
        boolean expected = true;
        var result = solution.canReach(s, minJump, maxJump);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "01101110";
        int minJump = 2;
        int maxJump = 3;
        boolean expected = false;
        var result = solution.canReach(s, minJump, maxJump);
        assertThat(result).isEqualTo(expected);
    }

}
