package com.blogspot.ostas.leetcode.all.easy.crawler_log_folder.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: logs = ["d1/","d2/","../","d21/","./"]
    Output: 2
    Explanation: Use this change folder operation "../" 2 times and go back to the main folder.
    Example 2:
    Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
    Output: 3
    Example 3:
    Input: logs = ["d1/","../","../","../"]
    Output: 0
      Constraints:
    1 <= logs.length <= 103
    2 <= logs[i].length <= 10
    logs[i] contains lowercase English letters, digits, '.', and '/'.
    logs[i] follows the format described in the statement.
    Folder names consist of lowercase English letters and digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] logs = new String[]{"d1/", "d2/", "../", "d21/", "./"};
        int expected = 2;
        var result = solution.minOperations(logs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] logs = new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"};
        int expected = 3;
        var result = solution.minOperations(logs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] logs = new String[]{"d1/", "../", "../", "../"};
        int expected = 0;
        var result = solution.minOperations(logs);
        assertThat(result).isEqualTo(expected);
    }

}
