package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloSessionController {
    //我又更新了

    //写入数据到session
    @RequestMapping("set")
    public String setSession(String msg, HttpSession session){
        session.setAttribute("msg",msg);
        return "session-set-ok";
    }

    //读取session数据
    @RequestMapping("get")
    public String getSession(HttpSession session){
        String msg = (String) session.getAttribute("msg");
        return "get-session:"+msg;
    }
}
