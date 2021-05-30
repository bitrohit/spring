package com.Tollgate.Rohit.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tollgate.Rohit.model.Token;
import com.Tollgate.Rohit.repository.InfoRepo;

@Service
public class RohitService {
	
	@Autowired
	private InfoRepo infoRepo;
	
	Date now = new Date();
    String pattern = "yyyy-MM-dd HH:mm:ss";
    SimpleDateFormat formatter = new SimpleDateFormat(pattern);
    String mysqlDateString = formatter.format(now);
	
	public String printToken(Token token){
		
		Date now = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String mysqlDateString = formatter.format(now);
        token.setDateTime(mysqlDateString);
		System.out.println("Here in service class");
		infoRepo.save(token);
		
		return "Journey: "+token.getTokenType()+"Vehicle no. "+token.getVehicleNo()+"Timestamp: "+ mysqlDateString;
		
	}
	
	public String checkToken(Token token){
		return "";
	}

}
