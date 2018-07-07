package com.javaegitimleri.petclinic.model;

import java.util.Date;

public class Pet {
	private Long id;
	private String neame;
	private Date birthDate;
	private Owner owner;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNeame() {
		return neame;
	}
	public void setNeame(String neame) {
		this.neame = neame;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", neame=" + neame + ", birthDate=" + birthDate + ", owner=" + owner + "]";
	}
	

}
