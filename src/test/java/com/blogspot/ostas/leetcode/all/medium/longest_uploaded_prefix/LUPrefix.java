package com.blogspot.ostas.leetcode.all.medium.longest_uploaded_prefix;

/*
      2424. longest uploaded prefix

https://leetcode.com/problems/longest-uploaded-prefix

You are given a stream of n videos, each represented by a distinct number from 1 to n that you need to "upload" to a server. You need to implement a data structure that calculates the length of the longest uploaded prefix at various points in the upload process.
We consider i to be an uploaded prefix if all videos in the range 1 to i (inclusive) have been uploaded to the server. The longest uploaded prefix is the maximum value of i that satisfies this definition.

Implement the LUPrefix class:
LUPrefix(int n) Initializes the object for a stream of n videos.
void upload(int video) Uploads video to the server.
int longest() Returns the length of the longest uploaded prefix defined above.

*/
class LUPrefix {
  public LUPrefix(int n) {
  }

  public void upload(int video) {
  }

  public int longest() {
    return 0;
  }
}