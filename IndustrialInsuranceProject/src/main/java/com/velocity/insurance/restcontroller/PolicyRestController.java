package com.velocity.insurance.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.util.MessageUtil;

@RestController
public class PolicyRestController {

	@GetMapping("/getMessage")
	public String getMessage() {
		return MessageUtil.upperCaseMessage("Hello, " + "\n" + "01st August 2026 Java Full Stack Development Batch");
	}
	
}
