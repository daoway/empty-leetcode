package com.blogspot.ostas.leetcode.all.hard.split_message_based_on_limit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: message = "this is really a very awesome message", limit = 9
    Output: ["thi<1/14>","s i<2/14>","s r<3/14>","eal<4/14>","ly <5/14>","a v<6/14>","ery<7/14>"," aw<8/14>","eso<9/14>","me<10/14>"," m<11/14>","es<12/14>","sa<13/14>","ge<14/14>"]
    Explanation:
    The first 9 parts take 3 characters each from the beginning of message.
    The next 5 parts take 2 characters each to finish splitting message.
    In this example, each part, including the last, has length 9.
    It can be shown it is not possible to split message into less than 14 parts.
    Example 2:
    Input: message = "short message", limit = 15
    Output: ["short mess<1/2>","age<2/2>"]
    Explanation:
    Under the given constraints, the string can be split into two parts:
    - The first part comprises of the first 10 characters, and has a length 15.
    - The next part comprises of the last 3 characters, and has a length 8.
      Constraints:
    1 <= message.length <= 104
    message consists only of lowercase English letters and ' '.
    1 <= limit <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String message = "this is really a very awesome message";
        int limit = 9;
        String[] expected =
                new String[]{"thi<1/14>", "s i<2/14>", "s r<3/14>", "eal<4/14>", "ly <5/14>", "a v<6/14>",
                        "ery<7/14>", " aw<8/14>", "eso<9/14>", "me<10/14>", " m<11/14>", "es<12/14>",
                        "sa<13/14>",
                        "ge<14/14>"};
        var result = solution.splitMessage(message, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String message = "short message";
        int limit = 15;
        String[] expected = new String[]{"short mess<1/2>", "age<2/2>"};
        var result = solution.splitMessage(message, limit);
        assertThat(result).isEqualTo(expected);
    }

}
