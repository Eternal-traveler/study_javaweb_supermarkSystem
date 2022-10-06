package com.haoyang.dao.role;

import com.haoyang.dao.BaseDao;
import com.haoyang.pojo.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoleDaoImpl implements RoleDao {
    @Override
    public List<Role> getRoleList(Connection connection) throws Exception {
        PreparedStatement pstm=null;
        ResultSet rs=null;
        List<Role> roleList = new ArrayList<Role>();
        if(connection!=null){
            String sql="SELECT * FROM `smbms_role`";
            Object[] params={};
            rs = BaseDao.execute(connection, sql, params, rs, pstm);
            while(rs.next()){
                Role role = new Role();
                role.setId(rs.getInt("id"));
                role.setRoleCode(rs.getString("roleCode"));
                role.setRoleName(rs.getString("roleName"));
                roleList.add(role);
            }
        }
        BaseDao.closeResource(null,pstm,rs);
        return roleList;
        //细心细心细心
    }
//    @Test
//    public void  test(){
//        RoleServiceImpl roleService = new RoleServiceImpl();
//        List<Role> roleList=null;
//        roleList=roleService.getRoleList();
//        for (Role role : roleList) {
//            System.out.println(role.getRoleName());
//        }
//    }
}
