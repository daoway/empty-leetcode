package com.blogspot.ostas.leetcode.all.medium.apply_discount_to_prices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sentence = "there are $1 $2 and 5$ candies in the shop", discount = 50
    Output: "there are $0.50 $1.00 and 5$ candies in the shop"
    Explanation:
    The words which represent prices are "$1" and "$2".
    - A 50% discount on "$1" yields "$0.50", so "$1" is replaced by "$0.50".
    - A 50% discount on "$2" yields "$1". Since we need to have exactly 2 decimal places after a price, we replace "$2" with "$1.00".
    Example 2:
    Input: sentence = "1 2 $3 4 $5 $6 7 8$ $9 $10$", discount = 100
    Output: "1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$"
    Explanation:
    Applying a 100% discount on any price will result in 0.
    The words representing prices are "$3", "$5", "$6", and "$9".
    Each of them is replaced by "$0.00".
      Constraints:
    1 <= sentence.length <= 105
    sentence consists of lowercase English letters, digits, ' ', and '$'.
    sentence does not have leading or trailing spaces.
    All words in sentence are separated by a single space.
    All prices will be positive numbers without leading zeros.
    All prices will have at most 10 digits.
    0 <= discount <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String sentence = "there are $1 $2 and 5$ candies in the shop";
        int discount = 50;
        String expected = "there are $0.50 $1.00 and 5$ candies in the shop";
        var result = solution.discountPrices(sentence, discount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String sentence = "1 2 $3 4 $5 $6 7 8$ $9 $10$";
        int discount = 100;
        String expected = "1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$";
        var result = solution.discountPrices(sentence, discount);
        assertThat(result).isEqualTo(expected);
    }

}
