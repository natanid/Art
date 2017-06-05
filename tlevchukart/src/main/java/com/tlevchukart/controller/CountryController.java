package com.tlevchukart.controller;

import javax.enterprise.inject.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tlevchukart.entity.Country;
import com.tlevchukart.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/country")
	public String country(Model model){
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("country", new Country());
		return "country";
	}

	@PostMapping("/country")
	public String country(@ModelAttribute Country country){

		countryService.save(country);

		return "redirect:/country";
	}
	
	@GetMapping("/deleteCountry/{id}")
	public String delete(@PathVariable int id){
		
		countryService.delete(id);
		
		return "redirect:/country";
	}}
	