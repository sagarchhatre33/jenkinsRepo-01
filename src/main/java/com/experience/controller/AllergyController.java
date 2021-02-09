package com.experience.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.experience.model.Allergy;
import com.experience.service.AllergyService;

@RestController
@RequestMapping("/allergy")
public class AllergyController {

	// extra variables for implementation of the sonarQube
	int a = 100;
	int c = a++;
	
	@Autowired
	private AllergyService allergyservice;
		
	@RequestMapping(value = "/save", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<Allergy> createAllergy(@RequestBody Allergy allergy) {
		
		Allergy createdAllergy = allergyservice.saveAllergy(allergy);
		return ResponseEntity.ok().body(createdAllergy);
	}
	
	@RequestMapping(value = "/getAll", produces = "application/json", method = RequestMethod.GET)
	public Iterable<Allergy> getAllergies(){
		
		return allergyservice.getAllAllergy();
	}
	
	@RequestMapping(value = "/get/{id}", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<Allergy> getAllergyById(@PathVariable Integer id){
		
		// adding a variable to test it in the sonarQube
		//int p = 1000;
		
		Allergy allergy = allergyservice.getAllergyById(id);
		return ResponseEntity.ok().body(allergy);
	}
}
