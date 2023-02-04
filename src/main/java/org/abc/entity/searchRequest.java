package org.abc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class searchRequest {
@Id
private Integer Id;
private String[] AllPlans;
}
