package com.zou.web;

import com.zou.bean.TestBean;
import com.zou.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/12/27.
 */
//@RestController
@Controller
public class HelloController {

//    @Autowired
//    TestBean testBean;

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() throws Exception{
//        return "Hello World";
        throw new Exception("发生错误");
    }

    @RequestMapping("/")
    public String index(ModelMap map) throws Exception{
        throw new MyException("发生错误2");
//        map.addAttribute("host", "http://blog.didispace.com");
//        return "index";
    }
}
