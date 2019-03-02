package com.winter.Controller;

import com.winter.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("th")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name" , "请叫我英雄!");
//        return new ModelAndView("thymeleaf/center.html" , "name","请叫 我英雄");

        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center(){
        return "thymeleaf/center";
    }

    @RequestMapping("/test")
    public String test(ModelMap map){
        Student stu = new Student();
        stu.setDesc("哇哈哈");
        return "test";
    }

}
