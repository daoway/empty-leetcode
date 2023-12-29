package com.blogspot.ostas.leetcode.all.easy.sort_integers_by_the_number_of_one_bits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [0,1,2,3,4,5,6,7,8]
    Output: [0,1,2,4,8,3,5,6,7]
    Explantion: [0] is the only integer with 0 bits.
    [1,2,4,8] all have 1 bit.
    [3,5,6] have 2 bits.
    [7] has 3 bits.
    The sorted array by bits is [0,1,2,4,8,3,5,6,7]
    Example 2:
    Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
    Output: [1,2,4,8,16,32,64,128,256,512,1024]
    Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.
      Constraints:
    1 <= arr.length <= 500
    0 <= arr[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7};
        var result = solution.sortByBits(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] expected = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        var result = solution.sortByBits(arr);
        assertThat(result).isEqualTo(expected);
    }

}
