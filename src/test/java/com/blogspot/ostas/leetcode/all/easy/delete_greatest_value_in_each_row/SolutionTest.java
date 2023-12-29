package com.blogspot.ostas.leetcode.all.easy.delete_greatest_value_in_each_row;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,2,4],[3,3,1]]
    Output: 8
    Explanation: The diagram above shows the removed values in each step.
    - In the first operation, we remove 4 from the first row and 3 from the second row (notice that, there are two cells with value 3 and we can remove any of them). We add 4 to the answer.
    - In the second operation, we remove 2 from the first row and 3 from the second row. We add 3 to the answer.
    - In the third operation, we remove 1 from the first row and 1 from the second row. We add 1 to the answer.
    The final answer = 4 + 3 + 1 = 8.
    Example 2:
    Input: grid = [[10]]
    Output: 10
    Explanation: The diagram above shows the removed values in each step.
    - In the first operation, we remove 10 from the first row. We add 10 to the answer.
    The final answer = 10.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 50
    1 <= grid[i][j] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 4}, {3, 3, 1}};
        int expected = 8;
        var result = solution.deleteGreatestValue(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{10}};
        int expected = 10;
        var result = solution.deleteGreatestValue(grid);
        assertThat(result).isEqualTo(expected);
    }

}
