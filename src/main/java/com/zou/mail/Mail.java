package com.zou.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/27.
 */
@Component
public class Mail {
    @Autowired
    private  JavaMailSender mailSender;
    public void sendMail(){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("2850208202@qq.com");
        message.setTo("2850208202@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }

}
