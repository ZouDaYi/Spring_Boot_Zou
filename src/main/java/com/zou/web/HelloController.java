package com.zou.web;

import com.zou.bean.TestBean;
import com.zou.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringBoot web 测试
 */

@Controller
public class HelloController {

//    @Autowired
//    TestBean testBean;

    /**
     * 异常返回json
     * @return MyException自己定义的异常类
     * @throws MyException
     */
    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    /**
     * 测试Spring Security
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() throws Exception{
        return "hello";
//        throw new Exception("发生错误");
    }
    /**
     * 测试Spring Security
     * @return 首页
     * @throws Exception
     */
    @RequestMapping("/")
    public String index(ModelMap map) throws Exception{
//        throw new MyException("发生错误2");
//        map.addAttribute("host", "http://www.sxy.com");
        return "index";
    }
    /**
     * 测试Spring Security
     * @return  登录页面
     * @throws Exception
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    @RequestMapping("/second")
    public String second(ModelMap map) throws Exception{
        map.addAttribute("host", "http://www.sxy.com");
        return "second";
    }
}
