package com.blogspot.ostas.leetcode.all.medium.merge_triplets_to_form_target_triplet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: triplets = [[2,5,3],[1,8,4],[1,7,5]], target = [2,7,5]
    Output: true
    Explanation: Perform the following operations:
    - Choose the first and last triplets [[2,5,3],[1,8,4],[1,7,5]]. Update the last triplet to be [max(2,1), max(5,7), max(3,5)] = [2,7,5]. triplets = [[2,5,3],[1,8,4],[2,7,5]]
    The target triplet [2,7,5] is now an element of triplets.
    Example 2:
    Input: triplets = [[3,4,5],[4,5,6]], target = [3,2,5]
    Output: false
    Explanation: It is impossible to have [3,2,5] as an element because there is no 2 in any of the triplets.
    Example 3:
    Input: triplets = [[2,5,3],[2,3,4],[1,2,5],[5,2,3]], target = [5,5,5]
    Output: true
    Explanation: Perform the following operations:
    - Choose the first and third triplets [[2,5,3],[2,3,4],[1,2,5],[5,2,3]]. Update the third triplet to be [max(2,1), max(5,2), max(3,5)] = [2,5,5]. triplets = [[2,5,3],[2,3,4],[2,5,5],[5,2,3]].
    - Choose the third and fourth triplets [[2,5,3],[2,3,4],[2,5,5],[5,2,3]]. Update the fourth triplet to be [max(2,5), max(5,2), max(5,3)] = [5,5,5]. triplets = [[2,5,3],[2,3,4],[2,5,5],[5,5,5]].
    The target triplet [5,5,5] is now an element of triplets.
      Constraints:
    1 <= triplets.length <= 105
    triplets[i].length == target.length == 3
    1 <= ai, bi, ci, x, y, z <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] triplets = new int[][]{{2, 5, 3}, {1, 8, 4}, {1, 7, 5}};
        int[] target = new int[]{2, 7, 5};
        boolean expected = true;
        var result = solution.mergeTriplets(triplets, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] triplets = new int[][]{{3, 4, 5}, {4, 5, 6}};
        int[] target = new int[]{3, 2, 5};
        boolean expected = false;
        var result = solution.mergeTriplets(triplets, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] triplets = new int[][]{{2, 5, 3}, {2, 3, 4}, {1, 2, 5}, {5, 2, 3}};
        int[] target = new int[]{5, 5, 5};
        boolean expected = true;
        var result = solution.mergeTriplets(triplets, target);
        assertThat(result).isEqualTo(expected);
    }

}
