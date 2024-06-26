package com.blogspot.ostas.leetcode.all.easy.best_poker_hand;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
      2347. best poker hand

https://leetcode.com/problems/best-poker-hand

You are given an integer array ranks and a character array suits. You have 5 cards where the ith card has a rank of ranks[i] and a suit of suits[i].
The following are the types of poker hands you can make from best to worst:
"Flush": Five cards of the same suit.
"Three of a Kind": Three cards of the same rank.
"Pair": Two cards of the same rank.
"High Card": Any single card.
Return a string representing the best type of poker hand you can make with the given cards.
Note that the return values are case-sensitive.

*/
class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        char suit = suits[0];
        int ind = 1;
        while (ind < suits.length && suits[ind] == suit) {
            ind++;
        }
        if (ind == suits.length) return "Flush";
        final Map<Integer, Integer> ranksSet = new HashMap<>();
        for (final int rank : ranks) {
            ranksSet.put(rank, ranksSet.getOrDefault(rank, 0) + 1);
        }
        int maxSameKind = Collections.max(ranksSet.values());
        if (maxSameKind == 2) return "Pair";
        if (maxSameKind >= 3) return "Three of a Kind";
        return "High Card";
    }
}