package com.blogspot.ostas.leetcode.all.medium.sender_with_largest_word_count;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: messages = ["Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"], senders = ["Alice","userTwo","userThree","Alice"]
    Output: "Alice"
    Explanation: Alice sends a total of 2 + 3 = 5 words.
    userTwo sends a total of 2 words.
    userThree sends a total of 3 words.
    Since Alice has the largest word count, we return "Alice".
    Example 2:
    Input: messages = ["How is leetcode for everyone","Leetcode is useful for practice"], senders = ["Bob","Charlie"]
    Output: "Charlie"
    Explanation: Bob sends a total of 5 words.
    Charlie sends a total of 5 words.
    Since there is a tie for the largest word count, we return the sender with the lexicographically larger name, Charlie.
      Constraints:
    n == messages.length == senders.length
    1 <= n <= 104
    1 <= messages[i].length <= 100
    1 <= senders[i].length <= 10
    messages[i] consists of uppercase and lowercase English letters and ' '.
    All the words in messages[i] are separated by a single space.
    messages[i] does not have leading or trailing spaces.
    senders[i] consists of uppercase and lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] messages = new String[]{"Hello userTwooo", "Hi userThree", "Wonderful day Alice",
                "Nice day userThree"};
        String[] senders = new String[]{"Alice", "userTwo", "userThree", "Alice"};
        String expected = "Alice";
        var result = solution.largestWordCount(messages, senders);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] messages =
                new String[]{"How is leetcode for everyone", "Leetcode is useful for practice"};
        String[] senders = new String[]{"Bob", "Charlie"};
        String expected = "Charlie";
        var result = solution.largestWordCount(messages, senders);
        assertThat(result).isEqualTo(expected);
    }

}
