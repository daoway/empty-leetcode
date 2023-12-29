package com.blogspot.ostas.leetcode.all.medium.repeated_dna_sequences;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
    Output: ["AAAAACCCCC","CCCCCAAAAA"]
    Example 2:
    Input: s = "AAAAAAAAAAAAA"
    Output: ["AAAAAAAAAA"]
      Constraints:
    1 <= s.length <= 105
    s[i] is either 'A', 'C', 'G', or 'T'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected = List.of("AAAAACCCCC", "CCCCCAAAAA");
        var result = solution.findRepeatedDnaSequences(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "AAAAAAAAAAAAA";
        List<String> expected = List.of("AAAAAAAAAA");
        var result = solution.findRepeatedDnaSequences(s);
        assertThat(result).isEqualTo(expected);
    }

}
