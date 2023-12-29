package com.blogspot.ostas.leetcode.all.hard.minimum_time_to_remove_all_cars_containing_illegal_goods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1100101"
    Output: 5
    Explanation:
    One way to remove all the cars containing illegal goods from the sequence is to
    - remove a car from the left end 2 times. Time taken is 2 * 1 = 2.
    - remove a car from the right end. Time taken is 1.
    - remove the car containing illegal goods found in the middle. Time taken is 2.
    This obtains a total time of 2 + 1 + 2 = 5.

    An alternative way is to
    - remove a car from the left end 2 times. Time taken is 2 * 1 = 2.
    - remove a car from the right end 3 times. Time taken is 3 * 1 = 3.
    This also obtains a total time of 2 + 3 = 5.

    5 is the minimum time taken to remove all the cars containing illegal goods.
    There are no other ways to remove them with less time.
    Example 2:
    Input: s = "0010"
    Output: 2
    Explanation:
    One way to remove all the cars containing illegal goods from the sequence is to
    - remove a car from the left end 3 times. Time taken is 3 * 1 = 3.
    This obtains a total time of 3.

    Another way to remove all the cars containing illegal goods from the sequence is to
    - remove the car containing illegal goods found in the middle. Time taken is 2.
    This obtains a total time of 2.

    Another way to remove all the cars containing illegal goods from the sequence is to
    - remove a car from the right end 2 times. Time taken is 2 * 1 = 2.
    This obtains a total time of 2.

    2 is the minimum time taken to remove all the cars containing illegal goods.
    There are no other ways to remove them with less time.
      Constraints:
    1 <= s.length <= 2 * 105
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1100101";
        int expected = 5;
        var result = solution.minimumTime(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "0010";
        int expected = 2;
        var result = solution.minimumTime(s);
        assertThat(result).isEqualTo(expected);
    }

}
