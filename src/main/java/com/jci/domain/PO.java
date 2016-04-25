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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "PO")
public class PO implements Serializable {

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
	@JoinColumn(name="PO_DIV_ID")
	private PoDiv poDiv;
	
	@JsonManagedReference
	@OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="PO_ITEM_ID")
	private PoItem poItem;
	
	@JsonManagedReference
	@OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="VENDOR_ID")
	private Vendor vendor;
	
	@JsonManagedReference
	@OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="SHIP_TO_ID")
	private ShipTo shipTo ;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_TIME")
	private Date created;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MOD_TIME")
	private Date updated; 
	  

	@PrePersist
	protected void onCreate() {
	    created = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
	    updated = new Date();
	}
	
	@Column(name = "status",length = 2)
    private int status;
	
	@Column(name = "data_source",length = 2)
    private int dataSource;
	
    @Column(name = "po_num", nullable = false,length = 10)
    private int poNum;

    @Column(name = "vend_num",length = 10)
    private int vendNum;
    
    @Column(name = "order_date")
    private Date orderDate;
    
    @Column(name = "buyer",length = 30)
    private String buyer;
    
    @Column(name = "po_cost",length = 23)
    private Float poCost;
    
    @Column(name = "ship_code",length = 6)
    private String shipCode;
    
    @Column(name = "terms_code",length = 6)
    private String termsCode;
    
    @Column(name = "fob",length = 30)
    private String fob;
    
    @Column(name = "print_price")
    private boolean printPrice;
    
    @Column(name = "vend_order",length = 30)
    private String vendOrder;
    
    @Column(name = "misc_charges")
    private Float miscCharges;
    
    @Column(name = "sales_tax")
    private Float salesTax;
    
    @Column(name = "freight")
    private Float freight;
    
    @Column(name = "stat",length = 2)
    private String stat;
    
    @Column(name = "key")
    private int key;
    
    @Column(name = "inv_date")
    private Date invDate;
    
    @Column(name = "inv_num",length = 30)
    private String invNum;
    
    @Column(name = "dist_date")
    private Date distDate;
    
    @Column(name = "type",length = 2)
    private String type;
    
    @Column(name = "drop_ship_no")
    private int dropShipNo;
    
    @Column(name = "drop_seq")
    private int dropSeq;
    
    @Column(name = "eff_date")
    private Date effDate;
    
    @Column(name = "exp_date")
    private Date expDate;
    
    @Column(name = "ship_addr",length = 2)
    private String shipAddr;
    
    @Column(name = "m_charges_t")
    private Float mChargesT;
    
    @Column(name = "sales_tax_t")
    private Float salesTaxT;
    
    @Column(name = "freight_t")
    private Float freightT;
    
    @Column(name = "whse",length = 8)
    private String whse;

    
    public PO() {
    }

    public PO(int poNum) {
        this.poNum = poNum;
    }

    public PO(long id, int poNum) {
        this.id = id;
        this.poNum = poNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public Float getPoCost() {
		return poCost;
	}

	public void setPoCost(Float poCost) {
		this.poCost = poCost;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	public String getTermsCode() {
		return termsCode;
	}

	public void setTermsCode(String termsCode) {
		this.termsCode = termsCode;
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

	public String getVendOrder() {
		return vendOrder;
	}

	public void setVendOrder(String vendOrder) {
		this.vendOrder = vendOrder;
	}

	public Float getMiscCharges() {
		return miscCharges;
	}

	public void setMiscCharges(Float miscCharges) {
		this.miscCharges = miscCharges;
	}

	public Float getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(Float salesTax) {
		this.salesTax = salesTax;
	}

	public Float getFreight() {
		return freight;
	}

	public void setFreight(Float freight) {
		this.freight = freight;
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

	public Date getInvDate() {
		return invDate;
	}

	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}

	public String getInvNum() {
		return invNum;
	}

	public void setInvNum(String invNum) {
		this.invNum = invNum;
	}

	public Date getDistDate() {
		return distDate;
	}

	public void setDistDate(Date distDate) {
		this.distDate = distDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Date getEffDate() {
		return effDate;
	}

	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public String getShipAddr() {
		return shipAddr;
	}

	public void setShipAddr(String shipAddr) {
		this.shipAddr = shipAddr;
	}

	public Float getmChargesT() {
		return mChargesT;
	}

	public void setmChargesT(Float mChargesT) {
		this.mChargesT = mChargesT;
	}

	public Float getSalesTaxT() {
		return salesTaxT;
	}

	public void setSalesTaxT(Float salesTaxT) {
		this.salesTaxT = salesTaxT;
	}

	public Float getFreightT() {
		return freightT;
	}

	public void setFreightT(Float freightT) {
		this.freightT = freightT;
	}

	public String getWhse() {
		return whse;
	}

	public void setWhse(String whse) {
		this.whse = whse;
	}

	public PoDiv getPoDiv() {
		return poDiv;
	}

	public void setPoDiv(PoDiv poDiv) {
		this.poDiv = poDiv;
	}


	public PoItem getPoItem() {
		return poItem;
	}

	public void setPoItem(PoItem poItem) {
		this.poItem = poItem;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public ShipTo getShipTo() {
		return shipTo;
	}

	public void setShipTo(ShipTo shipTo) {
		this.shipTo = shipTo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getDataSource() {
		return dataSource;
	}

	public void setDataSource(int dataSource) {
		this.dataSource = dataSource;
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
		PO other = (PO) obj;
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
		return "PO [id=" + id + ", poNum=" + poNum + ", vendNum=" + vendNum + ", orderDate=" + orderDate + ", buyer="
				+ buyer + ", poCost=" + poCost + ", shipCode=" + shipCode + ", termsCode=" + termsCode + ", fob=" + fob
				+ ", printPrice=" + printPrice + ", vendOrder=" + vendOrder + ", miscCharges=" + miscCharges
				+ ", salesTax=" + salesTax + ", freight=" + freight + ", stat=" + stat + ", key=" + key + ", invDate="
				+ invDate + ", invNum=" + invNum + ", distDate=" + distDate + ", type=" + type + ", dropShipNo="
				+ dropShipNo + ", dropSeq=" + dropSeq + ", effDate=" + effDate + ", expDate=" + expDate + ", shipAddr="
				+ shipAddr + ", mChargesT=" + mChargesT + ", salesTaxT=" + salesTaxT + ", freightT=" + freightT
				+ ", whse=" + whse + "]";
	}



}
