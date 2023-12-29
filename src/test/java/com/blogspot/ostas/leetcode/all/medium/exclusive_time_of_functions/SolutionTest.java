package com.blogspot.ostas.leetcode.all.medium.exclusive_time_of_functions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, logs = ["0:start:0","1:start:2","1:end:5","0:end:6"]
    Output: [3,4]
    Explanation:
    Function 0 starts at the beginning of time 0, then it executes 2 for units of time and reaches the end of time 1.
    Function 1 starts at the beginning of time 2, executes for 4 units of time, and ends at the end of time 5.
    Function 0 resumes execution at the beginning of time 6 and executes for 1 unit of time.
    So function 0 spends 2 + 1 = 3 units of total time executing, and function 1 spends 4 units of total time executing.
    Example 2:
    Input: n = 1, logs = ["0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7"]
    Output: [8]
    Explanation:
    Function 0 starts at the beginning of time 0, executes for 2 units of time, and recursively calls itself.
    Function 0 (recursive call) starts at the beginning of time 2 and executes for 4 units of time.
    Function 0 (initial call) resumes execution then immediately calls itself again.
    Function 0 (2nd recursive call) starts at the beginning of time 6 and executes for 1 unit of time.
    Function 0 (initial call) resumes execution at the beginning of time 7 and executes for 1 unit of time.
    So function 0 spends 2 + 4 + 1 + 1 = 8 units of total time executing.
    Example 3:
    Input: n = 2, logs = ["0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7"]
    Output: [7,1]
    Explanation:
    Function 0 starts at the beginning of time 0, executes for 2 units of time, and recursively calls itself.
    Function 0 (recursive call) starts at the beginning of time 2 and executes for 4 units of time.
    Function 0 (initial call) resumes execution then immediately calls function 1.
    Function 1 starts at the beginning of time 6, executes 1 unit of time, and ends at the end of time 6.
    Function 0 resumes execution at the beginning of time 6 and executes for 2 units of time.
    So function 0 spends 2 + 4 + 1 = 7 units of total time executing, and function 1 spends 1 unit of total time executing.
      Constraints:
    1 <= n <= 100
    1 <= logs.length <= 500
    0 <= function_id < n
    0 <= timestamp <= 109
    No two start events will happen at the same timestamp.
    No two end events will happen at the same timestamp.
    Each function has an "end" log for each "start" log.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        List<String> logs = List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6");
        int[] expected = new int[]{3, 4};
        var result = solution.exclusiveTime(n, logs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        List<String> logs =
                List.of("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7");
        int[] expected = new int[]{8};
        var result = solution.exclusiveTime(n, logs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        List<String> logs =
                List.of("0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7");
        int[] expected = new int[]{7, 1};
        var result = solution.exclusiveTime(n, logs);
        assertThat(result).isEqualTo(expected);
    }

}
