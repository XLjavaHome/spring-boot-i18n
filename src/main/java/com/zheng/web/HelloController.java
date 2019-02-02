package com.zheng.web;

import com.zheng.utils.LocaleMessageSourceUtil;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenglian on 2016/10/9.
 */
@Controller
@Log4j
public class HelloController {
    @Autowired
    private LocaleMessageSourceUtil messageSourceUtil;

    @RequestMapping("/hello")
    public String hello() {
        String welcome = messageSourceUtil.getMessage("welcome");
        log.info(welcome);
        log.info("测试");
        return "hello";
    }
}
