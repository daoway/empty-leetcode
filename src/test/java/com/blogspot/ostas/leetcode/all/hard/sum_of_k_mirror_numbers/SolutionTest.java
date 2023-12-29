package com.blogspot.ostas.leetcode.all.hard.sum_of_k_mirror_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: k = 2, n = 5
    Output: 25
    Explanation:
    The 5 smallest 2-mirror numbers and their representations in base-2 are listed as follows:
      base-10    base-2
    1          1
    3          11
    5          101
    7          111
    9          1001
    Their sum = 1 + 3 + 5 + 7 + 9 = 25.
    Example 2:
    Input: k = 3, n = 7
    Output: 499
    Explanation:
    The 7 smallest 3-mirror numbers are and their representations in base-3 are listed as follows:
      base-10    base-3
    1          1
    2          2
    4          11
    8          22
    121        11111
    151        12121
    212        21212
    Their sum = 1 + 2 + 4 + 8 + 121 + 151 + 212 = 499.
    Example 3:
    Input: k = 7, n = 17
    Output: 20379000
    Explanation: The 17 smallest 7-mirror numbers are:
    1, 2, 3, 4, 5, 6, 8, 121, 171, 242, 292, 16561, 65656, 2137312, 4602064, 6597956, 6958596
      Constraints:
    2 <= k <= 9
    1 <= n <= 30
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int k = 2;
        int n = 5;
        long expected = 25;
        var result = solution.kMirror(k, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int k = 3;
        int n = 7;
        long expected = 499;
        var result = solution.kMirror(k, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int k = 7;
        int n = 17;
        long expected = 20379000;
        var result = solution.kMirror(k, n);
        assertThat(result).isEqualTo(expected);
    }

}
