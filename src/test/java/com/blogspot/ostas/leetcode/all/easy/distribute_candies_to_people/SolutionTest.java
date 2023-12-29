package com.blogspot.ostas.leetcode.all.easy.distribute_candies_to_people;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: candies = 7, num_people = 4
    Output: [1,2,3,1]
    Explanation:
    On the first turn, ans[0] += 1, and the array is [1,0,0,0].
    On the second turn, ans[1] += 2, and the array is [1,2,0,0].
    On the third turn, ans[2] += 3, and the array is [1,2,3,0].
    On the fourth turn, ans[3] += 1 (because there is only one candy left), and the final array is [1,2,3,1].
    Example 2:
    Input: candies = 10, num_people = 3
    Output: [5,2,3]
    Explanation:
    On the first turn, ans[0] += 1, and the array is [1,0,0].
    On the second turn, ans[1] += 2, and the array is [1,2,0].
    On the third turn, ans[2] += 3, and the array is [1,2,3].
    On the fourth turn, ans[0] += 4, and the final array is [5,2,3].
      Constraints:
    1 <= candies <= 10^9
    1 <= num_people <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int candies = 7;
        int num_people = 4;
        int[] expected = new int[]{1, 2, 3, 1};
        var result = solution.distributeCandies(candies, num_people);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int candies = 10;
        int num_people = 3;
        int[] expected = new int[]{5, 2, 3};
        var result = solution.distributeCandies(candies, num_people);
        assertThat(result).isEqualTo(expected);
    }

}
