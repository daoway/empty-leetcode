package com.blogspot.ostas.leetcode.all.medium.simplify_path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: path = "/home/"
    Output: "/home"
    Explanation: Note that there is no trailing slash after the last directory name.
    Example 2:
    Input: path = "/../"
    Output: "/"
    Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
    Example 3:
    Input: path = "/home//foo/"
    Output: "/home/foo"
    Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
      Constraints:
    1 <= path.length <= 3000
    path consists of English letters, digits, period '.', slash '/' or '_'.
    path is a valid absolute Unix path.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String path = "/home/";
        String expected = "/home";
        var result = solution.simplifyPath(path);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String path = "/../";
        String expected = "/";
        var result = solution.simplifyPath(path);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String path = "/home//foo/";
        String expected = "/home/foo";
        var result = solution.simplifyPath(path);
        assertThat(result).isEqualTo(expected);
    }

}
