package com.blogspot.ostas.leetcode.all.easy.destination_city;

import java.util.List;

/*
      1436. destination city

https://leetcode.com/problems/destination-city

You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

*/

import java.util.HashMap;
import java.util.Map;

public class Solution{
  public String destCity(List<List<String>> paths) {
    final Map<String, String> fromToMap = new HashMap<>();
    for (final List<String> srsDst : paths){
      fromToMap.put(srsDst.get(0),srsDst.get(1));
    }

    for (String from : fromToMap.keySet()){
      var maybeDst = fromToMap.get(from);
      if(fromToMap.get(maybeDst) == null) return maybeDst;
    }
    return null;
  }
}