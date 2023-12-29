package com.blogspot.ostas.leetcode.all.medium.compare_version_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: version1 = "1.01", version2 = "1.001"
    Output: 0
    Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".
    Example 2:
    Input: version1 = "1.0", version2 = "1.0.0"
    Output: 0
    Explanation: version1 does not specify revision 2, which means it is treated as "0".
    Example 3:
    Input: version1 = "0.1", version2 = "1.1"
    Output: -1
    Explanation: version1's revision 0 is "0", while version2's revision 0 is "1". 0 < 1, so version1 < version2.
      Constraints:
    1 <= version1.length, version2.length <= 500
    version1 and version2 only contain digits and '.'.
    version1 and version2 are valid version numbers.
    All the given revisions in version1 and version2 can be stored in a 32-bit integer.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String version1 = "1.01";
        String version2 = "1.001";
        int expected = 0;
        var result = solution.compareVersion(version1, version2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String version1 = "1.0";
        String version2 = "1.0.0";
        int expected = 0;
        var result = solution.compareVersion(version1, version2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String version1 = "0.1";
        String version2 = "1.1";
        int expected = -1;
        var result = solution.compareVersion(version1, version2);
        assertThat(result).isEqualTo(expected);
    }

}
