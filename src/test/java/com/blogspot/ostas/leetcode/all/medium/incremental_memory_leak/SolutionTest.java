package com.blogspot.ostas.leetcode.all.medium.incremental_memory_leak;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: memory1 = 2, memory2 = 2
    Output: [3,1,0]
    Explanation: The memory is allocated as follows:
    - At the 1st second, 1 bit of memory is allocated to stick 1. The first stick now has 1 bit of available memory.
    - At the 2nd second, 2 bits of memory are allocated to stick 2. The second stick now has 0 bits of available memory.
    - At the 3rd second, the program crashes. The sticks have 1 and 0 bits available respectively.
    Example 2:
    Input: memory1 = 8, memory2 = 11
    Output: [6,0,4]
    Explanation: The memory is allocated as follows:
    - At the 1st second, 1 bit of memory is allocated to stick 2. The second stick now has 10 bit of available memory.
    - At the 2nd second, 2 bits of memory are allocated to stick 2. The second stick now has 8 bits of available memory.
    - At the 3rd second, 3 bits of memory are allocated to stick 1. The first stick now has 5 bits of available memory.
    - At the 4th second, 4 bits of memory are allocated to stick 2. The second stick now has 4 bits of available memory.
    - At the 5th second, 5 bits of memory are allocated to stick 1. The first stick now has 0 bits of available memory.
    - At the 6th second, the program crashes. The sticks have 0 and 4 bits available respectively.
      Constraints:
    0 <= memory1, memory2 <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int memory1 = 2;
        int memory2 = 2;
        int[] expected = new int[]{3, 1, 0};
        var result = solution.memLeak(memory1, memory2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int memory1 = 8;
        int memory2 = 11;
        int[] expected = new int[]{6, 0, 4};
        var result = solution.memLeak(memory1, memory2);
        assertThat(result).isEqualTo(expected);
    }

}
