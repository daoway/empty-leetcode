package com.blogspot.ostas.leetcode.all.medium.display_table_of_food_orders_in_a_restaurant;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: orders = [["David","3","Ceviche"],["Corina","10","Beef Burrito"],["David","3","Fried Chicken"],["Carla","5","Water"],["Carla","5","Ceviche"],["Rous","3","Ceviche"]]
    Output: [["Table","Beef Burrito","Ceviche","Fried Chicken","Water"],["3","0","2","1","0"],["5","0","1","0","1"],["10","1","0","0","0"]]
    Explanation:
    The displaying table looks like:
    Table,Beef Burrito,Ceviche,Fried Chicken,Water
    3    ,0           ,2      ,1            ,0
    5    ,0           ,1      ,0            ,1
    10   ,1           ,0      ,0            ,0
    For the table 3: David orders "Ceviche" and "Fried Chicken", and Rous orders "Ceviche".
    For the table 5: Carla orders "Water" and "Ceviche".
    For the table 10: Corina orders "Beef Burrito".
    Example 2:
    Input: orders = [["James","12","Fried Chicken"],["Ratesh","12","Fried Chicken"],["Amadeus","12","Fried Chicken"],["Adam","1","Canadian Waffles"],["Brianna","1","Canadian Waffles"]]
    Output: [["Table","Canadian Waffles","Fried Chicken"],["1","2","0"],["12","0","3"]]
    Explanation:
    For the table 1: Adam and Brianna order "Canadian Waffles".
    For the table 12: James, Ratesh and Amadeus order "Fried Chicken".
    Example 3:
    Input: orders = [["Laura","2","Bean Burrito"],["Jhon","2","Beef Burrito"],["Melissa","2","Soda"]]
    Output: [["Table","Bean Burrito","Beef Burrito","Soda"],["2","1","1","1"]]
      Constraints:
    1 <= orders.length <= 5 * 10^4
    orders[i].length == 3
    1 <= customerNamei.length, foodItemi.length <= 20
    customerNamei and foodItemi consist of lowercase and uppercase English letters and the space character.
    tableNumberi is a valid integer between 1 and 500.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> orders =
                List.of(List.of("David", "3", "Ceviche"), List.of("Corina", "10", "Beef Burrito"),
                        List.of("David", "3", "Fried Chicken"), List.of("Carla", "5", "Water"),
                        List.of("Carla", "5", "Ceviche"), List.of("Rous", "3", "Ceviche"));
        List<List<String>> expected =
                List.of(List.of("Table", "Beef Burrito", "Ceviche", "Fried Chicken", "Water"),
                        List.of("3", "0", "2", "1", "0"), List.of("5", "0", "1", "0", "1"),
                        List.of("10", "1", "0", "0", "0"));
        var result = solution.displayTable(orders);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> orders = List.of(List.of("James", "12", "Fried Chicken"),
                List.of("Ratesh", "12", "Fried Chicken"), List.of("Amadeus", "12", "Fried Chicken"),
                List.of("Adam", "1", "Canadian Waffles"), List.of("Brianna", "1", "Canadian Waffles"));
        List<List<String>> expected = List.of(List.of("Table", "Canadian Waffles", "Fried Chicken"),
                List.of("1", "2", "0"), List.of("12", "0", "3"));
        var result = solution.displayTable(orders);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<String>> orders =
                List.of(List.of("Laura", "2", "Bean Burrito"), List.of("Jhon", "2", "Beef Burrito"),
                        List.of("Melissa", "2", "Soda"));
        List<List<String>> expected = List.of(List.of("Table", "Bean Burrito", "Beef Burrito", "Soda"),
                List.of("2", "1", "1", "1"));
        var result = solution.displayTable(orders);
        assertThat(result).isEqualTo(expected);
    }

}
