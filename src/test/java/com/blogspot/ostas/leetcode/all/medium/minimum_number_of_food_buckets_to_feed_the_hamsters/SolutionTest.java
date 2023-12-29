package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_food_buckets_to_feed_the_hamsters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: hamsters = "H..H"
    Output: 2
    Explanation: We place two food buckets at indices 1 and 2.
    It can be shown that if we place only one food bucket, one of the hamsters will not be fed.
    Example 2:
    Input: hamsters = ".H.H."
    Output: 1
    Explanation: We place one food bucket at index 2.
    Example 3:
    Input: hamsters = ".HHH."
    Output: -1
    Explanation: If we place a food bucket at every empty index as shown, the hamster at index 2 will not be able to eat.
      Constraints:
    1 <= hamsters.length <= 105
    hamsters[i] is either'H' or '.'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String hamsters = "H..H";
        int expected = 2;
        var result = solution.minimumBuckets(hamsters);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String hamsters = ".H.H.";
        int expected = 1;
        var result = solution.minimumBuckets(hamsters);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String hamsters = ".HHH.";
        int expected = -1;
        var result = solution.minimumBuckets(hamsters);
        assertThat(result).isEqualTo(expected);
    }

}
