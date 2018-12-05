package com.cskaoyan.dao;

import com.cskaoyan.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

/**
 * @Auther: YangTao
 * @Date: 2018/12/5 0005
 */
public interface UserMapper {

    User findUserFromDB(@Param("mapz") HashMap<String, Object> map);


}
