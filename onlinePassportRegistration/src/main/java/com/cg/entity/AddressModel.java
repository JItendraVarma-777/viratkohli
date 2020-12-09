package com.cg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="Address_table")
public class AddressModel {
  
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "address_id")
	    private long id;

	    @Column(name = "plotNo")
	    private String plotNo;

	    @Column(name = "street")
	    private String street;

	    @Column(name = "city")
	    private String city;

	    @Column(name = "districts")
	    private String districts;

	    @Column(name = "sate")
	    private String state;

	    @Column(name = "zipcode")
	    private Long zipcode;

	    @Column(name="mobileNo")
	    private Long mobileNo;

	    public String getPlotNo() {
	        return plotNo;
	    }

	    public void setPlotNo(String plotNo) {
	        this.plotNo = plotNo;
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDistricts() {
			return districts;
		}

		public void setDistricts(String districts) {
			this.districts = districts;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getZipcode() {
			return zipcode;
		}

		public void setZipcode(Long zipcode) {
			this.zipcode = zipcode;
		}

		public Long getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(Long mobileNo) {
			this.mobileNo = mobileNo;
		}
		
		
		 /**
		 * 
		 * Constructor generation
		 */
		
		
		
		
		public AddressModel(long id, String plotNo, String street, String city, String districts, String state,
				Long zipcode, Long mobileNo) {
			super();
			this.id = id;
			this.plotNo = plotNo;
			this.street = street;
			this.city = city;
			this.districts = districts;
			this.state = state;
			this.zipcode = zipcode;
			this.mobileNo = mobileNo;
		}

		public AddressModel() {
			super();
			
		}


		@Override
		public String toString() {
			return "AddressModel [id=" + id + ", plotNo=" + plotNo + ", street=" + street + ", city=" + city
					+ ", districts=" + districts + ", state=" + state + ", zipcode=" + zipcode + ", mobileNo="
					+ mobileNo + "]";
		}
	     
	    
	    
	    
}
