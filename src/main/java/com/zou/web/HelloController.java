package com.zou.web;

import com.zou.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/12/27.
 */
//@RestController
@Controller
public class HelloController {

//    @Autowired
//    TestBean testBean;

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("host", "http://www.sxy.com");
        return "index";
    }
}
