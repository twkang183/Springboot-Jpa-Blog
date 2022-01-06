package me.eric.hello;

import javax.persistence.Entity;


import lombok.Data;


@Data
public class HelloUserVO {
	
	private String id;
	private String name;
	private String passwd;

}
