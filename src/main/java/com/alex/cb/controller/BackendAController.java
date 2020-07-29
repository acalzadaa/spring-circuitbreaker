package com.alex.cb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.cb.service.Service;

@RestController
@RequestMapping(value = "/backendA")
public class BackendAController {

	@Autowired
	Service businessAService;

	@GetMapping("failure")
	public String failure() {
		return businessAService.failure();
	}

	@GetMapping("success")
	public String success() {
		return businessAService.success();
	}

	@GetMapping("successException")
	public String successException() {
		return businessAService.successException();
	}

	@GetMapping("ignore")
	public String ignore() {
		return businessAService.ignoreException();
	}

	@GetMapping("fallback")
	public String failureWithFallback() {
		return businessAService.failureWithFallback();
	}
}
