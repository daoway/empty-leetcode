package com.blogspot.ostas.leetcode.all.medium.reduce_array_size_to_the_half;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [3,3,3,3,5,5,5,2,2,7]
    Output: 2
    Explanation: Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half of the size of the old array).
    Possible sets of size 2 are {3,5},{3,2},{5,2}.
    Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5] which has a size greater than half of the size of the old array.
    Example 2:
    Input: arr = [7,7,7,7,7,7]
    Output: 1
    Explanation: The only possible set you can choose is {7}. This will make the new array empty.
      Constraints:
    2 <= arr.length <= 105
    arr.length is even.
    1 <= arr[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        int expected = 2;
        var result = solution.minSetSize(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{7, 7, 7, 7, 7, 7};
        int expected = 1;
        var result = solution.minSetSize(arr);
        assertThat(result).isEqualTo(expected);
    }

}
