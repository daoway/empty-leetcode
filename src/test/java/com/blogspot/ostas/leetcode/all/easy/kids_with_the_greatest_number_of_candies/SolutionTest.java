package com.blogspot.ostas.leetcode.all.easy.kids_with_the_greatest_number_of_candies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true]
    Explanation: If you give all extraCandies to:
    - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
    - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
    - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
    - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
    - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
    Example 2:
    Input: candies = [4,2,1,1,2], extraCandies = 1
    Output: [true,false,false,false,false]
    Explanation: There is only 1 extra candy.
    Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
    Example 3:
    Input: candies = [12,1,12], extraCandies = 10
    Output: [true,false,true]
      Constraints:
    n == candies.length
    2 <= n <= 100
    1 <= candies[i] <= 100
    1 <= extraCandies <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = List.of(true, true, true, false, true);
        var result = solution.kidsWithCandies(candies, extraCandies);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] candies = new int[]{4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expected = List.of(true, false, false, false, false);
        var result = solution.kidsWithCandies(candies, extraCandies);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] candies = new int[]{12, 1, 12};
        int extraCandies = 10;
        List<Boolean> expected = List.of(true, false, true);
        var result = solution.kidsWithCandies(candies, extraCandies);
        assertThat(result).isEqualTo(expected);
    }

}
