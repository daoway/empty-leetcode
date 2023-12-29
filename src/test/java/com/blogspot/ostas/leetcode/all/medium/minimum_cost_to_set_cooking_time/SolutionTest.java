package com.blogspot.ostas.leetcode.all.medium.minimum_cost_to_set_cooking_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: startAt = 1, moveCost = 2, pushCost = 1, targetSeconds = 600
    Output: 6
    Explanation: The following are the possible ways to set the cooking time.
    - 1 0 0 0, interpreted as 10 minutes and 0 seconds.
      The finger is already on digit 1, pushes 1 (with cost 1), moves to 0 (with cost 2), pushes 0 (with cost 1), pushes 0 (with cost 1), and pushes 0 (with cost 1).
      The cost is: 1 + 2 + 1 + 1 + 1 = 6. This is the minimum cost.
    - 0 9 6 0, interpreted as 9 minutes and 60 seconds. That is also 600 seconds.
      The finger moves to 0 (with cost 2), pushes 0 (with cost 1), moves to 9 (with cost 2), pushes 9 (with cost 1), moves to 6 (with cost 2), pushes 6 (with cost 1), moves to 0 (with cost 2), and pushes 0 (with cost 1).
      The cost is: 2 + 1 + 2 + 1 + 2 + 1 + 2 + 1 = 12.
    - 9 6 0, normalized as 0960 and interpreted as 9 minutes and 60 seconds.
      The finger moves to 9 (with cost 2), pushes 9 (with cost 1), moves to 6 (with cost 2), pushes 6 (with cost 1), moves to 0 (with cost 2), and pushes 0 (with cost 1).
      The cost is: 2 + 1 + 2 + 1 + 2 + 1 = 9.
    Example 2:
    Input: startAt = 0, moveCost = 1, pushCost = 2, targetSeconds = 76
    Output: 6
    Explanation: The optimal way is to push two digits: 7 6, interpreted as 76 seconds.
    The finger moves to 7 (with cost 1), pushes 7 (with cost 2), moves to 6 (with cost 1), and pushes 6 (with cost 2). The total cost is: 1 + 2 + 1 + 2 = 6
    Note other possible ways are 0076, 076, 0116, and 116, but none of them produces the minimum cost.
      Constraints:
    0 <= startAt <= 9
    1 <= moveCost, pushCost <= 105
    1 <= targetSeconds <= 6039
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int startAt = 1;
        int moveCost = 2;
        int pushCost = 1;
        int targetSeconds = 600;
        int expected = 6;
        var result = solution.minCostSetTime(startAt, moveCost, pushCost, targetSeconds);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int startAt = 0;
        int moveCost = 1;
        int pushCost = 2;
        int targetSeconds = 76;
        int expected = 6;
        var result = solution.minCostSetTime(startAt, moveCost, pushCost, targetSeconds);
        assertThat(result).isEqualTo(expected);
    }

}
