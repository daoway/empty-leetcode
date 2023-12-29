package com.blogspot.ostas.leetcode.all.medium.invalid_transactions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
    Output: ["alice,20,800,mtv","alice,50,100,beijing"]
    Explanation: The first transaction is invalid because the second transaction occurs within a difference of 60 minutes, have the same name and is in a different city. Similarly the second one is invalid too.
    Example 2:
    Input: transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
    Output: ["alice,50,1200,mtv"]
    Example 3:
    Input: transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
    Output: ["bob,50,1200,mtv"]
      Constraints:
    transactions.length <= 1000
    Each transactions[i] takes the form "{name},{time},{amount},{city}"
    Each {name} and {city} consist of lowercase English letters, and have lengths between 1 and 10.
    Each {time} consist of digits, and represent an integer between 0 and 1000.
    Each {amount} consist of digits, and represent an integer between 0 and 2000.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] transactions = new String[]{"alice,20,800,mtv", "alice,50,100,beijing"};
        List<String> expected = List.of("alice,20,800,mtv", "alice,50,100,beijing");
        var result = solution.invalidTransactions(transactions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] transactions = new String[]{"alice,20,800,mtv", "alice,50,1200,mtv"};
        List<String> expected = List.of("alice,50,1200,mtv");
        var result = solution.invalidTransactions(transactions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] transactions = new String[]{"alice,20,800,mtv", "bob,50,1200,mtv"};
        List<String> expected = List.of("bob,50,1200,mtv");
        var result = solution.invalidTransactions(transactions);
        assertThat(result).isEqualTo(expected);
    }

}
