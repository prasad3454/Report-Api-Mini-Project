package com.report.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.report.entity.EligibilityDetails;
import com.report.request.SearchRequest;
import com.report.response.SearchResponse;

public interface EligibilityDetailsRepo extends JpaRepository<EligibilityDetails, Integer>{
	
	@Query("select distinct e.planName from EligibilityDetails e")
//	@Query("select distinct(planNames) from EligibilityDetails")
	public List<String> findPlanNames();
	
	@Query("select distinct e.planStatus from EligibilityDetails e")
//	@Query("select distinct(planStatus) from EligibilityDetails")
	public List<String> findPlanStatuses();
		
}
