package org.abc.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.abc.binding.kidDetails;

import lombok.Data;

@Entity
@Data
public class DataCollection {

	@Id
	private Integer caseNum;
	
	private String planName;
	
	private Long monthSalInc;
	private Long rentInc;
	private Long propertyInc;
	
	private String highestDeg;
	private Integer garduationYear;
	private String universityName;
	
	private List<kidDetails> kids;
}
