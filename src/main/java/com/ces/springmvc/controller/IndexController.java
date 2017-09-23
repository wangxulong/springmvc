package com.ces.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wxl on 2017/9/23.
 *
 * @author wxl
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public String hello(){
        return "index";
    }
}
