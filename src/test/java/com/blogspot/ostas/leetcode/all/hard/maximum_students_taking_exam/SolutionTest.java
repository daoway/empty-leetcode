package com.blogspot.ostas.leetcode.all.hard.maximum_students_taking_exam;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: seats = [["#",".","#","#",".","#"],
                [".","#","#","#","#","."],
                ["#",".","#","#",".","#"]]
    Output: 4
    Explanation: Teacher can place 4 students in available seats so they don't cheat on the exam.
    Example 2:
    Input: seats = [[".","#"],
                ["#","#"],
                ["#","."],
                ["#","#"],
                [".","#"]]
    Output: 3
    Explanation: Place all students in available seats.
    Example 3:
    Input: seats = [["#",".",".",".","#"],
                [".","#",".","#","."],
                [".",".","#",".","."],
                [".","#",".","#","."],
                ["#",".",".",".","#"]]
    Output: 10
    Explanation: Place students in available seats in column 1, 3 and 5.
      Constraints:
    seats contains only characters '.' and'#'.
    m == seats.length
    n == seats[i].length
    1 <= m <= 8
    1 <= n <= 8
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[][] seats = new char[][]{{'#', '.', '#', '#', '.', '#'}, {'.', '#', '#', '#', '#', '.'},
                {'#', '.', '#', '#', '.', '#'}};
        int expected = 4;
        var result = solution.maxStudents(seats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[][] seats = new char[][]{{'.', '#'}, {'#', '#'}, {'#', '.'}, {'#', '#'}, {'.', '#'}};
        int expected = 3;
        var result = solution.maxStudents(seats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        char[][] seats = new char[][]{{'#', '.', '.', '.', '#'}, {'.', '#', '.', '#', '.'},
                {'.', '.', '#', '.', '.'}, {'.', '#', '.', '#', '.'}, {'#', '.', '.', '.', '#'}};
        int expected = 10;
        var result = solution.maxStudents(seats);
        assertThat(result).isEqualTo(expected);
    }

}
