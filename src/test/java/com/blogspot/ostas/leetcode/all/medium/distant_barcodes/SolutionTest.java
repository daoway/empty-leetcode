package com.blogspot.ostas.leetcode.all.medium.distant_barcodes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: barcodes = [1,1,1,2,2,2]
    Output: [2,1,2,1,2,1]
    Example 2:
    Input: barcodes = [1,1,1,1,2,2,3,3]
    Output: [1,3,1,3,1,2,1,2]
      Constraints:
    1 <= barcodes.length <= 10000
    1 <= barcodes[i] <= 10000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] barcodes = new int[]{1, 1, 1, 2, 2, 2};
        int[] expected = new int[]{2, 1, 2, 1, 2, 1};
        var result = solution.rearrangeBarcodes(barcodes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] barcodes = new int[]{1, 1, 1, 1, 2, 2, 3, 3};
        int[] expected = new int[]{1, 3, 1, 3, 1, 2, 1, 2};
        var result = solution.rearrangeBarcodes(barcodes);
        assertThat(result).isEqualTo(expected);
    }

}
