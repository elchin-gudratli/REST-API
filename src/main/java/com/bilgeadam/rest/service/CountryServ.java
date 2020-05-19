package com.bilgeadam.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bilgeadam.rest.component.Country;
import com.bilgeadam.rest.repository.CountryDao;

@Service ("countryService")
public class CountryServ {

	@Autowired
	CountryDao countrydao;
	
	@Transactional
	public List<Country> getAllCountries()
	{
		return countrydao.getAllCountries();
	}
	
	@Transactional
	public Country getCountryByID (int id)
	{
		return countrydao.getCountryById(id);
	}
	
	@Transactional
	public Country addCountry (Country country)	
	{
		return countrydao.addCountry(country);

	}
	
	@Transactional
	public void updateCountry (Country country)	
	{
		 countrydao.updateCountry(country);
	}
	
	@Transactional
	public void deleteCountry (int id)	
	{
		countrydao.deleteCountry(id);
	}
	
	
}