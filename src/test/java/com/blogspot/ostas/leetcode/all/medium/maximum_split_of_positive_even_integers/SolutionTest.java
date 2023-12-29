package com.blogspot.ostas.leetcode.all.medium.maximum_split_of_positive_even_integers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: finalSum = 12
    Output: [2,4,6]
    Explanation: The following are valid splits: (12), (2 + 10), (2 + 4 + 6), and (4 + 8).
    (2 + 4 + 6) has the maximum number of integers, which is 3. Thus, we return [2,4,6].
    Note that [2,6,4], [6,2,4], etc. are also accepted.
    Example 2:
    Input: finalSum = 7
    Output: []
    Explanation: There are no valid splits for the given finalSum.
    Thus, we return an empty array.
    Example 3:
    Input: finalSum = 28
    Output: [6,8,2,12]
    Explanation: The following are valid splits: (2 + 26), (6 + 8 + 2 + 12), and (4 + 24).
    (6 + 8 + 2 + 12) has the maximum number of integers, which is 4. Thus, we return [6,8,2,12].
    Note that [10,2,4,12], [6,2,4,16], etc. are also accepted.
      Constraints:
    1 <= finalSum <= 1010
    */
    @Test
    void example_0() {
        var solution = new Solution();
        long finalSum = 12;
        List<Long> expected = List.of(2L, 4L, 6L);
        var result = solution.maximumEvenSplit(finalSum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        long finalSum = 7;
        List<Long> expected = List.of();
        var result = solution.maximumEvenSplit(finalSum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        long finalSum = 28;
        List<Long> expected1 = List.of(6L, 8L, 2L, 12L);
        List<Long> expected2 = List.of(10L, 2L, 4L, 12L);
        List<Long> expected3 = List.of(6L, 2L, 4L, 16L);
        var result = solution.maximumEvenSplit(finalSum);
        assertThat(result).satisfiesAnyOf(
                r -> assertThat(result).containsExactlyInAnyOrderElementsOf(expected1),
                r -> assertThat(result).containsExactlyInAnyOrderElementsOf(expected2),
                r -> assertThat(result).containsExactlyInAnyOrderElementsOf(expected3)
        );
    }

}
