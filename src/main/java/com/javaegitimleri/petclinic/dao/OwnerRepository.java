package com.javaegitimleri.petclinic.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.javaegitimleri.petclinic.model.*;

public interface OwnerRepository {

	List<Owner> findAll();
	Owner findById(Long id);
	List<Owner> findByLastName(String lastName);
	void create(Owner owner);
	Owner update(Owner owner);
	void delete(Long id);
	
}
