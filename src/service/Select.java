package service;

import java.util.List;

import dao.BackDao;
import entity.Student;

public class Select {
	//����һ��Dao��Ķ���
	BackDao d = new BackDao();
	
	public List<Student> all() {
		return d.all();
	}
}
