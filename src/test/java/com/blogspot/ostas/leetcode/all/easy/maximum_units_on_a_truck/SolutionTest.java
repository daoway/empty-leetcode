package com.blogspot.ostas.leetcode.all.easy.maximum_units_on_a_truck;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
    Output: 8
    Explanation: There are:
    - 1 box of the first type that contains 3 units.
    - 2 boxes of the second type that contain 2 units each.
    - 3 boxes of the third type that contain 1 unit each.
    You can take all the boxes of the first and second types, and one box of the third type.
    The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
    Example 2:
    Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
    Output: 91
      Constraints:
    1 <= boxTypes.length <= 1000
    1 <= numberOfBoxesi, numberOfUnitsPerBoxi <= 1000
    1 <= truckSize <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] boxTypes = new int[][]{{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        int expected = 8;
        var result = solution.maximumUnits(boxTypes, truckSize);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] boxTypes = new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;
        int expected = 91;
        var result = solution.maximumUnits(boxTypes, truckSize);
        assertThat(result).isEqualTo(expected);
    }

}
