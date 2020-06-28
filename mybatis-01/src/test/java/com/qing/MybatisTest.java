package com.qing;

import com.qing.mapper.UserMapper;
import com.qing.pojo.User;
import com.qing.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    @Test
    public void demo(){
        SqlSession sqlSession = mybatisUtils.getSqlSessionFactory();
//        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        List<User> users = mapper.SelectUserList();
        List<User> users = sqlSession.selectList("com.qing.dao.UserMapper.getUserList");
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void SelectUserById(){
        SqlSession sqlSession = mybatisUtils.getSqlSessionFactory();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUserList(){
        SqlSession sqlSession = mybatisUtils.getSqlSessionFactory();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> lists = mapper.getUserList("张");
        for (User list : lists) {
            System.out.println(list);
        }
        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = mybatisUtils.getSqlSessionFactory();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.addUser(new User(4, "张六", "555"));
        if(res>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = mybatisUtils.getSqlSessionFactory();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUser(new User(4,"孙七","123"));
        if (i > 0) {
            System.out.println("成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = mybatisUtils.getSqlSessionFactory();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        if (i > 0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}
