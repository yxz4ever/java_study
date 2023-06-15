package com.xrluo.springsecuritystudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xrluo.springsecuritystudy.domain.AdminUsers;
import com.xrluo.springsecuritystudy.service.AdminUsersService;
import com.xrluo.springsecuritystudy.mapper.AdminUsersMapper;
import org.springframework.stereotype.Service;

/**
* @author K
* @description 针对表【admin_users(后台管理员表)】的数据库操作Service实现
* @createDate 2023-06-14 14:20:02
*/
@Service
public class AdminUsersServiceImpl extends ServiceImpl<AdminUsersMapper, AdminUsers>
    implements AdminUsersService{

}




