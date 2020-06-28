package com.qing;

import com.qing.dao.StudentMapper;
import com.qing.dao.TeacherMapper;
import com.qing.pojo.Student;
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
        List<Teacher> teachers = mapper.getTeacher();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlsession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlsession.close();
    }
}
