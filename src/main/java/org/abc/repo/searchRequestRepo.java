package org.abc.repo;

import java.io.Serializable;

import org.abc.entity.searchRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface searchRequestRepo extends JpaRepository<searchRequest, Serializable> {
	
	@Query("select s.AllPlans from searchRequest s")
	public String[] getAllPlan();

}
