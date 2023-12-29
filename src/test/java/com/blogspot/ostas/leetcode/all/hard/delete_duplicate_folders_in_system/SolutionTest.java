package com.blogspot.ostas.leetcode.all.hard.delete_duplicate_folders_in_system;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: paths = [["a"],["c"],["d"],["a","b"],["c","b"],["d","a"]]
    Output: [["d"],["d","a"]]
    Explanation: The file structure is as shown.
    Folders "/a" and "/c" (and their subfolders) are marked for deletion because they both contain an empty
    folder named "b".
    Example 2:
    Input: paths = [["a"],["c"],["a","b"],["c","b"],["a","b","x"],["a","b","x","y"],["w"],["w","y"]]
    Output: [["c"],["c","b"],["a"],["a","b"]]
    Explanation: The file structure is as shown.
    Folders "/a/b/x" and "/w" (and their subfolders) are marked for deletion because they both contain an empty folder named "y".
    Note that folders "/a" and "/c" are identical after the deletion, but they are not deleted because they were not marked beforehand.
    Example 3:
    Input: paths = [["a","b"],["c","d"],["c"],["a"]]
    Output: [["c"],["c","d"],["a"],["a","b"]]
    Explanation: All folders are unique in the file system.
    Note that the returned array can be in a different order as the order does not matter.
      Constraints:
    1 <= paths.length <= 2 * 104
    1 <= paths[i].length <= 500
    1 <= paths[i][j].length <= 10
    1 <= sum(paths[i][j].length) <= 2 * 105
    path[i][j] consists of lowercase English letters.
    No two paths lead to the same folder.
    For any folder not at the root level, its parent folder will also be in the input.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> paths = List.of(List.of("a"), List.of("c"), List.of("d"), List.of("a", "b"),
                List.of("c", "b"), List.of("d", "a"));
        List<List<String>> expected = List.of(List.of("d"), List.of("d", "a"));
        var result = solution.deleteDuplicateFolder(new ArrayList<>(paths));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> paths =
                List.of(List.of("a"), List.of("c"), List.of("a", "b"), List.of("c", "b"),
                        List.of("a", "b", "x"), List.of("a", "b", "x", "y"), List.of("w"), List.of("w", "y"));
        List<List<String>> expected =
                List.of(List.of("c"), List.of("c", "b"), List.of("a"), List.of("a", "b"));
        var result = solution.deleteDuplicateFolder(new ArrayList<>(paths));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<String>> paths =
                List.of(List.of("a", "b"), List.of("c", "d"), List.of("c"), List.of("a"));
        List<List<String>> expected =
                List.of(List.of("c"), List.of("c", "d"), List.of("a"), List.of("a", "b"));
        var result = solution.deleteDuplicateFolder(new ArrayList<>(paths));
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}
