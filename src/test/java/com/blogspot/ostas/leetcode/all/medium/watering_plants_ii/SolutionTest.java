package com.blogspot.ostas.leetcode.all.medium.watering_plants_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: plants = [2,2,3,3], capacityA = 5, capacityB = 5
    Output: 1
    Explanation:
    - Initially, Alice and Bob have 5 units of water each in their watering cans.
    - Alice waters plant 0, Bob waters plant 3.
    - Alice and Bob now have 3 units and 2 units of water respectively.
    - Alice has enough water for plant 1, so she waters it. Bob does not have enough water for plant 2, so he refills his can then waters it.
    So, the total number of times they have to refill to water all the plants is 0 + 0 + 1 + 0 = 1.
    Example 2:
    Input: plants = [2,2,3,3], capacityA = 3, capacityB = 4
    Output: 2
    Explanation:
    - Initially, Alice and Bob have 3 units and 4 units of water in their watering cans respectively.
    - Alice waters plant 0, Bob waters plant 3.
    - Alice and Bob now have 1 unit of water each, and need to water plants 1 and 2 respectively.
    - Since neither of them have enough water for their current plants, they refill their cans and then water the plants.
    So, the total number of times they have to refill to water all the plants is 0 + 1 + 1 + 0 = 2.
    Example 3:
    Input: plants = [5], capacityA = 10, capacityB = 8
    Output: 0
    Explanation:
    - There is only one plant.
    - Alice's watering can has 10 units of water, whereas Bob's can has 8 units. Since Alice has more water in her can, she waters this plant.
    So, the total number of times they have to refill is 0.
      Constraints:
    n == plants.length
    1 <= n <= 105
    1 <= plants[i] <= 106
    max(plants[i]) <= capacityA, capacityB <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] plants = new int[]{2, 2, 3, 3};
        int capacityA = 5;
        int capacityB = 5;
        int expected = 1;
        var result = solution.minimumRefill(plants, capacityA, capacityB);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] plants = new int[]{2, 2, 3, 3};
        int capacityA = 3;
        int capacityB = 4;
        int expected = 2;
        var result = solution.minimumRefill(plants, capacityA, capacityB);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] plants = new int[]{5};
        int capacityA = 10;
        int capacityB = 8;
        int expected = 0;
        var result = solution.minimumRefill(plants, capacityA, capacityB);
        assertThat(result).isEqualTo(expected);
    }

}
