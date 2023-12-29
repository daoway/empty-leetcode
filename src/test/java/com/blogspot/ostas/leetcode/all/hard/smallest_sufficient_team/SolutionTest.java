package com.blogspot.ostas.leetcode.all.hard.smallest_sufficient_team;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: req_skills = ["java","nodejs","reactjs"], people = [["java"],["nodejs"],["nodejs","reactjs"]]
    Output: [0,2]
    Example 2:
    Input: req_skills = ["algorithms","math","java","reactjs","csharp","aws"], people = [["algorithms","math","java"],["algorithms","math","reactjs"],["java","csharp","aws"],["reactjs","csharp"],["csharp","math"],["aws","java"]]
    Output: [1,2]
      Constraints:
    1 <= req_skills.length <= 16
    1 <= req_skills[i].length <= 16
    req_skills[i] consists of lowercase English letters.
    All the strings of req_skills are unique.
    1 <= people.length <= 60
    0 <= people[i].length <= 16
    1 <= people[i][j].length <= 16
    people[i][j] consists of lowercase English letters.
    All the strings of people[i] are unique.
    Every skill in people[i] is a skill in req_skills.
    It is guaranteed a sufficient team exists.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] req_skills = new String[]{"java", "nodejs", "reactjs"};
        List<List<String>> people =
                List.of(List.of("java"), List.of("nodejs"), List.of("nodejs", "reactjs"));
        int[] expected = new int[]{0, 2};
        var result = solution.smallestSufficientTeam(req_skills, people);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] req_skills = new String[]{"algorithms", "math", "java", "reactjs", "csharp", "aws"};
        List<List<String>> people = List.of(List.of("algorithms", "math", "java"),
                List.of("algorithms", "math", "reactjs"), List.of("java", "csharp", "aws"),
                List.of("reactjs", "csharp"), List.of("csharp", "math"), List.of("aws", "java"));
        int[] expected = new int[]{1, 2};
        var result = solution.smallestSufficientTeam(req_skills, people);
        assertThat(result).isEqualTo(expected);
    }

}
