package com.blogspot.ostas.leetcode.all.medium.evaluate_the_bracket_pairs_of_a_string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "(name)is(age)yearsold", knowledge = [["name","bob"],["age","two"]]
    Output: "bobistwoyearsold"
    Explanation:
    The key "name" has a value of "bob", so replace "(name)" with "bob".
    The key "age" has a value of "two", so replace "(age)" with "two".
    Example 2:
    Input: s = "hi(name)", knowledge = [["a","b"]]
    Output: "hi?"
    Explanation: As you do not know the value of the key "name", replace "(name)" with "?".
    Example 3:
    Input: s = "(a)(a)(a)aaa", knowledge = [["a","yes"]]
    Output: "yesyesyesaaa"
    Explanation: The same key can appear multiple times.
    The key "a" has a value of "yes", so replace all occurrences of "(a)" with "yes".
    Notice that the "a"s not in a bracket pair are not evaluated.
      Constraints:
    1 <= s.length <= 105
    0 <= knowledge.length <= 105
    knowledge[i].length == 2
    1 <= keyi.length, valuei.length <= 10
    s consists of lowercase English letters and round brackets '(' and ')'.
    Every open bracket '(' in s will have a corresponding close bracket ')'.
    The key in each bracket pair of s will be non-empty.
    There will not be any nested bracket pairs in s.
    keyi and valuei consist of lowercase English letters.
    Each keyi in knowledge is unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "(name)is(age)yearsold";
        List<List<String>> knowledge = List.of(List.of("name", "bob"), List.of("age", "two"));
        String expected = "bobistwoyearsold";
        var result = solution.evaluate(s, knowledge);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "hi(name)";
        List<List<String>> knowledge = List.of(List.of("a", "b"));
        String expected = "hi?";
        var result = solution.evaluate(s, knowledge);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "(a)(a)(a)aaa";
        List<List<String>> knowledge = List.of(List.of("a", "yes"));
        String expected = "yesyesyesaaa";
        var result = solution.evaluate(s, knowledge);
        assertThat(result).isEqualTo(expected);
    }

}
