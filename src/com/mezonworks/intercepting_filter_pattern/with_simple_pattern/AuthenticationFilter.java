package com.mezonworks.intercepting_filter_pattern.with_simple_pattern;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
