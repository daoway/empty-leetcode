package com.blogspot.ostas.leetcode.all.easy.lemonade_change;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: bills = [5,5,5,10,20]
    Output: true
    Explanation:
    From the first 3 customers, we collect three $5 bills in order.
    From the fourth customer, we collect a $10 bill and give back a $5.
    From the fifth customer, we give a $10 bill and a $5 bill.
    Since all customers got correct change, we output true.
    Example 2:
    Input: bills = [5,5,10,10,20]
    Output: false
    Explanation:
    From the first two customers in order, we collect two $5 bills.
    For the next two customers in order, we collect a $10 bill and give back a $5 bill.
    For the last customer, we can not give the change of $15 back because we only have two $10 bills.
    Since not every customer received the correct change, the answer is false.
      Constraints:
    1 <= bills.length <= 105
    bills[i] is either 5, 10, or 20.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] bills = new int[]{5, 5, 5, 10, 20};
        boolean expected = true;
        var result = solution.lemonadeChange(bills);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] bills = new int[]{5, 5, 10, 10, 20};
        boolean expected = false;
        var result = solution.lemonadeChange(bills);
        assertThat(result).isEqualTo(expected);
    }

}
