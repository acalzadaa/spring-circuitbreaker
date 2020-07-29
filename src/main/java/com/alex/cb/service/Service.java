package com.alex.cb.service;

public interface Service {

	String failureWithFallback();

	String success();

	String failure();

	String ignoreException();

	String successException();

}