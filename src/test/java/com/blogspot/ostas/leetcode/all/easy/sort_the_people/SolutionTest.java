package com.blogspot.ostas.leetcode.all.easy.sort_the_people;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: names = ["Mary","John","Emma"], heights = [180,165,170]
    Output: ["Mary","Emma","John"]
    Explanation: Mary is the tallest, followed by Emma and John.
    Example 2:
    Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
    Output: ["Bob","Alice","Bob"]
    Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
      Constraints:
    n == names.length == heights.length
    1 <= n <= 103
    1 <= names[i].length <= 20
    1 <= heights[i] <= 105
    names[i] consists of lower and upper case English letters.
    All the values of heights are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] names = new String[]{"Mary", "John", "Emma"};
        int[] heights = new int[]{180, 165, 170};
        String[] expected = new String[]{"Mary", "Emma", "John"};
        var result = solution.sortPeople(names, heights);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] names = new String[]{"Alice", "Bob", "Bob"};
        int[] heights = new int[]{155, 185, 150};
        String[] expected = new String[]{"Bob", "Alice", "Bob"};
        var result = solution.sortPeople(names, heights);
        assertThat(result).isEqualTo(expected);
    }

}
