package com.blogspot.ostas.leetcode.all.hard.find_all_people_with_secret;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, meetings = [[1,2,5],[2,3,8],[1,5,10]], firstPerson = 1
    Output: [0,1,2,3,5]
    Explanation:
    At time 0, person 0 shares the secret with person 1.
    At time 5, person 1 shares the secret with person 2.
    At time 8, person 2 shares the secret with person 3.
    At time 10, person 1 shares the secret with person 5.
    Thus, people 0, 1, 2, 3, and 5 know the secret after all the meetings.
    Example 2:
    Input: n = 4, meetings = [[3,1,3],[1,2,2],[0,3,3]], firstPerson = 3
    Output: [0,1,3]
    Explanation:
    At time 0, person 0 shares the secret with person 3.
    At time 2, neither person 1 nor person 2 know the secret.
    At time 3, person 3 shares the secret with person 0 and person 1.
    Thus, people 0, 1, and 3 know the secret after all the meetings.
    Example 3:
    Input: n = 5, meetings = [[3,4,2],[1,2,1],[2,3,1]], firstPerson = 1
    Output: [0,1,2,3,4]
    Explanation:
    At time 0, person 0 shares the secret with person 1.
    At time 1, person 1 shares the secret with person 2, and person 2 shares the secret with person 3.
    Note that person 2 can share the secret at the same time as receiving it.
    At time 2, person 3 shares the secret with person 4.
    Thus, people 0, 1, 2, 3, and 4 know the secret after all the meetings.
      Constraints:
    2 <= n <= 105
    1 <= meetings.length <= 105
    meetings[i].length == 3
    0 <= xi, yi <= n - 1
    xi != yi
    1 <= timei <= 105
    1 <= firstPerson <= n - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int[][] meetings = new int[][]{{1, 2, 5}, {2, 3, 8}, {1, 5, 10}};
        int firstPerson = 1;
        List<Integer> expected = List.of(0, 1, 2, 3, 5);
        var result = solution.findAllPeople(n, meetings, firstPerson);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int[][] meetings = new int[][]{{3, 1, 3}, {1, 2, 2}, {0, 3, 3}};
        int firstPerson = 3;
        List<Integer> expected = List.of(0, 1, 3);
        var result = solution.findAllPeople(n, meetings, firstPerson);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 5;
        int[][] meetings = new int[][]{{3, 4, 2}, {1, 2, 1}, {2, 3, 1}};
        int firstPerson = 1;
        List<Integer> expected = List.of(0, 1, 2, 3, 4);
        var result = solution.findAllPeople(n, meetings, firstPerson);
        assertThat(result).isEqualTo(expected);
    }

}
