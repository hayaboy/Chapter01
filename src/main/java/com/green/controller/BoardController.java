package com.green.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	
	public BoardController() {
			System.out.println("BoardController 생성");
	}
	
	
	 @GetMapping("/hi")
	    public String ex1(String name){
	      return "hi2 " + name;
	    }

}
