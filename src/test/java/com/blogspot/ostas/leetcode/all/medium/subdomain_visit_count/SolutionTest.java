package com.blogspot.ostas.leetcode.all.medium.subdomain_visit_count;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cpdomains = ["9001 discuss.leetcode.com"]
    Output: ["9001 leetcode.com","9001 discuss.leetcode.com","9001 com"]
    Explanation: We only have one website domain: "discuss.leetcode.com".
    As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.
    Example 2:
    Input: cpdomains = ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
    Output: ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
    Explanation: We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times.
    For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.
      Constraints:
    1 <= cpdomain.length <= 100
    1 <= cpdomain[i].length <= 100
    cpdomain[i] follows either the "repi d1i.d2i.d3i" format or the "repi d1i.d2i" format.
    repi is an integer in the range [1, 104].
    d1i, d2i, and d3i consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] cpdomains = new String[]{"9001 discuss.leetcode.com"};
        List<String> expected = List.of("9001 leetcode.com", "9001 discuss.leetcode.com", "9001 com");
        var result = solution.subdomainVisits(cpdomains);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] cpdomains =
                new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> expected =
                List.of("901 mail.com", "50 yahoo.com", "900 google.mail.com", "5 wiki.org", "5 org",
                        "1 intel.mail.com", "951 com");
        var result = solution.subdomainVisits(cpdomains);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }


}
