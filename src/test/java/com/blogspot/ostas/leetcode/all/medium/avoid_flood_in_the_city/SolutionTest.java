package com.blogspot.ostas.leetcode.all.medium.avoid_flood_in_the_city;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rains = [1,2,3,4]
    Output: [-1,-1,-1,-1]
    Explanation: After the first day full lakes are [1]
    After the second day full lakes are [1,2]
    After the third day full lakes are [1,2,3]
    After the fourth day full lakes are [1,2,3,4]
    There's no day to dry any lake and there is no flood in any lake.
    Example 2:
    Input: rains = [1,2,0,0,2,1]
    Output: [-1,-1,2,1,-1,-1]
    Explanation: After the first day full lakes are [1]
    After the second day full lakes are [1,2]
    After the third day, we dry lake 2. Full lakes are [1]
    After the fourth day, we dry lake 1. There is no full lakes.
    After the fifth day, full lakes are [2].
    After the sixth day, full lakes are [1,2].
    It is easy that this scenario is flood-free. [-1,-1,1,2,-1,-1] is another acceptable scenario.
    Example 3:
    Input: rains = [1,2,0,1,2]
    Output: []
    Explanation: After the second day, full lakes are  [1,2]. We have to dry one lake in the third day.
    After that, it will rain over lakes [1,2]. It's easy to prove that no matter which lake you choose to dry in the 3rd day, the other one will flood.
      Constraints:
    1 <= rains.length <= 105
    0 <= rains[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] rains = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{-1, -1, -1, -1};
        var result = solution.avoidFlood(rains);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] rains = new int[]{1, 2, 0, 0, 2, 1};
        int[] expected = new int[]{-1, -1, 2, 1, -1, -1};
        var result = solution.avoidFlood(rains);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] rains = new int[]{1, 2, 0, 1, 2};
        int[] expected = new int[]{};
        var result = solution.avoidFlood(rains);
        assertThat(result).isEqualTo(expected);
    }

}
