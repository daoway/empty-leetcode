package com.blogspot.ostas.leetcode.all.hard.stamping_the_sequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stamp = "abc", target = "ababc"
    Output: [0,2]
    Explanation: Initially s = "?????".
    - Place stamp at index 0 to get "abc??".
    - Place stamp at index 2 to get "ababc".
    [1,0,2] would also be accepted as an answer, as well as some other answers.
    Example 2:
    Input: stamp = "abca", target = "aabcaca"
    Output: [3,0,1]
    Explanation: Initially s = "???????".
    - Place stamp at index 3 to get "???abca".
    - Place stamp at index 0 to get "abcabca".
    - Place stamp at index 1 to get "aabcaca".
      Constraints:
    1 <= stamp.length <= target.length <= 1000
    stamp and target consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String stamp = "abc";
        String target = "ababc";
        int[] expected = new int[]{0, 2};
        var result = solution.movesToStamp(stamp, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String stamp = "abca";
        String target = "aabcaca";
        int[] expected = new int[]{3, 0, 1};
        var result = solution.movesToStamp(stamp, target);
        assertThat(result).isEqualTo(expected);
    }

}
