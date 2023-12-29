package com.blogspot.ostas.leetcode.all.medium.alert_using_same_key_card_three_or_more_times_in_a_one_hour_period;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: keyName = ["daniel","daniel","daniel","luis","luis","luis","luis"], keyTime = ["10:00","10:40","11:00","09:00","11:00","13:00","15:00"]
    Output: ["daniel"]
    Explanation: "daniel" used the keycard 3 times in a one-hour period ("10:00","10:40", "11:00").
    Example 2:
    Input: keyName = ["alice","alice","alice","bob","bob","bob","bob"], keyTime = ["12:01","12:00","18:00","21:00","21:20","21:30","23:00"]
    Output: ["bob"]
    Explanation: "bob" used the keycard 3 times in a one-hour period ("21:00","21:20", "21:30").
      Constraints:
    1 <= keyName.length, keyTime.length <= 105
    keyName.length == keyTime.length
    keyTime[i] is in the format "HH:MM".
    [keyName[i], keyTime[i]] is unique.
    1 <= keyName[i].length <= 10
    keyName[i] contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] keyName = new String[]{"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"};
        String[] keyTime = new String[]{"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"};
        List<String> expected = List.of("daniel");
        var result = solution.alertNames(keyName, keyTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] keyName = new String[]{"alice", "alice", "alice", "bob", "bob", "bob", "bob"};
        String[] keyTime = new String[]{"12:01", "12:00", "18:00", "21:00", "21:20", "21:30", "23:00"};
        List<String> expected = List.of("bob");
        var result = solution.alertNames(keyName, keyTime);
        assertThat(result).isEqualTo(expected);
    }

}
