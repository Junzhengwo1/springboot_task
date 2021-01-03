package com.kou.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;

import javax.mail.MessagingException;

/**
 * @author JIAJUN KOU
 *
 * 邮箱发送工具类
 */
public class MailUtil {


    @Autowired
    private MailSender mailSender;

    /**
     *
     * @param html 是否支持文档注释
     * @param subject
     * @throws MessagingException
     */
    public void sendMail(Boolean html,String subject)throws MessagingException {





    }

}
