package com.blogspot.ostas.leetcode.all.easy.categorize_box_according_to_criteria;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: length = 1000, width = 35, height = 700, mass = 300
    Output: "Heavy"
    Explanation:
    None of the dimensions of the box is greater or equal to 104.
    Its volume = 24500000 <= 109. So it cannot be categorized as "Bulky".
    However mass >= 100, so the box is "Heavy".
    Since the box is not "Bulky" but "Heavy", we return "Heavy".
    Example 2:
    Input: length = 200, width = 50, height = 800, mass = 50
    Output: "Neither"
    Explanation:
    None of the dimensions of the box is greater or equal to 104.
    Its volume = 8 * 106 <= 109. So it cannot be categorized as "Bulky".
    Its mass is also less than 100, so it cannot be categorized as "Heavy" either.
    Since its neither of the two above categories, we return "Neither".
      Constraints:
    1 <= length, width, height <= 105
    1 <= mass <= 103
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int length = 1000;
        int width = 35;
        int height = 700;
        int mass = 300;
        String expected = "Heavy";
        var result = solution.categorizeBox(length, width, height, mass);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int length = 200;
        int width = 50;
        int height = 800;
        int mass = 50;
        String expected = "Neither";
        var result = solution.categorizeBox(length, width, height, mass);
        assertThat(result).isEqualTo(expected);
    }

}
