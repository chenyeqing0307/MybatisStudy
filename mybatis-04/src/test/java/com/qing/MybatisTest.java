package com.qing;

import com.qing.mapper.UserMapper;
import com.qing.pojo.User;
import com.qing.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    static Logger logger = Logger.getLogger(MybatisTest.class);
    @Test
    public void SelectUserAll(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUserAll();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testLogger(){
        logger.info("info:进入debug模式");
        logger.debug("debug:进入debug模式");
        logger.error("error:进入debug模式");
    }

}
