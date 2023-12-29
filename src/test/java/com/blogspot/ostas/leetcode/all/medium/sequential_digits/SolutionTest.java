package com.blogspot.ostas.leetcode.all.medium.sequential_digits;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: low = 100, high = 300
    Output: [123,234]
    Example 2:
    Input: low = 1000, high = 13000
    Output: [1234,2345,3456,4567,5678,6789,12345]
      Constraints:
    10 <= low <= high <= 10^9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int low = 100;
        int high = 300;
        List<Integer> expected = List.of(123, 234);
        var result = solution.sequentialDigits(low, high);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int low = 1000;
        int high = 13000;
        List<Integer> expected = List.of(1234, 2345, 3456, 4567, 5678, 6789, 12345);
        var result = solution.sequentialDigits(low, high);
        assertThat(result).isEqualTo(expected);
    }

}
