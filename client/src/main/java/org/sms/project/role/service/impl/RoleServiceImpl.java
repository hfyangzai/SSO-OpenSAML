package org.sms.project.role.service.impl;

import java.util.Date;
import java.util.List;
import org.sms.project.page.Page;
import org.sms.project.role.dao.RoleDao;
import org.sms.project.role.entity.Role;
import org.sms.project.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sunny
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    public static final String TABLE_NAME = "SEQUENCE_ROLE";

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> getRole(String query, String order, int startIndex, int size) {
        return null;
    }

    @Override
    public int insert(Role role) {
        role.setCreateDate(new Date());
        return roleDao.insert(role);
    }

    @Override
    public int update(Role role) {
        return roleDao.update(role);
    }

    @Override
    public int delete(long id) {
        return roleDao.delete(id);
    }

    @Override
    public Role findById(long id) {
        return roleDao.findById(id);
    }

    @Override
    public List<String> getRoleNameByEmail(long id) {
        return null;
    }

    @Override
    public List<Role> queryByCondition(String query, String order, Page page) {
        return roleDao.queryByCondition(query, order, page);
    }

    @Override
    public List<Role> queryByCondition(Page page) {
        return this.queryByCondition(null, null, page);
    }

    @Override
    public int getCount() {
        return roleDao.getCount();
    }
}