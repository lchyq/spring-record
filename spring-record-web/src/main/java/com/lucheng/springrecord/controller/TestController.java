package com.lucheng.springrecord.controller;
import com.lucheng.springrecord.mapper.TestMapper;
import com.lucheng.springrecord.repository.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
public class TestController {
    @Autowired
    private TestMapper testMapper;
    TransactionTemplate transactionTemplate = new TransactionTemplate();
    @RequestMapping("/ins")
    public void insert(){
        try {
            User user = new User();
            user.setId(2);
            testMapper.insert(user);
            int s = 1/ 0;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            System.out.println(calendar.toString());
        }catch (Exception e){
        }
    }
}
