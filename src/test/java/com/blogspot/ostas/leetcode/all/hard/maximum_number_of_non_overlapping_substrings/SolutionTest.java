package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_non_overlapping_substrings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "adefaddaccc"
    Output: ["e","f","ccc"]
    Explanation: The following are all the possible substrings that meet the conditions:
    [
      "adefaddaccc"
      "adefadda",
      "ef",
      "e",
      "f",
      "ccc",
    ]
    If we choose the first string, we cannot choose anything else and we'd get only 1. If we choose "adefadda", we are left with "ccc" which is the only one that doesn't overlap, thus obtaining 2 substrings. Notice also, that it's not optimal to choose "ef" since it can be split into two. Therefore, the optimal way is to choose ["e","f","ccc"] which gives us 3 substrings. No other solution of the same number of substrings exist.
    Example 2:
    Input: s = "abbaccd"
    Output: ["d","bb","cc"]
    Explanation: Notice that while the set of substrings ["d","abba","cc"] also has length 3, it's considered incorrect since it has larger total length.
      Constraints:
    1 <= s.length <= 105
    s contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "adefaddaccc";
        List<String> expected = List.of("e", "f", "ccc");
        var result = solution.maxNumOfSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abbaccd";
        List<String> expected = List.of("d", "bb", "cc");
        var result = solution.maxNumOfSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

}
