package com.blogspot.ostas.leetcode.all.medium.happy_students;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1]
    Output: 2
    Explanation:
    The two possible ways are:
    The class teacher selects no student.
    The class teacher selects both students to form the group.
    If the class teacher selects just one student to form a group then the both students will not be happy. Therefore, there are only two possible ways.
    Example 2:
    Input: nums = [6,0,3,3,6,7,2,7]
    Output: 3
    Explanation:
    The three possible ways are:
    The class teacher selects the student with index = 1 to form the group.
    The class teacher selects the students with index = 1, 2, 3, 6 to form the group.
    The class teacher selects all the students to form the group.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] < nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = new ArrayList<>(List.of(1, 1));
        int expected = 2;
        var result = solution.countWays(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = new ArrayList<>(List.of(6, 0, 3, 3, 6, 7, 2, 7));
        int expected = 3;
        var result = solution.countWays(nums);
        assertThat(result).isEqualTo(expected);
    }

}
