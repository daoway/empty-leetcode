package com.blogspot.ostas.leetcode.all.medium.number_of_burgers_with_no_waste_of_ingredients;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tomatoSlices = 16, cheeseSlices = 7
    Output: [1,6]
    Explantion: To make one jumbo burger and 6 small burgers we need 4*1 + 2*6 = 16 tomato and 1 + 6 = 7 cheese.
    There will be no remaining ingredients.
    Example 2:
    Input: tomatoSlices = 17, cheeseSlices = 4
    Output: []
    Explantion: There will be no way to use all ingredients to make small and jumbo burgers.
    Example 3:
    Input: tomatoSlices = 4, cheeseSlices = 17
    Output: []
    Explantion: Making 1 jumbo burger there will be 16 cheese remaining and making 2 small burgers there will be 15 cheese remaining.
      Constraints:
    0 <= tomatoSlices, cheeseSlices <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int tomatoSlices = 16;
        int cheeseSlices = 7;
        List<Integer> expected = List.of(1, 6);
        var result = solution.numOfBurgers(tomatoSlices, cheeseSlices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int tomatoSlices = 17;
        int cheeseSlices = 4;
        List<Integer> expected = List.of();
        var result = solution.numOfBurgers(tomatoSlices, cheeseSlices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int tomatoSlices = 4;
        int cheeseSlices = 17;
        List<Integer> expected = List.of();
        var result = solution.numOfBurgers(tomatoSlices, cheeseSlices);
        assertThat(result).isEqualTo(expected);
    }

}
