package com.blogspot.ostas.leetcode.all.medium.reward_top_k_students;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: positive_feedback = ["smart","brilliant","studious"], negative_feedback = ["not"], report = ["this student is studious","the student is smart"], student_id = [1,2], k = 2
    Output: [1,2]
    Explanation:
    Both the students have 1 positive feedback and 3 points but since student 1 has a lower ID he ranks higher.
    Example 2:
    Input: positive_feedback = ["smart","brilliant","studious"], negative_feedback = ["not"], report = ["this student is not studious","the student is smart"], student_id = [1,2], k = 2
    Output: [2,1]
    Explanation:
    - The student with ID 1 has 1 positive feedback and 1 negative feedback, so he has 3-1=2 points.
    - The student with ID 2 has 1 positive feedback, so he has 3 points.
    Since student 2 has more points, [2,1] is returned.
      Constraints:
    1 <= positive_feedback.length, negative_feedback.length <= 104
    1 <= positive_feedback[i].length, negative_feedback[j].length <= 100
    Both positive_feedback[i] and negative_feedback[j] consists of lowercase English letters.
    No word is present in both positive_feedback and negative_feedback.
    n == report.length == student_id.length
    1 <= n <= 104
    report[i] consists of lowercase English letters and spaces ' '.
    There is a single space between consecutive words of report[i].
    1 <= report[i].length <= 100
    1 <= student_id[i] <= 109
    All the values of student_id[i] are unique.
    1 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] positive_feedback = new String[]{"smart", "brilliant", "studious"};
        String[] negative_feedback = new String[]{"not"};
        String[] report = new String[]{"this student is studious", "the student is smart"};
        int[] student_id = new int[]{1, 2};
        int k = 2;
        List<Integer> expected = List.of(1, 2);
        var result = solution.topStudents(positive_feedback, negative_feedback, report, student_id, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] positive_feedback = new String[]{"smart", "brilliant", "studious"};
        String[] negative_feedback = new String[]{"not"};
        String[] report = new String[]{"this student is not studious", "the student is smart"};
        int[] student_id = new int[]{1, 2};
        int k = 2;
        List<Integer> expected = List.of(2, 1);
        var result = solution.topStudents(positive_feedback, negative_feedback, report, student_id, k);
        assertThat(result).isEqualTo(expected);
    }

}
