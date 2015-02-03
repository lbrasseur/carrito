package com.globant.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item_Categories {

	@Id
	@GeneratedValue
	@OneToOne(cascade = CascadeType.ALL)
	private int categoriesId;
	private String categoriesName;
	
	public String getCategoriesName() {
		return categoriesName;
	}
	public void setCategoriesName(String categoriesName) {
		this.categoriesName = categoriesName;
	}
}
