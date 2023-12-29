package com.blogspot.ostas.leetcode.all.hard.meeting_rooms_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, meetings = [[0,10],[1,5],[2,7],[3,4]]
    Output: 0
    Explanation:
    - At time 0, both rooms are not being used. The first meeting starts in room 0.
    - At time 1, only room 1 is not being used. The second meeting starts in room 1.
    - At time 2, both rooms are being used. The third meeting is delayed.
    - At time 3, both rooms are being used. The fourth meeting is delayed.
    - At time 5, the meeting in room 1 finishes. The third meeting starts in room 1 for the time period [5,10).
    - At time 10, the meetings in both rooms finish. The fourth meeting starts in room 0 for the time period [10,11).
    Both rooms 0 and 1 held 2 meetings, so we return 0.
    Example 2:
    Input: n = 3, meetings = [[1,20],[2,10],[3,5],[4,9],[6,8]]
    Output: 1
    Explanation:
    - At time 1, all three rooms are not being used. The first meeting starts in room 0.
    - At time 2, rooms 1 and 2 are not being used. The second meeting starts in room 1.
    - At time 3, only room 2 is not being used. The third meeting starts in room 2.
    - At time 4, all three rooms are being used. The fourth meeting is delayed.
    - At time 5, the meeting in room 2 finishes. The fourth meeting starts in room 2 for the time period [5,10).
    - At time 6, all three rooms are being used. The fifth meeting is delayed.
    - At time 10, the meetings in rooms 1 and 2 finish. The fifth meeting starts in room 1 for the time period [10,12).
    Room 0 held 1 meeting while rooms 1 and 2 each held 2 meetings, so we return 1.
      Constraints:
    1 <= n <= 100
    1 <= meetings.length <= 105
    meetings[i].length == 2
    0 <= starti < endi <= 5 * 105
    All the values of starti are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int[][] meetings = new int[][]{{0, 10}, {1, 5}, {2, 7}, {3, 4}};
        int expected = 0;
        var result = solution.mostBooked(n, meetings);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] meetings = new int[][]{{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
        int expected = 1;
        var result = solution.mostBooked(n, meetings);
        assertThat(result).isEqualTo(expected);
    }

}
