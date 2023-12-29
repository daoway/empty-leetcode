package com.blogspot.ostas.leetcode.all.medium.remove_sub_folders_from_the_filesystem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: folder = ["/a","/a/b","/c/d","/c/d/e","/c/f"]
    Output: ["/a","/c/d","/c/f"]
    Explanation: Folders "/a/b" is a subfolder of "/a" and "/c/d/e" is inside of folder "/c/d" in our filesystem.
    Example 2:
    Input: folder = ["/a","/a/b/c","/a/b/d"]
    Output: ["/a"]
    Explanation: Folders "/a/b/c" and "/a/b/d" will be removed because they are subfolders of "/a".
    Example 3:
    Input: folder = ["/a/b/c","/a/b/ca","/a/b/d"]
    Output: ["/a/b/c","/a/b/ca","/a/b/d"]
      Constraints:
    1 <= folder.length <= 4 * 104
    2 <= folder[i].length <= 100
    folder[i] contains only lowercase letters and '/'.
    folder[i] always starts with the character '/'.
    Each folder name is unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] folder = new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> expected = List.of("/a", "/c/d", "/c/f");
        var result = solution.removeSubfolders(folder);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] folder = new String[]{"/a", "/a/b/c", "/a/b/d"};
        List<String> expected = List.of("/a");
        var result = solution.removeSubfolders(folder);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] folder = new String[]{"/a/b/c", "/a/b/ca", "/a/b/d"};
        List<String> expected = List.of("/a/b/c", "/a/b/ca", "/a/b/d");
        var result = solution.removeSubfolders(folder);
        assertThat(result).isEqualTo(expected);
    }

}
