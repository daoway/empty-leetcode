package com.blogspot.ostas.leetcode.all.medium.design_authentication_manager;

/*
      1797. design authentication manager

https://leetcode.com/problems/design-authentication-manager

There is an authentication system that works with authentication tokens. For each session, the user will receive a new authentication token that will expire timeToLive seconds after the currentTime. If the token is renewed, the expiry time will be extended to expire timeToLive seconds after the (potentially different) currentTime.
Implement the AuthenticationManager class:
AuthenticationManager(int timeToLive) constructs the AuthenticationManager and sets the timeToLive.
generate(string tokenId, int currentTime) generates a new token with the given tokenId at the given currentTime in seconds.
renew(string tokenId, int currentTime) renews the unexpired token with the given tokenId at the given currentTime in seconds. If there are no unexpired tokens with the given tokenId, the request is ignored, and nothing happens.
countUnexpiredTokens(int currentTime) returns the number of unexpired tokens at the given currentTime.
Note that if a token expires at time t, and another action happens on time t (renew or countUnexpiredTokens), the expiration takes place before the other actions.

*/
class AuthenticationManager {
  public AuthenticationManager(int timeToLive) {
  }

  public void generate(String tokenId, int currentTime) {
  }

  public void renew(String tokenId, int currentTime) {
  }

  public int countUnexpiredTokens(int currentTime) {
    return 0;
  }
}