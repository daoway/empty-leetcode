package com.blogspot.ostas.leetcode.all.hard.closest_room;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rooms = [[2,2],[1,2],[3,2]], queries = [[3,1],[3,3],[5,2]]
    Output: [3,-1,3]
    Explanation: The answers to the queries are as follows:
    Query = [3,1]: Room number 3 is the closest as abs(3 - 3) = 0, and its size of 2 is at least 1. The answer is 3.
    Query = [3,3]: There are no rooms with a size of at least 3, so the answer is -1.
    Query = [5,2]: Room number 3 is the closest as abs(3 - 5) = 2, and its size of 2 is at least 2. The answer is 3.
    Example 2:
    Input: rooms = [[1,4],[2,3],[3,5],[4,1],[5,2]], queries = [[2,3],[2,4],[2,5]]
    Output: [2,1,3]
    Explanation: The answers to the queries are as follows:
    Query = [2,3]: Room number 2 is the closest as abs(2 - 2) = 0, and its size of 3 is at least 3. The answer is 2.
    Query = [2,4]: Room numbers 1 and 3 both have sizes of at least 4. The answer is 1 since it is smaller.
    Query = [2,5]: Room number 3 is the only room with a size of at least 5. The answer is 3.
      Constraints:
    n == rooms.length
    1 <= n <= 105
    k == queries.length
    1 <= k <= 104
    1 <= roomIdi, preferredj <= 107
    1 <= sizei, minSizej <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] rooms = new int[][]{{2, 2}, {1, 2}, {3, 2}};
        int[][] queries = new int[][]{{3, 1}, {3, 3}, {5, 2}};
        int[] expected = new int[]{3, -1, 3};
        var result = solution.closestRoom(rooms, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] rooms = new int[][]{{1, 4}, {2, 3}, {3, 5}, {4, 1}, {5, 2}};
        int[][] queries = new int[][]{{2, 3}, {2, 4}, {2, 5}};
        int[] expected = new int[]{2, 1, 3};
        var result = solution.closestRoom(rooms, queries);
        assertThat(result).isEqualTo(expected);
    }

}
