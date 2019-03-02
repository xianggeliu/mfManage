package com.winter.Controller;

import com.winter.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ftl")
public class FreemarkerController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        Student student = new Student();
        student.setId(1);
        student.setUserName("望江");
        student.setPhone("13343438989");
        student.setPassword("432221");
        student.setBithday(new Date());
        student.setUserId(123422);
        student.setDesc("请叫我英雄!");

        map.addAttribute("student" ,student );
        return "/freemarker/index";
    }

    @RequestMapping("center")
    public String center(){
        return "/freemarker/center/center";
    }

    @RequestMapping("/freemarker")
    public String freemarker(Map<String, Object> map){
        map.put("name", "Joe");
        map.put("sex", 1);    //sex:性别，1：男；0：女；

        // 模拟数据
        List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "xbq");
        friend.put("age", 22);
        friends.add(friend);
        friend = new HashMap<String, Object>();
        friend.put("name", "July");
        friend.put("age", 18);
        friends.add(friend);
        map.put("friends", friends);
        return "freemarker";
    }

}
