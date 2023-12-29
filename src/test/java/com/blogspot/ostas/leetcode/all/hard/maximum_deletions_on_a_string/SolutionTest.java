package com.blogspot.ostas.leetcode.all.hard.maximum_deletions_on_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcabcdabc"
    Output: 2
    Explanation:
    - Delete the first 3 letters ("abc") since the next 3 letters are equal. Now, s = "abcdabc".
    - Delete all the letters.
    We used 2 operations so return 2. It can be proven that 2 is the maximum number of operations needed.
    Note that in the second operation we cannot delete "abc" again because the next occurrence of "abc" does not happen in the next 3 letters.
    Example 2:
    Input: s = "aaabaab"
    Output: 4
    Explanation:
    - Delete the first letter ("a") since the next letter is equal. Now, s = "aabaab".
    - Delete the first 3 letters ("aab") since the next 3 letters are equal. Now, s = "aab".
    - Delete the first letter ("a") since the next letter is equal. Now, s = "ab".
    - Delete all the letters.
    We used 4 operations so return 4. It can be proven that 4 is the maximum number of operations needed.
    Example 3:
    Input: s = "aaaaa"
    Output: 5
    Explanation: In each operation, we can delete the first letter of s.
      Constraints:
    1 <= s.length <= 4000
    s consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcabcdabc";
        int expected = 2;
        var result = solution.deleteString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aaabaab";
        int expected = 4;
        var result = solution.deleteString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aaaaa";
        int expected = 5;
        var result = solution.deleteString(s);
        assertThat(result).isEqualTo(expected);
    }

}
