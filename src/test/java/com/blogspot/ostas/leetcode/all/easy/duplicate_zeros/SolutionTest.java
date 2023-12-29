package com.blogspot.ostas.leetcode.all.easy.duplicate_zeros;

import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
        Example 1:
    Input: arr = [1,0,2,3,0,4,5,0]
    Output: [1,0,0,2,3,0,0,4]
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    Example 2:
    Input: arr = [1,2,3]
    Output: [1,2,3]
    Explanation: After calling your function, the input array is modified to: [1,2,3]
      Constraints:
    1 <= arr.length <= 104
    0 <= arr[i] <= 9
    */

    @Test
    void test_0() {
        var solution = new Solution();
        int[] arr = new int[]{};
        solution.duplicateZeros(arr);
    }
}
