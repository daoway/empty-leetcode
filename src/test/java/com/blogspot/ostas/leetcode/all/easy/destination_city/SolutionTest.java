package com.blogspot.ostas.leetcode.all.easy.destination_city;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
    Output: "Sao Paulo"
    Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
    Example 2:
    Input: paths = [["B","C"],["D","B"],["C","A"]]
    Output: "A"
    Explanation: All possible trips are:
    "D" -> "B" -> "C" -> "A".
    "B" -> "C" -> "A".
    "C" -> "A".
    "A".
    Clearly the destination city is "A".
    Example 3:
    Input: paths = [["A","Z"]]
    Output: "Z"
      Constraints:
    1 <= paths.length <= 100
    paths[i].length == 2
    1 <= cityAi.length, cityBi.length <= 10
    cityAi != cityBi
    All strings consist of lowercase and uppercase English letters and the space character.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> paths = List.of(List.of("London", "New York"), List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo"));
        String expected = "Sao Paulo";
        var result = solution.destCity(paths);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> paths = List.of(List.of("B", "C"), List.of("D", "B"), List.of("C", "A"));
        String expected = "A";
        var result = solution.destCity(paths);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<String>> paths = List.of(List.of("A", "Z"));
        String expected = "Z";
        var result = solution.destCity(paths);
        assertThat(result).isEqualTo(expected);
    }

}
