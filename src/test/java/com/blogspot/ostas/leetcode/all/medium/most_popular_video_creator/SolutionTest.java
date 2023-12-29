package com.blogspot.ostas.leetcode.all.medium.most_popular_video_creator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: creators = ["alice","bob","alice","chris"], ids = ["one","two","three","four"], views = [5,10,5,4]
    Output: [["alice","one"],["bob","two"]]
    Explanation:
    The popularity of alice is 5 + 5 = 10.
    The popularity of bob is 10.
    The popularity of chris is 4.
    alice and bob are the most popular creators.
    For bob, the video with the highest view count is "two".
    For alice, the videos with the highest view count are "one" and "three". Since "one" is lexicographically smaller than "three", it is included in the answer.
    Example 2:
    Input: creators = ["alice","alice","alice"], ids = ["a","b","c"], views = [1,2,2]
    Output: [["alice","b"]]
    Explanation:
    The videos with id "b" and "c" have the highest view count.
    Since "b" is lexicographically smaller than "c", it is included in the answer.
      Constraints:
    n == creators.length == ids.length == views.length
    1 <= n <= 105
    1 <= creators[i].length, ids[i].length <= 5
    creators[i] and ids[i] consist only of lowercase English letters.
    0 <= views[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] creators = new String[]{"alice", "bob", "alice", "chris"};
        String[] ids = new String[]{"one", "two", "three", "four"};
        int[] views = new int[]{5, 10, 5, 4};
        List<List<String>> expected = List.of(List.of("alice", "one"), List.of("bob", "two"));
        var result = solution.mostPopularCreator(creators, ids, views);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] creators = new String[]{"alice", "alice", "alice"};
        String[] ids = new String[]{"a", "b", "c"};
        int[] views = new int[]{1, 2, 2};
        List<List<String>> expected = List.of(List.of("alice", "b"));
        var result = solution.mostPopularCreator(creators, ids, views);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}
