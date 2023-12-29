package com.blogspot.ostas.leetcode.all.medium.minimum_adjacent_swaps_to_reach_the_kth_smallest_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "5489355142", k = 4
    Output: 2
    Explanation: The 4th smallest wonderful number is "5489355421". To get this number:
    - Swap index 7 with index 8: "5489355142" -> "5489355412"
    - Swap index 8 with index 9: "5489355412" -> "5489355421"
    Example 2:
    Input: num = "11112", k = 4
    Output: 4
    Explanation: The 4th smallest wonderful number is "21111". To get this number:
    - Swap index 3 with index 4: "11112" -> "11121"
    - Swap index 2 with index 3: "11121" -> "11211"
    - Swap index 1 with index 2: "11211" -> "12111"
    - Swap index 0 with index 1: "12111" -> "21111"
    Example 3:
    Input: num = "00123", k = 1
    Output: 1
    Explanation: The 1st smallest wonderful number is "00132". To get this number:
    - Swap index 3 with index 4: "00123" -> "00132"
      Constraints:
    2 <= num.length <= 1000
    1 <= k <= 1000
    num only consists of digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "5489355142";
        int k = 4;
        int expected = 2;
        var result = solution.getMinSwaps(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "11112";
        int k = 4;
        int expected = 4;
        var result = solution.getMinSwaps(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "00123";
        int k = 1;
        int expected = 1;
        var result = solution.getMinSwaps(num, k);
        assertThat(result).isEqualTo(expected);
    }

}
