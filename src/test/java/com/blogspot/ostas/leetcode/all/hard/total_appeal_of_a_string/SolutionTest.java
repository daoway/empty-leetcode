package com.blogspot.ostas.leetcode.all.hard.total_appeal_of_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abbca"
    Output: 28
    Explanation: The following are the substrings of "abbca":
    - Substrings of length 1: "a", "b", "b", "c", "a" have an appeal of 1, 1, 1, 1, and 1 respectively. The sum is 5.
    - Substrings of length 2: "ab", "bb", "bc", "ca" have an appeal of 2, 1, 2, and 2 respectively. The sum is 7.
    - Substrings of length 3: "abb", "bbc", "bca" have an appeal of 2, 2, and 3 respectively. The sum is 7.
    - Substrings of length 4: "abbc", "bbca" have an appeal of 3 and 3 respectively. The sum is 6.
    - Substrings of length 5: "abbca" has an appeal of 3. The sum is 3.
    The total sum is 5 + 7 + 7 + 6 + 3 = 28.
    Example 2:
    Input: s = "code"
    Output: 20
    Explanation: The following are the substrings of "code":
    - Substrings of length 1: "c", "o", "d", "e" have an appeal of 1, 1, 1, and 1 respectively. The sum is 4.
    - Substrings of length 2: "co", "od", "de" have an appeal of 2, 2, and 2 respectively. The sum is 6.
    - Substrings of length 3: "cod", "ode" have an appeal of 3 and 3 respectively. The sum is 6.
    - Substrings of length 4: "code" has an appeal of 4. The sum is 4.
    The total sum is 4 + 6 + 6 + 4 = 20.
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abbca";
        long expected = 28;
        var result = solution.appealSum(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "code";
        long expected = 20;
        var result = solution.appealSum(s);
        assertThat(result).isEqualTo(expected);
    }

}
