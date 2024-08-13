package com.report.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.report.request.SearchRequest;
import com.report.response.SearchResponse;
import com.report.service.ReportServiceImpl;

@RestController
public class ReportRestController {
	
	@Autowired
	private ReportServiceImpl serviceImpl;
	
	@GetMapping("/plans")
	public ResponseEntity<List<String>> getUniquePlanName() {
		List<String> planNames = serviceImpl.getUniquePlanNames();
		return new ResponseEntity<>(planNames, HttpStatus.OK);
	}
	
	@GetMapping("/statuses")
	public ResponseEntity<List<String>> getUniquePlanStatus() {
		List<String> statuses = serviceImpl.getUniquePlanStatuses();
		return new ResponseEntity<>(statuses, HttpStatus.OK);
	}
	
	@PostMapping("/search")
	public ResponseEntity<List<SearchResponse>> searchReport(@RequestBody SearchRequest request) {
		List<SearchResponse> search = serviceImpl.searchReport(request);
		return new ResponseEntity<>(search, HttpStatus.OK);
	}
	
	@GetMapping("/excel")
	public void excelReport(HttpServletResponse response) throws Exception {
		response.setContentType("application/octet-stream");
		
		String headerKey = "Content-Disposition";
		String headerName = "attachment;filename=data.xls";
		
		response.setHeader(headerKey, headerName);
		
		serviceImpl.generateExcel(response);
	}
	
	@GetMapping("/pdf")
	public void pdfReport(HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");
		
		String headerKey = "Content-Disposition";
		String headerName = "attachment;filename=data.pdf";
		
		response.setHeader(headerKey, headerName);
		
		serviceImpl.generatePdf(response);
	}
}
