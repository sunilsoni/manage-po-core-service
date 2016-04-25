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
@Table(name = "PO_ITEM")
public class PoItem implements Serializable {

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
	@OneToOne(fetch=FetchType.EAGER, mappedBy="poItem")
    private PO po;
	
	/*@JsonBackReference
	//bi_directional one_to_one association to itemKey
	@OneToOne(fetch=FetchType.EAGER, mappedBy="poItemKey",cascade=CascadeType.ALL)
	private Item itemKey;*/
		
	@JsonManagedReference
	@OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="ITEM_ID")
	private Item itemKey;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MOD_TIME")
	private Date updated; 
	  
	@PreUpdate
	protected void onUpdate() {
	    updated = new Date();
	}

	@Column(name = "po_num" ,length = 10)
	private int poNum;
	
	@Column(name = "po_line" ,length = 10)
	private int poLine;		
	
	@Column(name = "po_release" ,length = 10)
	private int poRelease;		
	
	@Column(name = "item" ,length = 44)
	private String item	;	
	
	@Column(name = "qty_ordered" ,length = 18)
	private Float qtyOrdered	;	
	
	@Column(name = "qty_received" ,length = 18)
	private Float qtyReceived	;	
	
	@Column(name = "qty_rejected" ,length = 18)
	private Float qtyRejected	;	
	
	@Column(name = "item_cost" ,length = 23)
	private Float itemCost	;	
	
	@Column(name = "ref_type" ,length = 2)
	private String refType	;	
	
	@Column(name = "ref_num" ,length = 10)
	private int refNum	;
	
	@Column(name = "ref_line_suf" ,length = 10)
	private int refLineSuf	;	
	
	@Column(name = "ref_release" ,length = 10)
	private int refRelease	;	
	
	@Column(name = "due_date" ,length = 10)
	private Date dueDate	;	
	
	@Column(name = "rcvd_date" ,length = 10)
	private Date rcvdDate	;	
	
	@Column(name = "vend_item" ,length = 60)
	private String vendItem	;	
	
	@Column(name = "root_job" ,length = 10)
	private int rootJob		;
	
	@Column(name = "root_suf" ,length = 10)
	private int rootSuf		;
	
	@Column(name = "key" ,length = 10)
	private int key		;
	
	@Column(name = "plan_cost" ,length = 23)
	private Float planCost		;
	
	@Column(name = "qty_voucher" ,length = 18)
	private Float qtyVoucher	;	
	
	@Column(name = "qty_returned" ,length = 18)
	private Float qtyReturned	;	
	
	@Column(name = "voucher_cost" ,length = 23)
	private Float voucherCost	;	
	
	@Column(name = "non_inv_acct" ,length = 40)
	private String nonInvAcct	;	
	
	@Column(name = "non_inv_sub" ,length = 49)
	private String nonInvSub	;	
	
	@Column(name = "stat" ,length = 2)
	private String stat		;
	
	@Column(name = "drop_ship_no" ,length = 10)
	private int dropShipNo	;	
	
	@Column(name = "drop_seq" ,length = 10)
	private int dropSeq		;
	
	@Column(name = "ship_addr" ,length = 2)
	private String shipAddr	;	
	
	@Column(name = "promise_date" ,length = 10)
	private Date promiseDate;		
	
	@Column(name = "release_date" ,length = 10)
	private Date releaseDate;		
	
	@Column(name = "whse" ,length = 8)
	private String whse;

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

	public int getPoLine() {
		return poLine;
	}

	public void setPoLine(int poLine) {
		this.poLine = poLine;
	}

	public int getPoRelease() {
		return poRelease;
	}

	public void setPoRelease(int poRelease) {
		this.poRelease = poRelease;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Float getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(Float qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public Float getQtyReceived() {
		return qtyReceived;
	}

	public void setQtyReceived(Float qtyReceived) {
		this.qtyReceived = qtyReceived;
	}

	public Float getQtyRejected() {
		return qtyRejected;
	}

	public void setQtyRejected(Float qtyRejected) {
		this.qtyRejected = qtyRejected;
	}

	public Float getItemCost() {
		return itemCost;
	}

	public void setItemCost(Float itemCost) {
		this.itemCost = itemCost;
	}

	public String getRefType() {
		return refType;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	public int getRefNum() {
		return refNum;
	}

	public void setRefNum(int refNum) {
		this.refNum = refNum;
	}

	public int getRefLineSuf() {
		return refLineSuf;
	}

	public void setRefLineSuf(int refLineSuf) {
		this.refLineSuf = refLineSuf;
	}

	public int getRefRelease() {
		return refRelease;
	}

	public void setRefRelease(int refRelease) {
		this.refRelease = refRelease;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getRcvdDate() {
		return rcvdDate;
	}

	public void setRcvdDate(Date rcvdDate) {
		this.rcvdDate = rcvdDate;
	}

	public String getVendItem() {
		return vendItem;
	}

	public void setVendItem(String vendItem) {
		this.vendItem = vendItem;
	}

	public int getRootJob() {
		return rootJob;
	}

	public void setRootJob(int rootJob) {
		this.rootJob = rootJob;
	}

	public int getRootSuf() {
		return rootSuf;
	}

	public void setRootSuf(int rootSuf) {
		this.rootSuf = rootSuf;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Float getPlanCost() {
		return planCost;
	}

	public void setPlanCost(Float planCost) {
		this.planCost = planCost;
	}

	public Float getQtyVoucher() {
		return qtyVoucher;
	}

	public void setQtyVoucher(Float qtyVoucher) {
		this.qtyVoucher = qtyVoucher;
	}

	public Float getQtyReturned() {
		return qtyReturned;
	}

	public void setQtyReturned(Float qtyReturned) {
		this.qtyReturned = qtyReturned;
	}

	public Float getVoucherCost() {
		return voucherCost;
	}

	public void setVoucherCost(Float voucherCost) {
		this.voucherCost = voucherCost;
	}

	public String getNonInvAcct() {
		return nonInvAcct;
	}

	public void setNonInvAcct(String nonInvAcct) {
		this.nonInvAcct = nonInvAcct;
	}

	public String getNonInvSub() {
		return nonInvSub;
	}

	public void setNonInvSub(String nonInvSub) {
		this.nonInvSub = nonInvSub;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
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

	public String getShipAddr() {
		return shipAddr;
	}

	public void setShipAddr(String shipAddr) {
		this.shipAddr = shipAddr;
	}

	public Date getPromiseDate() {
		return promiseDate;
	}

	public void setPromiseDate(Date promiseDate) {
		this.promiseDate = promiseDate;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getWhse() {
		return whse;
	}

	public void setWhse(String whse) {
		this.whse = whse;
	}

	public Item getItemKey() {
		return itemKey;
	}

	public void setItemKey(Item itemKey) {
		this.itemKey = itemKey;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((po == null) ? 0 : po.hashCode());
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
		PoItem other = (PoItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (po == null) {
			if (other.po != null)
				return false;
		} else if (!po.equals(other.po))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PoItem [id=" + id + ", po=" + po + ", updated=" + updated + ", poNum=" + poNum + ", poLine=" + poLine
				+ ", poRelease=" + poRelease + ", item=" + item + ", qtyOrdered=" + qtyOrdered + ", qtyReceived="
				+ qtyReceived + ", qtyRejected=" + qtyRejected + ", itemCost=" + itemCost + ", refType=" + refType
				+ ", refNum=" + refNum + ", refLineSuf=" + refLineSuf + ", refRelease=" + refRelease + ", dueDate="
				+ dueDate + ", rcvdDate=" + rcvdDate + ", vendItem=" + vendItem + ", rootJob=" + rootJob + ", rootSuf="
				+ rootSuf + ", key=" + key + ", planCost=" + planCost + ", qtyVoucher=" + qtyVoucher + ", qtyReturned="
				+ qtyReturned + ", voucherCost=" + voucherCost + ", nonInvAcct=" + nonInvAcct + ", nonInvSub="
				+ nonInvSub + ", stat=" + stat + ", dropShipNo=" + dropShipNo + ", dropSeq=" + dropSeq + ", shipAddr="
				+ shipAddr + ", promiseDate=" + promiseDate + ", releaseDate=" + releaseDate + ", whse=" + whse + "]";
	}	




}
