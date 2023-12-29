package com.blogspot.ostas.leetcode.all.easy.defanging_an_ip_address;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: address = "1.1.1.1"
    Output: "1[.]1[.]1[.]1"
    Example 2:
    Input: address = "255.100.50.0"
    Output: "255[.]100[.]50[.]0"
      Constraints:
    The given address is a valid IPv4 address.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String address = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";
        var result = solution.defangIPaddr(address);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String address = "255.100.50.0";
        String expected = "255[.]100[.]50[.]0";
        var result = solution.defangIPaddr(address);
        assertThat(result).isEqualTo(expected);
    }

}
