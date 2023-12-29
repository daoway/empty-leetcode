package com.blogspot.ostas.leetcode.all.medium.minimum_lines_to_represent_a_line_chart;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stockPrices = [[1,7],[2,6],[3,5],[4,4],[5,4],[6,3],[7,2],[8,1]]
    Output: 3
    Explanation:
    The diagram above represents the input, with the X-axis representing the day and Y-axis representing the price.
    The following 3 lines can be drawn to represent the line chart:
    - Line 1 (in red) from (1,7) to (4,4) passing through (1,7), (2,6), (3,5), and (4,4).
    - Line 2 (in blue) from (4,4) to (5,4).
    - Line 3 (in green) from (5,4) to (8,1) passing through (5,4), (6,3), (7,2), and (8,1).
    It can be shown that it is not possible to represent the line chart using less than 3 lines.
    Example 2:
    Input: stockPrices = [[3,4],[1,2],[7,8],[2,3]]
    Output: 1
    Explanation:
    As shown in the diagram above, the line chart can be represented with a single line.
      Constraints:
    1 <= stockPrices.length <= 105
    stockPrices[i].length == 2
    1 <= dayi, pricei <= 109
    All dayi are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] stockPrices = new int[][]{{1, 7}, {2, 6}, {3, 5}, {4, 4}, {5, 4}, {6, 3}, {7, 2},
                {8, 1}};
        int expected = 3;
        var result = solution.minimumLines(stockPrices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] stockPrices = new int[][]{{3, 4}, {1, 2}, {7, 8}, {2, 3}};
        int expected = 1;
        var result = solution.minimumLines(stockPrices);
        assertThat(result).isEqualTo(expected);
    }

}
