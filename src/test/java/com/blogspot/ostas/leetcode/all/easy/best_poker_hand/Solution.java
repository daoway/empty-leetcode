package com.blogspot.ostas.leetcode.all.easy.best_poker_hand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    Set<Character> suitsSet = new HashSet<>();
    for(char c : suits){
      suitsSet.add(c);
    }
    if(suitsSet.size() == 1) return "Flush";
    Map<Integer, Integer> ranksSet = new HashMap<>();
    for (int rank : ranks) {
      ranksSet.put(rank, ranksSet.getOrDefault(rank, 0) + 1);
    }
    if(ranksSet.size() == 2+1 || ranksSet.size() == 2) return "Three of a Kind";
    if(ranksSet.size() == 4) return "Pair";
    return "High Card";
  }
}