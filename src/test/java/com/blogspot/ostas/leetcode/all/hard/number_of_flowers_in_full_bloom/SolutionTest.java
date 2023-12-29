package com.blogspot.ostas.leetcode.all.hard.number_of_flowers_in_full_bloom;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: flowers = [[1,6],[3,7],[9,12],[4,13]], people = [2,3,7,11]
    Output: [1,2,2,2]
    Explanation: The figure above shows the times when the flowers are in full bloom and when the people arrive.
    For each person, we return the number of flowers in full bloom during their arrival.
    Example 2:
    Input: flowers = [[1,10],[3,3]], people = [3,3,2]
    Output: [2,2,1]
    Explanation: The figure above shows the times when the flowers are in full bloom and when the people arrive.
    For each person, we return the number of flowers in full bloom during their arrival.
      Constraints:
    1 <= flowers.length <= 5 * 104
    flowers[i].length == 2
    1 <= starti <= endi <= 109
    1 <= people.length <= 5 * 104
    1 <= people[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] flowers = new int[][]{{1, 6}, {3, 7}, {9, 12}, {4, 13}};
        int[] people = new int[]{2, 3, 7, 11};
        int[] expected = new int[]{1, 2, 2, 2};
        var result = solution.fullBloomFlowers(flowers, people);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] flowers = new int[][]{{1, 10}, {3, 3}};
        int[] people = new int[]{3, 3, 2};
        int[] expected = new int[]{2, 2, 1};
        var result = solution.fullBloomFlowers(flowers, people);
        assertThat(result).isEqualTo(expected);
    }

}
