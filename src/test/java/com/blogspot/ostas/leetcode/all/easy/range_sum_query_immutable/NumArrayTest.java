package com.blogspot.ostas.leetcode.all.easy.range_sum_query_immutable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class NumArrayTest {

    @Test
    void sumRange() {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        var x1 = numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
        assertThat(x1).isEqualTo(1);
        var x2 = numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
        assertThat(x2).isEqualTo(-1);
        var x3 = numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
        assertThat(x3).isEqualTo(-3);
    }
}