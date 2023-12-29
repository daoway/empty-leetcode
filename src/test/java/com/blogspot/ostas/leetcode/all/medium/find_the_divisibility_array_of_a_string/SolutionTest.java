package com.blogspot.ostas.leetcode.all.medium.find_the_divisibility_array_of_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "998244353", m = 3
    Output: [1,1,0,0,0,1,1,0,0]
    Explanation: There are only 4 prefixes that are divisible by 3: "9", "99", "998244", and "9982443".
    Example 2:
    Input: word = "1010", m = 10
    Output: [0,1,0,1]
    Explanation: There are only 2 prefixes that are divisible by 10: "10", and "1010".
      Constraints:
    1 <= n <= 105
    word.length == n
    word consists of digits from 0 to 9
    1 <= m <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "998244353";
        int m = 3;
        int[] expected = new int[]{1, 1, 0, 0, 0, 1, 1, 0, 0};
        var result = solution.divisibilityArray(word, m);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "1010";
        int m = 10;
        int[] expected = new int[]{0, 1, 0, 1};
        var result = solution.divisibilityArray(word, m);
        assertThat(result).isEqualTo(expected);
    }

}
