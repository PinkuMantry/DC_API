package org.abc.rest;

import org.abc.service.DataCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class dcRest {
	@Autowired
	private DataCollectionService dcs;
	
	@GetMapping("/search")
	public String searchInsurance(Integer caseNum) {
		return dcs.search(caseNum);
	}

	@GetMapping("/planName")
	public String[] plan()
	{
		return dcs.getAllPlan();
	}
}
