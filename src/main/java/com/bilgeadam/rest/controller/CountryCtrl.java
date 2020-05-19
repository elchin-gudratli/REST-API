package com.bilgeadam.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bilgeadam.rest.component.Country;
import com.bilgeadam.rest.service.CountryServ;

@SuppressWarnings("serial")
@RestController
public class CountryCtrl {
	
	

	@Autowired
	private CountryServ countryservice;
	
	@RequestMapping(value="/getAllCountries",method=RequestMethod.GET,
			headers="Accept=application/json")
	public List<Country> getCountries(){
		List<Country> listofCountries=countryservice.getAllCountries();
		return listofCountries;
	}

	@RequestMapping(value="/getAllCountry{id}",method=RequestMethod.GET,
			headers="Accept=application/json")
	public Country getCountryById(@PathVariable int id) {
		return countryservice.getCountryByID(id);
	}
	@RequestMapping(value="/addCountry",method=RequestMethod.POST,
			headers="Accept=application/json")
	public Country addCountry(@RequestBody Country country) {
		return countryservice.addCountry(country);
	}
	@RequestMapping(value="/updateCountry",method=RequestMethod.PUT,
			headers="Accept=application/json")
	public void updateCountry(@RequestBody Country country) {
	      countryservice.updateCountry(country);
		
	}
	@RequestMapping(value="/deleteCountry{id}",method=RequestMethod.DELETE,
			headers="Accept=application/json")
	public void deleteCountry(@PathVariable ("id") int id) {
		 countryservice.deleteCountry(id);
	}
}
