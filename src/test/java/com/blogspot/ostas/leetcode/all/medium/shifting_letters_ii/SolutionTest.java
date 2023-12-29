package com.blogspot.ostas.leetcode.all.medium.shifting_letters_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abc", shifts = [[0,1,0],[1,2,1],[0,2,1]]
    Output: "ace"
    Explanation: Firstly, shift the characters from index 0 to index 1 backward. Now s = "zac".
    Secondly, shift the characters from index 1 to index 2 forward. Now s = "zbd".
    Finally, shift the characters from index 0 to index 2 forward. Now s = "ace".
    Example 2:
    Input: s = "dztz", shifts = [[0,0,0],[1,1,1]]
    Output: "catz"
    Explanation: Firstly, shift the characters from index 0 to index 0 backward. Now s = "cztz".
    Finally, shift the characters from index 1 to index 1 forward. Now s = "catz".
      Constraints:
    1 <= s.length, shifts.length <= 5 * 104
    shifts[i].length == 3
    0 <= starti <= endi < s.length
    0 <= directioni <= 1
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abc";
        int[][] shifts = new int[][]{{0, 1, 0}, {1, 2, 1}, {0, 2, 1}};
        String expected = "ace";
        var result = solution.shiftingLetters(s, shifts);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "dztz";
        int[][] shifts = new int[][]{{0, 0, 0}, {1, 1, 1}};
        String expected = "catz";
        var result = solution.shiftingLetters(s, shifts);
        assertThat(result).isEqualTo(expected);
    }

}
