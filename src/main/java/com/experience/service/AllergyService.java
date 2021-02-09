package com.experience.service;

import com.experience.model.Allergy;

public interface AllergyService {
	
	public Allergy saveAllergy(Allergy allergy);
	public Iterable<Allergy> getAllAllergy();
	public Allergy getAllergyById(Integer Id);
	
	public void deleteAllergy(Integer id);
	
}
//all services should be  invoked in the controller --> & hence we have to autowire the AllergyService reference --
//-- in the controller class