package com.atlantong.gmall.user.controller;

import com.atlantong.gmall.user.bean.UmsMember;
import com.atlantong.gmall.user.bean.UmsMemberReceiveAddress;
import com.atlantong.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
       return "hello user" ;
    }
    @RequestMapping("getAllUser")
    @ResponseBody
    public  List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers=userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("getReceviceAddressByMemberId")
    @ResponseBody
    public  List<UmsMemberReceiveAddress> getReceviceAddressByMemberId( String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=userService.getReceviceAddressByMemberId(Long.valueOf(memberId));
        return umsMemberReceiveAddresses;
    }
}
