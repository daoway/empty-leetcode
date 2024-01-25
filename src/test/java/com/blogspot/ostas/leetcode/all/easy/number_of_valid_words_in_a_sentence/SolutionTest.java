package com.blogspot.ostas.leetcode.all.easy.number_of_valid_words_in_a_sentence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sentence = "cat and  dog"
    Output: 3
    Explanation: The valid words in the sentence are "cat", "and", and "dog".
    Example 2:
    Input: sentence = "!this  1-s b8d!"
    Output: 0
    Explanation: There are no valid words in the sentence.
    "!this" is invalid because it starts with a punctuation mark.
    "1-s" and "b8d" are invalid because they contain digits.
    Example 3:
    Input: sentence = "alice and  bob are playing stone-game10"
    Output: 5
    Explanation: The valid words in the sentence are "alice", "and", "bob", "are", and "playing".
    "stone-game10" is invalid because it contains digits.
      Constraints:
    1 <= sentence.length <= 1000
    sentence only contains lowercase English letters, digits, ' ', '-', '!', '.', and ','.
    There will be at least 1 token.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String sentence = "cat and  dog";
        int expected = 3;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String sentence = "!this  1-s b8d!";
        int expected = 0;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String sentence = "alice and  bob are playing stone-game10";
        int expected = 5;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_3() {
        var solution = new Solution();
        String sentence = " o6 t";
        int expected = 1;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_4() {
        var solution = new Solution();
        String sentence = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";
        int expected = 6;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void example_5() {
        var solution = new Solution();
        String sentence = "-";
        int expected = 0;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void example_6() {
        var solution = new Solution();
        String sentence = "!";
        int expected = 1;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_7() {
        var solution = new Solution();
        String sentence = """
                "qte1i   1-,, yv03a  r12r2stw 4 d,tnirlsj pb !16- 9 b  dnlgrig 8   n!88qyfjly   0g f5hgfg0u9lux7 - 6ega 0p36 pnw  ae  0m  -v  q3zdw09b9qju q0! s-  jk 04 e1ik  2 3  k a1qe.ac,-w j,keef76xz8  -!zhc s b u -z. ,,b -rei 83ooj 899 af w1irv u o3jk21 71i60pq3,.rzbhc.-  t9 xlk5g  ovn 8f9  ztw 7siy p-yl856r, ma39xtl!t-o c 2x 2 drj!ms0w ysy  u0tcw8u.im c 0ke.5sk  dn8.mh qi   8xmt -bxmr  z 1r 5 umyk 8rbe!dif kmes n rp icnb s 0yc1e 8  e1 !f  .u lh  n a -iinnm!a08dfgq ,lux,j 8fyqt hcbajnb4swuxtqm4j1  ic04 o,i4lka id 0srlb  y 2k  1g  3m nptj   53rh, zim7mkd2hqf64 chotiijcemj!m dif7iiq m2e ve!9!r1 jw okyahf! r6kskaodd h eug.yc,3j ilkd 9vlpipfc  g5y   7u 5pt531!4s 4  si !lg x50-   kc51ca34s pl 9w,mgj3  5fy,.3d shi ct a k2nx8l xum9sgyp6r   rj! 8  m!1k gm  typy . oee08!!j0,2iwq  9 ywd w rhpoc s6118y c5.qw4d  tlrjs.!9 mpioexe. xmicv  ,z g2 p6 bhtm!  ,w 7 "                
                """;
        int expected = 50;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }
}
