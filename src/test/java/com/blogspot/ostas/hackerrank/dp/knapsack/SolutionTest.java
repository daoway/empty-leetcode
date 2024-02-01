package com.blogspot.ostas.hackerrank.dp.knapsack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//In the first test case, one can pick {6, 6}. In the second, we can pick {3,3,3}.


class SolutionTest {
    @Test
    void test_0() {
        int k = 12;
        List<Integer> arr = List.of(1, 6, 9);
        var result = Result.unboundedKnapsack(k, arr);
        var expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test_1() {
        int k = 9;
        List<Integer> arr = List.of(3, 4, 4, 4, 8);
        var result = Result.unboundedKnapsack(k, arr);
        var expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}