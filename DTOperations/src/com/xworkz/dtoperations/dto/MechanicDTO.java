package com.xworkz.dtoperations.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MechanicDTO implements Serializable {
	
	private String garageName;
	private int gstNumber;
	private String specialization;
	private int bikeServiceCost;


}
