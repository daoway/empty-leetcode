package com.blogspot.ostas.hackerrank.dp.jumping_on_the_clouds;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void example_0() {
        List<Integer> c = List.of(0, 0, 1, 0, 0, 1, 0);
        int result = Result.jumpingOnClouds(c);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        List<Integer> c = List.of(0, 0, 0, 1, 0, 0);
        int result = Result.jumpingOnClouds(c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}
