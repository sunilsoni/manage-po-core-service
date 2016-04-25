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
@Table(name = "ITEM")
public class Item implements Serializable {

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
	@JoinColumn(name="ITEM_DIV_ID")
	private ItemDiv itemDiv;
	
	/*@JsonManagedReference
	@OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="PO_ITEM_ID")
	private PoItem poItemKey;*/
	
	@JsonBackReference
	//bi_directional one_to_one association to itemKey
	@OneToOne(fetch=FetchType.EAGER, mappedBy="itemKey",cascade=CascadeType.ALL)
	private PoItem poItemKey;
	
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MOD_TIME")
	private Date updated; 
	  
	@PreUpdate
	protected void onUpdate() {
	    updated = new Date();
	}
	
	@Column(name = "item", nullable = false,length = 30)
	private String item;
	
	@Column(name = "description",length = 80)
	private String description;
	
	@Column(name = "qty_allocjob")
	private Float qtyAllocjob;
	
	@Column(name = "qty_wip")
	private Float qtyWip;
	
	@Column(name = "u_m",length = 20)
	private String um;
	
	@Column(name = "unit_price")
	private Float unitPrice;
	
	@Column(name = "lead_time")
	private int leadTime;
	
	@Column(name = "lot_size")
	private Float lotSize;
	
	@Column(name = "qty_used_ytd")
	private Float qtyUsedYtd;
	
	@Column(name = "qty_mfg_ytd")
	private Float qtyMfgYtd;
	
	@Column(name = "abc_code",length = 2)
	private String abcCode;
	
	@Column(name = "drawing_nbr",length = 50)
	private String drawingNbr;
	
	@Column(name = "product_code",length = 20)
	private String productCode;
	
	@Column(name = "p_m_code")
	private boolean pmCode;
	
	@Column(name = "cost_method",length = 2)
	private String costMethod;
	
	@Column(name = "lst_lot_size")
	private Float lstLotSize;
	
	@Column(name = "unit_cost")
	private Float unitCost;
	
	@Column(name = "reprice")
	private boolean reprice;
	
	@Column(name = "lst_u_cost")
	private Float lstuCost;
	
	@Column(name = "avg_u_cost")
	private Float avguCost;
	
	@Column(name = "job")
	private int job;
	
	@Column(name = "suffix")
	private int suffix;
	
	@Column(name = "stocked")
	private boolean stocked;
	
	@Column(name = "matl_type",length = 2)
	private String matlType;
	
	@Column(name = "key")
	private int key;
	
	@Column(name = "low_level")
	private int lowLevel;
	
	@Column(name = "last_inv")
	private Date lastInv;
	
	@Column(name = "days_supply")
	private int daysSupply;

	@Column(name = "order_min")
	private Float orderMin;

	@Column(name = "order_mult")
	private Float orderMult;

	@Column(name = "plan_code",length = 6)
	private String planCode;

	@Column(name = "mps_flag")
	private boolean mpsFlag;

	@Column(name = "accept_req")
	private boolean acceptReq;

	@Column(name = "change_date")
	private Date changeDate;

	@Column(name = "revision",length = 16)
	private String revision;

	@Column(name = "phantom_flag")
	private boolean phantomFlag;

	@Column(name = "plan_flag")
	private boolean planFlag;

	@Column(name = "paper_time")
	private int paperTime;

	@Column(name = "dock_time")
	private int dockTime;

	@Column(name = "net_change")
	private boolean netChange;

	@Column(name = "asm_setup")
	private Float asmSetup;

	@Column(name = "asm_run")
	private Float asmRun;

	@Column(name = "asm_matl")
	private Float asmMatl;

	@Column(name = "asm_tool")
	private Float asmTool;

	@Column(name = "asm_fixture")
	private Float asmFixture;
	

	@Column(name = "asm_other")
	private Float asmOther;

	@Column(name = "asm_fixed")
	private Float asmFixed;

	@Column(name = "asm_var")
	private Float asmVar;

	@Column(name = "asm_outside")
	private Float asmOutside;

	@Column(name = "comp_setup")
	private Float compSetup;

	@Column(name = "comp_run")
	private Float compRun;

	@Column(name = "comp_matl")
	private Float compMatl;

	@Column(name = "comp_tool")
	private Float compTool;

	@Column(name = "comp_fixture")
	private Float compFixture;

	@Column(name = "comp_other")
	private Float compOther;

	@Column(name = "comp_fixed")
	private Float compFixed;

	@Column(name = "comp_var")
	private Float compVar;

	@Column(name = "comp_outside")
	private Float compOutside;

	@Column(name = "sub_matl")
	private Float subMatl;

	@Column(name = "shrink_fact")
	private Float shrinkFact;

	@Column(name = "alt_item",length = 30)
	private String altItem;

	@Column(name = "unit_weight")
	private Float unitWeight;

	@Column(name = "weight_units",length = 6)
	private String weightUnits;

	@Column(name = "user_code",length = 16)
	private String userCode;

	@Column(name = "tax_flag")
	private boolean taxFlag;

	@Column(name = "cur_u_cost")
	private Float curuCost;

	@Column(name = "feat_type")
	private boolean featType;

	@Column(name = "var_lead")
	private Float varLead;

	@Column(name = "feat_str",length = 80)
	private String featStr;

	@Column(name = "next_config")
	private int nextConfig;

	@Column(name = "feat_templ",length = 110)
	private String featTempl;

	@Column(name = "fl_stock")
	private boolean flStock;

	@Column(name = "charfld1",length = 40)
	private String charfld1;

	@Column(name = "charfld2",length = 40)
	private String charfld2;

	@Column(name = "charfld3",length = 40)
	private String charfld3;

	@Column(name = "decifld1")
	private Float decifld1;
	

	@Column(name = "decifld2")
	private Float decifld2;
	

	@Column(name = "decifld3")
	private Float decifld3;
	

	@Column(name = "logifld")
	private boolean logifld;

	@Column(name = "datefld")
	private Date datefld;
	

	@Column(name = "track_ecn")
	private boolean trackEcn;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Float getQtyAllocjob() {
		return qtyAllocjob;
	}


	public void setQtyAllocjob(Float qtyAllocjob) {
		this.qtyAllocjob = qtyAllocjob;
	}


	public Float getQtyWip() {
		return qtyWip;
	}


	public void setQtyWip(Float qtyWip) {
		this.qtyWip = qtyWip;
	}


	public String getUm() {
		return um;
	}


	public void setUm(String um) {
		this.um = um;
	}


	public Float getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getLeadTime() {
		return leadTime;
	}


	public void setLeadTime(int leadTime) {
		this.leadTime = leadTime;
	}


	public Float getLotSize() {
		return lotSize;
	}


	public void setLotSize(Float lotSize) {
		this.lotSize = lotSize;
	}


	public Float getQtyUsedYtd() {
		return qtyUsedYtd;
	}


	public void setQtyUsedYtd(Float qtyUsedYtd) {
		this.qtyUsedYtd = qtyUsedYtd;
	}


	public Float getQtyMfgYtd() {
		return qtyMfgYtd;
	}


	public void setQtyMfgYtd(Float qtyMfgYtd) {
		this.qtyMfgYtd = qtyMfgYtd;
	}


	public String getAbcCode() {
		return abcCode;
	}


	public void setAbcCode(String abcCode) {
		this.abcCode = abcCode;
	}


	public String getDrawingNbr() {
		return drawingNbr;
	}


	public void setDrawingNbr(String drawingNbr) {
		this.drawingNbr = drawingNbr;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public boolean isPmCode() {
		return pmCode;
	}


	public void setPmCode(boolean pmCode) {
		this.pmCode = pmCode;
	}


	public String getCostMethod() {
		return costMethod;
	}


	public void setCostMethod(String costMethod) {
		this.costMethod = costMethod;
	}


	public Float getLstLotSize() {
		return lstLotSize;
	}


	public void setLstLotSize(Float lstLotSize) {
		this.lstLotSize = lstLotSize;
	}


	public Float getUnitCost() {
		return unitCost;
	}


	public void setUnitCost(Float unitCost) {
		this.unitCost = unitCost;
	}


	public boolean isReprice() {
		return reprice;
	}


	public void setReprice(boolean reprice) {
		this.reprice = reprice;
	}


	public Float getLstuCost() {
		return lstuCost;
	}


	public void setLstuCost(Float lstuCost) {
		this.lstuCost = lstuCost;
	}


	public Float getAvguCost() {
		return avguCost;
	}


	public void setAvguCost(Float avguCost) {
		this.avguCost = avguCost;
	}


	public int getJob() {
		return job;
	}


	public void setJob(int job) {
		this.job = job;
	}


	public int getSuffix() {
		return suffix;
	}


	public void setSuffix(int suffix) {
		this.suffix = suffix;
	}


	public boolean isStocked() {
		return stocked;
	}


	public void setStocked(boolean stocked) {
		this.stocked = stocked;
	}


	public String getMatlType() {
		return matlType;
	}


	public void setMatlType(String matlType) {
		this.matlType = matlType;
	}


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	public int getLowLevel() {
		return lowLevel;
	}


	public void setLowLevel(int lowLevel) {
		this.lowLevel = lowLevel;
	}


	public Date getLastInv() {
		return lastInv;
	}


	public void setLastInv(Date lastInv) {
		this.lastInv = lastInv;
	}


	public int getDaysSupply() {
		return daysSupply;
	}


	public void setDaysSupply(int daysSupply) {
		this.daysSupply = daysSupply;
	}


	public Float getOrderMin() {
		return orderMin;
	}


	public void setOrderMin(Float orderMin) {
		this.orderMin = orderMin;
	}


	public Float getOrderMult() {
		return orderMult;
	}


	public void setOrderMult(Float orderMult) {
		this.orderMult = orderMult;
	}


	public String getPlanCode() {
		return planCode;
	}


	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}


	public boolean isMpsFlag() {
		return mpsFlag;
	}


	public void setMpsFlag(boolean mpsFlag) {
		this.mpsFlag = mpsFlag;
	}


	public boolean isAcceptReq() {
		return acceptReq;
	}


	public void setAcceptReq(boolean acceptReq) {
		this.acceptReq = acceptReq;
	}


	public Date getChangeDate() {
		return changeDate;
	}


	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}


	public String getRevision() {
		return revision;
	}


	public void setRevision(String revision) {
		this.revision = revision;
	}


	public boolean isPhantomFlag() {
		return phantomFlag;
	}


	public void setPhantomFlag(boolean phantomFlag) {
		this.phantomFlag = phantomFlag;
	}


	public boolean isPlanFlag() {
		return planFlag;
	}


	public void setPlanFlag(boolean planFlag) {
		this.planFlag = planFlag;
	}


	public int getPaperTime() {
		return paperTime;
	}


	public void setPaperTime(int paperTime) {
		this.paperTime = paperTime;
	}


	public int getDockTime() {
		return dockTime;
	}


	public void setDockTime(int dockTime) {
		this.dockTime = dockTime;
	}


	public boolean isNetChange() {
		return netChange;
	}


	public void setNetChange(boolean netChange) {
		this.netChange = netChange;
	}


	public Float getAsmSetup() {
		return asmSetup;
	}


	public void setAsmSetup(Float asmSetup) {
		this.asmSetup = asmSetup;
	}


	public Float getAsmRun() {
		return asmRun;
	}


	public void setAsmRun(Float asmRun) {
		this.asmRun = asmRun;
	}


	public Float getAsmMatl() {
		return asmMatl;
	}


	public void setAsmMatl(Float asmMatl) {
		this.asmMatl = asmMatl;
	}


	public Float getAsmTool() {
		return asmTool;
	}


	public void setAsmTool(Float asmTool) {
		this.asmTool = asmTool;
	}


	public Float getAsmFixture() {
		return asmFixture;
	}


	public void setAsmFixture(Float asmFixture) {
		this.asmFixture = asmFixture;
	}


	public Float getAsmOther() {
		return asmOther;
	}


	public void setAsmOther(Float asmOther) {
		this.asmOther = asmOther;
	}


	public Float getAsmFixed() {
		return asmFixed;
	}


	public void setAsmFixed(Float asmFixed) {
		this.asmFixed = asmFixed;
	}


	public Float getAsmVar() {
		return asmVar;
	}


	public void setAsmVar(Float asmVar) {
		this.asmVar = asmVar;
	}


	public Float getAsmOutside() {
		return asmOutside;
	}


	public void setAsmOutside(Float asmOutside) {
		this.asmOutside = asmOutside;
	}


	public Float getCompSetup() {
		return compSetup;
	}


	public void setCompSetup(Float compSetup) {
		this.compSetup = compSetup;
	}


	public Float getCompRun() {
		return compRun;
	}


	public void setCompRun(Float compRun) {
		this.compRun = compRun;
	}


	public Float getCompMatl() {
		return compMatl;
	}


	public void setCompMatl(Float compMatl) {
		this.compMatl = compMatl;
	}


	public Float getCompTool() {
		return compTool;
	}


	public void setCompTool(Float compTool) {
		this.compTool = compTool;
	}


	public Float getCompFixture() {
		return compFixture;
	}


	public void setCompFixture(Float compFixture) {
		this.compFixture = compFixture;
	}


	public Float getCompOther() {
		return compOther;
	}


	public void setCompOther(Float compOther) {
		this.compOther = compOther;
	}


	public Float getCompFixed() {
		return compFixed;
	}


	public void setCompFixed(Float compFixed) {
		this.compFixed = compFixed;
	}


	public Float getCompVar() {
		return compVar;
	}


	public void setCompVar(Float compVar) {
		this.compVar = compVar;
	}


	public Float getCompOutside() {
		return compOutside;
	}


	public void setCompOutside(Float compOutside) {
		this.compOutside = compOutside;
	}


	public Float getSubMatl() {
		return subMatl;
	}


	public void setSubMatl(Float subMatl) {
		this.subMatl = subMatl;
	}


	public Float getShrinkFact() {
		return shrinkFact;
	}


	public void setShrinkFact(Float shrinkFact) {
		this.shrinkFact = shrinkFact;
	}


	public String getAltItem() {
		return altItem;
	}


	public void setAltItem(String altItem) {
		this.altItem = altItem;
	}


	public Float getUnitWeight() {
		return unitWeight;
	}


	public void setUnitWeight(Float unitWeight) {
		this.unitWeight = unitWeight;
	}


	public String getWeightUnits() {
		return weightUnits;
	}


	public void setWeightUnits(String weightUnits) {
		this.weightUnits = weightUnits;
	}


	public String getUserCode() {
		return userCode;
	}


	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}


	public boolean isTaxFlag() {
		return taxFlag;
	}


	public void setTaxFlag(boolean taxFlag) {
		this.taxFlag = taxFlag;
	}


	public Float getCuruCost() {
		return curuCost;
	}


	public void setCuruCost(Float curuCost) {
		this.curuCost = curuCost;
	}


	public boolean isFeatType() {
		return featType;
	}


	public void setFeatType(boolean featType) {
		this.featType = featType;
	}


	public Float getVarLead() {
		return varLead;
	}


	public void setVarLead(Float varLead) {
		this.varLead = varLead;
	}


	public String getFeatStr() {
		return featStr;
	}


	public void setFeatStr(String featStr) {
		this.featStr = featStr;
	}


	public int getNextConfig() {
		return nextConfig;
	}


	public void setNextConfig(int nextConfig) {
		this.nextConfig = nextConfig;
	}


	public String getFeatTempl() {
		return featTempl;
	}


	public void setFeatTempl(String featTempl) {
		this.featTempl = featTempl;
	}


	public boolean isFlStock() {
		return flStock;
	}


	public void setFlStock(boolean flStock) {
		this.flStock = flStock;
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


	public boolean isTrackEcn() {
		return trackEcn;
	}


	public void setTrackEcn(boolean trackEcn) {
		this.trackEcn = trackEcn;
	}


	public ItemDiv getItemDiv() {
		return itemDiv;
	}


	public void setItemDiv(ItemDiv itemDiv) {
		this.itemDiv = itemDiv;
	}


	public PoItem getPoItemKey() {
		return poItemKey;
	}


	public void setPoItemKey(PoItem poItemKey) {
		this.poItemKey = poItemKey;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
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
		Item other = (Item) obj;
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
		return true;
	}


	@Override
	public String toString() {
		return "Item [id=" + id + ", item=" + item + ", description=" + description + ", qtyAllocjob=" + qtyAllocjob
				+ ", qtyWip=" + qtyWip + ", um=" + um + ", unitPrice=" + unitPrice + ", leadTime=" + leadTime
				+ ", lotSize=" + lotSize + ", qtyUsedYtd=" + qtyUsedYtd + ", qtyMfgYtd=" + qtyMfgYtd + ", abcCode="
				+ abcCode + ", drawingNbr=" + drawingNbr + ", productCode=" + productCode + ", pmCode=" + pmCode
				+ ", costMethod=" + costMethod + ", lstLotSize=" + lstLotSize + ", unitCost=" + unitCost + ", reprice="
				+ reprice + ", lstuCost=" + lstuCost + ", avguCost=" + avguCost + ", job=" + job + ", suffix=" + suffix
				+ ", stocked=" + stocked + ", matlType=" + matlType + ", key=" + key + ", lowLevel=" + lowLevel
				+ ", lastInv=" + lastInv + ", daysSupply=" + daysSupply + ", orderMin=" + orderMin + ", orderMult="
				+ orderMult + ", planCode=" + planCode + ", mpsFlag=" + mpsFlag + ", acceptReq=" + acceptReq
				+ ", changeDate=" + changeDate + ", revision=" + revision + ", phantomFlag=" + phantomFlag
				+ ", planFlag=" + planFlag + ", paperTime=" + paperTime + ", dockTime=" + dockTime + ", netChange="
				+ netChange + ", asmSetup=" + asmSetup + ", asmRun=" + asmRun + ", asmMatl=" + asmMatl + ", asmTool="
				+ asmTool + ", asmFixture=" + asmFixture + ", asmOther=" + asmOther + ", asmFixed=" + asmFixed
				+ ", asmVar=" + asmVar + ", asmOutside=" + asmOutside + ", compSetup=" + compSetup + ", compRun="
				+ compRun + ", compMatl=" + compMatl + ", compTool=" + compTool + ", compFixture=" + compFixture
				+ ", compOther=" + compOther + ", compFixed=" + compFixed + ", compVar=" + compVar + ", compOutside="
				+ compOutside + ", subMatl=" + subMatl + ", shrinkFact=" + shrinkFact + ", altItem=" + altItem
				+ ", unitWeight=" + unitWeight + ", weightUnits=" + weightUnits + ", userCode=" + userCode
				+ ", taxFlag=" + taxFlag + ", curuCost=" + curuCost + ", featType=" + featType + ", varLead=" + varLead
				+ ", featStr=" + featStr + ", nextConfig=" + nextConfig + ", featTempl=" + featTempl + ", flStock="
				+ flStock + ", charfld1=" + charfld1 + ", charfld2=" + charfld2 + ", charfld3=" + charfld3
				+ ", decifld1=" + decifld1 + ", decifld2=" + decifld2 + ", decifld3=" + decifld3 + ", logifld="
				+ logifld + ", datefld=" + datefld + ", trackEcn=" + trackEcn + "]";
	}
	
	

}
