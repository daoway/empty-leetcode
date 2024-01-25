package com.blogspot.ostas.leetcode.all.medium.detonate_the_maximum_bombs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: bombs = [[2,1,3],[6,1,4]]
    Output: 2
    Explanation:
    The above figure shows the positions and ranges of the 2 bombs.
    If we detonate the left bomb, the right bomb will not be affected.
    But if we detonate the right bomb, both bombs will be detonated.
    So the maximum bombs that can be detonated is max(1, 2) = 2.
    Example 2:
    Input: bombs = [[1,1,5],[10,10,5]]
    Output: 1
    Explanation:
    Detonating either bomb will not detonate the other bomb, so the maximum number of bombs that can be detonated is 1.
    Example 3:
    Input: bombs = [[1,2,3],[2,3,1],[3,4,2],[4,5,3],[5,6,4]]
    Output: 5
    Explanation:
    The best bomb to detonate is bomb 0 because:
    - Bomb 0 detonates bombs 1 and 2. The red circle denotes the range of bomb 0.
    - Bomb 2 detonates bomb 3. The blue circle denotes the range of bomb 2.
    - Bomb 3 detonates bomb 4. The green circle denotes the range of bomb 3.
    Thus all 5 bombs are detonated.
      Constraints:
    1 <= bombs.length <= 100
    bombs[i].length == 3
    1 <= xi, yi, ri <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] bombs = new int[][]{{2, 1, 3}, {6, 1, 4}};
        int expected = 2;
        var result = solution.maximumDetonation(bombs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] bombs = new int[][]{{1, 1, 5}, {10, 10, 5}};
        int expected = 1;
        var result = solution.maximumDetonation(bombs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] bombs = new int[][]{{1, 2, 3}, {2, 3, 1}, {3, 4, 2}, {4, 5, 3}, {5, 6, 4}};
        int expected = 5;
        var result = solution.maximumDetonation(bombs);
        assertThat(result).isEqualTo(expected);
    }

}
