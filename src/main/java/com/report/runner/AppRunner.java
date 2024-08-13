//package com.report.runner;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.report.entity.EligibilityDetails;
//import com.report.repository.EligibilityDetailsRepo;
//
//@Component
//public class AppRunner implements CommandLineRunner{
//	
//	@Autowired
//	private EligibilityDetailsRepo detailsRepo;
//
//	@Override
//	public void run(String... args) throws Exception {
//		
//		EligibilityDetails entity = new EligibilityDetails();
//		entity.setEligName("Jonas");
//		entity.setMobileNo(1234567L);
//		entity.setEmail("jonas@gmail.com");
//		entity.setGender('M');
//		entity.setSsn(576843L);
//		entity.setPlanName("SNAP");
//		entity.setPlanStatus("Approved");
//		
//		detailsRepo.save(entity);
//		
//		EligibilityDetails entity1 = new EligibilityDetails();
//		entity1.setEligName("Magnus");
//		entity1.setMobileNo(8765432L);
//		entity1.setEmail("magnus@gmail.com");
//		entity1.setGender('M');
//		entity1.setSsn(236548L);
//		entity1.setPlanName("CCAP");
//		entity1.setPlanStatus("Approved");
//		
//		detailsRepo.save(entity1);
//		
//		EligibilityDetails entity2 = new EligibilityDetails();
//		entity2.setEligName("Martha");
//		entity2.setMobileNo(9876543L);
//		entity2.setEmail("martha@gmail.com");
//		entity2.setGender('F');
//		entity2.setSsn(349876L);
//		entity2.setPlanName("MEDICAL");
//		entity2.setPlanStatus("Approved");
//		
//		detailsRepo.save(entity2);
//		
//	}
//
//}
