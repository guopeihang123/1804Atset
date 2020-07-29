package com.cls.Serivce;

import java.util.List;
import java.util.Map;

import com.cls.bean.Student;
import com.cls.bean.Stuname;

public interface StuSerivce {
	public List<Student> stusel(Map<String, Object> map);
	public int del(Integer id);
	public int add(Student s);
	public List<Stuname> selc();

}
