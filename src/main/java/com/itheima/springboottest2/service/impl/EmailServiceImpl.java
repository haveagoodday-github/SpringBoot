package com.itheima.springboottest2.service.impl;

import com.itheima.springboottest2.pojo.EmailProperties;
import com.itheima.springboottest2.service.EmailService;
import com.itheima.springboottest2.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    // 注入email配置信息实体类
    @Autowired
    private EmailProperties emailProperties;


    @Override
    public boolean send(String to, String title, String content) {
        System.out.println(emailProperties);
        // 发送邮件
        boolean flag = MailUtil.sendMail(emailProperties, to, title, content);
        return flag;
    }
}
