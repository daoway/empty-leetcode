package com.blogspot.ostas.leetcode.all.easy.maximum_value_of_a_string_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: strs = ["alic3","bob","3","4","00000"]
    Output: 5
    Explanation:
    - "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
    - "bob" consists only of letters, so its value is also its length, i.e. 3.
    - "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
    - "4" also consists only of digits, so its value is 4.
    - "00000" consists only of digits, so its value is 0.
    Hence, the maximum value is 5, of "alic3".
    Example 2:
    Input: strs = ["1","01","001","0001"]
    Output: 1
    Explanation:
    Each string in the array has value 1. Hence, we return 1.
      Constraints:
    1 <= strs.length <= 100
    1 <= strs[i].length <= 9
    strs[i] consists of only lowercase English letters and digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] strs = new String[]{"alic3", "bob", "3", "4", "00000"};
        int expected = 5;
        var result = solution.maximumValue(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] strs = new String[]{"1", "01", "001", "0001"};
        int expected = 1;
        var result = solution.maximumValue(strs);
        assertThat(result).isEqualTo(expected);
    }

}
