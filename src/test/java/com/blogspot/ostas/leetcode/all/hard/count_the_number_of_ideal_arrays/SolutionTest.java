package com.blogspot.ostas.leetcode.all.hard.count_the_number_of_ideal_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, maxValue = 5
    Output: 10
    Explanation: The following are the possible ideal arrays:
    - Arrays starting with the value 1 (5 arrays): [1,1], [1,2], [1,3], [1,4], [1,5]
    - Arrays starting with the value 2 (2 arrays): [2,2], [2,4]
    - Arrays starting with the value 3 (1 array): [3,3]
    - Arrays starting with the value 4 (1 array): [4,4]
    - Arrays starting with the value 5 (1 array): [5,5]
    There are a total of 5 + 2 + 1 + 1 + 1 = 10 distinct ideal arrays.
    Example 2:
    Input: n = 5, maxValue = 3
    Output: 11
    Explanation: The following are the possible ideal arrays:
    - Arrays starting with the value 1 (9 arrays):
       - With no other distinct values (1 array): [1,1,1,1,1]
       - With 2nd distinct value 2 (4 arrays): [1,1,1,1,2], [1,1,1,2,2], [1,1,2,2,2], [1,2,2,2,2]
       - With 2nd distinct value 3 (4 arrays): [1,1,1,1,3], [1,1,1,3,3], [1,1,3,3,3], [1,3,3,3,3]
    - Arrays starting with the value 2 (1 array): [2,2,2,2,2]
    - Arrays starting with the value 3 (1 array): [3,3,3,3,3]
    There are a total of 9 + 1 + 1 = 11 distinct ideal arrays.
      Constraints:
    2 <= n <= 104
    1 <= maxValue <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int maxValue = 5;
        int expected = 10;
        var result = solution.idealArrays(n, maxValue);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int maxValue = 3;
        int expected = 11;
        var result = solution.idealArrays(n, maxValue);
        assertThat(result).isEqualTo(expected);
    }

}
