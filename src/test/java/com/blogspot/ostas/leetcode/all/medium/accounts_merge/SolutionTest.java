package com.blogspot.ostas.leetcode.all.medium.accounts_merge;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: accounts = [["John","johnsmith@mail.com","john_newyork@mail.com"],["John","johnsmith@mail.com","john00@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
    Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
    Explanation:
    The first and second John's are the same person as they have the common email "johnsmith@mail.com".
    The third John and Mary are different people as none of their email addresses are used by other accounts.
    We could return these lists in any order, for example the answer [['Mary', 'mary@mail.com'], ['John', 'johnnybravo@mail.com'],
    ['John', 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com']] would still be accepted.
    Example 2:
    Input: accounts = [["Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co"],["Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"],["Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"],["Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"],["Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co"]]
    Output: [["Ethan","Ethan0@m.co","Ethan4@m.co","Ethan5@m.co"],["Gabe","Gabe0@m.co","Gabe1@m.co","Gabe3@m.co"],["Hanzo","Hanzo0@m.co","Hanzo1@m.co","Hanzo3@m.co"],["Kevin","Kevin0@m.co","Kevin3@m.co","Kevin5@m.co"],["Fern","Fern0@m.co","Fern1@m.co","Fern5@m.co"]]
      Constraints:
    1 <= accounts.length <= 1000
    2 <= accounts[i].length <= 10
    1 <= accounts[i][j].length <= 30
    accounts[i][0] consists of English letters.
    accounts[i][j] (for j > 0) is a valid email.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> accounts =
                List.of(List.of("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                        List.of("John", "johnsmith@mail.com", "john00@mail.com"),
                        List.of("Mary", "mary@mail.com"),
                        List.of("John", "johnnybravo@mail.com"));
        List<List<String>> expected = List.of(
                List.of("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
                List.of("Mary", "mary@mail.com"), List.of("John", "johnnybravo@mail.com"));
        var result = solution.accountsMerge(accounts);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> accounts = List.of(List.of("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"),
                List.of("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"),
                List.of("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"),
                List.of("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"),
                List.of("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co"));
        List<List<String>> expected =
                List.of(List.of("Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"),
                        List.of("Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"),
                        List.of("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"),
                        List.of("Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"),
                        List.of("Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co"));
        var result = solution.accountsMerge(accounts);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}
