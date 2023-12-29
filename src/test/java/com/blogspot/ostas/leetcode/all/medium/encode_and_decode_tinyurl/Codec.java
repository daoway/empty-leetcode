package com.blogspot.ostas.leetcode.all.medium.encode_and_decode_tinyurl;

/*
      535. encode and decode tinyurl

https://leetcode.com/problems/encode-and-decode-tinyurl

Note: This is a companion problem to the System Design problem: Design TinyURL.
TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.
There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
Implement the Solution class:
Solution() Initializes the object of the system.
String encode(String longUrl) Returns a tiny URL for the given longUrl.
String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.

*/
import java.util.HashMap;
import java.util.Map;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Codec {
  private static final Map<String, String> map = new HashMap<>();
  private static final MessageDigest md;
  static {
    try {
      md = MessageDigest.getInstance("MD5");
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  public String encode(String originalURL) {
    final byte[] hashBytes = md.digest(originalURL.getBytes());
    final String shortURL = bytesToHex(hashBytes).substring(0, 8).toLowerCase(); // Using the first 8 characters as the short URL
    map.put(shortURL, originalURL);
    return shortURL;
  }

  public String decode(String shortURL) {
    return map.get(shortURL.toLowerCase());
  }

  private String bytesToHex(byte[] bytes) {
    final StringBuilder result = new StringBuilder();
    for (final byte b : bytes) {
      result.append(String.format("%02X", b));
    }
    return result.toString();
  }

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));