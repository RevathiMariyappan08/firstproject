package com.example.demo;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class Employee_Controller {

	@Autowired
	Employee_service empser;
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping(value="/student")
	public String getStudentList() {
		HttpHeaders headers=new HttpHeaders();
		HttpEntity<String>entity = new HttpEntity<String>(headers);
		return restTemplate.exchange(
			"http://localhost:8081/show1", HttpMethod.GET,entity,String.class).getBody();
			
		}
		@RequestMapping(value="/studentbyid/{id}")
		public String getStudentbyid(@PathVariable int id) {
			HttpHeaders headers=new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<String>entity=new HttpEntity<String>(headers);
			return restTemplate.exchange("http://localhost:8081/show/"+id,HttpMethod.GET,entity,String.class).getBody();
		}
	
	
	
	
	@PostMapping(value="/add")
	public String saveDetails(@RequestBody Employee1 e) {
		return empser.saveDetails(e);
	}
	@GetMapping(value="/show/{id}")
	public Employee1 getDetails(@PathVariable int id) {
		return empser.getDetails(id);
	}
	@PutMapping(value="/update")
	public String updateDetails(@RequestBody Employee1 e) {
		return empser.updateDetails(e);
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteDetails(@PathVariable Integer id) {
		return empser.deleteDetails(id);
	}
	@GetMapping(value="/getviasal/{sal1}/{sal2}")
	public List<Employee1>getBySal (@PathVariable int sal1,@PathVariable int sal2) {
		return empser.getBySal(sal1,sal2);
	}
	
	

}
