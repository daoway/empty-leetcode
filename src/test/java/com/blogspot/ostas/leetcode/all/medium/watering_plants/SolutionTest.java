package com.blogspot.ostas.leetcode.all.medium.watering_plants;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: plants = [2,2,3,3], capacity = 5
    Output: 14
    Explanation: Start at the river with a full watering can:
    - Walk to plant 0 (1 step) and water it. Watering can has 3 units of water.
    - Walk to plant 1 (1 step) and water it. Watering can has 1 unit of water.
    - Since you cannot completely water plant 2, walk back to the river to refill (2 steps).
    - Walk to plant 2 (3 steps) and water it. Watering can has 2 units of water.
    - Since you cannot completely water plant 3, walk back to the river to refill (3 steps).
    - Walk to plant 3 (4 steps) and water it.
    Steps needed = 1 + 1 + 2 + 3 + 3 + 4 = 14.
    Example 2:
    Input: plants = [1,1,1,4,2,3], capacity = 4
    Output: 30
    Explanation: Start at the river with a full watering can:
    - Water plants 0, 1, and 2 (3 steps). Return to river (3 steps).
    - Water plant 3 (4 steps). Return to river (4 steps).
    - Water plant 4 (5 steps). Return to river (5 steps).
    - Water plant 5 (6 steps).
    Steps needed = 3 + 3 + 4 + 4 + 5 + 5 + 6 = 30.
    Example 3:
    Input: plants = [7,7,7,7,7,7,7], capacity = 8
    Output: 49
    Explanation: You have to refill before watering each plant.
    Steps needed = 1 + 1 + 2 + 2 + 3 + 3 + 4 + 4 + 5 + 5 + 6 + 6 + 7 = 49.
      Constraints:
    n == plants.length
    1 <= n <= 1000
    1 <= plants[i] <= 106
    max(plants[i]) <= capacity <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] plants = new int[]{2, 2, 3, 3};
        int capacity = 5;
        int expected = 14;
        var result = solution.wateringPlants(plants, capacity);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] plants = new int[]{1, 1, 1, 4, 2, 3};
        int capacity = 4;
        int expected = 30;
        var result = solution.wateringPlants(plants, capacity);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] plants = new int[]{7, 7, 7, 7, 7, 7, 7};
        int capacity = 8;
        int expected = 49;
        var result = solution.wateringPlants(plants, capacity);
        assertThat(result).isEqualTo(expected);
    }

}
