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
public class MovieDTO implements Serializable {
	
	private String movieName;
	private String genre;
	private String awards;
	private int year;

}
