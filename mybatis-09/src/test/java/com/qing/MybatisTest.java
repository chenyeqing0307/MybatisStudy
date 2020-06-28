package com.qing;

import com.qing.dao.UserMapper;
import com.qing.pojo.User;
import com.qing.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisTest {
    @Test
    public void queryUserById(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        System.out.println("===============================");
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        sqlsession.close();
    }
}
