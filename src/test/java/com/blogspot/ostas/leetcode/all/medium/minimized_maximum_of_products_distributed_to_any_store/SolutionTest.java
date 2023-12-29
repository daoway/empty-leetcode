package com.blogspot.ostas.leetcode.all.medium.minimized_maximum_of_products_distributed_to_any_store;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, quantities = [11,6]
    Output: 3
    Explanation: One optimal way is:
    - The 11 products of type 0 are distributed to the first four stores in these amounts: 2, 3, 3, 3
    - The 6 products of type 1 are distributed to the other two stores in these amounts: 3, 3
    The maximum number of products given to any store is max(2, 3, 3, 3, 3, 3) = 3.
    Example 2:
    Input: n = 7, quantities = [15,10,10]
    Output: 5
    Explanation: One optimal way is:
    - The 15 products of type 0 are distributed to the first three stores in these amounts: 5, 5, 5
    - The 10 products of type 1 are distributed to the next two stores in these amounts: 5, 5
    - The 10 products of type 2 are distributed to the last two stores in these amounts: 5, 5
    The maximum number of products given to any store is max(5, 5, 5, 5, 5, 5, 5) = 5.
    Example 3:
    Input: n = 1, quantities = [100000]
    Output: 100000
    Explanation: The only optimal way is:
    - The 100000 products of type 0 are distributed to the only store.
    The maximum number of products given to any store is max(100000) = 100000.
      Constraints:
    m == quantities.length
    1 <= m <= n <= 105
    1 <= quantities[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int[] quantities = new int[]{11, 6};
        int expected = 3;
        var result = solution.minimizedMaximum(n, quantities);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int[] quantities = new int[]{15, 10, 10};
        int expected = 5;
        var result = solution.minimizedMaximum(n, quantities);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 1;
        int[] quantities = new int[]{100000};
        int expected = 100000;
        var result = solution.minimizedMaximum(n, quantities);
        assertThat(result).isEqualTo(expected);
    }

}
