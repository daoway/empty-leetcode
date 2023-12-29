package com.blogspot.ostas.leetcode.all.medium.course_schedule_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: numCourses = 2, prerequisites = [[1,0]]
    Output: [0,1]
    Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1].
    Example 2:
    Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
    Output: [0,2,1,3]
    Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
    So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].
    Example 3:
    Input: numCourses = 1, prerequisites = []
    Output: [0]
      Constraints:
    1 <= numCourses <= 2000
    0 <= prerequisites.length <= numCourses * (numCourses - 1)
    prerequisites[i].length == 2
    0 <= ai, bi < numCourses
    ai != bi
    All the pairs [ai, bi] are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1, 0}};
        int[] expected = new int[]{0, 1};
        var result = solution.findOrder(numCourses, prerequisites);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int numCourses = 4;
        int[][] prerequisites = new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] expected1 = new int[]{0, 1, 2, 3};
        int[] expected2 = new int[]{0, 2, 1, 3};
        var result = solution.findOrder(numCourses, prerequisites);
        assertThat(result).isIn(expected1, expected2);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int numCourses = 1;
        int[][] prerequisites = new int[][]{};
        int[] expected = new int[]{0};
        var result = solution.findOrder(numCourses, prerequisites);
        assertThat(result).isEqualTo(expected);
    }

}
