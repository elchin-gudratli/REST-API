package com.bilgeadam.rest.component;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@SuppressWarnings("serial")
@Entity

@Table(name="country")
@Component
public class Country  implements Serializable{

	@Id	
	@Column(name="id")
	private int id;

	@Column(name="countryName")
	private String name;

	@Column(name="population")
	private long population;

	public Country() { }

	public Country(int id, String name, long population) {	
		this.id = id;
		this.name = name;
		this.population = population;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", population=" + population + "]";
	}
}
