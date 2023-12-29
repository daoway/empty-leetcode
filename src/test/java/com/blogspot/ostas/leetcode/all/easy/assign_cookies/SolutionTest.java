package com.blogspot.ostas.leetcode.all.easy.assign_cookies;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: g = [1,2,3], s = [1,1]
    Output: 1
    Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
    And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
    You need to output 1.
    Example 2:
    Input: g = [1,2], s = [1,2,3]
    Output: 2
    Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
    You have 3 cookies and their sizes are big enough to gratify all of the children,
    You need to output 2.
      Constraints:
    1 <= g.length <= 3 * 104
    0 <= s.length <= 3 * 104
    1 <= g[i], s[j] <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] g = new int[]{1, 2, 3};
        int[] s = new int[]{1, 1};
        int expected = 1;
        var result = solution.findContentChildren(g, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] g = new int[]{1, 2};
        int[] s = new int[]{1, 2, 3};
        int expected = 2;
        var result = solution.findContentChildren(g, s);
        assertThat(result).isEqualTo(expected);
    }

}
