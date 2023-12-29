package com.blogspot.ostas.leetcode.all.medium.largest_values_from_labels;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: values = [5,4,3,2,1], labels = [1,1,2,2,3], numWanted = 3, useLimit = 1
    Output: 9
    Explanation: The subset chosen is the first, third, and fifth items.
    Example 2:
    Input: values = [5,4,3,2,1], labels = [1,3,3,3,2], numWanted = 3, useLimit = 2
    Output: 12
    Explanation: The subset chosen is the first, second, and third items.
    Example 3:
    Input: values = [9,8,8,7,6], labels = [0,0,0,1,1], numWanted = 3, useLimit = 1
    Output: 16
    Explanation: The subset chosen is the first and fourth items.
      Constraints:
    n == values.length == labels.length
    1 <= n <= 2 * 104
    0 <= values[i], labels[i] <= 2 * 104
    1 <= numWanted, useLimit <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] values = new int[]{5, 4, 3, 2, 1};
        int[] labels = new int[]{1, 1, 2, 2, 3};
        int numWanted = 3;
        int useLimit = 1;
        int expected = 9;
        var result = solution.largestValsFromLabels(values, labels, numWanted, useLimit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] values = new int[]{5, 4, 3, 2, 1};
        int[] labels = new int[]{1, 3, 3, 3, 2};
        int numWanted = 3;
        int useLimit = 2;
        int expected = 12;
        var result = solution.largestValsFromLabels(values, labels, numWanted, useLimit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] values = new int[]{9, 8, 8, 7, 6};
        int[] labels = new int[]{0, 0, 0, 1, 1};
        int numWanted = 3;
        int useLimit = 1;
        int expected = 16;
        var result = solution.largestValsFromLabels(values, labels, numWanted, useLimit);
        assertThat(result).isEqualTo(expected);
    }

}
