package com.itheima.springboottest2.controller;

import com.itheima.springboottest2.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @RequestMapping("/send")
    public Boolean send() {
        // 收件人信箱
        String to = "2736766802@qq.com";
        String title = "测试邮件标题";
        String content = "测试邮件内容";
        // 发送邮件
        boolean flag = emailService.send(to, title, content);
        return flag;
    }
}
