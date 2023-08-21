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
public class CeoDTO implements Serializable {
	
	private String name;
	private String companyName;
	private double salary;
	private int exp;

}
