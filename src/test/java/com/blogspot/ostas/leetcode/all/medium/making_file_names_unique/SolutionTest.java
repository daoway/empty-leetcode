package com.blogspot.ostas.leetcode.all.medium.making_file_names_unique;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: names = ["pes","fifa","gta","pes(2019)"]
    Output: ["pes","fifa","gta","pes(2019)"]
    Explanation: Let's see how the file system creates folder names:
    "pes" --> not assigned before, remains "pes"
    "fifa" --> not assigned before, remains "fifa"
    "gta" --> not assigned before, remains "gta"
    "pes(2019)" --> not assigned before, remains "pes(2019)"
    Example 2:
    Input: names = ["gta","gta(1)","gta","avalon"]
    Output: ["gta","gta(1)","gta(2)","avalon"]
    Explanation: Let's see how the file system creates folder names:
    "gta" --> not assigned before, remains "gta"
    "gta(1)" --> not assigned before, remains "gta(1)"
    "gta" --> the name is reserved, system adds (k), since "gta(1)" is also reserved, systems put k = 2. it becomes "gta(2)"
    "avalon" --> not assigned before, remains "avalon"
    Example 3:
    Input: names = ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"]
    Output: ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"]
    Explanation: When the last folder is created, the smallest positive valid k is 4, and it becomes "onepiece(4)".
      Constraints:
    1 <= names.length <= 5 * 104
    1 <= names[i].length <= 20
    names[i] consists of lowercase English letters, digits, and/or round brackets.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] names = new String[]{"pes", "fifa", "gta", "pes(2019)"};
        String[] expected = new String[]{"pes", "fifa", "gta", "pes(2019)"};
        var result = solution.getFolderNames(names);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] names = new String[]{"gta", "gta(1)", "gta", "avalon"};
        String[] expected = new String[]{"gta", "gta(1)", "gta(2)", "avalon"};
        var result = solution.getFolderNames(names);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] names =
                new String[]{"onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece"};
        String[] expected =
                new String[]{"onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece(4)"};
        var result = solution.getFolderNames(names);
        assertThat(result).isEqualTo(expected);
    }

}
