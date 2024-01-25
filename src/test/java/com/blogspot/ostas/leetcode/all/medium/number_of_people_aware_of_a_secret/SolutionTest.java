package com.blogspot.ostas.leetcode.all.medium.number_of_people_aware_of_a_secret;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, delay = 2, forget = 4
    Output: 5
    Explanation:
    Day 1: Suppose the first person is named A. (1 person)
    Day 2: A is the only person who knows the secret. (1 person)
    Day 3: A shares the secret with a new person, B. (2 people)
    Day 4: A shares the secret with a new person, C. (3 people)
    Day 5: A forgets the secret, and B shares the secret with a new person, D. (3 people)
    Day 6: B shares the secret with E, and C shares the secret with F. (5 people)
    Example 2:
    Input: n = 4, delay = 1, forget = 3
    Output: 6
    Explanation:
    Day 1: The first person is named A. (1 person)
    Day 2: A shares the secret with B. (2 people)
    Day 3: A and B share the secret with 2 new people, C and D. (4 people)
    Day 4: A forgets the secret. B, C, and D share the secret with 3 new people. (6 people)
      Constraints:
    2 <= n <= 1000
    1 <= delay < forget <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int delay = 2;
        int forget = 4;
        int expected = 5;
        var result = solution.peopleAwareOfSecret(n, delay, forget);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int delay = 1;
        int forget = 3;
        int expected = 6;
        var result = solution.peopleAwareOfSecret(n, delay, forget);
        assertThat(result).isEqualTo(expected);
    }

}
