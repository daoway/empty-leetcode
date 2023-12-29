package com.blogspot.ostas.leetcode.all.hard.reconstruct_itinerary;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
    Output: ["JFK","MUC","LHR","SFO","SJC"]
    Example 2:
    Input: tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
    Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
    Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"] but it is larger in lexical order.
      Constraints:
    1 <= tickets.length <= 300
    tickets[i].length == 2
    fromi.length == 3
    toi.length == 3
    fromi and toi consist of uppercase English letters.
    fromi != toi
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> tickets =
                List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"),
                        List.of("LHR", "SFO"));
        List<String> expected = List.of("JFK", "MUC", "LHR", "SFO", "SJC");
        var result = solution.findItinerary(tickets);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> tickets =
                List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"),
                        List.of("ATL", "JFK"), List.of("ATL", "SFO"));
        List<String> expected = List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
        var result = solution.findItinerary(tickets);
        assertThat(result).isEqualTo(expected);
    }

}
