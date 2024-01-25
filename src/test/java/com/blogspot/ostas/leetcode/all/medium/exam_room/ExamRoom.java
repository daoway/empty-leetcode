package com.blogspot.ostas.leetcode.all.medium.exam_room;

/*
      855. exam room

https://leetcode.com/problems/exam-room

There is an exam room with n seats in a single row labeled from 0 to n - 1.
When a student enters the room, they must sit in the seat that maximizes the distance to the closest person. If there are multiple such seats, they sit in the seat with the lowest number. If no one is in the room, then the student sits at seat number 0.
Design a class that simulates the mentioned exam room.
Implement the ExamRoom class:
ExamRoom(int n) Initializes the object of the exam room with the number of the seats n.
int seat() Returns the label of the seat at which the next student will set.
void leave(int p) Indicates that the student sitting at seat p will leave the room. It is guaranteed that there will be a student sitting at seat p.

*/
class ExamRoom {
  public ExamRoom(int n) {
  }

  public int seat() {
    return 0;
  }

  public void leave(int p) {
  }
}