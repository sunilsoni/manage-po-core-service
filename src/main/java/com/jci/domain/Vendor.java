package com.jci.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "VENDOR")
public class Vendor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@JsonManagedReference
	@OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="VENDOR_DIV_ID")
	private VendorDiv vendorDiv;
	
	@JsonManagedReference
	@OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="VENDOR_ADDR_ID")
	private VendAddr vendAddr;
	
	@JsonBackReference
	@OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL, mappedBy="vendor")
	@JoinColumn(name="PO_ID")
	private PO po;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MOD_TIME")
	private Date updated; 
	  
	@PreUpdate
	protected void onUpdate() {
	    updated = new Date();
	}
	
	@Column(name = "vend_num", nullable = false,length = 10)
	private int vendNum;		
	
	@Column(name = "curr_code" ,length = 6)
	private String currCode;	 	
	
	@Column(name = "contact" ,length = 37)
	private String contact	 ;	
	
	@Column(name = "phone" ,length = 24)
	private String phone;	 	
	
	@Column(name = "vend_type" ,length = 12)
	private String vendType;	 	
	
	@Column(name = "terms_code" ,length = 6)
	private String termsCode	; 	
	
	@Column(name = "ship_code" ,length = 6)
	private String shipCode;	 	
	
	@Column(name = "fob" ,length = 30)
	private String fob	; 	
	
	@Column(name = "print_price" ,length = 1)
	private boolean printPrice;	 

	@Column(name = "stat" ,length = 2)
	private String stat	;

	@Column(name = "key" )
	private int key;
	

	@Column(name = "last_purch	" )
	private Date lastPurch	; 

	@Column(name = "last_paid" )
	private Date lastPaid	; 

	@Column(name = "purch_ytd	" ,length = 17)
	private Float purchYtd	;

	@Column(name = "purch_lst_yr" ,length = 17)
	private Float purchLstYr;	 

	@Column(name = "disc_ytd" ,length = 17)
	private Float discYtd	 ;

	@Column(name = "disc_lst_yr" ,length = 17)
	private Float discLstYr;	 

	@Column(name = "pay_ytd" ,length = 17)
	private Float payYtd	 ;

	@Column(name = "fed_id" ,length = 26)
	private String fedId	; 

	@Column(name = "vend_remit" ,length = 10)
	private int vendRemit;	 

	@Column(name = "whse" ,length = 8)
	private String whse		;

	@Column(name = "charfld1" ,length = 40)
	private String charfld1	;	

	@Column(name = "charfld2" ,length = 40)
	private String charfld2	;	

	@Column(name = "charfld3" ,length = 40)
	private String charfld3	;	

	@Column(name = "decifld1" ,length = 17)
	private Float decifld1;		

	@Column(name = "decifld2" ,length = 17)
	private Float decifld2	;	

	@Column(name = "decifld3" ,length = 17)
	private Float decifld3	;	

	@Column(name = "logifld" )
	private boolean logifld;

	@Column(name = "datefld")
	private Date datefld;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVendNum() {
		return vendNum;
	}

	public void setVendNum(int vendNum) {
		this.vendNum = vendNum;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
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

	public String getVendType() {
		return vendType;
	}

	public void setVendType(String vendType) {
		this.vendType = vendType;
	}

	public String getTermsCode() {
		return termsCode;
	}

	public void setTermsCode(String termsCode) {
		this.termsCode = termsCode;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	public String getFob() {
		return fob;
	}

	public void setFob(String fob) {
		this.fob = fob;
	}

	public boolean isPrintPrice() {
		return printPrice;
	}

	public void setPrintPrice(boolean printPrice) {
		this.printPrice = printPrice;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Date getLastPurch() {
		return lastPurch;
	}

	public void setLastPurch(Date lastPurch) {
		this.lastPurch = lastPurch;
	}

	public Date getLastPaid() {
		return lastPaid;
	}

	public void setLastPaid(Date lastPaid) {
		this.lastPaid = lastPaid;
	}

	public Float getPurchYtd() {
		return purchYtd;
	}

	public void setPurchYtd(Float purchYtd) {
		this.purchYtd = purchYtd;
	}

	public Float getPurchLstYr() {
		return purchLstYr;
	}

	public void setPurchLstYr(Float purchLstYr) {
		this.purchLstYr = purchLstYr;
	}

	public Float getDiscYtd() {
		return discYtd;
	}

	public void setDiscYtd(Float discYtd) {
		this.discYtd = discYtd;
	}

	public Float getDiscLstYr() {
		return discLstYr;
	}

	public void setDiscLstYr(Float discLstYr) {
		this.discLstYr = discLstYr;
	}

	public Float getPayYtd() {
		return payYtd;
	}

	public void setPayYtd(Float payYtd) {
		this.payYtd = payYtd;
	}

	public String getFedId() {
		return fedId;
	}

	public void setFedId(String fedId) {
		this.fedId = fedId;
	}

	public int getVendRemit() {
		return vendRemit;
	}

	public void setVendRemit(int vendRemit) {
		this.vendRemit = vendRemit;
	}

	public String getWhse() {
		return whse;
	}

	public void setWhse(String whse) {
		this.whse = whse;
	}

	public String getCharfld1() {
		return charfld1;
	}

	public void setCharfld1(String charfld1) {
		this.charfld1 = charfld1;
	}

	public String getCharfld2() {
		return charfld2;
	}

	public void setCharfld2(String charfld2) {
		this.charfld2 = charfld2;
	}

	public String getCharfld3() {
		return charfld3;
	}

	public void setCharfld3(String charfld3) {
		this.charfld3 = charfld3;
	}

	public Float getDecifld1() {
		return decifld1;
	}

	public void setDecifld1(Float decifld1) {
		this.decifld1 = decifld1;
	}

	public Float getDecifld2() {
		return decifld2;
	}

	public void setDecifld2(Float decifld2) {
		this.decifld2 = decifld2;
	}

	public Float getDecifld3() {
		return decifld3;
	}

	public void setDecifld3(Float decifld3) {
		this.decifld3 = decifld3;
	}

	public boolean isLogifld() {
		return logifld;
	}

	public void setLogifld(boolean logifld) {
		this.logifld = logifld;
	}

	public Date getDatefld() {
		return datefld;
	}

	public void setDatefld(Date datefld) {
		this.datefld = datefld;
	}

	public VendorDiv getVendorDiv() {
		return vendorDiv;
	}

	public void setVendorDiv(VendorDiv vendorDiv) {
		this.vendorDiv = vendorDiv;
	}

	public PO getPo() {
		return po;
	}

	public void setPo(PO po) {
		this.po = po;
	}

	 

	public VendAddr getVendAddr() {
		return vendAddr;
	}

	public void setVendAddr(VendAddr vendAddr) {
		this.vendAddr = vendAddr;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
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
		Vendor other = (Vendor) obj;
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
		return "Vendor [id=" + id + ", vendNum=" + vendNum + ", currCode=" + currCode + ", contact=" + contact
				+ ", phone=" + phone + ", vendType=" + vendType + ", termsCode=" + termsCode + ", shipCode=" + shipCode
				+ ", fob=" + fob + ", printPrice=" + printPrice + ", stat=" + stat + ", key=" + key + ", lastPurch="
				+ lastPurch + ", lastPaid=" + lastPaid + ", purchYtd=" + purchYtd + ", purchLstYr=" + purchLstYr
				+ ", discYtd=" + discYtd + ", discLstYr=" + discLstYr + ", payYtd=" + payYtd + ", fedId=" + fedId
				+ ", vendRemit=" + vendRemit + ", whse=" + whse + ", charfld1=" + charfld1 + ", charfld2=" + charfld2
				+ ", charfld3=" + charfld3 + ", decifld1=" + decifld1 + ", decifld2=" + decifld2 + ", decifld3="
				+ decifld3 + ", logifld=" + logifld + ", datefld=" + datefld + "]";
	}
	
	

}
