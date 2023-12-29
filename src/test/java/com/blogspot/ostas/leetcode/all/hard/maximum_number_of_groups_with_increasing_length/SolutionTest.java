package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_groups_with_increasing_length;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: usageLimits = [1,2,5]
    Output: 3
    Explanation: In this example, we can use 0 at most once, 1 at most twice, and 2 at most five times.
    One way of creating the maximum number of groups while satisfying the conditions is:
    Group 1 contains the number [2].
    Group 2 contains the numbers [1,2].
    Group 3 contains the numbers [0,1,2].
    It can be shown that the maximum number of groups is 3.
    So, the output is 3.
    Example 2:
    Input: usageLimits = [2,1,2]
    Output: 2
    Explanation: In this example, we can use 0 at most twice, 1 at most once, and 2 at most twice.
    One way of creating the maximum number of groups while satisfying the conditions is:
    Group 1 contains the number [0].
    Group 2 contains the numbers [1,2].
    It can be shown that the maximum number of groups is 2.
    So, the output is 2.
    Example 3:
    Input: usageLimits = [1,1]
    Output: 1
    Explanation: In this example, we can use both 0 and 1 at most once.
    One way of creating the maximum number of groups while satisfying the conditions is:
    Group 1 contains the number [0].
    It can be shown that the maximum number of groups is 1.
    So, the output is 1.
      Constraints:
    1 <= usageLimits.length <= 105
    1 <= usageLimits[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> usageLimits = List.of(1, 2, 5);
        int expected = 3;
        var result = solution.maxIncreasingGroups(new ArrayList<>(usageLimits));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> usageLimits = List.of(2, 1, 2);
        int expected = 2;
        var result = solution.maxIncreasingGroups(new ArrayList<>(usageLimits));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<Integer> usageLimits = List.of(1, 1);
        int expected = 1;
        var result = solution.maxIncreasingGroups(new ArrayList<>(usageLimits));
        assertThat(result).isEqualTo(expected);
    }

}
