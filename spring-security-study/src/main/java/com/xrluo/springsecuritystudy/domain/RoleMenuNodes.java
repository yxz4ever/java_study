package com.xrluo.springsecuritystudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import lombok.Data;

/**
 * 角色权限关系表
 * @TableName role_menu_nodes
 */
@TableName(value ="role_menu_nodes")
@Data
public class RoleMenuNodes implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 3376022809599090984L;
    /**
     * 角色ID
     */
    @MppMultiId
    private Integer roleId;

    /**
     * 权限ID
     */
    @MppMultiId
    private Integer nodeId;



    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RoleMenuNodes other = (RoleMenuNodes) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getNodeId() == null ? other.getNodeId() == null : this.getNodeId().equals(other.getNodeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", nodeId=").append(nodeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}