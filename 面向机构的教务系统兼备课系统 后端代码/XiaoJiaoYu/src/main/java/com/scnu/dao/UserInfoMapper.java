package com.scnu.dao;

import org.apache.ibatis.annotations.Param;

import com.scnu.bean.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    int UpdatePasswordByTelephone(@Param("telephone") String telephone, @Param("password") String password);
    
    // 查询是否含有该手机号码，并且返回UserInfo
    UserInfo selectByTelephone(String telephone);
    
    // 登录验证
    UserInfo selectByUsernameOrTelephone(UserInfo userInfo);
    
    
}