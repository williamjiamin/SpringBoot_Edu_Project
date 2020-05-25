package com.lexueoude.web;

import com.lexueoude.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
//        假设代码里有问题，会跳500
//        int x = 888/0;


//       假设场景：当页面找不到的时候，new 一个新的exception出来
        String web = null;
        if (web == null){
            throw new NotFoundException("您所查询的页面并不存在");
        }
        return "index";
    }

}
