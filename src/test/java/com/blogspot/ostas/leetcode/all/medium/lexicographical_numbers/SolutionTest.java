package com.blogspot.ostas.leetcode.all.medium.lexicographical_numbers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 13
    Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]
    Example 2:
    Input: n = 2
    Output: [1,2]
      Constraints:
    1 <= n <= 5 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 13;
        List<Integer> expected = List.of(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9);
        var result = solution.lexicalOrder(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        List<Integer> expected = List.of(1, 2);
        var result = solution.lexicalOrder(n);
        assertThat(result).isEqualTo(expected);
    }

}
