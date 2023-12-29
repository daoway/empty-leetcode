package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_weeks_for_which_you_can_work;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: milestones = [1,2,3]
    Output: 6
    Explanation: One possible scenario is:
    - During the 1st week, you will work on a milestone of project 0.
    - During the 2nd week, you will work on a milestone of project 2.
    - During the 3rd week, you will work on a milestone of project 1.
    - During the 4th week, you will work on a milestone of project 2.
    - During the 5th week, you will work on a milestone of project 1.
    - During the 6th week, you will work on a milestone of project 2.
    The total number of weeks is 6.
    Example 2:
    Input: milestones = [5,2,1]
    Output: 7
    Explanation: One possible scenario is:
    - During the 1st week, you will work on a milestone of project 0.
    - During the 2nd week, you will work on a milestone of project 1.
    - During the 3rd week, you will work on a milestone of project 0.
    - During the 4th week, you will work on a milestone of project 1.
    - During the 5th week, you will work on a milestone of project 0.
    - During the 6th week, you will work on a milestone of project 2.
    - During the 7th week, you will work on a milestone of project 0.
    The total number of weeks is 7.
    Note that you cannot work on the last milestone of project 0 on 8th week because it would violate the rules.
    Thus, one milestone in project 0 will remain unfinished.
      Constraints:
    n == milestones.length
    1 <= n <= 105
    1 <= milestones[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] milestones = new int[]{1, 2, 3};
        long expected = 6;
        var result = solution.numberOfWeeks(milestones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] milestones = new int[]{5, 2, 1};
        long expected = 7;
        var result = solution.numberOfWeeks(milestones);
        assertThat(result).isEqualTo(expected);
    }

}
