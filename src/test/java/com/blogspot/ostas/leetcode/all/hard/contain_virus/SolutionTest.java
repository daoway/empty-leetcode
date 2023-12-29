package com.blogspot.ostas.leetcode.all.hard.contain_virus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: isInfected = [[0,1,0,0,0,0,0,1],[0,1,0,0,0,0,0,1],[0,0,0,0,0,0,0,1],[0,0,0,0,0,0,0,0]]
    Output: 10
    Explanation: There are 2 contaminated regions.
    On the first day, add 5 walls to quarantine the viral region on the left. The board after the virus spreads is:
    On the second day, add 5 walls to quarantine the viral region on the right. The virus is fully contained.
    Example 2:
    Input: isInfected = [[1,1,1],[1,0,1],[1,1,1]]
    Output: 4
    Explanation: Even though there is only one cell saved, there are 4 walls built.
    Notice that walls are only built on the shared boundary of two different cells.
    Example 3:
    Input: isInfected = [[1,1,1,0,0,0,0,0,0],[1,0,1,0,1,1,1,1,1],[1,1,1,0,0,0,0,0,0]]
    Output: 13
    Explanation: The region on the left only builds two new walls.
      Constraints:
    m == isInfected.length
    n == isInfected[i].length
    1 <= m, n <= 50
    isInfected[i][j] is either 0 or 1.
    There is always a contiguous viral region throughout the described process that will infect strictly more uncontaminated squares in the next round.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] isInfected = new int[][]{{0, 1, 0, 0, 0, 0, 0, 1}, {0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0, 0, 0}};
        int expected = 10;
        var result = solution.containVirus(isInfected);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] isInfected = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int expected = 4;
        var result = solution.containVirus(isInfected);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] isInfected = new int[][]{{1, 1, 1, 0, 0, 0, 0, 0, 0}, {1, 0, 1, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 0, 0, 0}};
        int expected = 13;
        var result = solution.containVirus(isInfected);
        assertThat(result).isEqualTo(expected);
    }

}
