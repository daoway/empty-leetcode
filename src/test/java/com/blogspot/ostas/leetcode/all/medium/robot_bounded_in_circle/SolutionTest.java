package com.blogspot.ostas.leetcode.all.medium.robot_bounded_in_circle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: instructions = "GGLLGG"
    Output: true
    Explanation: The robot is initially at (0, 0) facing the north direction.
    "G": move one step. Position: (0, 1). Direction: North.
    "G": move one step. Position: (0, 2). Direction: North.
    "L": turn 90 degrees anti-clockwise. Position: (0, 2). Direction: West.
    "L": turn 90 degrees anti-clockwise. Position: (0, 2). Direction: South.
    "G": move one step. Position: (0, 1). Direction: South.
    "G": move one step. Position: (0, 0). Direction: South.
    Repeating the instructions, the robot goes into the cycle: (0, 0) --> (0, 1) --> (0, 2) --> (0, 1) --> (0, 0).
    Based on that, we return true.
    Example 2:
    Input: instructions = "GG"
    Output: false
    Explanation: The robot is initially at (0, 0) facing the north direction.
    "G": move one step. Position: (0, 1). Direction: North.
    "G": move one step. Position: (0, 2). Direction: North.
    Repeating the instructions, keeps advancing in the north direction and does not go into cycles.
    Based on that, we return false.
    Example 3:
    Input: instructions = "GL"
    Output: true
    Explanation: The robot is initially at (0, 0) facing the north direction.
    "G": move one step. Position: (0, 1). Direction: North.
    "L": turn 90 degrees anti-clockwise. Position: (0, 1). Direction: West.
    "G": move one step. Position: (-1, 1). Direction: West.
    "L": turn 90 degrees anti-clockwise. Position: (-1, 1). Direction: South.
    "G": move one step. Position: (-1, 0). Direction: South.
    "L": turn 90 degrees anti-clockwise. Position: (-1, 0). Direction: East.
    "G": move one step. Position: (0, 0). Direction: East.
    "L": turn 90 degrees anti-clockwise. Position: (0, 0). Direction: North.
    Repeating the instructions, the robot goes into the cycle: (0, 0) --> (0, 1) --> (-1, 1) --> (-1, 0) --> (0, 0).
    Based on that, we return true.
      Constraints:
    1 <= instructions.length <= 100
    instructions[i] is 'G', 'L' or, 'R'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String instructions = "GGLLGG";
        boolean expected = true;
        var result = solution.isRobotBounded(instructions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String instructions = "GG";
        boolean expected = false;
        var result = solution.isRobotBounded(instructions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String instructions = "GL";
        boolean expected = true;
        var result = solution.isRobotBounded(instructions);
        assertThat(result).isEqualTo(expected);
    }

}
