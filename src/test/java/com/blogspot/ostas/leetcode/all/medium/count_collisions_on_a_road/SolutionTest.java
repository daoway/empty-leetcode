package com.blogspot.ostas.leetcode.all.medium.count_collisions_on_a_road;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: directions = "RLRSLL"
    Output: 5
    Explanation:
    The collisions that will happen on the road are:
    - Cars 0 and 1 will collide with each other. Since they are moving in opposite directions, the number of collisions becomes 0 + 2 = 2.
    - Cars 2 and 3 will collide with each other. Since car 3 is stationary, the number of collisions becomes 2 + 1 = 3.
    - Cars 3 and 4 will collide with each other. Since car 3 is stationary, the number of collisions becomes 3 + 1 = 4.
    - Cars 4 and 5 will collide with each other. After car 4 collides with car 3, it will stay at the point of collision and get hit by car 5. The number of collisions becomes 4 + 1 = 5.
    Thus, the total number of collisions that will happen on the road is 5.
    Example 2:
    Input: directions = "LLRR"
    Output: 0
    Explanation:
    No cars will collide with each other. Thus, the total number of collisions that will happen on the road is 0.
      Constraints:
    1 <= directions.length <= 105
    directions[i] is either 'L', 'R', or 'S'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String directions = "RLRSLL";
        int expected = 5;
        var result = solution.countCollisions(directions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String directions = "LLRR";
        int expected = 0;
        var result = solution.countCollisions(directions);
        assertThat(result).isEqualTo(expected);
    }

}
