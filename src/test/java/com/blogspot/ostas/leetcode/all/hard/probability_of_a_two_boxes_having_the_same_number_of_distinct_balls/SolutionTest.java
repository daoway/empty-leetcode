package com.blogspot.ostas.leetcode.all.hard.probability_of_a_two_boxes_having_the_same_number_of_distinct_balls;

import org.junit.jupiter.api.Test;

import static com.blogspot.ostas.leetcode.all.common.Utils.round;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: balls = [1,1]
    Output: 1.00000
    Explanation: Only 2 ways to divide the balls equally:
    - A ball of color 1 to box 1 and a ball of color 2 to box 2
    - A ball of color 2 to box 1 and a ball of color 1 to box 2
    In both ways, the number of distinct colors in each box is equal. The probability is 2/2 = 1
    Example 2:
    Input: balls = [2,1,1]
    Output: 0.66667
    Explanation: We have the set of balls [1, 1, 2, 3]
    This set of balls will be shuffled randomly and we may have one of the 12 distinct shuffles with equal probability (i.e. 1/12):
    [1,1 / 2,3], [1,1 / 3,2], [1,2 / 1,3], [1,2 / 3,1], [1,3 / 1,2], [1,3 / 2,1], [2,1 / 1,3], [2,1 / 3,1], [2,3 / 1,1], [3,1 / 1,2], [3,1 / 2,1], [3,2 / 1,1]
    After that, we add the first two balls to the first box and the second two balls to the second box.
    We can see that 8 of these 12 possible random distributions have the same number of distinct colors of balls in each box.
    Probability is 8/12 = 0.66667
    Example 3:
    Input: balls = [1,2,1,2]
    Output: 0.60000
    Explanation: The set of balls is [1, 2, 2, 3, 4, 4]. It is hard to display all the 180 possible random shuffles of this set but it is easy to check that 108 of them will have the same number of distinct colors in each box.
    Probability = 108 / 180 = 0.6
      Constraints:
    1 <= balls.length <= 8
    1 <= balls[i] <= 6
    sum(balls) is even.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] balls = new int[]{1, 1};
        double expected = 1.00000;
        var result = solution.getProbability(balls);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] balls = new int[]{2, 1, 1};
        double expected = 0.66667;
        var result = solution.getProbability(balls);
        assertThat(round(result)).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] balls = new int[]{1, 2, 1, 2};
        double expected = 0.60000;
        var result = solution.getProbability(balls);
        assertThat(result).isEqualTo(expected);
    }

}
