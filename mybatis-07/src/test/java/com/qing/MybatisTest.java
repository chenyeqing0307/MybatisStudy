package com.qing;

import com.qing.dao.TeacherMapper;
import com.qing.pojo.Teacher;
import com.qing.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    @Test
    public void getTeacher(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        TeacherMapper mapper = sqlsession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlsession.close();
    }
}
