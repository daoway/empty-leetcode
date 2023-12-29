package com.blogspot.ostas.leetcode.all.hard.delivering_boxes_from_storage_to_ports;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: boxes = [[1,1],[2,1],[1,1]], portsCount = 2, maxBoxes = 3, maxWeight = 3
    Output: 4
    Explanation: The optimal strategy is as follows:
    - The ship takes all the boxes in the queue, goes to port 1, then port 2, then port 1 again, then returns to storage. 4 trips.
    So the total number of trips is 4.
    Note that the first and third boxes cannot be delivered together because the boxes need to be delivered in order (i.e. the second box needs to be delivered at port 2 before the third box).
    Example 2:
    Input: boxes = [[1,2],[3,3],[3,1],[3,1],[2,4]], portsCount = 3, maxBoxes = 3, maxWeight = 6
    Output: 6
    Explanation: The optimal strategy is as follows:
    - The ship takes the first box, goes to port 1, then returns to storage. 2 trips.
    - The ship takes the second, third and fourth boxes, goes to port 3, then returns to storage. 2 trips.
    - The ship takes the fifth box, goes to port 2, then returns to storage. 2 trips.
    So the total number of trips is 2 + 2 + 2 = 6.
    Example 3:
    Input: boxes = [[1,4],[1,2],[2,1],[2,1],[3,2],[3,4]], portsCount = 3, maxBoxes = 6, maxWeight = 7
    Output: 6
    Explanation: The optimal strategy is as follows:
    - The ship takes the first and second boxes, goes to port 1, then returns to storage. 2 trips.
    - The ship takes the third and fourth boxes, goes to port 2, then returns to storage. 2 trips.
    - The ship takes the fifth and sixth boxes, goes to port 3, then returns to storage. 2 trips.
    So the total number of trips is 2 + 2 + 2 = 6.
      Constraints:
    1 <= boxes.length <= 105
    1 <= portsCount, maxBoxes, maxWeight <= 105
    1 <= portsi <= portsCount
    1 <= weightsi <= maxWeight
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] boxes = new int[][]{{1, 1}, {2, 1}, {1, 1}};
        int portsCount = 2;
        int maxBoxes = 3;
        int maxWeight = 3;
        int expected = 4;
        var result = solution.boxDelivering(boxes, portsCount, maxBoxes, maxWeight);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] boxes = new int[][]{{1, 2}, {3, 3}, {3, 1}, {3, 1}, {2, 4}};
        int portsCount = 3;
        int maxBoxes = 3;
        int maxWeight = 6;
        int expected = 6;
        var result = solution.boxDelivering(boxes, portsCount, maxBoxes, maxWeight);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] boxes = new int[][]{{1, 4}, {1, 2}, {2, 1}, {2, 1}, {3, 2}, {3, 4}};
        int portsCount = 3;
        int maxBoxes = 6;
        int maxWeight = 7;
        int expected = 6;
        var result = solution.boxDelivering(boxes, portsCount, maxBoxes, maxWeight);
        assertThat(result).isEqualTo(expected);
    }

}
