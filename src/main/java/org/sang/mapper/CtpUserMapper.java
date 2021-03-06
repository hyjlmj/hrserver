package org.sang.mapper;

import org.sang.bean.CtpUser;

public interface CtpUserMapper {

    CtpUser loadUserByUsername(String username);

    int deleteByPrimaryKey(Integer id);

    int insert(CtpUser record);

    int insertSelective(CtpUser record);

    CtpUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CtpUser record);

    int updateByPrimaryKey(CtpUser record);
}