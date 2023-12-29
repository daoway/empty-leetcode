package com.blogspot.ostas.leetcode.all.medium.number_of_adjacent_elements_with_the_same_color;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, queries = [[0,2],[1,2],[3,1],[1,1],[2,1]]
    Output: [0,1,1,0,2]
    Explanation: Initially array nums = [0,0,0,0], where 0 denotes uncolored elements of the array.
    - After the 1st query nums = [2,0,0,0]. The count of adjacent elements with the same color is 0.
    - After the 2nd query nums = [2,2,0,0]. The count of adjacent elements with the same color is 1.
    - After the 3rd query nums = [2,2,0,1]. The count of adjacent elements with the same color is 1.
    - After the 4th query nums = [2,1,0,1]. The count of adjacent elements with the same color is 0.
    - After the 5th query nums = [2,1,1,1]. The count of adjacent elements with the same color is 2.
    Example 2:
    Input: n = 1, queries = [[0,100000]]
    Output: [0]
    Explanation: Initially array nums = [0], where 0 denotes uncolored elements of the array.
    - After the 1st query nums = [100000]. The count of adjacent elements with the same color is 0.
      Constraints:
    1 <= n <= 105
    1 <= queries.length <= 105
    queries[i].length == 2
    0 <= indexi <= n - 1
    1 <=  colori <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] queries = new int[][]{{0, 2}, {1, 2}, {3, 1}, {1, 1}, {2, 1}};
        int[] expected = new int[]{0, 1, 1, 0, 2};
        var result = solution.colorTheArray(n, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int[][] queries = new int[][]{{0, 100000}};
        int[] expected = new int[]{0};
        var result = solution.colorTheArray(n, queries);
        assertThat(result).isEqualTo(expected);
    }

}
