package com.blogspot.ostas.leetcode.all.medium.minimum_genetic_mutation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: startGene = "AACCGGTT", endGene = "AACCGGTA", bank = ["AACCGGTA"]
    Output: 1
    Example 2:
    Input: startGene = "AACCGGTT", endGene = "AAACGGTA", bank = ["AACCGGTA","AACCGCTA","AAACGGTA"]
    Output: 2
      Constraints:
    0 <= bank.length <= 10
    startGene.length == endGene.length == bank[i].length == 8
    startGene, endGene, and bank[i] consist of only the characters ['A', 'C', 'G', 'T'].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String startGene = "AACCGGTT";
        String endGene = "AACCGGTA";
        String[] bank = new String[]{"AACCGGTA"};
        int expected = 1;
        var result = solution.minMutation(startGene, endGene, bank);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String startGene = "AACCGGTT";
        String endGene = "AAACGGTA";
        String[] bank = new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        int expected = 2;
        var result = solution.minMutation(startGene, endGene, bank);
        assertThat(result).isEqualTo(expected);
    }

}
