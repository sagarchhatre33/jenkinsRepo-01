package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.Allergy;
import com.experience.repository.AllergyRepository;
import com.experience.service.AllergyService;

@Service
public class AllergyServiceImpl implements AllergyService{
	
	@Autowired
	private AllergyRepository repo;

	@Override
	public Allergy saveAllergy(Allergy allergy) {
		return repo.save(allergy);
	}
	
	@Override
	public Iterable<Allergy> getAllAllergy() {
		return repo.findAll();
	}

	@Override
	public Allergy getAllergyById(Integer Id) {
		return repo.findOne(Id);
	}

	@Override
	public void deleteAllergy(Integer id) {
		repo.delete(id);
	}
	
	// writting a method to anayse the code in sonarQube
		public void m1() {
			
	/*
			 double x = 0.25;
		 
			 if("java"!=null && !"".equals("java")){
			 System.out.println("method m1 executed");
	*/
			System.out.println("method m1 executed");
			}

}
