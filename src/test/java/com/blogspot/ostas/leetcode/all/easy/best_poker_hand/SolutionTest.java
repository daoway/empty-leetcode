package com.blogspot.ostas.leetcode.all.easy.best_poker_hand;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ranks = [13,2,3,1,9], suits = ["a","a","a","a","a"]
    Output: "Flush"
    Explanation: The hand with all the cards consists of 5 cards with the same suit, so we have a "Flush".
    Example 2:
    Input: ranks = [4,4,2,4,4], suits = ["d","a","a","b","c"]
    Output: "Three of a Kind"
    Explanation: The hand with the first, second, and fourth card consists of 3 cards with the same rank, so we have a "Three of a Kind".
    Note that we could also make a "Pair" hand but "Three of a Kind" is a better hand.
    Also note that other cards could be used to make the "Three of a Kind" hand.
    Example 3:
    Input: ranks = [10,10,2,12,9], suits = ["a","b","c","a","d"]
    Output: "Pair"
    Explanation: The hand with the first and second card consists of 2 cards with the same rank, so we have a "Pair".
    Note that we cannot make a "Flush" or a "Three of a Kind".
      Constraints:
    ranks.length == suits.length == 5
    1 <= ranks[i] <= 13
    'a' <= suits[i] <= 'd'
    No two cards have the same rank and suit.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] ranks = new int[]{13, 2, 3, 1, 9};
        char[] suits = new char[]{'a', 'a', 'a', 'a', 'a'};
        String expected = "Flush";
        var result = solution.bestHand(ranks, suits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] ranks = new int[]{4, 4, 2, 4, 4};
        char[] suits = new char[]{'d', 'a', 'a', 'b', 'c'};
        String expected = "Three of a Kind";
        var result = solution.bestHand(ranks, suits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] ranks = new int[]{10, 10, 2, 12, 9};
        char[] suits = new char[]{'a', 'b', 'c', 'a', 'd'};
        String expected = "Pair";
        var result = solution.bestHand(ranks, suits);
        assertThat(result).isEqualTo(expected);
    }

}
