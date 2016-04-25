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
@Table(name = "PO_DIV")
public class PoDiv implements Serializable {

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
	@OneToOne(fetch=FetchType.EAGER, mappedBy="poDiv")
    private PO po;
	
	
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MOD_TIME")
	private Date updated; 
	  
	@PreUpdate
	protected void onUpdate() {
	    updated = new Date();
	}

	@Column(name = "po_num" ,length = 10)
	private int poNum	;	
	
	@Column(name = "vend_num" ,length = 10)
	private int vendNum	;	
	
	@Column(name = "inv_num" ,length = 30)
	private String invNum;		
	
	@Column(name = "mro_po" ,length = 1)
	private boolean mroPo;		
	
	@Column(name = "requestor" ,length = 50)
	private String  requestor;		
	
	@Column(name = "taxable" ,length = 1)
	private boolean taxable	;	
	
	@Column(name = "ar_num" ,length = 16)
	private String arNum;		
	
	@Column(name = "zz_avail_char_2" ,length = 7)
	private String zzAvailChar2;		
	
	@Column(name = "user_id" ,length = 16)
	private String userId;		
	
	@Column(name = "zz_avail_date_1" ,length = 10)
	private Date zzAvailDate1;		
	
	@Column(name = "zz_avail_date_2" ,length = 10)
	private Date zzAvailDate2	;	
	
	@Column(name = "date_maintained" ,length = 10)
	private Date dateMaintained	;	
	
	@Column(name = "zz_avail_dec_1" ,length = 17)
	private Float zzAvailDec1	;	
	
	@Column(name = "zz_avail_dec_2" ,length = 17)
	private Float zzAvailDec2	;	
	
	@Column(name = "zz_avail_dec_3" ,length = 17)
	private Float zzAvailDec3;		
	
	@Column(name = "zz_avail_int_1" ,length = 10)
	private int zzAvailInt1	;	
	
	@Column(name = "zz_avail_int_2" ,length = 10)
	private int zzAvailInt2	;	
	
	@Column(name = "po_rel_count" ,length = 10)
	private int poRelCount	;	
	
	@Column(name = "zz_avail_log_1" ,length = 1)
	private boolean zzAvailLog1	;	
	
	@Column(name = "zz_avail_log_2" ,length = 1)
	private boolean zzAvailLog2;		
	
	@Column(name = "zz_avail_log_3" ,length = 1)
	private boolean zzAvailLog3	;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PO getPo() {
		return po;
	}

	public void setPo(PO po) {
		this.po = po;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getPoNum() {
		return poNum;
	}

	public void setPoNum(int poNum) {
		this.poNum = poNum;
	}

	public int getVendNum() {
		return vendNum;
	}

	public void setVendNum(int vendNum) {
		this.vendNum = vendNum;
	}

	public String getInvNum() {
		return invNum;
	}

	public void setInvNum(String invNum) {
		this.invNum = invNum;
	}

	public boolean isMroPo() {
		return mroPo;
	}

	public void setMroPo(boolean mroPo) {
		this.mroPo = mroPo;
	}

	public String getRequestor() {
		return requestor;
	}

	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}

	public boolean isTaxable() {
		return taxable;
	}

	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}

	public String getArNum() {
		return arNum;
	}

	public void setArNum(String arNum) {
		this.arNum = arNum;
	}

	public String getZzAvailChar2() {
		return zzAvailChar2;
	}

	public void setZzAvailChar2(String zzAvailChar2) {
		this.zzAvailChar2 = zzAvailChar2;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getZzAvailDate1() {
		return zzAvailDate1;
	}

	public void setZzAvailDate1(Date zzAvailDate1) {
		this.zzAvailDate1 = zzAvailDate1;
	}

	public Date getZzAvailDate2() {
		return zzAvailDate2;
	}

	public void setZzAvailDate2(Date zzAvailDate2) {
		this.zzAvailDate2 = zzAvailDate2;
	}

	public Date getDateMaintained() {
		return dateMaintained;
	}

	public void setDateMaintained(Date dateMaintained) {
		this.dateMaintained = dateMaintained;
	}

	public Float getZzAvailDec1() {
		return zzAvailDec1;
	}

	public void setZzAvailDec1(Float zzAvailDec1) {
		this.zzAvailDec1 = zzAvailDec1;
	}

	public Float getZzAvailDec2() {
		return zzAvailDec2;
	}

	public void setZzAvailDec2(Float zzAvailDec2) {
		this.zzAvailDec2 = zzAvailDec2;
	}

	public Float getZzAvailDec3() {
		return zzAvailDec3;
	}

	public void setZzAvailDec3(Float zzAvailDec3) {
		this.zzAvailDec3 = zzAvailDec3;
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

	public int getPoRelCount() {
		return poRelCount;
	}

	public void setPoRelCount(int poRelCount) {
		this.poRelCount = poRelCount;
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

	public boolean isZzAvailLog3() {
		return zzAvailLog3;
	}

	public void setZzAvailLog3(boolean zzAvailLog3) {
		this.zzAvailLog3 = zzAvailLog3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + poNum;
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
		PoDiv other = (PoDiv) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (poNum != other.poNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PoDiv [id=" + id + ", po=" + po + ", updated=" + updated + ", poNum=" + poNum + ", vendNum=" + vendNum
				+ ", invNum=" + invNum + ", mroPo=" + mroPo + ", requestor=" + requestor + ", taxable=" + taxable
				+ ", arNum=" + arNum + ", zzAvailChar2=" + zzAvailChar2 + ", userId=" + userId + ", zzAvailDate1="
				+ zzAvailDate1 + ", zzAvailDate2=" + zzAvailDate2 + ", dateMaintained=" + dateMaintained
				+ ", zzAvailDec1=" + zzAvailDec1 + ", zzAvailDec2=" + zzAvailDec2 + ", zzAvailDec3=" + zzAvailDec3
				+ ", zzAvailInt1=" + zzAvailInt1 + ", zzAvailInt2=" + zzAvailInt2 + ", poRelCount=" + poRelCount
				+ ", zzAvailLog1=" + zzAvailLog1 + ", zzAvailLog2=" + zzAvailLog2 + ", zzAvailLog3=" + zzAvailLog3
				+ "]";
	}	
	
	
		
}
