/*
<<<<<<< HEAD
 Added Comments
 CopyRight @2017
  */
package com.mkyong.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "status")
public class Status {
private String message ;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
}
