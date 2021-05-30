package com.Tollgate.Rohit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tollgate.Rohit.model.Token;
import com.Tollgate.Rohit.service.RohitService;


@RestController
@RequestMapping("/myapi")
public class RohitController {
	@Autowired
	RohitService rohitService;
	
	@PostMapping(value = "/fun", consumes= MediaType.APPLICATION_JSON_VALUE)
	public String meth(@RequestBody Token token){
		return rohitService.printToken(token);
		
	}

}
