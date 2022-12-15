package com.mrgiovanotti.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrgiovanotti.domain.Hotel;
import com.mrgiovanotti.persistence.HotelRepository;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelRepository hotelRepository;

	@GetMapping("/list")
	public List<Hotel> getHotels() {
		return hotelRepository.findAll();
	}

}
