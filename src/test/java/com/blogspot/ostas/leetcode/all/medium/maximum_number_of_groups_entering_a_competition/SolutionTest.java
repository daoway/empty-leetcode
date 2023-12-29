package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_groups_entering_a_competition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grades = [10,6,12,7,3,5]
    Output: 3
    Explanation: The following is a possible way to form 3 groups of students:
    - 1st group has the students with grades = [12]. Sum of grades: 12. Student count: 1
    - 2nd group has the students with grades = [6,7]. Sum of grades: 6 + 7 = 13. Student count: 2
    - 3rd group has the students with grades = [10,3,5]. Sum of grades: 10 + 3 + 5 = 18. Student count: 3
    It can be shown that it is not possible to form more than 3 groups.
    Example 2:
    Input: grades = [8,8]
    Output: 1
    Explanation: We can only form 1 group, since forming 2 groups would lead to an equal number of students in both groups.
      Constraints:
    1 <= grades.length <= 105
    1 <= grades[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] grades = new int[]{10, 6, 12, 7, 3, 5};
        int expected = 3;
        var result = solution.maximumGroups(grades);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] grades = new int[]{8, 8};
        int expected = 1;
        var result = solution.maximumGroups(grades);
        assertThat(result).isEqualTo(expected);
    }

}
