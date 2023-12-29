package com.blogspot.ostas.leetcode.all.hard.robot_collisions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: positions = [5,4,3,2,1], healths = [2,17,9,15,10], directions = "RRRRR"
    Output: [2,17,9,15,10]
    Explanation: No collision occurs in this example, since all robots are moving in the same direction. So, the health of the robots in order from the first robot is returned, [2, 17, 9, 15, 10].
    Example 2:
    Input: positions = [3,5,2,6], healths = [10,10,15,12], directions = "RLRL"
    Output: [14]
    Explanation: There are 2 collisions in this example. Firstly, robot 1 and robot 2 will collide, and since both have the same health, they will be removed from the line. Next, robot 3 and robot 4 will collide and since robot 4's health is smaller, it gets removed, and robot 3's health becomes 15 - 1 = 14. Only robot 3 remains, so we return [14].
    Example 3:
    Input: positions = [1,2,5,6], healths = [10,10,11,11], directions = "RLRL"
    Output: []
    Explanation: Robot 1 and robot 2 will collide and since both have the same health, they are both removed. Robot 3 and 4 will collide and since both have the same health, they are both removed. So, we return an empty array, [].
      Constraints:
    1 <= positions.length == healths.length == directions.length == n <= 105
    1 <= positions[i], healths[i] <= 109
    directions[i] == 'L' or directions[i] == 'R'
    All values in positions are distinct
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] positions = new int[]{5, 4, 3, 2, 1};
        int[] healths = new int[]{2, 17, 9, 15, 10};
        String directions = "RRRRR";
        List<Integer> expected = List.of(2, 17, 9, 15, 10);
        var result = solution.survivedRobotsHealths(positions, healths, directions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] positions = new int[]{3, 5, 2, 6};
        int[] healths = new int[]{10, 10, 15, 12};
        String directions = "RLRL";
        List<Integer> expected = List.of(14);
        var result = solution.survivedRobotsHealths(positions, healths, directions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] positions = new int[]{1, 2, 5, 6};
        int[] healths = new int[]{10, 10, 11, 11};
        String directions = "RLRL";
        List<Integer> expected = List.of();
        var result = solution.survivedRobotsHealths(positions, healths, directions);
        assertThat(result).isEqualTo(expected);
    }

}
