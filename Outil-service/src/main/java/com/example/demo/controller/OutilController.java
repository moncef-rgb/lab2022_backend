package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Outil;
import com.example.demo.services.IOutilService;

@RestController
@CrossOrigin
public class OutilController {
	
	@Autowired
	IOutilService outilService;
	
	@RequestMapping(value="/outils",method=RequestMethod.GET)
	public List<Outil> findOutils(){
		return outilService.findAll();
	}

}
