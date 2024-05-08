package com.blogspot.ostas.leetcode.all.easy.implement_queue_using_stacks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyQueueTest {

    @Test
    void test() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        var el1 = myQueue.peek(); // return 1
        assertThat(el1).isEqualTo(1);
        var el2 = myQueue.pop(); // return 1, queue is [2]
        assertThat(el2).isEqualTo(1);
        var empty = myQueue.empty(); // return false
        assertThat(empty).isFalse();
    }
}