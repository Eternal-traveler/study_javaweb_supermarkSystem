package com.haoyang.dao.role;

import com.haoyang.pojo.Role;

import java.sql.Connection;
import java.util.List;

public interface RoleDao {
    //获取角色表
    public List<Role> getRoleList(Connection connection) throws Exception;
}
