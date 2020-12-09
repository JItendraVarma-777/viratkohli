package com.cg.entity;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



 
  @Entity
  @Table(name="USER_REGISTRATION_table")
  public class PassportRegistrationModel
 {

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @Column(name = "firstName")
	    private String firstName;

	    @Column(name = "lastName")
	    private String lastName;

	   @Column(name = "DateofBirth")
	    private String dateOfBirth;

	    @Column(name = "gender")
	    private String gender;

	    @Column(name="email")
	    private String email;

	    @Column(name = "qualification1")
	    private String qualification1;

	    @Column(name = "qualification2")
	    private String qualification2;

	    @Column(name = "qualification3")
	    private String qualification3;
	    /**
		 * creating one to one relation with login
		 */
	    @OneToOne(cascade= CascadeType.ALL)
	    private LoginModel login;
	    /**
	  		 * creating many to one relation with address
	  		 */
	    @ManyToOne(cascade = CascadeType.ALL)
	    private AddressModel address;
	    
	    /**
		 * 
		 * Constructor generation
		 */
	       public PassportRegistrationModel() {
			super();
			
	    	}

		
		public PassportRegistrationModel(Long id, String firstName, String lastName, String dateOfBirth, String gender,
				String email, String qualification1, String qualification2, String qualification3, LoginModel login,
				AddressModel address) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.gender = gender;
			this.email = email;
			this.qualification1 = qualification1;
			this.qualification2 = qualification2;
			this.qualification3 = qualification3;
			this.login = login;
			this.address = address;
		}

		public PassportRegistrationModel(Long id, String firstName, String lastName, String dateOfBirth,
					String gender, String email, String qualification1, String qualification2, String qualification3) {
				super();
				this.id = id;
				this.firstName = firstName;
				this.lastName = lastName;
				this.dateOfBirth = dateOfBirth;
				this.gender = gender;
				this.email = email;
				this.qualification1 = qualification1;
				this.qualification2 = qualification2;
				this.qualification3 = qualification3;
			}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public AddressModel getAddress() {
			return address;
		}

		public void setAddress(AddressModel address) {
			this.address = address;
		}

		public LoginModel getLogin() {
			return login;
		}

		public void setLogin(LoginModel login) {
			this.login = login;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getDateofBirthday() {
			return dateOfBirth;
	}

		public void setDateofBirthday(String dateofBirthday) {
			dateOfBirth = dateofBirthday;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getQualification1() {
			return qualification1;
		}

		public void setQualification1(String qualification1) {
			this.qualification1 = qualification1;
		}

		public String getQualification2() {
			return qualification2;
		}

		public void setQualification2(String qualification2) {
			this.qualification2 = qualification2;
		}

		public String getQualification3() {
			return qualification3;
		}

		public void setQualification3(String qualification3) {
			this.qualification3 = qualification3;
		}

		/**
		 * creating getters and setters for above properties
		 */
		
		/**
		 * generating to sting method
		 */
		@Override
		public String toString() {
			return "PassportRegistrationModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", DateofBirthday=" +", gender=" + gender + ", email=" + email
					+ ", qualification1=" + qualification1 + ", qualification2=" + qualification2 + ", qualification3="
					+ qualification3 + "]";
		}
		
}
