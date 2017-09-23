package com.ces.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxl on 2017/9/23.
 *
 * @author wxl
 */
@Controller
@RequestMapping(value = "anno/")
public class DemoAnnoController {
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String index(HttpServletRequest request){
        return "url:"+request.getRequestURL() +" can access";
    }
    @RequestMapping(value = "json",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map obj(HttpServletRequest request){
        Map<String,String> name = new HashMap<>();
        name.put("name","wxl");
        return name;
    }

    @RequestMapping(value = "xml",produces = "application/xml;charset=UTF-8")
    @ResponseBody
    public Map xml(HttpServletRequest request){
        Map<String,String> name = new HashMap<>();
        name.put("name","wxl");
        return name;
    }

}
