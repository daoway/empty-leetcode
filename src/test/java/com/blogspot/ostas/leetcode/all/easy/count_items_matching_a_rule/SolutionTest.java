package com.blogspot.ostas.leetcode.all.easy.count_items_matching_a_rule;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
    Output: 1
    Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
    Example 2:
    Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
    Output: 2
    Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
      Constraints:
    1 <= items.length <= 104
    1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
    ruleKey is equal to either "type", "color", or "name".
    All strings consist only of lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> items =
                List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"),
                        List.of("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        int expected = 1;
        var result = solution.countMatches(items, ruleKey, ruleValue);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> items =
                List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "phone"),
                        List.of("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        int expected = 2;
        var result = solution.countMatches(items, ruleKey, ruleValue);
        assertThat(result).isEqualTo(expected);
    }

}
