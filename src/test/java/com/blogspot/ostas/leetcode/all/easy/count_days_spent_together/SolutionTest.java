package com.blogspot.ostas.leetcode.all.easy.count_days_spent_together;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19"
    Output: 3
    Explanation: Alice will be in Rome from August 15 to August 18. Bob will be in Rome from August 16 to August 19. They are both in Rome together on August 16th, 17th, and 18th, so the answer is 3.
    Example 2:
    Input: arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob = "12-31"
    Output: 0
    Explanation: There is no day when Alice and Bob are in Rome together, so we return 0.
      Constraints:
    All dates are provided in the format "MM-DD".
    Alice and Bob's arrival dates are earlier than or equal to their leaving dates.
    The given dates are valid dates of a non-leap year.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String arriveAlice = "08-15";
        String leaveAlice = "08-18";
        String arriveBob = "08-16";
        String leaveBob = "08-19";
        int expected = 3;
        var result = solution.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String arriveAlice = "10-01";
        String leaveAlice = "10-31";
        String arriveBob = "11-01";
        String leaveBob = "12-31";
        int expected = 0;
        var result = solution.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob);
        assertThat(result).isEqualTo(expected);
    }

}
