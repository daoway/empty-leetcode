package com.blogspot.ostas.leetcode.all.medium.set_matrix_zeroes;

import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
        Example 1:
    Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
    Output: [[1,0,1],[0,0,0],[1,0,1]]
    Example 2:
    Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
    Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
      Constraints:
    m == matrix.length
    n == matrix[0].length
    1 <= m, n <= 200
    -231 <= matrix[i][j] <= 231 - 1
      Follow up:
    A straightforward solution using O(mn) space is probably a bad idea.
    A simple improvement uses O(m + n) space, but still not the best solution.
    Could you devise a constant space solution?
    */

  @Test
  void test_0() {
    var solution = new Solution();
    int[][] matrix = new int[][] {};
    solution.setZeroes(matrix);
  }
}
