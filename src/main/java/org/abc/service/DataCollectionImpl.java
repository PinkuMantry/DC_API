package org.abc.service;


import java.util.Date;

import org.abc.entity.DataCollection;
import org.abc.repo.DataCollectionRepo;
import org.abc.repo.searchRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class DataCollectionImpl implements DataCollectionService {

	@Autowired
	private searchRequestRepo srepo;
	@Autowired
	private DataCollectionRepo dcrepo;
	public String search(Integer caseNum) {
		DataCollection dc=dcrepo.findById(caseNum).get();
		String s=dc.getPlanName();
		
		if(s.equals("SNAP"))
		{
			long income=dc.getMonthSalInc();
			if(income<=1500)
				return "Eligible";
		}
		else if(s.equals("CCAP"))
		{
			long income=dc.getMonthSalInc();
			int total_kids=dc.getKids().size();
			if(income<=1500 && total_kids>0)
				return "Eligible";
		}
		else if(s.equals("Medicaid"))
		{
			long income=dc.getMonthSalInc()+dc.getRentInc()+dc.getPropertyInc();
			if(income<=1500)
				return "Eligible";
		}
		else if(s.equals("Medicare"))
		{
			Date d=new Date();
			int year=d.getYear();
				if(year-dc.getGarduationYear()>45)
					return "Eligible";
		}
		else if(s.equals("QHP"))
		{
			return "Eligible";
		}
		else if(s.equals("RIW"))
		{
			long income=dc.getMonthSalInc();
			if(dc.getGarduationYear()!=null && income==0)
				return "Eligible";
		}
		return "Not Eligible";	
	}
	
	
	public String[] getAllPlan() {
		return srepo.getAllPlan();
	}

}
