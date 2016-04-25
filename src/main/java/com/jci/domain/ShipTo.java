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
@Table(name = "SHIP_TO")
public class ShipTo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@JsonBackReference
	//bi_directional one_to_one association to po
	@OneToOne(fetch=FetchType.EAGER, mappedBy="shipTo")
	private PO po;
		
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MOD_TIME")
	private Date updated; 
	  
	@PreUpdate
	protected void onUpdate() {
	    updated = new Date();
	}
	
	@Column(name = "drop_ship_no" ,length = 10)
	private int dropShipNo;		
	
	@Column(name = "drop_seq" ,length = 10)
	private int dropSeq		;
	
	@Column(name = "name" ,length = 50)
	private String name		;
	
	@Column(name = "address_1" ,length = 50)
	private String address1	;	
	
	@Column(name = "address_2" ,length = 50)
	private String address2	;	
	
	@Column(name = "city" ,length = 30)
	private String city		;
	
	@Column(name = "state" ,length = 4)
	private String state	;	
	
	@Column(name = "zip" ,length = 20)
	private String zip		;
	
	@Column(name = "county" ,length = 30)
	private String county	;	
	
	@Column(name = "country" ,length = 30)
	private String country	;	
	
	@Column(name = "contact" ,length = 30)
	private String contact	;	
	
	@Column(name = "phone" ,length = 24)
	private String phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDropShipNo() {
		return dropShipNo;
	}

	public void setDropShipNo(int dropShipNo) {
		this.dropShipNo = dropShipNo;
	}

	public int getDropSeq() {
		return dropSeq;
	}

	public void setDropSeq(int dropSeq) {
		this.dropSeq = dropSeq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}		

	

}
