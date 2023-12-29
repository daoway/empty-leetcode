package com.blogspot.ostas.leetcode.all.easy.last_visited_integers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["1","2","prev","prev","prev"]
    Output: [2,1,-1]
    Explanation:
    For "prev" at index = 2, last visited integer will be 2 as here the number of consecutive "prev" strings is 1, and in the array reverse_nums, 2 will be the first element.
    For "prev" at index = 3, last visited integer will be 1 as there are a total of two consecutive "prev" strings including this "prev" which are visited, and 1 is the second last visited integer.
    For "prev" at index = 4, last visited integer will be -1 as there are a total of three consecutive "prev" strings including this "prev" which are visited, but the total number of integers visited is two.
    Example 2:
    Input: words = ["1","prev","2","prev","prev"]
    Output: [1,2,1]
    Explanation:
    For "prev" at index = 1, last visited integer will be 1.
    For "prev" at index = 3, last visited integer will be 2.
    For "prev" at index = 4, last visited integer will be 1 as there are a total of two consecutive "prev" strings including this "prev" which are visited, and 1 is the second last visited integer.
      Constraints:
    1 <= words.length <= 100
    words[i] == "prev" or 1 <= int(words[i]) <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<String> words = List.of("1", "2", "prev", "prev", "prev");
        List<Integer> expected = List.of(2, 1, -1);
        var result = solution.lastVisitedIntegers(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<String> words = List.of("1", "prev", "2", "prev", "prev");
        List<Integer> expected = List.of(1, 2, 1);
        var result = solution.lastVisitedIntegers(words);
        assertThat(result).isEqualTo(expected);
    }

}
