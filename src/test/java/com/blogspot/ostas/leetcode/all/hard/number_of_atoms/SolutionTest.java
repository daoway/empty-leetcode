package com.blogspot.ostas.leetcode.all.hard.number_of_atoms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: formula = "H2O"
    Output: "H2O"
    Explanation: The count of elements are {'H': 2, 'O': 1}.
    Example 2:
    Input: formula = "Mg(OH)2"
    Output: "H2MgO2"
    Explanation: The count of elements are {'H': 2, 'Mg': 1, 'O': 2}.
    Example 3:
    Input: formula = "K4(ON(SO3)2)2"
    Output: "K4N2O14S4"
    Explanation: The count of elements are {'K': 4, 'N': 2, 'O': 14, 'S': 4}.
      Constraints:
    1 <= formula.length <= 1000
    formula consists of English letters, digits, '(', and ')'.
    formula is always valid.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String formula = "H2O";
        String expected = "H2O";
        var result = solution.countOfAtoms(formula);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String formula = "Mg(OH)2";
        String expected = "H2MgO2";
        var result = solution.countOfAtoms(formula);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String formula = "K4(ON(SO3)2)2";
        String expected = "K4N2O14S4";
        var result = solution.countOfAtoms(formula);
        assertThat(result).isEqualTo(expected);
    }

}
