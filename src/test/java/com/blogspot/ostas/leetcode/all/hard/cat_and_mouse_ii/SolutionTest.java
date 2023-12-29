package com.blogspot.ostas.leetcode.all.hard.cat_and_mouse_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = ["####F","#C...","M...."], catJump = 1, mouseJump = 2
    Output: true
    Explanation: Cat cannot catch Mouse on its turn nor can it get the food before Mouse.
    Example 2:
    Input: grid = ["M.C...F"], catJump = 1, mouseJump = 4
    Output: true
    Example 3:
    Input: grid = ["M.C...F"], catJump = 1, mouseJump = 3
    Output: false
      Constraints:
    rows == grid.length
    cols = grid[i].length
    1 <= rows, cols <= 8
    grid[i][j] consist only of characters 'C', 'M', 'F', '.', and '#'.
    There is only one of each character 'C', 'M', and 'F' in grid.
    1 <= catJump, mouseJump <= 8
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] grid = new String[]{"####F", "#C...", "M...."};
        int catJump = 1;
        int mouseJump = 2;
        boolean expected = true;
        var result = solution.canMouseWin(grid, catJump, mouseJump);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] grid = new String[]{"M.C...F"};
        int catJump = 1;
        int mouseJump = 4;
        boolean expected = true;
        var result = solution.canMouseWin(grid, catJump, mouseJump);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] grid = new String[]{"M.C...F"};
        int catJump = 1;
        int mouseJump = 3;
        boolean expected = false;
        var result = solution.canMouseWin(grid, catJump, mouseJump);
        assertThat(result).isEqualTo(expected);
    }

}
