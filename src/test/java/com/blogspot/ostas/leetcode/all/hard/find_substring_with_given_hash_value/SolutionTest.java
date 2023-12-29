package com.blogspot.ostas.leetcode.all.hard.find_substring_with_given_hash_value;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leetcode", power = 7, modulo = 20, k = 2, hashValue = 0
    Output: "ee"
    Explanation: The hash of "ee" can be computed to be hash("ee", 7, 20) = (5 * 1 + 5 * 7) mod 20 = 40 mod 20 = 0.
    "ee" is the first substring of length 2 with hashValue 0. Hence, we return "ee".
    Example 2:
    Input: s = "fbxzaad", power = 31, modulo = 100, k = 3, hashValue = 32
    Output: "fbx"
    Explanation: The hash of "fbx" can be computed to be hash("fbx", 31, 100) = (6 * 1 + 2 * 31 + 24 * 312) mod 100 = 23132 mod 100 = 32.
    The hash of "bxz" can be computed to be hash("bxz", 31, 100) = (2 * 1 + 24 * 31 + 26 * 312) mod 100 = 25732 mod 100 = 32.
    "fbx" is the first substring of length 3 with hashValue 32. Hence, we return "fbx".
    Note that "bxz" also has a hash of 32 but it appears later than "fbx".
      Constraints:
    1 <= k <= s.length <= 2 * 104
    1 <= power, modulo <= 109
    0 <= hashValue < modulo
    s consists of lowercase English letters only.
    The test cases are generated such that an answer always exists.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leetcode";
        int power = 7;
        int modulo = 20;
        int k = 2;
        int hashValue = 0;
        String expected = "ee";
        var result = solution.subStrHash(s, power, modulo, k, hashValue);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "fbxzaad";
        int power = 31;
        int modulo = 100;
        int k = 3;
        int hashValue = 32;
        String expected = "fbx";
        var result = solution.subStrHash(s, power, modulo, k, hashValue);
        assertThat(result).isEqualTo(expected);
    }

}
