package com.blogspot.ostas.leetcode.all.easy.binary_watch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: turnedOn = 1
    Output: ["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]
    Example 2:
    Input: turnedOn = 9
    Output: []
      Constraints:
    0 <= turnedOn <= 10
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int turnedOn = 1;
        List<String> expected =
                List.of("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00");
        var result = solution.readBinaryWatch(turnedOn);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int turnedOn = 9;
        List<String> expected = List.of();
        var result = solution.readBinaryWatch(turnedOn);
        assertThat(result).isEqualTo(expected);
    }

}
