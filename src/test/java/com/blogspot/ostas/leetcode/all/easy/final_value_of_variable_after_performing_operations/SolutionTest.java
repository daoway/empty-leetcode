package com.blogspot.ostas.leetcode.all.easy.final_value_of_variable_after_performing_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: operations = ["--X","X++","X++"]
    Output: 1
    Explanation: The operations are performed as follows:
    Initially, X = 0.
    --X: X is decremented by 1, X =  0 - 1 = -1.
    X++: X is incremented by 1, X = -1 + 1 =  0.
    X++: X is incremented by 1, X =  0 + 1 =  1.
    Example 2:
    Input: operations = ["++X","++X","X++"]
    Output: 3
    Explanation: The operations are performed as follows:
    Initially, X = 0.
    ++X: X is incremented by 1, X = 0 + 1 = 1.
    ++X: X is incremented by 1, X = 1 + 1 = 2.
    X++: X is incremented by 1, X = 2 + 1 = 3.
    Example 3:
    Input: operations = ["X++","++X","--X","X--"]
    Output: 0
    Explanation: The operations are performed as follows:
    Initially, X = 0.
    X++: X is incremented by 1, X = 0 + 1 = 1.
    ++X: X is incremented by 1, X = 1 + 1 = 2.
    --X: X is decremented by 1, X = 2 - 1 = 1.
    X--: X is decremented by 1, X = 1 - 1 = 0.
      Constraints:
    1 <= operations.length <= 100
    operations[i] will be either "++X", "X++", "--X", or "X--".
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] operations = new String[]{"--X", "X++", "X++"};
        int expected = 1;
        var result = solution.finalValueAfterOperations(operations);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] operations = new String[]{"++X", "++X", "X++"};
        int expected = 3;
        var result = solution.finalValueAfterOperations(operations);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] operations = new String[]{"X++", "++X", "--X", "X--"};
        int expected = 0;
        var result = solution.finalValueAfterOperations(operations);
        assertThat(result).isEqualTo(expected);
    }

}
