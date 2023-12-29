package com.blogspot.ostas.leetcode.all.medium.validate_ip_address;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: queryIP = "172.16.254.1"
    Output: "IPv4"
    Explanation: This is a valid IPv4 address, return "IPv4".
    Example 2:
    Input: queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334"
    Output: "IPv6"
    Explanation: This is a valid IPv6 address, return "IPv6".
    Example 3:
    Input: queryIP = "256.256.256.256"
    Output: "Neither"
    Explanation: This is neither a IPv4 address nor a IPv6 address.
      Constraints:
    queryIP consists only of English letters, digits and the characters '.' and ':'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String queryIP = "172.16.254.1";
        String expected = "IPv4";
        var result = solution.validIPAddress(queryIP);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        String expected = "IPv6";
        var result = solution.validIPAddress(queryIP);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String queryIP = "256.256.256.256";
        String expected = "Neither";
        var result = solution.validIPAddress(queryIP);
        assertThat(result).isEqualTo(expected);
    }

}
