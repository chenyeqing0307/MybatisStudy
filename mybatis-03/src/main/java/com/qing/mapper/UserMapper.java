package com.qing.mapper;

import com.qing.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User getUserById(@Param("uid") int id);


}
