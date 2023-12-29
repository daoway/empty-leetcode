package com.blogspot.ostas.leetcode.all.medium.swap_adjacent_in_lr_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: start = "RXXLRXRXL", end = "XRLXXRRLX"
    Output: true
    Explanation: We can transform start to end following these steps:
    RXXLRXRXL ->
    XRXLRXRXL ->
    XRLXRXRXL ->
    XRLXXRRXL ->
    XRLXXRRLX
    Example 2:
    Input: start = "X", end = "L"
    Output: false
      Constraints:
    1 <= start.length <= 104
    start.length == end.length
    Both start and end will only consist of characters in 'L', 'R', and 'X'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String start = "RXXLRXRXL";
        String end = "XRLXXRRLX";
        boolean expected = true;
        var result = solution.canTransform(start, end);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String start = "X";
        String end = "L";
        boolean expected = false;
        var result = solution.canTransform(start, end);
        assertThat(result).isEqualTo(expected);
    }

}
