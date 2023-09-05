package com.sat.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/message")
public class WishMessageController {
	
	@GetMapping("/wish")
	public ResponseEntity<String> getMessage(){
		LocalDateTime time=LocalDateTime.now();
		
		String msg=null;
		int hour=time.getHour();
		if(hour<12) {
			msg="Good Morning";
		}else if(hour<16) {
			msg="Good AfterNoon";
		}else if(hour<20){
			msg="Good Night";
		}
		ResponseEntity<String> entity=new ResponseEntity<String>(msg+"  Hi Satya",HttpStatus.OK);
		return entity;
	}

}
