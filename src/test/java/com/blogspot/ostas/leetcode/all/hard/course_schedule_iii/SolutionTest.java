package com.blogspot.ostas.leetcode.all.hard.course_schedule_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: courses = [[100,200],[200,1300],[1000,1250],[2000,3200]]
    Output: 3
    Explanation:
    There are totally 4 courses, but you can take 3 courses at most:
    First, take the 1st course, it costs 100 days so you will finish it on the 100th day, and ready to take the next course on the 101st day.
    Second, take the 3rd course, it costs 1000 days so you will finish it on the 1100th day, and ready to take the next course on the 1101st day.
    Third, take the 2nd course, it costs 200 days so you will finish it on the 1300th day.
    The 4th course cannot be taken now, since you will finish it on the 3300th day, which exceeds the closed date.
    Example 2:
    Input: courses = [[1,2]]
    Output: 1
    Example 3:
    Input: courses = [[3,2],[4,3]]
    Output: 0
      Constraints:
    1 <= courses.length <= 104
    1 <= durationi, lastDayi <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] courses = new int[][]{{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        int expected = 3;
        var result = solution.scheduleCourse(courses);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] courses = new int[][]{{1, 2}};
        int expected = 1;
        var result = solution.scheduleCourse(courses);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] courses = new int[][]{{3, 2}, {4, 3}};
        int expected = 0;
        var result = solution.scheduleCourse(courses);
        assertThat(result).isEqualTo(expected);
    }

}
