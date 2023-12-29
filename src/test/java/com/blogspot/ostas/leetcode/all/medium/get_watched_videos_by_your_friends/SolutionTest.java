package com.blogspot.ostas.leetcode.all.medium.get_watched_videos_by_your_friends;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 1
    Output: ["B","C"]
    Explanation:
    You have id = 0 (green color in the figure) and your friends are (yellow color in the figure):
    Person with id = 1 -> watchedVideos = ["C"]
    Person with id = 2 -> watchedVideos = ["B","C"]
    The frequencies of watchedVideos by your friends are:
    B -> 1
    C -> 2
    Example 2:
    Input: watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 2
    Output: ["D"]
    Explanation:
    You have id = 0 (green color in the figure) and the only friend of your friends is the person with id = 3 (yellow color in the figure).
      Constraints:
    n == watchedVideos.length == friends.length
    2 <= n <= 100
    1 <= watchedVideos[i].length <= 100
    1 <= watchedVideos[i][j].length <= 8
    0 <= friends[i].length < n
    0 <= friends[i][j] < n
    0 <= id < n
    1 <= level < n
    if friends[i] contains j, then friends[j] contains i
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> watchedVideos =
                List.of(List.of("A", "B"), List.of("C"), List.of("B", "C"), List.of("D"));
        int[][] friends = new int[][]{{1, 2}, {0, 3}, {0, 3}, {1, 2}};
        int id = 0;
        int level = 1;
        List<String> expected = List.of("B", "C");
        var result = solution.watchedVideosByFriends(watchedVideos, friends, id, level);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> watchedVideos =
                List.of(List.of("A", "B"), List.of("C"), List.of("B", "C"), List.of("D"));
        int[][] friends = new int[][]{{1, 2}, {0, 3}, {0, 3}, {1, 2}};
        int id = 0;
        int level = 2;
        List<String> expected = List.of("D");
        var result = solution.watchedVideosByFriends(watchedVideos, friends, id, level);
        assertThat(result).isEqualTo(expected);
    }

}
