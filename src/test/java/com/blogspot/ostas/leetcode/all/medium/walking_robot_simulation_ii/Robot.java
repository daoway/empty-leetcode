package com.blogspot.ostas.leetcode.all.medium.walking_robot_simulation_ii;

/*
      2069. walking robot simulation ii

https://leetcode.com/problems/walking-robot-simulation-ii

A width x height grid is on an XY-plane with the bottom-left cell at (0, 0) and the top-right cell at (width - 1, height - 1). The grid is aligned with the four cardinal directions ("North", "East", "South", and "West"). A robot is initially at cell (0, 0) facing direction "East".
The robot can be instructed to move for a specific number of steps. For each step, it does the following.
Attempts to move forward one cell in the direction it is facing.
If the cell the robot is moving to is out of bounds, the robot instead turns 90 degrees counterclockwise and retries the step.
After the robot finishes moving the number of steps required, it stops and awaits the next instruction.
Implement the Robot class:
Robot(int width, int height) Initializes the width x height grid with the robot at (0, 0) facing "East".
void step(int num) Instructs the robot to move forward num steps.
int[] getPos() Returns the current cell the robot is at, as an array of length 2, [x, y].
String getDir() Returns the current direction of the robot, "North", "East", "South", or "West".

*/
class Robot {
  public Robot(int width, int height) {
  }

  public void step(int num) {
  }

  public int[] getPos() {
    return null;
  }

  public String getDir() {
    return null;
  }
}