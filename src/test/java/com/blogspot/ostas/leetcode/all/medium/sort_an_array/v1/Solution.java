package com.blogspot.ostas.leetcode.all.medium.sort_an_array.v1;

class Solution {
  static void merge(int[] array, int left, int middle, int right) {
    int[] leftTmpArray = new int[middle-left+2];
    int[] rightTmpArray = new int[right-middle+1];
    for (int i=0; i<=middle-left; i++) {
      leftTmpArray[i] = array[left+i];
    }
    for (int i=0; i<right-middle; i++) {
      rightTmpArray[i] = array[middle+1+i];
    }


    leftTmpArray[middle-left+1] = Integer.MAX_VALUE;
    rightTmpArray[right-middle] = Integer.MAX_VALUE;

    int i = 0, j = 0;
    for (int k = left; k<=right; k++) {
      if (leftTmpArray[i] < rightTmpArray[j]) {
        array[k] = leftTmpArray[i];
        i++;
      } else {
        array[k] = rightTmpArray[j];
        j++;
      }

    }

  }

  public void mergeSort(int[] array, int left, int right) {
    if (right > left) {
      int m = (left+right)/2;
      mergeSort(array, left, m);
      mergeSort(array, m+1, right);
      merge(array, left, m, right);
    }
  }

  public int[] sortArray(int[] nums) {
    mergeSort(nums,0,nums.length-1);
    return nums;
  }

}