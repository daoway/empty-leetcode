package com.blogspot.ostas.leetcode.all.easy.implement_stack_using_queues;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MyStackTest {
    @Test
    void test0(){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        var t0 = myStack.top(); // return 2
        assertThat(t0).isEqualTo(2);
        var t1 = myStack.pop(); // return 2
        assertThat(t1).isEqualTo(2);
        myStack.empty(); // return False
        assertThat(myStack.empty()).isEqualTo(false);
    }
}