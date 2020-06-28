package com.qing.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Utils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String input = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(input);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlsession(){
        return sqlSessionFactory.openSession(true);
    }
}
