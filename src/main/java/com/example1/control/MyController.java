package com.example1.control;

import com.example1.entity.User;
import com.example1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class MyController {
    @Autowired
    private UserService service;

    /**
     * @param 查看大侠列表
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<User> select01() {
        List<User> list = service.findAll();
        return list;
    }

    /**
     * @param 添加大侠
     */

    @RequestMapping("/add")
    public String insert01(User user){
        int i = service.addChivalrous(user);
        System.out.println(i);
        return "redirect:/page/show.html";
    }
}
