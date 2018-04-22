package com.controller;

import com.base.DataManager;
import com.requestOBJ.BaseRespose;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    //添加一个日志器（只能java类添加,不能控制器加载）
    private static  Logger logger = DataManager.logger;

    @RequestMapping("/index")
    public String index() {
        //返回一个index.jsp这个视图
        return "index";
    }

    @RequestMapping("/get")
    @ResponseBody
    public BaseRespose get() {
        for (int i = 0; i < 5; i++) {
            logger.info("i=" + i);
        }
        logger.debug("#####logger.debug 4546456546546#####");
        logger.error("#####logger.error 45646546546  #####");
        BaseRespose baseRespose = new BaseRespose();
        baseRespose.setCode(100);
        baseRespose.setMsg("success");
        return baseRespose;
    }
}