package com.winter.Controller;

import com.winter.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

//    @PostMapping(value = "/test")
    @GetMapping(value = "/test")
    public Object test(){
        Map<String ,Object> map = new HashMap<>();
        Student student = new Student();
        student.setId(1);
        student.setUserName("望江");
        student.setPhone("13343438989");
        student.setPassword("432221");
        student.setBithday(new Date());
        student.setUserId(123422);
        student.setDesc("请叫我英雄!");
        map.put("status" , 20220);
        map.put("student" , student);

        return map;
    }

}
