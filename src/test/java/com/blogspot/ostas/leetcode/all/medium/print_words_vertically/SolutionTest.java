package com.blogspot.ostas.leetcode.all.medium.print_words_vertically;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "HOW ARE YOU"
    Output: ["HAY","ORO","WEU"]
    Explanation: Each word is printed vertically.
     "HAY"
     "ORO"
     "WEU"
    Example 2:
    Input: s = "TO BE OR NOT TO BE"
    Output: ["TBONTB","OEROOE","   T"]
    Explanation: Trailing spaces is not allowed.
    "TBONTB"
    "OEROOE"
    "   T"
    Example 3:
    Input: s = "CONTEST IS COMING"
    Output: ["CIC","OSO","N M","T I","E N","S G","T"]
      Constraints:
    1 <= s.length <= 200
    s contains only upper case English letters.
    It's guaranteed that there is only one space between 2 words.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "HOW ARE YOU";
        List<String> expected = List.of("HAY", "ORO", "WEU");
        var result = solution.printVertically(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "TO BE OR NOT TO BE";
        List<String> expected = List.of("TBONTB", "OEROOE", "   T");
        var result = solution.printVertically(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "CONTEST IS COMING";
        List<String> expected = List.of("CIC", "OSO", "N M", "T I", "E N", "S G", "T");
        var result = solution.printVertically(s);
        assertThat(result).isEqualTo(expected);
    }

}
