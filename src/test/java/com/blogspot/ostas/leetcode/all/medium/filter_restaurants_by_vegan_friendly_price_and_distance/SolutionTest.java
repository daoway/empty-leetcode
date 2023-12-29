package com.blogspot.ostas.leetcode.all.medium.filter_restaurants_by_vegan_friendly_price_and_distance;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: restaurants = [[1,4,1,40,10],[2,8,0,50,5],[3,8,1,30,4],[4,10,0,10,3],[5,1,1,15,1]], veganFriendly = 1, maxPrice = 50, maxDistance = 10
    Output: [3,1,5]
    Explanation:
    The restaurants are:
    Restaurant 1 [id=1, rating=4, veganFriendly=1, price=40, distance=10]
    Restaurant 2 [id=2, rating=8, veganFriendly=0, price=50, distance=5]
    Restaurant 3 [id=3, rating=8, veganFriendly=1, price=30, distance=4]
    Restaurant 4 [id=4, rating=10, veganFriendly=0, price=10, distance=3]
    Restaurant 5 [id=5, rating=1, veganFriendly=1, price=15, distance=1]
    After filter restaurants with veganFriendly = 1, maxPrice = 50 and maxDistance = 10 we have restaurant 3, restaurant 1 and restaurant 5 (ordered by rating from highest to lowest).
    Example 2:
    Input: restaurants = [[1,4,1,40,10],[2,8,0,50,5],[3,8,1,30,4],[4,10,0,10,3],[5,1,1,15,1]], veganFriendly = 0, maxPrice = 50, maxDistance = 10
    Output: [4,3,2,1,5]
    Explanation: The restaurants are the same as in example 1, but in this case the filter veganFriendly = 0, therefore all restaurants are considered.
    Example 3:
    Input: restaurants = [[1,4,1,40,10],[2,8,0,50,5],[3,8,1,30,4],[4,10,0,10,3],[5,1,1,15,1]], veganFriendly = 0, maxPrice = 30, maxDistance = 3
    Output: [4,5]
      Constraints:
    1 <= restaurants.length <= 10^4
    restaurants[i].length == 5
    1 <= idi, ratingi, pricei, distancei <= 10^5
    1 <= maxPrice, maxDistance <= 10^5
    veganFriendlyi and veganFriendly are 0 or 1.
    All idi are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] restaurants = new int[][]{{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4},
                {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        int veganFriendly = 1;
        int maxPrice = 50;
        int maxDistance = 10;
        List<Integer> expected = List.of(3, 1, 5);
        var result = solution.filterRestaurants(restaurants, veganFriendly, maxPrice, maxDistance);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] restaurants = new int[][]{{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4},
                {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        int veganFriendly = 0;
        int maxPrice = 50;
        int maxDistance = 10;
        List<Integer> expected = List.of(4, 3, 2, 1, 5);
        var result = solution.filterRestaurants(restaurants, veganFriendly, maxPrice, maxDistance);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] restaurants = new int[][]{{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4},
                {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        int veganFriendly = 0;
        int maxPrice = 30;
        int maxDistance = 3;
        List<Integer> expected = List.of(4, 5);
        var result = solution.filterRestaurants(restaurants, veganFriendly, maxPrice, maxDistance);
        assertThat(result).isEqualTo(expected);
    }

}
