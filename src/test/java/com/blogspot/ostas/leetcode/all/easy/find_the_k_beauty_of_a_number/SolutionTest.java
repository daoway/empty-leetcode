package com.blogspot.ostas.leetcode.all.easy.find_the_k_beauty_of_a_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 240, k = 2
    Output: 2
    Explanation: The following are the substrings of num of length k:
    - "24" from "240": 24 is a divisor of 240.
    - "40" from "240": 40 is a divisor of 240.
    Therefore, the k-beauty is 2.
    Example 2:
    Input: num = 430043, k = 2
    Output: 2
    Explanation: The following are the substrings of num of length k:
    - "43" from "430043": 43 is a divisor of 430043.
    - "30" from "430043": 30 is not a divisor of 430043.
    - "00" from "430043": 0 is not a divisor of 430043.
    - "04" from "430043": 4 is not a divisor of 430043.
    - "43" from "430043": 43 is a divisor of 430043.
    Therefore, the k-beauty is 2.
      Constraints:
    1 <= num <= 109
    1 <= k <= num.length (taking num as a string)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 240;
        int k = 2;
        int expected = 2;
        var result = solution.divisorSubstrings(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 430043;
        int k = 2;
        int expected = 2;
        var result = solution.divisorSubstrings(num, k);
        assertThat(result).isEqualTo(expected);
    }

}
