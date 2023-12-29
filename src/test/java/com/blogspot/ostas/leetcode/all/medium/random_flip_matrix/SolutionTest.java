package com.blogspot.ostas.leetcode.all.medium.random_flip_matrix;

class SolutionTest {

    /*
      Example 1:
    Input
    ["Solution", "flip", "flip", "flip", "reset", "flip"]
    [[3, 1], [], [], [], [], []]
    Output
    [null, [1, 0], [2, 0], [0, 0], null, [2, 0]]

    Explanation
    Solution solution = new Solution(3, 1);
    solution.flip();  // return [1, 0], [0,0], [1,0], and [2,0] should be equally likely to be returned.
    solution.flip();  // return [2, 0], Since [1,0] was returned, [2,0] and [0,0]
    solution.flip();  // return [0, 0], Based on the previously returned indices, only [0,0] can be returned.
    solution.reset(); // All the values are reset to 0 and can be returned.
    solution.flip();  // return [2, 0], [0,0], [1,0], and [2,0] should be equally likely to be returned.
      Constraints:
    1 <= m, n <= 104
    There will be at least one free cell for each call to flip.
    At most 1000 calls will be made to flip and reset.
    */

}
