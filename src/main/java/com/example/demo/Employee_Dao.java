package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class Employee_Dao {
	@Autowired
	Employee_Repo emprepo;
	public String savedetails(Employee1 e) {
		emprepo.save(e);
		return "Successful Succeed";
	}
	public Employee1 getDetails(int id) {
		return emprepo.findById(id).get();
	}
	public String updateDetails(Employee1 e) {
		emprepo.save(e).getId();
		return "data updated";
	}
	public String deleteDetails(Integer id) {
		emprepo.deleteById(id);
		return "data has been deleted";
	}
	public List<Employee1>getBySal(int sal1,int sal2) {
		return emprepo.getBySal(sal1,sal2);
	}

}
