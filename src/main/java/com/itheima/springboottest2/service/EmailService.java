package com.itheima.springboottest2.service;

public interface EmailService {
    boolean send(String to, String title, String content);
}
