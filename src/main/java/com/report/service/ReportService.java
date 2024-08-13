package com.report.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.report.request.SearchRequest;
import com.report.response.SearchResponse;

public interface ReportService {
	
	public List<String> getUniquePlanNames();
	public List<String> getUniquePlanStatuses();
	public List<SearchResponse> searchReport(SearchRequest request);
	public void generateExcel(HttpServletResponse response) throws Exception;
	public void generatePdf(HttpServletResponse response) throws Exception;
}
