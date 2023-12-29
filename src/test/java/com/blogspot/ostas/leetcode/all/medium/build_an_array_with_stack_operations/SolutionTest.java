package com.blogspot.ostas.leetcode.all.medium.build_an_array_with_stack_operations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = [1,3], n = 3
    Output: ["Push","Push","Pop","Push"]
    Explanation: Initially the stack s is empty. The last element is the top of the stack.
    Read 1 from the stream and push it to the stack. s = [1].
    Read 2 from the stream and push it to the stack. s = [1,2].
    Pop the integer on the top of the stack. s = [1].
    Read 3 from the stream and push it to the stack. s = [1,3].
    Example 2:
    Input: target = [1,2,3], n = 3
    Output: ["Push","Push","Push"]
    Explanation: Initially the stack s is empty. The last element is the top of the stack.
    Read 1 from the stream and push it to the stack. s = [1].
    Read 2 from the stream and push it to the stack. s = [1,2].
    Read 3 from the stream and push it to the stack. s = [1,2,3].
    Example 3:
    Input: target = [1,2], n = 4
    Output: ["Push","Push"]
    Explanation: Initially the stack s is empty. The last element is the top of the stack.
    Read 1 from the stream and push it to the stack. s = [1].
    Read 2 from the stream and push it to the stack. s = [1,2].
    Since the stack (from the bottom to the top) is equal to target, we stop the stack operations.
    The answers that read integer 3 from the stream are not accepted.
      Constraints:
    1 <= target.length <= 100
    1 <= n <= 100
    1 <= target[i] <= n
    target is strictly increasing.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] target = new int[]{1, 3};
        int n = 3;
        List<String> expected = List.of("Push", "Push", "Pop", "Push");
        var result = solution.buildArray(target, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] target = new int[]{1, 2, 3};
        int n = 3;
        List<String> expected = List.of("Push", "Push", "Push");
        var result = solution.buildArray(target, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] target = new int[]{1, 2};
        int n = 4;
        List<String> expected = List.of("Push", "Push");
        var result = solution.buildArray(target, n);
        assertThat(result).isEqualTo(expected);
    }

}
