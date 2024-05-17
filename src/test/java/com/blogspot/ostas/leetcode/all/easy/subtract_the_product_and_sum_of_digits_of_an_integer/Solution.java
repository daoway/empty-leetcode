package com.blogspot.ostas.leetcode.all.easy.subtract_the_product_and_sum_of_digits_of_an_integer;

/*
      1281. subtract the product and sum of digits of an integer

https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer

Given an integer number n, return the difference between the product of its digits and the sum of its digits.

*/
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int num = n % 10;
            sum += num;
            product *= num;
            n /= 10;
        }
        return product - sum;
    }
}