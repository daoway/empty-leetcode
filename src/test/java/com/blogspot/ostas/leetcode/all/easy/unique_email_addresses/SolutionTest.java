package com.blogspot.ostas.leetcode.all.easy.unique_email_addresses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
    Output: 2
    Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
    Example 2:
    Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
    Output: 3
      Constraints:
    1 <= emails.length <= 100
    1 <= emails[i].length <= 100
    emails[i] consist of lowercase English letters, '+', '.' and '@'.
    Each emails[i] contains exactly one '@' character.
    All local and domain names are non-empty.
    Local names do not start with a '+' character.
    Domain names end with the ".com" suffix.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] emails =
                new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"};
        int expected = 2;
        var result = solution.numUniqueEmails(emails);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] emails = new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        int expected = 3;
        var result = solution.numUniqueEmails(emails);
        assertThat(result).isEqualTo(expected);
    }

}
