package com.blogspot.ostas.leetcode.all.easy.shortest_distance_to_target_string_in_a_circular_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["hello","i","am","leetcode","hello"], target = "hello", startIndex = 1
    Output: 1
    Explanation: We start from index 1 and can reach "hello" by
    - moving 3 units to the right to reach index 4.
    - moving 2 units to the left to reach index 4.
    - moving 4 units to the right to reach index 0.
    - moving 1 unit to the left to reach index 0.
    The shortest distance to reach "hello" is 1.
    Example 2:
    Input: words = ["a","b","leetcode"], target = "leetcode", startIndex = 0
    Output: 1
    Explanation: We start from index 0 and can reach "leetcode" by
    - moving 2 units to the right to reach index 3.
    - moving 1 unit to the left to reach index 3.
    The shortest distance to reach "leetcode" is 1.
    Example 3:
    Input: words = ["i","eat","leetcode"], target = "ate", startIndex = 0
    Output: -1
    Explanation: Since "ate" does not exist in words, we return -1.
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 100
    words[i] and target consist of only lowercase English letters.
    0 <= startIndex < words.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"hello", "i", "am", "leetcode", "hello"};
        String target = "hello";
        int startIndex = 1;
        int expected = 1;
        var result = solution.closetTarget(words, target, startIndex);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"a", "b", "leetcode"};
        String target = "leetcode";
        int startIndex = 0;
        int expected = 1;
        var result = solution.closetTarget(words, target, startIndex);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"i", "eat", "leetcode"};
        String target = "ate";
        int startIndex = 0;
        int expected = -1;
        var result = solution.closetTarget(words, target, startIndex);
        assertThat(result).isEqualTo(expected);
    }

}
