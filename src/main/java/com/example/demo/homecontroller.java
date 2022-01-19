package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homecontroller {

	
	public static Logger logger = LoggerFactory.getLogger(homecontroller.class);
	
	@Test
	public void hello1()
	{
		
		logger.info("welcome");
		assertEquals(true,true);
	}
	@ResponseBody
	@RequestMapping("/index")
	public String hello()
	{
		return "hello docker";
	}
	
}
