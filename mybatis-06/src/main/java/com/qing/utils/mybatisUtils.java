package com.qing.utils;

import org.apache.ibatis.io.*;
import org.apache.ibatis.session.*;
import java.io.*;

public class mybatisUtils {
    private static SqlSessionFactory sqlSessionFactory ;

    static{
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory  = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }
}
