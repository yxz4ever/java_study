package com.xrluo.springsecuritystudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xrluo.springsecuritystudy.domain.MenuNodes;
import com.xrluo.springsecuritystudy.service.MenuNodesService;
import com.xrluo.springsecuritystudy.mapper.MenuNodesMapper;
import org.springframework.stereotype.Service;

/**
* @author K
* @description 针对表【menu_nodes(菜单节点表)】的数据库操作Service实现
* @createDate 2023-06-14 14:20:02
*/
@Service
public class MenuNodesServiceImpl extends ServiceImpl<MenuNodesMapper, MenuNodes>
    implements MenuNodesService{

}




