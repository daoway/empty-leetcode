package com.blogspot.ostas.leetcode.all.hard.maximum_candies_you_can_get_from_boxes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: status = [1,0,1,0], candies = [7,5,4,100], keys = [[],[],[1],[]], containedBoxes = [[1,2],[3],[],[]], initialBoxes = [0]
    Output: 16
    Explanation: You will be initially given box 0. You will find 7 candies in it and boxes 1 and 2.
    Box 1 is closed and you do not have a key for it so you will open box 2. You will find 4 candies and a key to box 1 in box 2.
    In box 1, you will find 5 candies and box 3 but you will not find a key to box 3 so box 3 will remain closed.
    Total number of candies collected = 7 + 4 + 5 = 16 candy.
    Example 2:
    Input: status = [1,0,0,0,0,0], candies = [1,1,1,1,1,1], keys = [[1,2,3,4,5],[],[],[],[],[]], containedBoxes = [[1,2,3,4,5],[],[],[],[],[]], initialBoxes = [0]
    Output: 6
    Explanation: You have initially box 0. Opening it you can find boxes 1,2,3,4 and 5 and their keys.
    The total number of candies will be 6.
      Constraints:
    n == status.length == candies.length == keys.length == containedBoxes.length
    1 <= n <= 1000
    status[i] is either 0 or 1.
    1 <= candies[i] <= 1000
    0 <= keys[i].length <= n
    0 <= keys[i][j] < n
    All values of keys[i] are unique.
    0 <= containedBoxes[i].length <= n
    0 <= containedBoxes[i][j] < n
    All values of containedBoxes[i] are unique.
    Each box is contained in one box at most.
    0 <= initialBoxes.length <= n
    0 <= initialBoxes[i] < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] status = new int[]{1, 0, 1, 0};
        int[] candies = new int[]{7, 5, 4, 100};
        int[][] keys = new int[][]{{}, {}, {1}, {}};
        int[][] containedBoxes = new int[][]{{1, 2}, {3}, {}, {}};
        int[] initialBoxes = new int[]{0};
        int expected = 16;
        var result = solution.maxCandies(status, candies, keys, containedBoxes, initialBoxes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] status = new int[]{1, 0, 0, 0, 0, 0};
        int[] candies = new int[]{1, 1, 1, 1, 1, 1};
        int[][] keys = new int[][]{{1, 2, 3, 4, 5}, {}, {}, {}, {}, {}};
        int[][] containedBoxes = new int[][]{{1, 2, 3, 4, 5}, {}, {}, {}, {}, {}};
        int[] initialBoxes = new int[]{0};
        int expected = 6;
        var result = solution.maxCandies(status, candies, keys, containedBoxes, initialBoxes);
        assertThat(result).isEqualTo(expected);
    }

}
