package com.xrluo.springsecuritystudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xrluo.springsecuritystudy.domain.RoleMenuNodes;
import com.xrluo.springsecuritystudy.service.RoleMenuNodesService;
import com.xrluo.springsecuritystudy.mapper.RoleMenuNodesMapper;
import org.springframework.stereotype.Service;

/**
* @author K
* @description 针对表【role_menu_nodes(角色权限关系表)】的数据库操作Service实现
* @createDate 2023-06-14 14:20:02
*/
@Service
public class RoleMenuNodesServiceImpl extends ServiceImpl<RoleMenuNodesMapper, RoleMenuNodes>
    implements RoleMenuNodesService{

}




