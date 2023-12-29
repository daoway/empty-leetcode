package com.blogspot.ostas.leetcode.all.medium.longest_absolute_file_path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
    Output: 20
    Explanation: We have only one file, and the absolute path is "dir/subdir2/file.ext" of length 20.
    Example 2:
    Input: input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
    Output: 32
    Explanation: We have two files:
    "dir/subdir1/file1.ext" of length 21
    "dir/subdir2/subsubdir2/file2.ext" of length 32.
    We return 32 since it is the longest absolute path to a file.
    Example 3:
    Input: input = "a"
    Output: 0
    Explanation: We do not have any files, just a single directory named "a".
      Constraints:
    1 <= input.length <= 104
    input may contain lowercase or uppercase English letters, a new line character '\n', a tab character '\t', a dot '.', a space ' ', and digits.
    All file and directory names have positive length.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        int expected = 20;
        var result = solution.lengthLongestPath(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String input =
                "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        int expected = 32;
        var result = solution.lengthLongestPath(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String input = "a";
        int expected = 0;
        var result = solution.lengthLongestPath(input);
        assertThat(result).isEqualTo(expected);
    }

}
