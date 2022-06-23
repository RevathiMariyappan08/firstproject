package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Employee_service {
	@Autowired
	Employee_Dao empdao;
	public String saveDetails(Employee1 e) {
		return empdao.savedetails(e);
	}
	public Employee1 getDetails(int id) {
		return empdao.getDetails(id);
	}
	public String updateDetails(Employee1 e) {
		return empdao.updateDetails(e);
	}
	public String deleteDetails(Integer id) {
		return empdao.deleteDetails(id);
	}
	public List<Employee1>getBySal(int sal1,int sal2) {
		return empdao.getBySal(sal1,sal2);
	}

}
