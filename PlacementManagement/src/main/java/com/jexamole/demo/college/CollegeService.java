package com.jexamole.demo.college;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CollegeService {
	@Autowired
	private CollegeRepository repo;
	
	//to retrieve all the data of college class
	public List<College> listAll() {
		return repo.findAll();
	}

	//insert/create a data
	public void create(College c) {
	   repo.save(c);
	}
	
	//to retrieve a single record
	public College retrieve(Integer collegeid) {
		return repo.findById(collegeid).get();
		
	}
	
	//to delete a data
	public void delete(Integer collegeid) {
		repo.deleteById(collegeid);
	}
}
