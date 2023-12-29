package com.blogspot.ostas.leetcode.all.medium.people_whose_list_of_favorite_companies_is_not_a_subset_of_another_list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
    Output: [0,1,4]
    Explanation:
    Person with index=2 has favoriteCompanies[2]=["google","facebook"] which is a subset of favoriteCompanies[0]=["leetcode","google","facebook"] corresponding to the person with index 0.
    Person with index=3 has favoriteCompanies[3]=["google"] which is a subset of favoriteCompanies[0]=["leetcode","google","facebook"] and favoriteCompanies[1]=["google","microsoft"].
    Other lists of favorite companies are not a subset of another list, therefore, the answer is [0,1,4].
    Example 2:
    Input: favoriteCompanies = [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
    Output: [0,1]
    Explanation: In this case favoriteCompanies[2]=["facebook","google"] is a subset of favoriteCompanies[0]=["leetcode","google","facebook"], therefore, the answer is [0,1].
    Example 3:
    Input: favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]
    Output: [0,1,2,3]
      Constraints:
    1 <= favoriteCompanies.length <= 100
    1 <= favoriteCompanies[i].length <= 500
    1 <= favoriteCompanies[i][j].length <= 20
    All strings in favoriteCompanies[i] are distinct.
    All lists of favorite companies are distinct, that is, If we sort alphabetically each list then favoriteCompanies[i] != favoriteCompanies[j].
    All strings consist of lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> favoriteCompanies = List.of(List.of("leetcode", "google", "facebook"),
                List.of("google", "microsoft"), List.of("google", "facebook"), List.of("google"),
                List.of("amazon"));
        List<Integer> expected = List.of(0, 1, 4);
        var result = solution.peopleIndexes(favoriteCompanies);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> favoriteCompanies = List.of(List.of("leetcode", "google", "facebook"),
                List.of("leetcode", "amazon"), List.of("facebook", "google"));
        List<Integer> expected = List.of(0, 1);
        var result = solution.peopleIndexes(favoriteCompanies);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<String>> favoriteCompanies =
                List.of(List.of("leetcode"), List.of("google"), List.of("facebook"),
                        List.of("amazon"));
        List<Integer> expected = List.of(0, 1, 2, 3);
        var result = solution.peopleIndexes(favoriteCompanies);
        assertThat(result).isEqualTo(expected);
    }

}
