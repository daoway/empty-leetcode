package com.blogspot.ostas.leetcode.all.hard.poor_pigs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: buckets = 4, minutesToDie = 15, minutesToTest = 15
    Output: 2
    Explanation: We can determine the poisonous bucket as follows:
    At time 0, feed the first pig buckets 1 and 2, and feed the second pig buckets 2 and 3.
    At time 15, there are 4 possible outcomes:
    - If only the first pig dies, then bucket 1 must be poisonous.
    - If only the second pig dies, then bucket 3 must be poisonous.
    - If both pigs die, then bucket 2 must be poisonous.
    - If neither pig dies, then bucket 4 must be poisonous.
    Example 2:
    Input: buckets = 4, minutesToDie = 15, minutesToTest = 30
    Output: 2
    Explanation: We can determine the poisonous bucket as follows:
    At time 0, feed the first pig bucket 1, and feed the second pig bucket 2.
    At time 15, there are 2 possible outcomes:
    - If either pig dies, then the poisonous bucket is the one it was fed.
    - If neither pig dies, then feed the first pig bucket 3, and feed the second pig bucket 4.
    At time 30, one of the two pigs must die, and the poisonous bucket is the one it was fed.
      Constraints:
    1 <= buckets <= 1000
    1 <= minutesToDie <= minutesToTest <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int buckets = 4;
        int minutesToDie = 15;
        int minutesToTest = 15;
        int expected = 2;
        var result = solution.poorPigs(buckets, minutesToDie, minutesToTest);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int buckets = 4;
        int minutesToDie = 15;
        int minutesToTest = 30;
        int expected = 2;
        var result = solution.poorPigs(buckets, minutesToDie, minutesToTest);
        assertThat(result).isEqualTo(expected);
    }

}
