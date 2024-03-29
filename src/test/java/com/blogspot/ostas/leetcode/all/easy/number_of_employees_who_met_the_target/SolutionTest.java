package com.blogspot.ostas.leetcode.all.easy.number_of_employees_who_met_the_target;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: hours = [0,1,2,3,4], target = 2
    Output: 3
    Explanation: The company wants each employee to work for at least 2 hours.
    - Employee 0 worked for 0 hours and didn't meet the target.
    - Employee 1 worked for 1 hours and didn't meet the target.
    - Employee 2 worked for 2 hours and met the target.
    - Employee 3 worked for 3 hours and met the target.
    - Employee 4 worked for 4 hours and met the target.
    There are 3 employees who met the target.
    Example 2:
    Input: hours = [5,1,4,2,2], target = 6
    Output: 0
    Explanation: The company wants each employee to work for at least 6 hours.
    There are 0 employees who met the target.
      Constraints:
    1 <= n == hours.length <= 50
    0 <= hours[i], target <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] hours = new int[]{0, 1, 2, 3, 4};
        int target = 2;
        int expected = 3;
        var result = solution.numberOfEmployeesWhoMetTarget(hours, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] hours = new int[]{5, 1, 4, 2, 2};
        int target = 6;
        int expected = 0;
        var result = solution.numberOfEmployeesWhoMetTarget(hours, target);
        assertThat(result).isEqualTo(expected);
    }

}
