package com.blogspot.ostas.leetcode.all.medium.execution_of_all_suffix_instructions_staying_in_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, startPos = [0,1], s = "RRDDLU"
    Output: [1,5,4,3,1,0]
    Explanation: Starting from startPos and beginning execution from the ith instruction:
    - 0th: "RRDDLU". Only one instruction "R" can be executed before it moves off the grid.
    - 1st:  "RDDLU". All five instructions can be executed while it stays in the grid and ends at (1, 1).
    - 2nd:   "DDLU". All four instructions can be executed while it stays in the grid and ends at (1, 0).
    - 3rd:    "DLU". All three instructions can be executed while it stays in the grid and ends at (0, 0).
    - 4th:     "LU". Only one instruction "L" can be executed before it moves off the grid.
    - 5th:      "U". If moving up, it would move off the grid.
    Example 2:
    Input: n = 2, startPos = [1,1], s = "LURD"
    Output: [4,1,0,0]
    Explanation:
    - 0th: "LURD".
    - 1st:  "URD".
    - 2nd:   "RD".
    - 3rd:    "D".
    Example 3:
    Input: n = 1, startPos = [0,0], s = "LRUD"
    Output: [0,0,0,0]
    Explanation: No matter which instruction the robot begins execution from, it would move off the grid.
      Constraints:
    m == s.length
    1 <= n, m <= 500
    startPos.length == 2
    0 <= startrow, startcol < n
    s consists of 'L', 'R', 'U', and 'D'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[] startPos = new int[]{0, 1};
        String s = "RRDDLU";
        int[] expected = new int[]{1, 5, 4, 3, 1, 0};
        var result = solution.executeInstructions(n, startPos, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[] startPos = new int[]{1, 1};
        String s = "LURD";
        int[] expected = new int[]{4, 1, 0, 0};
        var result = solution.executeInstructions(n, startPos, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 1;
        int[] startPos = new int[]{0, 0};
        String s = "LRUD";
        int[] expected = new int[]{0, 0, 0, 0};
        var result = solution.executeInstructions(n, startPos, s);
        assertThat(result).isEqualTo(expected);
    }

}
