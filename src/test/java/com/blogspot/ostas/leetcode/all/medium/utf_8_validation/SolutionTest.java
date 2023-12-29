package com.blogspot.ostas.leetcode.all.medium.utf_8_validation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: data = [197,130,1]
    Output: true
    Explanation: data represents the octet sequence: 11000101 10000010 00000001.
    It is a valid utf-8 encoding for a 2-bytes character followed by a 1-byte character.
    Example 2:
    Input: data = [235,140,4]
    Output: false
    Explanation: data represented the octet sequence: 11101011 10001100 00000100.
    The first 3 bits are all one's and the 4th bit is 0 means it is a 3-bytes character.
    The next byte is a continuation byte which starts with 10 and that's correct.
    But the second continuation byte does not start with 10, so it is invalid.
      Constraints:
    1 <= data.length <= 2 * 104
    0 <= data[i] <= 255
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] data = new int[]{197, 130, 1};
        boolean expected = true;
        var result = solution.validUtf8(data);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] data = new int[]{235, 140, 4};
        boolean expected = false;
        var result = solution.validUtf8(data);
        assertThat(result).isEqualTo(expected);
    }

}
