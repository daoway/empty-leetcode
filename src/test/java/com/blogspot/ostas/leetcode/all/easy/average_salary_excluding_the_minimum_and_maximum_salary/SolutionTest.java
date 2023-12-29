package com.blogspot.ostas.leetcode.all.easy.average_salary_excluding_the_minimum_and_maximum_salary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: salary = [4000,3000,1000,2000]
    Output: 2500.00000
    Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
    Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
    Example 2:
    Input: salary = [1000,2000,3000]
    Output: 2000.00000
    Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
    Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
      Constraints:
    3 <= salary.length <= 100
    1000 <= salary[i] <= 106
    All the integers of salary are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] salary = new int[]{4000, 3000, 1000, 2000};
        double expected = 2500.00000;
        var result = solution.average(salary);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] salary = new int[]{1000, 2000, 3000};
        double expected = 2000.00000;
        var result = solution.average(salary);
        assertThat(result).isEqualTo(expected);
    }

}
