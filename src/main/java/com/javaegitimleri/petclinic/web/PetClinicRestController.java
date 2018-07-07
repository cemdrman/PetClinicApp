package com.javaegitimleri.petclinic.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaegitimleri.petclinic.exception.OwnerNotFoundException;
import com.javaegitimleri.petclinic.model.Owner;
import com.javaegitimleri.petclinic.service.PetClinicService;

@RestController
@RequestMapping("/rest")
public class PetClinicRestController {
	
	@Autowired
	private PetClinicService petService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/owners")
	public ResponseEntity<List<Owner>> getOwners(){
		List<Owner> owners = petService.findOwners();
		return ResponseEntity.ok(owners);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/owner")
	public ResponseEntity<List<Owner>> getOwners(@RequestParam("ln") String lastName){
		List<Owner> owners = petService.findOwners(lastName);
		return ResponseEntity.ok(owners);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/owner/{id}")
	public ResponseEntity<Owner> getOwners(@PathVariable("id") Long id){
		try {
			Owner owner = petService.findOwner(id);
			return ResponseEntity.ok(owner);
		} catch (OwnerNotFoundException e) {
			return ResponseEntity.notFound().build();
		}		
	}
	
}
