package com.blogspot.ostas.leetcode.all.medium.employee_importance;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: employees = [[1,5,[2,3]],[2,3,[]],[3,3,[]]], id = 1
    Output: 11
    Explanation: Employee 1 has an importance value of 5 and has two direct subordinates: employee 2 and employee 3.
    They both have an importance value of 3.
    Thus, the total importance value of employee 1 is 5 + 3 + 3 = 11.
    Example 2:
    Input: employees = [[1,2,[5]],[5,-3,[]]], id = 5
    Output: -3
    Explanation: Employee 5 has an importance value of -3 and has no direct subordinates.
    Thus, the total importance value of employee 5 is -3.
      Constraints:
    1 <= employees.length <= 2000
    1 <= employees[i].id <= 2000
    All employees[i].id are unique.
    -100 <= employees[i].importance <= 100
    One employee has at most one direct leader and may have several subordinates.
    The IDs in employees[i].subordinates are valid IDs.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        //Input: employees = [[1,5,[2,3]],[2,3,[]],[3,3,[]]], id = 1
        List<Employee> employees = List.of(
                new Employee(1, 5, List.of(2, 3)),
                new Employee(2, 3, List.of()),
                new Employee(3, 3, List.of())
        );
        int id = 1;
        int expected = 11;
        var result = solution.getImportance(employees, id);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Employee> employees = List.of(
                new Employee(1, 2, List.of(5)),
                new Employee(5, -3, List.of())
        );

        int id = 5;
        int expected = -3;
        var result = solution.getImportance(employees, id);
        assertThat(result).isEqualTo(expected);
    }

}
