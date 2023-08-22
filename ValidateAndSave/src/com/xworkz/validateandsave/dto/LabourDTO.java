package com.xworkz.validateandsave.dto;

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
public class LabourDTO implements Serializable {
	
	private String name;
	private int age;
	private String occupation;
	private int income;

}
