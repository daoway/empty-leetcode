package com.blogspot.ostas.leetcode.all.easy.number_of_senior_citizens;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
    Output: 2
    Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
    Example 2:
    Input: details = ["1313579440F2036","2921522980M5644"]
    Output: 0
    Explanation: None of the passengers are older than 60.
      Constraints:
    1 <= details.length <= 100
    details[i].length == 15
    details[i] consists of digits from '0' to '9'.
    details[i][10] is either 'M' or 'F' or 'O'.
    The phone numbers and seat numbers of the passengers are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] details = new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        int expected = 2;
        var result = solution.countSeniors(details);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] details = new String[]{"1313579440F2036", "2921522980M5644"};
        int expected = 0;
        var result = solution.countSeniors(details);
        assertThat(result).isEqualTo(expected);
    }

}
