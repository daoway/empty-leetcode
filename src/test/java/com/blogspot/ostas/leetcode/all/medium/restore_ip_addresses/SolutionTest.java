package com.blogspot.ostas.leetcode.all.medium.restore_ip_addresses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "25525511135"
    Output: ["255.255.11.135","255.255.111.35"]
    Example 2:
    Input: s = "0000"
    Output: ["0.0.0.0"]
    Example 3:
    Input: s = "101023"
    Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
      Constraints:
    1 <= s.length <= 20
    s consists of digits only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "25525511135";
        List<String> expected = List.of("255.255.11.135", "255.255.111.35");
        var result = solution.restoreIpAddresses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "0000";
        List<String> expected = List.of("0.0.0.0");
        var result = solution.restoreIpAddresses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "101023";
        List<String> expected =
                List.of("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        var result = solution.restoreIpAddresses(s);
        assertThat(result).isEqualTo(expected);
    }

}
