package com.blogspot.ostas.leetcode.all.medium.range_sum_query_mutable.naive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumArrayTest {

    @Test
    void sumRange() {
        NumArray numArray = new NumArray(new int[]{1, 3, 5});
        var x0 = numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
        assertThat(x0).isEqualTo(9);
        numArray.update(1, 2);   // nums = [1, 2, 5]
        var x1 = numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
        assertThat(x1).isEqualTo(8);
    }
}