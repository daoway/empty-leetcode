package com.blogspot.ostas.leetcode.all.medium.logical_or_of_two_binary_grids_represented_as_quad_trees;

import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
      Example 1:
    Input: quadTree1 = [[0,1],[1,1],[1,1],[1,0],[1,0]]
    , quadTree2 = [[0,1],[1,1],[0,1],[1,1],[1,0],null,null,null,null,[1,0],[1,0],[1,1],[1,1]]
    Output: [[0,0],[1,1],[1,1],[1,1],[1,0]]
    Explanation: quadTree1 and quadTree2 are shown above. You can see the binary matrix which is represented by each Quad-Tree.
    If we apply logical bitwise OR on the two binary matrices we get the binary matrix below which is represented by the result Quad-Tree.
    Notice that the binary matrices shown are only for illustration, you don't have to construct the binary matrix to get the result tree.
    Example 2:
    Input: quadTree1 = [[1,0]], quadTree2 = [[1,0]]
    Output: [[1,0]]
    Explanation: Each tree represents a binary matrix of size 1*1. Each matrix contains only zero.
    The resulting matrix is of size 1*1 with also zero.
      Constraints:
    quadTree1 and quadTree2 are both valid Quad-Trees each representing a n * n grid.
    n == 2x where 0 <= x <= 9.
    */
    @Test
    void example_0() {
//      var solution = new Solution();
//      Node quadTree1=[[0,1],[1,1],[1,1],[1,0],[1,0]];
//      Node quadTree2=[[0,1],[1,1],[0,1],[1,1],[1,0],null,null,null,null,[1,0],[1,0],[1,1],[1,1]];
//      Node expected = [[0,0],[1,1],[1,1],[1,1],[1,0]];
//      var result = solution.intersect(quadTree1,quadTree2);
//      assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
//      var solution = new Solution();
//      Node quadTree1=[[1,0]];
//      Node quadTree2=[[1,0]];Node expected = [[1,0]];
//      var result = solution.intersect(quadTree1,quadTree2);
//      assertThat(result).isEqualTo(expected);
    }

}
