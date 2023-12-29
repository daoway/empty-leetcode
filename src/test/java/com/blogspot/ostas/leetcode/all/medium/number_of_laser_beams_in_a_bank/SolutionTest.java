package com.blogspot.ostas.leetcode.all.medium.number_of_laser_beams_in_a_bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: bank = ["011001","000000","010100","001000"]
    Output: 8
    Explanation: Between each of the following device pairs, there is one beam. In total, there are 8 beams:
     * bank[0][1] -- bank[2][1]
     * bank[0][1] -- bank[2][3]
     * bank[0][2] -- bank[2][1]
     * bank[0][2] -- bank[2][3]
     * bank[0][5] -- bank[2][1]
     * bank[0][5] -- bank[2][3]
     * bank[2][1] -- bank[3][2]
     * bank[2][3] -- bank[3][2]
    Note that there is no beam between any device on the 0th row with any on the 3rd row.
    This is because the 2nd row contains security devices, which breaks the second condition.
    Example 2:
    Input: bank = ["000","111","000"]
    Output: 0
    Explanation: There does not exist two devices located on two different rows.
      Constraints:
    m == bank.length
    n == bank[i].length
    1 <= m, n <= 500
    bank[i][j] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] bank = new String[]{"011001", "000000", "010100", "001000"};
        int expected = 8;
        var result = solution.numberOfBeams(bank);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] bank = new String[]{"000", "111", "000"};
        int expected = 0;
        var result = solution.numberOfBeams(bank);
        assertThat(result).isEqualTo(expected);
    }

}
