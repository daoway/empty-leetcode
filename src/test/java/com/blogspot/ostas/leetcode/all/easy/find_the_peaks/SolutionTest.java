package com.blogspot.ostas.leetcode.all.easy.find_the_peaks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mountain = [2,4,4]
    Output: []
    Explanation: mountain[0] and mountain[2] can not be a peak because they are first and last elements of the array.
    mountain[1] also can not be a peak because it is not strictly greater than mountain[2].
    So the answer is [].
    Example 2:
    Input: mountain = [1,4,3,8,5]
    Output: [1,3]
    Explanation: mountain[0] and mountain[4] can not be a peak because they are first and last elements of the array.
    mountain[2] also can not be a peak because it is not strictly greater than mountain[3] and mountain[1].
    But mountain [1] and mountain[3] are strictly greater than their neighboring elements.
    So the answer is [1,3].
      Constraints:
    3 <= mountain.length <= 100
    1 <= mountain[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] mountain = new int[]{2, 4, 4};
        List<Integer> expected = List.of();
        var result = solution.findPeaks(mountain);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] mountain = new int[]{1, 4, 3, 8, 5};
        List<Integer> expected = List.of(1, 3);
        var result = solution.findPeaks(mountain);
        assertThat(result).isEqualTo(expected);
    }

}
