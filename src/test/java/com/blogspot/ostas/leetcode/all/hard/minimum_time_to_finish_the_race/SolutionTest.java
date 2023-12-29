package com.blogspot.ostas.leetcode.all.hard.minimum_time_to_finish_the_race;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tires = [[2,3],[3,4]], changeTime = 5, numLaps = 4
    Output: 21
    Explanation:
    Lap 1: Start with tire 0 and finish the lap in 2 seconds.
    Lap 2: Continue with tire 0 and finish the lap in 2 * 3 = 6 seconds.
    Lap 3: Change tires to a new tire 0 for 5 seconds and then finish the lap in another 2 seconds.
    Lap 4: Continue with tire 0 and finish the lap in 2 * 3 = 6 seconds.
    Total time = 2 + 6 + 5 + 2 + 6 = 21 seconds.
    The minimum time to complete the race is 21 seconds.
    Example 2:
    Input: tires = [[1,10],[2,2],[3,4]], changeTime = 6, numLaps = 5
    Output: 25
    Explanation:
    Lap 1: Start with tire 1 and finish the lap in 2 seconds.
    Lap 2: Continue with tire 1 and finish the lap in 2 * 2 = 4 seconds.
    Lap 3: Change tires to a new tire 1 for 6 seconds and then finish the lap in another 2 seconds.
    Lap 4: Continue with tire 1 and finish the lap in 2 * 2 = 4 seconds.
    Lap 5: Change tires to tire 0 for 6 seconds then finish the lap in another 1 second.
    Total time = 2 + 4 + 6 + 2 + 4 + 6 + 1 = 25 seconds.
    The minimum time to complete the race is 25 seconds.
      Constraints:
    1 <= tires.length <= 105
    tires[i].length == 2
    1 <= fi, changeTime <= 105
    2 <= ri <= 105
    1 <= numLaps <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] tires = new int[][]{{2, 3}, {3, 4}};
        int changeTime = 5;
        int numLaps = 4;
        int expected = 21;
        var result = solution.minimumFinishTime(tires, changeTime, numLaps);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] tires = new int[][]{{1, 10}, {2, 2}, {3, 4}};
        int changeTime = 6;
        int numLaps = 5;
        int expected = 25;
        var result = solution.minimumFinishTime(tires, changeTime, numLaps);
        assertThat(result).isEqualTo(expected);
    }

}
