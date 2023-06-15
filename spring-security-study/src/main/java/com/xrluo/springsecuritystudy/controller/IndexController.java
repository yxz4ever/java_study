package com.xrluo.springsecuritystudy.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xrluo.springsecuritystudy.domain.AdminUsers;
import com.xrluo.springsecuritystudy.service.AdminUsersService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @Resource
    private AdminUsersService adminUsersService;

    @RequestMapping("/")
    public AdminUsers index(){
        QueryWrapper<AdminUsers> adminUsersQueryWrapper = new QueryWrapper<>();
        adminUsersQueryWrapper.eq("name","闫循祯");
        AdminUsers users = adminUsersService.getOne(adminUsersQueryWrapper);
        return users;
    }
}
