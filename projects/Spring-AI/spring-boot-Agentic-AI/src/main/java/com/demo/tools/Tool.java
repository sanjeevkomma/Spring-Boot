package com.demo.tools;

public interface Tool {
    String name();
    String description();
    String execute(String input);
}