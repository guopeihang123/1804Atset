package com.cls.Serivce;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cls.bean.Student;
import com.cls.bean.Stuname;
import com.cls.mapper.StuMapper;

@Service
public class StuSerivceImpl implements StuSerivce{

	@Resource
	public StuMapper stu;

	public List<Student> stusel(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return stu.stusel(map);
	}

	public int del(Integer id) {
		// TODO Auto-generated method stub
		return stu.del(id);
	}

	public int add(Student s) {
		// TODO Auto-generated method stub
		return stu.add(s);
	}

	public List<Stuname> selc() {
		// TODO Auto-generated method stub
		return stu.selc();
	}
}
