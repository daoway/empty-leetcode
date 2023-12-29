package com.blogspot.ostas.leetcode.all.easy.minimum_hours_of_training_to_win_a_competition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: initialEnergy = 5, initialExperience = 3, energy = [1,4,3,2], experience = [2,6,3,1]
    Output: 8
    Explanation: You can increase your energy to 11 after 6 hours of training, and your experience to 5 after 2 hours of training.
    You face the opponents in the following order:
    - You have more energy and experience than the 0th opponent so you win.
      Your energy becomes 11 - 1 = 10, and your experience becomes 5 + 2 = 7.
    - You have more energy and experience than the 1st opponent so you win.
      Your energy becomes 10 - 4 = 6, and your experience becomes 7 + 6 = 13.
    - You have more energy and experience than the 2nd opponent so you win.
      Your energy becomes 6 - 3 = 3, and your experience becomes 13 + 3 = 16.
    - You have more energy and experience than the 3rd opponent so you win.
      Your energy becomes 3 - 2 = 1, and your experience becomes 16 + 1 = 17.
    You did a total of 6 + 2 = 8 hours of training before the competition, so we return 8.
    It can be proven that no smaller answer exists.
    Example 2:
    Input: initialEnergy = 2, initialExperience = 4, energy = [1], experience = [3]
    Output: 0
    Explanation: You do not need any additional energy or experience to win the competition, so we return 0.
      Constraints:
    n == energy.length == experience.length
    1 <= n <= 100
    1 <= initialEnergy, initialExperience, energy[i], experience[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int initialEnergy = 5;
        int initialExperience = 3;
        int[] energy = new int[]{1, 4, 3, 2};
        int[] experience = new int[]{2, 6, 3, 1};
        int expected = 8;
        var result = solution.minNumberOfHours(initialEnergy, initialExperience, energy, experience);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int initialEnergy = 2;
        int initialExperience = 4;
        int[] energy = new int[]{1};
        int[] experience = new int[]{3};
        int expected = 0;
        var result = solution.minNumberOfHours(initialEnergy, initialExperience, energy, experience);
        assertThat(result).isEqualTo(expected);
    }

}
