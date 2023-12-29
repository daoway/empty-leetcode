package com.blogspot.ostas.leetcode.all.medium.high_access_employees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: access_times = [["a","0549"],["b","0457"],["a","0532"],["a","0621"],["b","0540"]]
    Output: ["a"]
    Explanation: "a" has three access times in the one-hour period of [05:32, 06:31] which are 05:32, 05:49, and 06:21.
    But "b" does not have more than two access times at all.
    So the answer is ["a"].
    Example 2:
    Input: access_times = [["d","0002"],["c","0808"],["c","0829"],["e","0215"],["d","1508"],["d","1444"],["d","1410"],["c","0809"]]
    Output: ["c","d"]
    Explanation: "c" has three access times in the one-hour period of [08:08, 09:07] which are 08:08, 08:09, and 08:29.
    "d" has also three access times in the one-hour period of [14:10, 15:09] which are 14:10, 14:44, and 15:08.
    However, "e" has just one access time, so it can not be in the answer and the final answer is ["c","d"].
    Example 3:
    Input: access_times = [["cd","1025"],["ab","1025"],["cd","1046"],["cd","1055"],["ab","1124"],["ab","1120"]]
    Output: ["ab","cd"]
    Explanation: "ab" has three access times in the one-hour period of [10:25, 11:24] which are 10:25, 11:20, and 11:24.
    "cd" has also three access times in the one-hour period of [10:25, 11:24] which are 10:25, 10:46, and 10:55.
    So the answer is ["ab","cd"].
      Constraints:
    1 <= access_times.length <= 100
    access_times[i].length == 2
    1 <= access_times[i][0].length <= 10
    access_times[i][0] consists only of English small letters.
    access_times[i][1].length == 4
    access_times[i][1] is in 24-hour time format.
    access_times[i][1] consists only of '0' to '9'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> access_times =
                List.of(List.of("a", "0549"), List.of("b", "0457"), List.of("a", "0532"),
                        List.of("a", "0621"), List.of("b", "0540"));
        List<String> expected = List.of("a");
        var result = solution.findHighAccessEmployees(new ArrayList<>(access_times));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> access_times =
                List.of(List.of("d", "0002"), List.of("c", "0808"), List.of("c", "0829"),
                        List.of("e", "0215"), List.of("d", "1508"), List.of("d", "1444"), List.of("d", "1410"),
                        List.of("c", "0809"));
        List<String> expected = List.of("c", "d");
        var result = solution.findHighAccessEmployees(new ArrayList<>(access_times));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<String>> access_times =
                List.of(List.of("cd", "1025"), List.of("ab", "1025"), List.of("cd", "1046"),
                        List.of("cd", "1055"), List.of("ab", "1124"), List.of("ab", "1120"));
        List<String> expected = List.of("ab", "cd");
        var result = solution.findHighAccessEmployees(new ArrayList<>(access_times));
        assertThat(result).isEqualTo(expected);
    }

}
