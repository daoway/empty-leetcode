package com.blogspot.ostas.leetcode.all.hard.process_restricted_friend_requests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, restrictions = [[0,1]], requests = [[0,2],[2,1]]
    Output: [true,false]
    Explanation:
    Request 0: Person 0 and person 2 can be friends, so they become direct friends.
    Request 1: Person 2 and person 1 cannot be friends since person 0 and person 1 would be indirect friends (1--2--0).
    Example 2:
    Input: n = 3, restrictions = [[0,1]], requests = [[1,2],[0,2]]
    Output: [true,false]
    Explanation:
    Request 0: Person 1 and person 2 can be friends, so they become direct friends.
    Request 1: Person 0 and person 2 cannot be friends since person 0 and person 1 would be indirect friends (0--2--1).
    Example 3:
    Input: n = 5, restrictions = [[0,1],[1,2],[2,3]], requests = [[0,4],[1,2],[3,1],[3,4]]
    Output: [true,false,true,false]
    Explanation:
    Request 0: Person 0 and person 4 can be friends, so they become direct friends.
    Request 1: Person 1 and person 2 cannot be friends since they are directly restricted.
    Request 2: Person 3 and person 1 can be friends, so they become direct friends.
    Request 3: Person 3 and person 4 cannot be friends since person 0 and person 1 would be indirect friends (0--4--3--1).
      Constraints:
    2 <= n <= 1000
    0 <= restrictions.length <= 1000
    restrictions[i].length == 2
    0 <= xi, yi <= n - 1
    xi != yi
    1 <= requests.length <= 1000
    requests[j].length == 2
    0 <= uj, vj <= n - 1
    uj != vj
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] restrictions = new int[][]{{0, 1}};
        int[][] requests = new int[][]{{0, 2}, {2, 1}};
        boolean[] expected = new boolean[]{true, false};
        var result = solution.friendRequests(n, restrictions, requests);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] restrictions = new int[][]{{0, 1}};
        int[][] requests = new int[][]{{1, 2}, {0, 2}};
        boolean[] expected = new boolean[]{true, false};
        var result = solution.friendRequests(n, restrictions, requests);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 5;
        int[][] restrictions = new int[][]{{0, 1}, {1, 2}, {2, 3}};
        int[][] requests = new int[][]{{0, 4}, {1, 2}, {3, 1}, {3, 4}};
        boolean[] expected = new boolean[]{true, false, true, false};
        var result = solution.friendRequests(n, restrictions, requests);
        assertThat(result).isEqualTo(expected);
    }

}
