package com.kou.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author JIAJUN KOU
 *
 * 实现一下异步任务
 *
 */
@Service
public class AsyncService {



    //告诉spring这是一个异步的方法
    @Async
    public void Hello(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("数据正在加载中");
    }


}
