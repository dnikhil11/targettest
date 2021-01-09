package com.target.test.controller;

import java.util.Random;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.test.YAMLConfig;
import com.target.test.model.RandomResponse;

/**
* spring boot v2 server with one DELETE API point exposed & return response as a random number
*
* @author  Nikhil Dubey
* @version 1.0
* @since   2021-01-08 
*/

@RestController
public class TargetAssinmentController {

	static Logger logger = Logger.getLogger(TargetAssinmentController.class.getName());

	@Autowired
	private YAMLConfig myConfig;

	@DeleteMapping(value = "/api/create_random_numbers")
	public RandomResponse createRandomNumber() {
		int lowerLimit = myConfig.getLowerLimit();
		int upperLimit = myConfig.getUpperLimit();
		int randomNumber = lowerLimit + new Random().nextInt(upperLimit);
		String status = "successfully deleted";
		RandomResponse RandomResponse = new RandomResponse(status, randomNumber);
		logger.info("<<<Response>>>>" + RandomResponse.toString());
		return RandomResponse;
	}
}

 