package in.mahesh.customer;

import org.springframework.stereotype.Controller;

public class Customer {
	private Integer cId;
	private String name;
	private String email;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(Integer cId, String name, String email) {
		super();
		this.cId = cId;
		this.name = name;
		this.email = email;
	}


	public Integer getcId() {
		return cId;
	}


	public void setcId(Integer cId) {
		this.cId = cId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
