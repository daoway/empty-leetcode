package com.blogspot.ostas.leetcode.all.easy.calculate_amount_paid_in_taxes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: brackets = [[3,50],[7,10],[12,25]], income = 10
    Output: 2.65000
    Explanation:
    Based on your income, you have 3 dollars in the 1st tax bracket, 4 dollars in the 2nd tax bracket, and 3 dollars in the 3rd tax bracket.
    The tax rate for the three tax brackets is 50%, 10%, and 25%, respectively.
    In total, you pay $3 * 50% + $4 * 10% + $3 * 25% = $2.65 in taxes.
    Example 2:
    Input: brackets = [[1,0],[4,25],[5,50]], income = 2
    Output: 0.25000
    Explanation:
    Based on your income, you have 1 dollar in the 1st tax bracket and 1 dollar in the 2nd tax bracket.
    The tax rate for the two tax brackets is 0% and 25%, respectively.
    In total, you pay $1 * 0% + $1 * 25% = $0.25 in taxes.
    Example 3:
    Input: brackets = [[2,50]], income = 0
    Output: 0.00000
    Explanation:
    You have no income to tax, so you have to pay a total of $0 in taxes.
      Constraints:
    1 <= brackets.length <= 100
    1 <= upperi <= 1000
    0 <= percenti <= 100
    0 <= income <= 1000
    upperi is sorted in ascending order.
    All the values of upperi are unique.
    The upper bound of the last tax bracket is greater than or equal to income.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] brackets = new int[][]{{3, 50}, {7, 10}, {12, 25}};
        int income = 10;
        double expected = 2.65000;
        var result = solution.calculateTax(brackets, income);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] brackets = new int[][]{{1, 0}, {4, 25}, {5, 50}};
        int income = 2;
        double expected = 0.25000;
        var result = solution.calculateTax(brackets, income);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] brackets = new int[][]{{2, 50}};
        int income = 0;
        double expected = 0.00000;
        var result = solution.calculateTax(brackets, income);
        assertThat(result).isEqualTo(expected);
    }

}
