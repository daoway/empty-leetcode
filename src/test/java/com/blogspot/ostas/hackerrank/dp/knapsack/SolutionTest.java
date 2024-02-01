package com.blogspot.ostas.hackerrank.dp.knapsack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    @Test
    void test_0(){
        int k=0;
        List<Integer> arr = List.of();
        var result = Result.unboundedKnapsack(k, arr);
    }
}