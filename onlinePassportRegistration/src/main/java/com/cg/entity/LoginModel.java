package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_table")
public class LoginModel {


	

	
        public LoginModel(long id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "log_id") 
	    private long id;	 
	   
	    @Column(name = "email" ,nullable = false)
	    private String email;

	    @Column(name = "password")
	    private String password;
	    
	    

		
		  public long getId() 
		  { 
			  return id;
		  }
  	     public void setId(long id) 
  	     { 
  		  this.id = id;
}		 

		public LoginModel() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "LoginModel [ email=" + email + ", password=" + password + "]";
		}

		
	    

}
