package com.example.demo.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Logge {
	Logger log=LoggerFactory.getLogger(Controller.class);
	@RequestMapping("/log")
	public String demo()
	{
		log.info("Information Message");
		log.warn("Warning Message");
		log.error("Error Message");
		log.debug("Debug Message");
		log.trace("Trace Message");
		return "Completed";
		
	}

}
