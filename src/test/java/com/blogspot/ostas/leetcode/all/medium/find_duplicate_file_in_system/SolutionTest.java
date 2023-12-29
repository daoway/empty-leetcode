package com.blogspot.ostas.leetcode.all.medium.find_duplicate_file_in_system;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: paths = ["root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"]
    Output: [["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]
    Example 2:
    Input: paths = ["root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"]
    Output: [["root/a/2.txt","root/c/d/4.txt"],["root/a/1.txt","root/c/3.txt"]]
      Constraints:
    1 <= paths.length <= 2 * 104
    1 <= paths[i].length <= 3000
    1 <= sum(paths[i].length) <= 5 * 105
    paths[i] consist of English letters, digits, '/', '.', '(', ')', and ' '.
    You may assume no files or directories share the same name in the same directory.
    You may assume each given directory info represents a unique directory. A single blank space separates the directory path and file info.
      Follow up:
    Imagine you are given a real file system, how will you search files? DFS or BFS?
    If the file content is very large (GB level), how will you modify your solution?
    If you can only read the file by 1kb each time, how will you modify your solution?
    What is the time complexity of your modified solution? What is the most time-consuming part and memory-consuming part of it? How to optimize?
    How to make sure the duplicated files you find are not false positive?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)",
                "root 4.txt(efgh)"};
        List<List<String>> expected = List.of(List.of("root/a/2.txt", "root/c/d/4.txt", "root/4.txt"),
                List.of("root/a/1.txt", "root/c/3.txt"));
        var result = solution.findDuplicate(paths);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)"};
        List<List<String>> expected = List.of(List.of("root/a/2.txt", "root/c/d/4.txt"),
                List.of("root/a/1.txt", "root/c/3.txt"));
        var result = solution.findDuplicate(paths);
        assertThat(result).isEqualTo(expected);
    }

}
