package com.blogspot.ostas.leetcode.all.easy.self_dividing_numbers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: left = 1, right = 22
    Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
    Example 2:
    Input: left = 47, right = 85
    Output: [48,55,66,77]
      Constraints:
    1 <= left <= right <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int left = 1;
        int right = 22;
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        var result = solution.selfDividingNumbers(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int left = 47;
        int right = 85;
        List<Integer> expected = List.of(48, 55, 66, 77);
        var result = solution.selfDividingNumbers(left, right);
        assertThat(result).isEqualTo(expected);
    }

}
