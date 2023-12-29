package com.blogspot.ostas.leetcode.all.medium.find_all_possible_recipes_from_given_supplies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: recipes = ["bread"], ingredients = [["yeast","flour"]], supplies = ["yeast","flour","corn"]
    Output: ["bread"]
    Explanation:
    We can create "bread" since we have the ingredients "yeast" and "flour".
    Example 2:
    Input: recipes = ["bread","sandwich"], ingredients = [["yeast","flour"],["bread","meat"]], supplies = ["yeast","flour","meat"]
    Output: ["bread","sandwich"]
    Explanation:
    We can create "bread" since we have the ingredients "yeast" and "flour".
    We can create "sandwich" since we have the ingredient "meat" and can create the ingredient "bread".
    Example 3:
    Input: recipes = ["bread","sandwich","burger"], ingredients = [["yeast","flour"],["bread","meat"],["sandwich","meat","bread"]], supplies = ["yeast","flour","meat"]
    Output: ["bread","sandwich","burger"]
    Explanation:
    We can create "bread" since we have the ingredients "yeast" and "flour".
    We can create "sandwich" since we have the ingredient "meat" and can create the ingredient "bread".
    We can create "burger" since we have the ingredient "meat" and can create the ingredients "bread" and "sandwich".
      Constraints:
    n == recipes.length == ingredients.length
    1 <= n <= 100
    1 <= ingredients[i].length, supplies.length <= 100
    1 <= recipes[i].length, ingredients[i][j].length, supplies[k].length <= 10
    recipes[i], ingredients[i][j], and supplies[k] consist only of lowercase English letters.
    All the values of recipes and supplies combined are unique.
    Each ingredients[i] does not contain any duplicate values.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] recipes = new String[]{"bread"};
        List<List<String>> ingredients = List.of(List.of("yeast", "flour"));
        String[] supplies = new String[]{"yeast", "flour", "corn"};
        List<String> expected = List.of("bread");
        var result = solution.findAllRecipes(recipes, ingredients, supplies);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] recipes = new String[]{"bread", "sandwich"};
        List<List<String>> ingredients = List.of(List.of("yeast", "flour"), List.of("bread", "meat"));
        String[] supplies = new String[]{"yeast", "flour", "meat"};
        List<String> expected = List.of("bread", "sandwich");
        var result = solution.findAllRecipes(recipes, ingredients, supplies);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] recipes = new String[]{"bread", "sandwich", "burger"};
        List<List<String>> ingredients = List.of(List.of("yeast", "flour"), List.of("bread", "meat"),
                List.of("sandwich", "meat", "bread"));
        String[] supplies = new String[]{"yeast", "flour", "meat"};
        List<String> expected = List.of("bread", "sandwich", "burger");
        var result = solution.findAllRecipes(recipes, ingredients, supplies);
        assertThat(result).isEqualTo(expected);
    }

}
