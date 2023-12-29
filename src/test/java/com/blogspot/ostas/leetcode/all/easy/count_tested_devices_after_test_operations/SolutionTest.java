package com.blogspot.ostas.leetcode.all.easy.count_tested_devices_after_test_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: batteryPercentages = [1,1,2,1,3]
    Output: 3
    Explanation: Performing the test operations in order starting from device 0:
    At device 0, batteryPercentages[0] > 0, so there is now 1 tested device, and batteryPercentages becomes [1,0,1,0,2].
    At device 1, batteryPercentages[1] == 0, so we move to the next device without testing.
    At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages becomes [1,0,1,0,1].
    At device 3, batteryPercentages[3] == 0, so we move to the next device without testing.
    At device 4, batteryPercentages[4] > 0, so there are now 3 tested devices, and batteryPercentages stays the same.
    So, the answer is 3.
    Example 2:
    Input: batteryPercentages = [0,1,2]
    Output: 2
    Explanation: Performing the test operations in order starting from device 0:
    At device 0, batteryPercentages[0] == 0, so we move to the next device without testing.
    At device 1, batteryPercentages[1] > 0, so there is now 1 tested device, and batteryPercentages becomes [0,1,1].
    At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages stays the same.
    So, the answer is 2.
      Constraints:
    1 <= n == batteryPercentages.length <= 100
    0 <= batteryPercentages[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] batteryPercentages = new int[]{1, 1, 2, 1, 3};
        int expected = 3;
        var result = solution.countTestedDevices(batteryPercentages);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] batteryPercentages = new int[]{0, 1, 2};
        int expected = 2;
        var result = solution.countTestedDevices(batteryPercentages);
        assertThat(result).isEqualTo(expected);
    }

}
