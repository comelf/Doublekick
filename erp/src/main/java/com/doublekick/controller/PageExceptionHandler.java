package com.doublekick.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice(value={"com.doublekick.controller"})
public class PageExceptionHandler {
private static final Logger logger = LoggerFactory.getLogger(PageExceptionHandler.class);
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public String notFoundExceptionHandler(HttpServletRequest req,Exception e, Model model) {
		logging(req.getRequestURI(), e);
		model.addAttribute("code", 404);
		model.addAttribute("message", "Page Not Found");
		return "error";
	}
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	@ResponseStatus(value=HttpStatus.METHOD_NOT_ALLOWED)
	public String httpRequestMethodNotSupportedExceptionHandler(HttpServletRequest req,Exception e, Model model) {
		logging(req.getRequestURI(), e);
		model.addAttribute("code", 405);
		model.addAttribute("message", "METHOD NOT ALLOWED");
		return "error500";
	}

	@ExceptionHandler(BadSqlGrammarException.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public String badSqlExceptionHandler(HttpServletRequest req,Exception e, Model model) {
		logging(req.getRequestURI(), e);
		model.addAttribute("code", 500);
		model.addAttribute("message", "Bad Sql Grammar Exception");
		return "upgrading";
	}

	@ExceptionHandler(DataAccessResourceFailureException.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public String databasAccessExceptionHandler(HttpServletRequest req,Exception e, Model model) {
		logging(req.getRequestURI(), e);
		model.addAttribute("code", 500);
		model.addAttribute("message", "Data Access Resource Failure Exception");
		return "upgrading";
	}

	@ExceptionHandler({ SQLException.class, DataAccessException.class })
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public String databaseError(HttpServletRequest req,Exception e, Model model) {
		logging(req.getRequestURI(), e);
		model.addAttribute("code", 500);
		model.addAttribute("message", "SQL Exception");
		return "upgrading";
	}

	@ExceptionHandler({ Exception.class})
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public String error(HttpServletRequest req,Exception e, Model model) {
		logging(req.getRequestURI(), e);
		
		model.addAttribute("code", 500);
		model.addAttribute("message", "Exception");
		return "upgrading";
	}
	
	@ExceptionHandler({ ResourceAccessException.class})
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public String eurekaClientException(HttpServletRequest req, ResourceAccessException e, Model model) {
		logging(req.getRequestURI(), e);
		logger.error("Eureka error  : {}, {}", req.getPathInfo(), e.getMessage());
		model.addAttribute("code", 500);
		model.addAttribute("message", "Exception");
		return "upgrading";
	}

	private void logging(String requst, Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		logger.error("Exception : {}, {}", requst, e.toString()+" "+sw.toString());
	}
}
