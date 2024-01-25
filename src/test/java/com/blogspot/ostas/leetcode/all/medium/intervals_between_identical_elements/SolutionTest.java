package com.blogspot.ostas.leetcode.all.medium.intervals_between_identical_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [2,1,3,1,2,3,3]
    Output: [4,2,7,2,4,4,5]
    Explanation:
    - Index 0: Another 2 is found at index 4. |0 - 4| = 4
    - Index 1: Another 1 is found at index 3. |1 - 3| = 2
    - Index 2: Two more 3s are found at indices 5 and 6. |2 - 5| + |2 - 6| = 7
    - Index 3: Another 1 is found at index 1. |3 - 1| = 2
    - Index 4: Another 2 is found at index 0. |4 - 0| = 4
    - Index 5: Two more 3s are found at indices 2 and 6. |5 - 2| + |5 - 6| = 4
    - Index 6: Two more 3s are found at indices 2 and 5. |6 - 2| + |6 - 5| = 5
    Example 2:
    Input: arr = [10,5,10,10]
    Output: [5,0,3,4]
    Explanation:
    - Index 0: Two more 10s are found at indices 2 and 3. |0 - 2| + |0 - 3| = 5
    - Index 1: There is only one 5 in the array, so its sum of intervals to identical elements is 0.
    - Index 2: Two more 10s are found at indices 0 and 3. |2 - 0| + |2 - 3| = 3
    - Index 3: Two more 10s are found at indices 0 and 2. |3 - 0| + |3 - 2| = 4
      Constraints:
    n == arr.length
    1 <= n <= 105
    1 <= arr[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{2, 1, 3, 1, 2, 3, 3};
        long[] expected = new long[]{4, 2, 7, 2, 4, 4, 5};
        var result = solution.getDistances(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{10, 5, 10, 10};
        long[] expected = new long[]{5, 0, 3, 4};
        var result = solution.getDistances(arr);
        assertThat(result).isEqualTo(expected);
    }

}
