package com.blogspot.ostas.leetcode.all.medium.pyramid_transition_matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: bottom = "BCD", allowed = ["BCC","CDE","CEA","FFF"]
    Output: true
    Explanation: The allowed triangular patterns are shown on the right.
    Starting from the bottom (level 3), we can build "CE" on level 2 and then build "A" on level 1.
    There are three triangular patterns in the pyramid, which are "BCC", "CDE", and "CEA". All are allowed.
    Example 2:
    Input: bottom = "AAAA", allowed = ["AAB","AAC","BCD","BBE","DEF"]
    Output: false
    Explanation: The allowed triangular patterns are shown on the right.
    Starting from the bottom (level 4), there are multiple ways to build level 3, but trying all the possibilites, you will get always stuck before building level 1.
      Constraints:
    2 <= bottom.length <= 6
    0 <= allowed.length <= 216
    allowed[i].length == 3
    The letters in all input strings are from the set {'A', 'B', 'C', 'D', 'E', 'F'}.
    All the values of allowed are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String bottom = "BCD";
        List<String> allowed = List.of("BCC", "CDE", "CEA", "FFF");
        boolean expected = true;
        var result = solution.pyramidTransition(bottom, allowed);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String bottom = "AAAA";
        List<String> allowed = List.of("AAB", "AAC", "BCD", "BBE", "DEF");
        boolean expected = false;
        var result = solution.pyramidTransition(bottom, allowed);
        assertThat(result).isEqualTo(expected);
    }

}
