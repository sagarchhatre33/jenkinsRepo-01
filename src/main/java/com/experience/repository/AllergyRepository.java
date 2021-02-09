package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experience.model.Allergy;

@Repository
public interface AllergyRepository extends CrudRepository<Allergy, Serializable>{

	//reference of this interface is used in the ServiceImplClass to invoke the inbuild methods of crudRepository
}
