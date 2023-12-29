package com.blogspot.ostas.leetcode.all.hard.kth_smallest_instructions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: destination = [2,3], k = 1
    Output: "HHHVV"
    Explanation: All the instructions that reach (2, 3) in lexicographic order are as follows:
    ["HHHVV", "HHVHV", "HHVVH", "HVHHV", "HVHVH", "HVVHH", "VHHHV", "VHHVH", "VHVHH", "VVHHH"].
    Example 2:
    Input: destination = [2,3], k = 2
    Output: "HHVHV"
    Example 3:
    Input: destination = [2,3], k = 3
    Output: "HHVVH"
      Constraints:
    destination.length == 2
    1 <= row, column <= 15
    1 <= k <= nCr(row + column, row), where nCr(a, b) denotes a choose b.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] destination = new int[]{2, 3};
        int k = 1;
        String expected = "HHHVV";
        var result = solution.kthSmallestPath(destination, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] destination = new int[]{2, 3};
        int k = 2;
        String expected = "HHVHV";
        var result = solution.kthSmallestPath(destination, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] destination = new int[]{2, 3};
        int k = 3;
        String expected = "HHVVH";
        var result = solution.kthSmallestPath(destination, k);
        assertThat(result).isEqualTo(expected);
    }

}
