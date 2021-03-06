package com.lexueoude.web;

import com.lexueoude.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    //    @GetMapping("/{id}/{name}")做传参测试
    @GetMapping("/")
//    public String index(@PathVariable Integer id, @PathVariable String name)做传参测试
    public String index() {
//        假设代码里有问题，会跳500
//        int x = 888/0;


//       假设场景：当页面找不到的时候，new 一个新的exception出来
//        String web = null;
//        if (web == null){
//            throw new NotFoundException("您所查询的页面并不存在");
//        }

//        System.out.println("~~~~~~~~~~index~~~~~~~~~~~~")做传参测试;

        return "index";
    }

    @GetMapping("/details")
    public String details() {
        return "details";
    }

}
