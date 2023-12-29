package com.blogspot.ostas.leetcode.all.medium.first_completely_painted_row_or_column;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,3,4,2], mat = [[1,4],[2,3]]
    Output: 2
    Explanation: The moves are shown in order, and both the first row and second column of the matrix become fully painted at arr[2].
    Example 2:
    Input: arr = [2,8,7,4,1,3,5,6,9], mat = [[3,2,5],[1,4,6],[8,7,9]]
    Output: 3
    Explanation: The second column becomes fully painted at arr[3].
      Constraints:
    m == mat.length
    n = mat[i].length
    arr.length == m * n
    1 <= m, n <= 105
    1 <= m * n <= 105
    1 <= arr[i], mat[r][c] <= m * n
    All the integers of arr are unique.
    All the integers of mat are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 3, 4, 2};
        int[][] mat = new int[][]{{1, 4}, {2, 3}};
        int expected = 2;
        var result = solution.firstCompleteIndex(arr, mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{2, 8, 7, 4, 1, 3, 5, 6, 9};
        int[][] mat = new int[][]{{3, 2, 5}, {1, 4, 6}, {8, 7, 9}};
        int expected = 3;
        var result = solution.firstCompleteIndex(arr, mat);
        assertThat(result).isEqualTo(expected);
    }

}
