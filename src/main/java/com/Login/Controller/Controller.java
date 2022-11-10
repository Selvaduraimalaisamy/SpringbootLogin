package com.Login.Controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class Controller {

	@RequestMapping(value = "testlogin", method = RequestMethod.GET)

	public ResponseEntity<?> testLoginMethod(@RequestParam Map<String, String> requestparams) throws Exception {
		String username = requestparams.get("userName");
		String password = requestparams.get("userPass");
		requestparams.put(username, password);

		return new ResponseEntity<>(requestparams, HttpStatus.OK);
	}

	@RequestMapping(value = "testloginweb", method = RequestMethod.GET)

	public ResponseEntity<?> testLoginwebMethod(@RequestParam Map<String, String> requestparams) throws Exception {
		
		String name = "Selvadurai";
		String passwordold = "Selva@2d";
		if (requestparams.get("userName").equals(name) && requestparams.get("userPass").equals(passwordold)) {
			requestparams.put("WELCOME", name);
		}
		else {
			requestparams.put("username :", name);
			requestparams.put("password :", passwordold);
		}

		return new ResponseEntity<>(requestparams, HttpStatus.OK);
	}
}
