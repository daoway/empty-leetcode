package com.blogspot.ostas.leetcode.all.easy.kth_distinct_string_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = ["d","b","c","b","c","a"], k = 2
    Output: "a"
    Explanation:
    The only distinct strings in arr are "d" and "a".
    "d" appears 1st, so it is the 1st distinct string.
    "a" appears 2nd, so it is the 2nd distinct string.
    Since k == 2, "a" is returned.
    Example 2:
    Input: arr = ["aaa","aa","a"], k = 1
    Output: "aaa"
    Explanation:
    All strings in arr are distinct, so the 1st string "aaa" is returned.
    Example 3:
    Input: arr = ["a","b","a"], k = 3
    Output: ""
    Explanation:
    The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".
      Constraints:
    1 <= k <= arr.length <= 1000
    1 <= arr[i].length <= 5
    arr[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] arr = new String[]{"d", "b", "c", "b", "c", "a"};
        int k = 2;
        String expected = "a";
        var result = solution.kthDistinct(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] arr = new String[]{"aaa", "aa", "a"};
        int k = 1;
        String expected = "aaa";
        var result = solution.kthDistinct(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] arr = new String[]{"a", "b", "a"};
        int k = 3;
        String expected = "";
        var result = solution.kthDistinct(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
