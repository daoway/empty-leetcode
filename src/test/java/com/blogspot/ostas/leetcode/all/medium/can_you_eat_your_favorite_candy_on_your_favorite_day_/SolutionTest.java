package com.blogspot.ostas.leetcode.all.medium.can_you_eat_your_favorite_candy_on_your_favorite_day_;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: candiesCount = [7,4,5,3,8], queries = [[0,2,2],[4,2,4],[2,13,1000000000]]
    Output: [true,false,true]
    Explanation:
    1- If you eat 2 candies (type 0) on day 0 and 2 candies (type 0) on day 1, you will eat a candy of type 0 on day 2.
    2- You can eat at most 4 candies each day.
       If you eat 4 candies every day, you will eat 4 candies (type 0) on day 0 and 4 candies (type 0 and type 1) on day 1.
       On day 2, you can only eat 4 candies (type 1 and type 2), so you cannot eat a candy of type 4 on day 2.
    3- If you eat 1 candy each day, you will eat a candy of type 2 on day 13.
    Example 2:
    Input: candiesCount = [5,2,6,4,1], queries = [[3,1,2],[4,10,3],[3,10,100],[4,100,30],[1,3,1]]
    Output: [false,true,true,false,false]
      Constraints:
    1 <= candiesCount.length <= 105
    1 <= candiesCount[i] <= 105
    1 <= queries.length <= 105
    queries[i].length == 3
    0 <= favoriteTypei < candiesCount.length
    0 <= favoriteDayi <= 109
    1 <= dailyCapi <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] candiesCount = new int[]{7, 4, 5, 3, 8};
        int[][] queries = new int[][]{{0, 2, 2}, {4, 2, 4}, {2, 13, 1000000000}};
        boolean[] expected = new boolean[]{true, false, true};
        var result = solution.canEat(candiesCount, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] candiesCount = new int[]{5, 2, 6, 4, 1};
        int[][] queries = new int[][]{{3, 1, 2}, {4, 10, 3}, {3, 10, 100}, {4, 100, 30}, {1, 3, 1}};
        boolean[] expected = new boolean[]{false, true, true, false, false};
        var result = solution.canEat(candiesCount, queries);
        assertThat(result).isEqualTo(expected);
    }

}
