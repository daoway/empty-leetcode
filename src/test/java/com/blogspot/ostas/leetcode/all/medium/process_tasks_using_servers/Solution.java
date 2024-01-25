package com.blogspot.ostas.leetcode.all.medium.process_tasks_using_servers;

/*
      1882. process tasks using servers

https://leetcode.com/problems/process-tasks-using-servers

You are given two 0-indexed integer arrays servers and tasks of lengths n and m respectively. servers[i] is the weight of the ith server, and tasks[j] is the time needed to process the jth task in seconds.
Tasks are assigned to the servers using a task queue. Initially, all servers are free, and the queue is empty.
At second j, the jth task is inserted into the queue (starting with the 0th task being inserted at second 0). As long as there are free servers and the queue is not empty, the task in the front of the queue will be assigned to a free server with the smallest weight, and in case of a tie, it is assigned to a free server with the smallest index.
If there are no free servers and the queue is not empty, we wait until a server becomes free and immediately assign the next task. If multiple servers become free at the same time, then multiple tasks from the queue will be assigned in order of insertion following the weight and index priorities above.
A server that is assigned task j at second t will be free again at second t + tasks[j].
Build an array ans of length m, where ans[j] is the index of the server the jth task will be assigned to.
Return the array ans.

*/
class Solution {
  public int[] assignTasks(int[] servers, int[] tasks) {
    return null;
  }
}