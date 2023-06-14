package com.dproduction.model;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;

@Data
public class User implements Serializable {

	@Getter
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
    
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}