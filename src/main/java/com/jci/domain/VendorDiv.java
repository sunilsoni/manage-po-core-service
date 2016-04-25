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
@Table(name = "VENDOR_DIV")
public class VendorDiv implements Serializable {

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
	@OneToOne(fetch=FetchType.EAGER, mappedBy="vendorDiv")
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
	
	@Column(name = "inspect_code" ,length = 2)
	private String inspectCode;		
	
	@Column(name = "skip_lot" ,length = 10)
	private int skipLot		;
	
	@Column(name = "vend_amaps" ,length = 14)
	private String vendAmaps	;	
	
	@Column(name = "vend_1099" ,length = 1)
	private boolean vend1099	;	
	
	@Column(name = "report_card" ,length = 1)
	private boolean reportCard	;	
	
	@Column(name = "po_media" ,length = 10)
	private String poMedia	;	
	
	@Column(name = "rfc" ,length = 26)
	private String rfc		;
	
	@Column(name = "edi_test_prod_ind" ,length = 2)
	private String ediTestProdInd;		
	
	@Column(name = "vendor_plant_id" ,length = 4)
	private String vendorPlantId;		
	
	@Column(name = "last_update" ,length = 10)
	private Date lastUpdate		;
	
	@Column(name = "zz_avail_date_2" ,length = 10)
	private Date zzAvailDate2	;	
	
	@Column(name = "zz_avail_date_3" ,length = 10)
	private Date zzAvailDate3	;	
	
	@Column(name = "last_yr_purch_ytd" ,length = 18)
	private Float lastYrPurchYtd;		
	
	@Column(name = "last_yr_order_ytd" ,length = 18)
	private Float lastYrOrderYtd;		
	
	@Column(name = "last_yr_recv_ytd" ,length = 18)
	private Float lastYrRecvYtd	;	
	
	@Column(name = "zz_avail_int_1" ,length = 10)
	private int zzAvailInt1		;
	
	@Column(name = "zz_avail_int_2" ,length = 10)
	private int zzAvailInt2		;
	
	@Column(name = "zz_avail_int_3" ,length = 10)
	private int zzAvailInt3		;
	
	@Column(name = "zz_avail_log_1" ,length = 1)
	private boolean zzAvailLog1		;
	
	@Column(name = "zz_avail_log_2" ,length = 1)
	private boolean zzAvailLog2		;
	
	@Column(name = "selected_for_sms" ,length = 1)
	private boolean selectedForSms	;	
	
	@Column(name = "edi_qualifier" ,length = 13)
	private String ediQualifier	;	
	
	@Column(name = "edi_id_no" ,length = 30)
	private String ediIdNo		;
	
	@Column(name = "edi_test_ind" ,length = 2)
	private String ediTestInd	;	
	
	@Column(name = "edi_standard" ,length = 12)
	private String ediStandard	;	
	
	@Column(name = "supplier_class" ,length = 20)
	private String supplierClass;		
	
	@Column(name = "vend_email" ,length = 80)
	private String vendEmail	;	
	
	@Column(name = "suppl_type" ,length = 12)
	private String supplType	;

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

	public String getInspectCode() {
		return inspectCode;
	}

	public void setInspectCode(String inspectCode) {
		this.inspectCode = inspectCode;
	}

	public int getSkipLot() {
		return skipLot;
	}

	public void setSkipLot(int skipLot) {
		this.skipLot = skipLot;
	}

	public String getVendAmaps() {
		return vendAmaps;
	}

	public void setVendAmaps(String vendAmaps) {
		this.vendAmaps = vendAmaps;
	}

	public boolean isVend1099() {
		return vend1099;
	}

	public void setVend1099(boolean vend1099) {
		this.vend1099 = vend1099;
	}

	public boolean isReportCard() {
		return reportCard;
	}

	public void setReportCard(boolean reportCard) {
		this.reportCard = reportCard;
	}

	public String getPoMedia() {
		return poMedia;
	}

	public void setPoMedia(String poMedia) {
		this.poMedia = poMedia;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getEdiTestProdInd() {
		return ediTestProdInd;
	}

	public void setEdiTestProdInd(String ediTestProdInd) {
		this.ediTestProdInd = ediTestProdInd;
	}

	public String getVendorPlantId() {
		return vendorPlantId;
	}

	public void setVendorPlantId(String vendorPlantId) {
		this.vendorPlantId = vendorPlantId;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getZzAvailDate2() {
		return zzAvailDate2;
	}

	public void setZzAvailDate2(Date zzAvailDate2) {
		this.zzAvailDate2 = zzAvailDate2;
	}

	public Date getZzAvailDate3() {
		return zzAvailDate3;
	}

	public void setZzAvailDate3(Date zzAvailDate3) {
		this.zzAvailDate3 = zzAvailDate3;
	}

	public Float getLastYrPurchYtd() {
		return lastYrPurchYtd;
	}

	public void setLastYrPurchYtd(Float lastYrPurchYtd) {
		this.lastYrPurchYtd = lastYrPurchYtd;
	}

	public Float getLastYrOrderYtd() {
		return lastYrOrderYtd;
	}

	public void setLastYrOrderYtd(Float lastYrOrderYtd) {
		this.lastYrOrderYtd = lastYrOrderYtd;
	}

	public Float getLastYrRecvYtd() {
		return lastYrRecvYtd;
	}

	public void setLastYrRecvYtd(Float lastYrRecvYtd) {
		this.lastYrRecvYtd = lastYrRecvYtd;
	}

	public int getZzAvailInt1() {
		return zzAvailInt1;
	}

	public void setZzAvailInt1(int zzAvailInt1) {
		this.zzAvailInt1 = zzAvailInt1;
	}

	public int getZzAvailInt2() {
		return zzAvailInt2;
	}

	public void setZzAvailInt2(int zzAvailInt2) {
		this.zzAvailInt2 = zzAvailInt2;
	}

	public int getZzAvailInt3() {
		return zzAvailInt3;
	}

	public void setZzAvailInt3(int zzAvailInt3) {
		this.zzAvailInt3 = zzAvailInt3;
	}

	public boolean isZzAvailLog1() {
		return zzAvailLog1;
	}

	public void setZzAvailLog1(boolean zzAvailLog1) {
		this.zzAvailLog1 = zzAvailLog1;
	}

	public boolean isZzAvailLog2() {
		return zzAvailLog2;
	}

	public void setZzAvailLog2(boolean zzAvailLog2) {
		this.zzAvailLog2 = zzAvailLog2;
	}

	public boolean isSelectedForSms() {
		return selectedForSms;
	}

	public void setSelectedForSms(boolean selectedForSms) {
		this.selectedForSms = selectedForSms;
	}

	public String getEdiQualifier() {
		return ediQualifier;
	}

	public void setEdiQualifier(String ediQualifier) {
		this.ediQualifier = ediQualifier;
	}

	public String getEdiIdNo() {
		return ediIdNo;
	}

	public void setEdiIdNo(String ediIdNo) {
		this.ediIdNo = ediIdNo;
	}

	public String getEdiTestInd() {
		return ediTestInd;
	}

	public void setEdiTestInd(String ediTestInd) {
		this.ediTestInd = ediTestInd;
	}

	public String getEdiStandard() {
		return ediStandard;
	}

	public void setEdiStandard(String ediStandard) {
		this.ediStandard = ediStandard;
	}

	public String getSupplierClass() {
		return supplierClass;
	}

	public void setSupplierClass(String supplierClass) {
		this.supplierClass = supplierClass;
	}

	public String getVendEmail() {
		return vendEmail;
	}

	public void setVendEmail(String vendEmail) {
		this.vendEmail = vendEmail;
	}

	public String getSupplType() {
		return supplType;
	}

	public void setSupplType(String supplType) {
		this.supplType = supplType;
	}	

	
}
