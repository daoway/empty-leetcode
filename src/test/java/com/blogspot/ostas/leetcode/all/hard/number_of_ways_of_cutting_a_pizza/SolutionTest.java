package com.blogspot.ostas.leetcode.all.hard.number_of_ways_of_cutting_a_pizza;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: pizza = ["A..","AAA","..."], k = 3
    Output: 3
    Explanation: The figure above shows the three ways to cut the pizza. Note that pieces must contain at least one apple.
    Example 2:
    Input: pizza = ["A..","AA.","..."], k = 3
    Output: 1
    Example 3:
    Input: pizza = ["A..","A..","..."], k = 1
    Output: 1
      Constraints:
    1 <= rows, cols <= 50
    rows == pizza.length
    cols == pizza[i].length
    1 <= k <= 10
    pizza consists of characters 'A' and '.' only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] pizza = new String[]{"A..", "AAA", "..."};
        int k = 3;
        int expected = 3;
        var result = solution.ways(pizza, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] pizza = new String[]{"A..", "AA.", "..."};
        int k = 3;
        int expected = 1;
        var result = solution.ways(pizza, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] pizza = new String[]{"A..", "A..", "..."};
        int k = 1;
        int expected = 1;
        var result = solution.ways(pizza, k);
        assertThat(result).isEqualTo(expected);
    }

}
