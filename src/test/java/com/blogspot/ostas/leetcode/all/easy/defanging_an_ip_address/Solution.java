package com.blogspot.ostas.leetcode.all.easy.defanging_an_ip_address;

/*
      1108. defanging an ip address

https://leetcode.com/problems/defanging-an-ip-address

Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

*/
public class Solution {
  public String defangIPaddr(String address) {
    final StringBuilder sb = new StringBuilder();
    for (final char c : address.toCharArray()) {
      if (c == '.') {
        sb.append("[.]");
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
  public String defangIPaddrX(String address) {
    return address.replaceAll("\\.", "[.]");
  }

}
