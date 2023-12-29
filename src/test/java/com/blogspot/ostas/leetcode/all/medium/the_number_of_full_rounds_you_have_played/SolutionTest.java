package com.blogspot.ostas.leetcode.all.medium.the_number_of_full_rounds_you_have_played;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: loginTime = "09:31", logoutTime = "10:14"
    Output: 1
    Explanation: You played one full round from 09:45 to 10:00.
    You did not play the full round from 09:30 to 09:45 because you logged in at 09:31 after it began.
    You did not play the full round from 10:00 to 10:15 because you logged out at 10:14 before it ended.
    Example 2:
    Input: loginTime = "21:30", logoutTime = "03:00"
    Output: 22
    Explanation: You played 10 full rounds from 21:30 to 00:00 and 12 full rounds from 00:00 to 03:00.
    10 + 12 = 22.
      Constraints:
    loginTime and logoutTime are in the format hh:mm.
    00 <= hh <= 23
    00 <= mm <= 59
    loginTime and logoutTime are not equal.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String loginTime = "09:31";
        String logoutTime = "10:14";
        int expected = 1;
        var result = solution.numberOfRounds(loginTime, logoutTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String loginTime = "21:30";
        String logoutTime = "03:00";
        int expected = 22;
        var result = solution.numberOfRounds(loginTime, logoutTime);
        assertThat(result).isEqualTo(expected);
    }

}
