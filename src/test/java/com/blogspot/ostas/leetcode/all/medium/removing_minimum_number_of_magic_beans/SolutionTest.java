package com.blogspot.ostas.leetcode.all.medium.removing_minimum_number_of_magic_beans;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: beans = [4,1,6,5]
    Output: 4
    Explanation:
    - We remove 1 bean from the bag with only 1 bean.
      This results in the remaining bags: [4,0,6,5]
    - Then we remove 2 beans from the bag with 6 beans.
      This results in the remaining bags: [4,0,4,5]
    - Then we remove 1 bean from the bag with 5 beans.
      This results in the remaining bags: [4,0,4,4]
    We removed a total of 1 + 2 + 1 = 4 beans to make the remaining non-empty bags have an equal number of beans.
    There are no other solutions that remove 4 beans or fewer.
    Example 2:
    Input: beans = [2,10,3,2]
    Output: 7
    Explanation:
    - We remove 2 beans from one of the bags with 2 beans.
      This results in the remaining bags: [0,10,3,2]
    - Then we remove 2 beans from the other bag with 2 beans.
      This results in the remaining bags: [0,10,3,0]
    - Then we remove 3 beans from the bag with 3 beans.
      This results in the remaining bags: [0,10,0,0]
    We removed a total of 2 + 2 + 3 = 7 beans to make the remaining non-empty bags have an equal number of beans.
    There are no other solutions that removes 7 beans or fewer.
      Constraints:
    1 <= beans.length <= 105
    1 <= beans[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] beans = new int[]{4, 1, 6, 5};
        long expected = 4;
        var result = solution.minimumRemoval(beans);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] beans = new int[]{2, 10, 3, 2};
        long expected = 7;
        var result = solution.minimumRemoval(beans);
        assertThat(result).isEqualTo(expected);
    }

}
