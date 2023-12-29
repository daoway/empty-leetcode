package com.blogspot.ostas.leetcode.all.hard.freedom_trail;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ring = "godding", key = "gd"
    Output: 4
    Explanation:
    For the first key character 'g', since it is already in place, we just need 1 step to spell this character.
    For the second key character 'd', we need to rotate the ring "godding" anticlockwise by two steps to make it become "ddinggo".
    Also, we need 1 more step for spelling.
    So the final output is 4.
    Example 2:
    Input: ring = "godding", key = "godding"
    Output: 13
      Constraints:
    1 <= ring.length, key.length <= 100
    ring and key consist of only lower case English letters.
    It is guaranteed that key could always be spelled by rotating ring.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String ring = "godding";
        String key = "gd";
        int expected = 4;
        var result = solution.findRotateSteps(ring, key);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String ring = "godding";
        String key = "godding";
        int expected = 13;
        var result = solution.findRotateSteps(ring, key);
        assertThat(result).isEqualTo(expected);
    }

}
