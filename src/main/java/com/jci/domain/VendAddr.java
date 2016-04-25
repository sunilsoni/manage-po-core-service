package com.jci.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "VEND_ADDR")
public class VendAddr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@JsonBackReference
	//bi_directional one_to_one association to vendor
	@OneToOne(fetch=FetchType.EAGER, mappedBy="vendAddr")
	private Vendor vendor;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MOD_TIME")
	private Date updated; 
	  
	@PreUpdate
	protected void onUpdate() {
	    updated = new Date();
	}
	
	@Column(name = "vend_num" ,length = 10)
	private int vendNum		;
	
	@Column(name = "address_1" ,length = 50)
	private String address1;		
	
	@Column(name = "address_2" ,length = 50)
	private String address2;		
	
	@Column(name = "city" ,length = 30)
	private String city;		
	
	@Column(name = "country" ,length = 30)
	private String country;		
	
	@Column(name = "county" ,length = 30)
	private String county;		
	
	@Column(name = "fax_num" ,length = 24)
	private String faxNum;		
	
	@Column(name = "name" ,length = 50)
	private String name;		
	
	@Column(name = "state" ,length = 4)
	private String state;		
	
	@Column(name = "telex_num" ,length = 20)
	private String telexNum;		
	
	@Column(name = "zip" ,length = 20)
	private String zip;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getVendNum() {
		return vendNum;
	}

	public void setVendNum(int vendNum) {
		this.vendNum = vendNum;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getFaxNum() {
		return faxNum;
	}

	public void setFaxNum(String faxNum) {
		this.faxNum = faxNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTelexNum() {
		return telexNum;
	}

	public void setTelexNum(String telexNum) {
		this.telexNum = telexNum;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + vendNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VendAddr other = (VendAddr) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (vendNum != other.vendNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VendAddr [id=" + id + ", vendor=" + vendor + ", updated=" + updated + ", vendNum=" + vendNum
				+ ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", country=" + country
				+ ", county=" + county + ", faxNum=" + faxNum + ", name=" + name + ", state=" + state + ", telexNum="
				+ telexNum + ", zip=" + zip + "]";
	}	
	
	
	
}
