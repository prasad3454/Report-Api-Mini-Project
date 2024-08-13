package com.report.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ELIGIBILITY_DETAILS")
public class EligibilityDetails {
	
	@Id
	@GeneratedValue
	@Column(name = "ELIG_ID")
	private Integer eligId;
	
	@Column(name = "ELIG_NAME")
	private String eligName;
	
	@Column(name = "MOBILE_NO")
	private Long mobileNo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "GENDER")
	private Character gender;
	
	@Column(name = "SSN")
	private Long ssn;
	
	@Column(name = "PLAN_NAME")
	private String planName;
	
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	
	@Column(name = "PLAN_START_DATE")
	private LocalDate planStartDate;
	
	@Column(name = "PLAN_END_DATE")
	private LocalDate planEndDate;
	
	@Column(name = "CREATE_DATE")
	private LocalDate createDate;
	
	@Column(name = "UPDATE_DATE")
	private LocalDate updateDate;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
}
