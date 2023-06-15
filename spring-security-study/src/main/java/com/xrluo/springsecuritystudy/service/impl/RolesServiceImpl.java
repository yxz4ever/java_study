package com.xrluo.springsecuritystudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xrluo.springsecuritystudy.domain.Roles;
import com.xrluo.springsecuritystudy.service.RolesService;
import com.xrluo.springsecuritystudy.mapper.RolesMapper;
import org.springframework.stereotype.Service;

/**
* @author K
* @description 针对表【roles(角色表)】的数据库操作Service实现
* @createDate 2023-06-14 14:20:02
*/
@Service
public class RolesServiceImpl extends ServiceImpl<RolesMapper, Roles>
    implements RolesService{

}




