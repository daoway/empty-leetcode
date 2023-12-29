package com.blogspot.ostas.leetcode.all.medium.find_latest_group_of_size_m;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [3,5,1,2,4], m = 1
    Output: 4
    Explanation:
    Step 1: "00100", groups: ["1"]
    Step 2: "00101", groups: ["1", "1"]
    Step 3: "10101", groups: ["1", "1", "1"]
    Step 4: "11101", groups: ["111", "1"]
    Step 5: "11111", groups: ["11111"]
    The latest step at which there exists a group of size 1 is step 4.
    Example 2:
    Input: arr = [3,1,5,4,2], m = 2
    Output: -1
    Explanation:
    Step 1: "00100", groups: ["1"]
    Step 2: "10100", groups: ["1", "1"]
    Step 3: "10101", groups: ["1", "1", "1"]
    Step 4: "10111", groups: ["1", "111"]
    Step 5: "11111", groups: ["11111"]
    No group of size 2 exists during any step.
      Constraints:
    n == arr.length
    1 <= m <= n <= 105
    1 <= arr[i] <= n
    All integers in arr are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{3, 5, 1, 2, 4};
        int m = 1;
        int expected = 4;
        var result = solution.findLatestStep(arr, m);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{3, 1, 5, 4, 2};
        int m = 2;
        int expected = -1;
        var result = solution.findLatestStep(arr, m);
        assertThat(result).isEqualTo(expected);
    }

}
