package com.blogspot.ostas.leetcode.all.medium.minimum_cost_of_a_path_with_special_roads;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: start = [1,1], target = [4,5], specialRoads = [[1,2,3,3,2],[3,4,4,5,1]]
    Output: 5
    Explanation: The optimal path from (1,1) to (4,5) is the following:
    - (1,1) -> (1,2). This move has a cost of |1 - 1| + |2 - 1| = 1.
    - (1,2) -> (3,3). This move uses the first special edge, the cost is 2.
    - (3,3) -> (3,4). This move has a cost of |3 - 3| + |4 - 3| = 1.
    - (3,4) -> (4,5). This move uses the second special edge, the cost is 1.
    So the total cost is 1 + 2 + 1 + 1 = 5.
    It can be shown that we cannot achieve a smaller total cost than 5.
    Example 2:
    Input: start = [3,2], target = [5,7], specialRoads = [[3,2,3,4,4],[3,3,5,5,5],[3,4,5,6,6]]
    Output: 7
    Explanation: It is optimal to not use any special edges and go directly from the starting to the ending position with a cost |5 - 3| + |7 - 2| = 7.
      Constraints:
    start.length == target.length == 2
    1 <= startX <= targetX <= 105
    1 <= startY <= targetY <= 105
    1 <= specialRoads.length <= 200
    specialRoads[i].length == 5
    startX <= x1i, x2i <= targetX
    startY <= y1i, y2i <= targetY
    1 <= costi <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] start = new int[]{1, 1};
        int[] target = new int[]{4, 5};
        int[][] specialRoads = new int[][]{{1, 2, 3, 3, 2}, {3, 4, 4, 5, 1}};
        int expected = 5;
        var result = solution.minimumCost(start, target, specialRoads);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] start = new int[]{3, 2};
        int[] target = new int[]{5, 7};
        int[][] specialRoads = new int[][]{{3, 2, 3, 4, 4}, {3, 3, 5, 5, 5}, {3, 4, 5, 6, 6}};
        int expected = 7;
        var result = solution.minimumCost(start, target, specialRoads);
        assertThat(result).isEqualTo(expected);
    }

}
