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
@Table(name = "ITEM_DIV")
public class ItemDiv implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@JsonBackReference
	//bi_directional one_to_one association to itemKey
	@OneToOne(fetch=FetchType.EAGER, mappedBy="itemDiv")
	private Item itemKey;
		
		
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MOD_TIME")
	private Date updated; 
	  
	@PreUpdate
	protected void onUpdate() {
	    updated = new Date();
	}
	
	@Column(name = "item" ,length = 30) 
	private  String item	;	

	@Column(name = "prod_code" ,length = 10)
	private  int prodCode	;

	@Column(name = "comm_code" ,length = 20)	
	private  String commCode	;	

	@Column(name = "mro_item" ,length = 1)
	private  boolean	mroItem	;	

	@Column(name = "item_stat" ,length = 2)
	private  String	itemStat;	

	@Column(name = "Date_added" ,length = 10)
	private  Date DateAdded	;	

	@Column(name = "year_usage" ,length = 10)
	private  int yearUsage	;	

	@Column(name = "year_forecast" ,length = 10)
	private  int yearForecast;		

	@Column(name = "duty_class" ,length = 26)
	private  String dutyClass;		

	@Column(name = "high_tech" ,length = 1)
	private  boolean highTech;	

	@Column(name = "resale_ind" ,length = 1)
	private  boolean resaleInd;		

	@Column(name = "user_id" ,length = 16)
	private  String userId	;	

	@Column(name = "Country" ,length = 6)
	private  String Country	;	

	@Column(name = "buyer_uid" ,length = 16)
	private  String buyerUid	;	

	@Column(name = "last_update" ,length = 10)
	private  Date lastUpDate	;	

	@Column(name = "zz_avail_date_2" ,length = 10)
	private  Date zzAvailDate2	;	

	@Column(name = "date_maintained" ,length = 10)
	private  Date DateMaintained	;	

	@Column(name = "duty_cur" ,length = 18)
	private  Float dutyCur	;	

	@Column(name = "duty_std" ,length = 18)
	private  Float dutyStd	;	

	@Column(name = "last_inv_bal" ,length = 18)
	private  Float lastInvBal;		

	@Column(name = "zz_avail_int_1" ,length = 10)
	private  int zzAvailInt1	;	

	@Column(name = "zz_avail_int_2" ,length = 10)
	private  int zzAvailInt2	;	

	@Column(name = "zz_avail_int_3" ,length = 10)
	private  int zzAvailInt3		;

	@Column(name = "oto_product" ,length = 1)
	private  boolean otoProduct	;	

	@Column(name = "transact_oh_inv_ind" ,length = 1)
	private  boolean transactOhInvInd	;	

	@Column(name = "Nafta" ,length = 1)
	private  boolean Nafta	;	

	@Column(name = "code_number" ,length = 30)
	private  String codeNumber;		

	@Column(name = "ie_item_type" ,length = 2)
	private  String ieItemType;		

	@Column(name = "prior_ytd_usage" ,length = 20)
	private  int priorYtdUsage	;	

	@Column(name = "ie_cam_class" ,length = 12)
	private  String ieCamClass	;	

	@Column(name = "ie_im_suffix" ,length = 8)
	private  String ieImSuffix	;	

	@Column(name = "ie_em_suffix" ,length = 8)
	private  String ieEmSuffix;		

	@Column(name = "ie_ia_suffix" ,length = 13)
	private  String ieIaSuffix	;	

	@Column(name = "ie_ea_suffix" ,length = 8)
	private  String ieEaSuffix	;	

	@Column(name = "main_ship_plant" ,length = 2)
	private  String mainShipPlant;		

	@Column(name = "oe_plan_tm_fence" ,length = 10)
	private  int oePlanTmFence;		

	@Column(name = "pack_qty" ,length = 10)
	private  int packQty		;

	@Column(name = "pack_volume" ,length = 17)
	private  Float packVolume;		

	@Column(name = "factory_approval" ,length = 1)
	private  boolean factoryApproval	;	

	@Column(name = "country_origin" ,length = 2)
	private  String countryOrigin;		

	@Column(name = "sales_lead_time" ,length = 10)
	private  int salesLeadTime;

	@Column(name = "ie_um" ,length = 20)
	private  String ieUm		;

	@Column(name = "ie_um_conv" ,length = 19)
	private  Float ieUmConv	;	

	@Column(name = "monthly_usage" ,length = 240)
	private  String monthlyUsage	;	

	@Column(name = "autoreplen" ,length = 1)
	private  boolean autoreplen;		

	@Column(name = "autodirect" ,length = 1)
	private  boolean autodirect	;	

	@Column(name = "last_yr_purch_ytd" ,length = 18)
	private  Float lastYrPurchYtd;		

	@Column(name = "last_yr_mfg_ytd" ,length = 18)
	private  Float lastYrMfgYtd	;	

	@Column(name = "last_yr_used_ytd" ,length = 18)
	private  Float lastYrUsedYtd	;	

	@Column(name = "last_yr_sold_ytd" ,length = 18)
	private  Float lastYrSoldYtd	;	

	@Column(name = "ord_in_limit_eu_qty" ,length = 10)
	private  int ordInLimitEuQty	;	

	@Column(name = "ft_lead_time" ,length = 10)
	private  int ftLeadTime	;	

	@Column(name = "eu_factor_mult" ,length = 17)
	private  Float euFactorMult	;	

	@Column(name = "avail_for_ft_ind" ,length = 1)
	private  boolean availForFtInd	;	

	@Column(name = "allow_pack_to_be_broken" ,length = 1)
	private  boolean allowPackToBeBroken;		

	@Column(name = "min_co_ord_qty" ,length = 10)
	private  int minCoOrdQty	;	

	@Column(name = "drawing_nbr" ,length = 50)
	private  String drawingNbr;		

	@Column(name = "revision" ,length = 16)
	private  String revision	;	

	@Column(name = "ec_trans_Date" ,length = 10)
	private  Date ecTransDate;		

	@Column(name = "pack_volume_id" ,length = 10)
	private  String packVolumeId	;	

	@Column(name = "pack_typ" ,length = 8)
	private  String packTyp		;

	@Column(name = "prod_src_typ" ,length = 8)
	private  String prodSrcTyp	;	

	@Column(name = "buy_american_ind" ,length = 1)
	private  boolean buyAmericanInd	;	

	@Column(name = "buy_american_xref_prod_id" ,length = 30)
	private  String buyAmericanXrefProdId	;	

	@Column(name = "buy_american_xref_cell_id" ,length = 10)
	private  int buyAmericanXrefCellId	;	

	@Column(name = "emerg_serv_avail_ind" ,length = 1)
	private  boolean emergServAvailInd	;	

	@Column(name = "fast_track_serv_avail_ind" ,length = 1)
	private  boolean fastTrackServAvailInd;		

	@Column(name = "emerg_repair_serv_avail_ind" ,length = 1)
	private  boolean emergRepairServAvailInd	;	

	@Column(name = "planner_id" ,length = 16)
	private  String plannerId;	

	@Column(name = "stocked_at_whse" ,length = 1)
	private  boolean stockedAtWhse;		

	@Column(name = "consign_loc" ,length = 1)
	private  boolean consignLoc	;	

	@Column(name = "logifld_div" ,length = 1)
	private  boolean logifldDiv;		

	@Column(name = "decfld_div" ,length = 17)
	private  Float decfldDiv	;	

	@Column(name = "intfld_div" ,length = 10)
	private  int intfldDiv	;	

	@Column(name = "datefld_div" ,length = 10)
	private  Date DatefldDiv	;	

	@Column(name = "standard_custom" ,length = 1)
	private  boolean standardCustom	;	

	@Column(name = "ship_dt" ,length = 10)
	private  Date shipDt		;

	@Column(name = "vship_support_seq_id" ,length = 10)
	private  int vshipSupportSeqId;		

	@Column(name = "ship_acct_nbr" ,length = 40)
	private  String shipAcctNbr	;	

	@Column(name = "mfg_cell" ,length = 16)
	private  String mfgCell	;	

	@Column(name = "zz_charfld1_div" ,length = 44)
	private  String zzCharfld1Div;		

	@Column(name = "zz_charfld2_div" ,length = 40)
	private  String zzCharfld2Div;		

	@Column(name = "zz_charfld3_div" ,length = 40)
	private  String zzCharfld3Div	;	

	@Column(name = "zz_intefld1_div" ,length = 10)
	private  int zzIntefld1Div	;	

	@Column(name = "zz_intefld2_div" ,length = 10)
	private  int zzIntefld2Div	;	

	@Column(name = "zz_intefld3_div" ,length = 10)
	private  int zzIntefld3Div	;	

	@Column(name = "zz_decifld1_div" ,length = 17)
	private  Float zzDecifld1Div	;	

	@Column(name = "zz_decifld2_div" ,length = 17)
	private  Float zzDecifld2Div	;	

	@Column(name = "zz_decifld3_div" ,length = 17)
	private  Float zzDecifld3Div	;	

	@Column(name = "zz_logifld1_div" ,length = 1)
	private  boolean zzLogifld1Div;		

	@Column(name = "zz_logifld2_div" ,length = 1)
	private  boolean zzLogifld2Div;		

	@Column(name = "zz_logifld3_div" ,length = 1)
	private  boolean zzLogifld3Div;		

	@Column(name = "zz_datefld1_div" ,length = 10)
	private  Date zzDatefld1Div	;	

	@Column(name = "zz_datefld2_div" ,length = 10)
	private  Date zzDatefld2Div;		

	@Column(name = "zz_datefld3_div" ,length = 10)
	private  Date zzDatefld3Div	;	

	@Column(name = "backflush_from_consign" ,length = 1)
	private  boolean backflushFromConsign;		

	@Column(name = "daily_usage" ,length = 17)
	private  Float dailyUsage	;	

	@Column(name = "kb_stop_rel" ,length = 1)
	private  boolean kbStopRel	;	

	@Column(name = "kb_stop_by" ,length = 20)
	private  String kbStopBy	;	

	@Column(name = "kb_override_qty" ,length = 1)
	private  boolean kbOverrideQty	;	

	@Column(name = "kb_override_by" ,length = 20)
	private  String kbOverrideBy	;	

	@Column(name = "kb_stop_Date" ,length = 10)
	private  Date kbStopDate		;

	@Column(name = "kb_override_Date" ,length = 10)
	private  Date kbOverrideDate;		

	@Column(name = "vmi_item" ,length = 1)
	private  boolean vmiItem		;

	@Column(name = "bto_item" ,length = 1)
	private  boolean btoItem		;

	@Column(name = "serial_no_req_ind" ,length = 1)
	private  boolean serialNoReqInd	;	

	@Column(name = "hazardous_material_ind" ,length = 1)
	private  boolean hazardousMaterialInd	;	

	@Column(name = "avail_sds_item_ind" ,length = 1)
	private  boolean availSdsItemInd	;	

	@Column(name = "skid_ind" ,length = 1)
	private  boolean skidInd		;

	@Column(name = "order_up_to_units" ,length = 17)
	private  Float orderUpToUnits;		

	@Column(name = "single_src_ind" ,length = 1)
	private  boolean singleSrcInd	;	

	@Column(name = "single_src_category" ,length = 4)
	private  String singleSrcCategory	;	

	@Column(name = "min_ss_qty" ,length = 10)
	private  int minSsQty;		

	@Column(name = "re_order_pt" ,length = 10)
	private  int reOrderPt	;	

	@Column(name = "order_up_to_qty" ,length = 10)
	private  int orderUpToQty;		

	@Column(name = "model_qty" ,length = 10)
	private  int modelQty	;	

	@Column(name = "behavior" ,length = 6)
	private  String behavior		;

	@Column(name = "pareto" ,length = 2)
	private  String pareto		;

	@Column(name = "optimiza_stock_ind" ,length = 1)
	private  boolean optimizaStockInd	;	

	@Column(name = "criticality" ,length = 10)
	private  int criticality	;	

	@Column(name = "recc_order_qty" ,length = 10)
	private  int reccOrderQty	;	

	@Column(name = "zz_charfld4_div" ,length = 40)
	private  String zzCharfld4Div;		

	@Column(name = "zz_charfld5_div" ,length = 40)
	private  String zzCharfld5Div;		

	@Column(name = "zz_charfld6_div" ,length = 40)
	private  String zzCharfld6Div;		

	@Column(name = "zz_intefld4_div" ,length = 10)
	private  int zzIntefld4Div	;	

	@Column(name = "zz_intefld5_div" ,length = 10)
	private  int zzIntefld5Div	;	

	@Column(name = "zz_intefld6_div" ,length = 10)
	private  int zzIntefld6Div	;	

	@Column(name = "zz_decifld4_div" ,length = 17)
	private  Float zzDecifld4Div	;	

	@Column(name = "zz_decifld5_div" ,length = 17)
	private  Float zzDecifld5Div	;	

	@Column(name = "zz_decifld6_div" ,length = 17)
	private  Float zzDecifld6Div	;	

	@Column(name = "zz_logifld4_div" ,length = 1)
	private  boolean zzLogifld4Div;		

	@Column(name = "zz_logifld5_div" ,length = 1)
	private  boolean zzLogifld5Div;		

	@Column(name = "zz_logifld6_div" ,length = 1)
	private  boolean zzLogifld6Div;		

	@Column(name = "zz_datefld4_div" ,length = 10)
	private  Date zzDatefld4Div	;	

	@Column(name = "zz_datefld5_div" ,length = 10)
	private  Date zzDatefld5Div	;	

	@Column(name = "zz_datefld6_div" ,length = 10)
	private  Date zzDatefld6Div;

	@Column(name = "ship_support_seq_id" ,length = 10)
	private  int shipSupportSeqId;
	
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

	public int getProdCode() {
		return prodCode;
	}

	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}

	public String getCommCode() {
		return commCode;
	}

	public void setCommCode(String commCode) {
		this.commCode = commCode;
	}

	public boolean isMroItem() {
		return mroItem;
	}

	public void setMroItem(boolean mroItem) {
		this.mroItem = mroItem;
	}

	public String getItemStat() {
		return itemStat;
	}

	public void setItemStat(String itemStat) {
		this.itemStat = itemStat;
	}

	public Date getDateAdded() {
		return DateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		DateAdded = dateAdded;
	}

	public int getYearUsage() {
		return yearUsage;
	}

	public void setYearUsage(int yearUsage) {
		this.yearUsage = yearUsage;
	}

	public int getYearForecast() {
		return yearForecast;
	}

	public void setYearForecast(int yearForecast) {
		this.yearForecast = yearForecast;
	}

	public String getDutyClass() {
		return dutyClass;
	}

	public void setDutyClass(String dutyClass) {
		this.dutyClass = dutyClass;
	}

	public boolean isHighTech() {
		return highTech;
	}

	public void setHighTech(boolean highTech) {
		this.highTech = highTech;
	}

	public boolean isResaleInd() {
		return resaleInd;
	}

	public void setResaleInd(boolean resaleInd) {
		this.resaleInd = resaleInd;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getBuyerUid() {
		return buyerUid;
	}

	public void setBuyerUid(String buyerUid) {
		this.buyerUid = buyerUid;
	}

	public Date getLastUpDate() {
		return lastUpDate;
	}

	public void setLastUpDate(Date lastUpDate) {
		this.lastUpDate = lastUpDate;
	}

	public Date getZzAvailDate2() {
		return zzAvailDate2;
	}

	public void setZzAvailDate2(Date zzAvailDate2) {
		this.zzAvailDate2 = zzAvailDate2;
	}

	public Date getDateMaintained() {
		return DateMaintained;
	}

	public void setDateMaintained(Date dateMaintained) {
		DateMaintained = dateMaintained;
	}

	public Float getDutyCur() {
		return dutyCur;
	}

	public void setDutyCur(Float dutyCur) {
		this.dutyCur = dutyCur;
	}

	public Float getDutyStd() {
		return dutyStd;
	}

	public void setDutyStd(Float dutyStd) {
		this.dutyStd = dutyStd;
	}

	public Float getLastInvBal() {
		return lastInvBal;
	}

	public void setLastInvBal(Float lastInvBal) {
		this.lastInvBal = lastInvBal;
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

	public boolean isOtoProduct() {
		return otoProduct;
	}

	public void setOtoProduct(boolean otoProduct) {
		this.otoProduct = otoProduct;
	}

	public boolean isTransactOhInvInd() {
		return transactOhInvInd;
	}

	public void setTransactOhInvInd(boolean transactOhInvInd) {
		this.transactOhInvInd = transactOhInvInd;
	}

	public boolean isNafta() {
		return Nafta;
	}

	public void setNafta(boolean nafta) {
		Nafta = nafta;
	}

	public String getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}

	public String getIeItemType() {
		return ieItemType;
	}

	public void setIeItemType(String ieItemType) {
		this.ieItemType = ieItemType;
	}

	public int getPriorYtdUsage() {
		return priorYtdUsage;
	}

	public void setPriorYtdUsage(int priorYtdUsage) {
		this.priorYtdUsage = priorYtdUsage;
	}

	public String getIeCamClass() {
		return ieCamClass;
	}

	public void setIeCamClass(String ieCamClass) {
		this.ieCamClass = ieCamClass;
	}

	public String getIeImSuffix() {
		return ieImSuffix;
	}

	public void setIeImSuffix(String ieImSuffix) {
		this.ieImSuffix = ieImSuffix;
	}

	public String getIeEmSuffix() {
		return ieEmSuffix;
	}

	public void setIeEmSuffix(String ieEmSuffix) {
		this.ieEmSuffix = ieEmSuffix;
	}

	public String getIeIaSuffix() {
		return ieIaSuffix;
	}

	public void setIeIaSuffix(String ieIaSuffix) {
		this.ieIaSuffix = ieIaSuffix;
	}

	public String getIeEaSuffix() {
		return ieEaSuffix;
	}

	public void setIeEaSuffix(String ieEaSuffix) {
		this.ieEaSuffix = ieEaSuffix;
	}

	public String getMainShipPlant() {
		return mainShipPlant;
	}

	public void setMainShipPlant(String mainShipPlant) {
		this.mainShipPlant = mainShipPlant;
	}

	public int getOePlanTmFence() {
		return oePlanTmFence;
	}

	public void setOePlanTmFence(int oePlanTmFence) {
		this.oePlanTmFence = oePlanTmFence;
	}

	public int getPackQty() {
		return packQty;
	}

	public void setPackQty(int packQty) {
		this.packQty = packQty;
	}

	public Float getPackVolume() {
		return packVolume;
	}

	public void setPackVolume(Float packVolume) {
		this.packVolume = packVolume;
	}

	public boolean isFactoryApproval() {
		return factoryApproval;
	}

	public void setFactoryApproval(boolean factoryApproval) {
		this.factoryApproval = factoryApproval;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public int getSalesLeadTime() {
		return salesLeadTime;
	}

	public void setSalesLeadTime(int salesLeadTime) {
		this.salesLeadTime = salesLeadTime;
	}

	public String getIeUm() {
		return ieUm;
	}

	public void setIeUm(String ieUm) {
		this.ieUm = ieUm;
	}

	public Float getIeUmConv() {
		return ieUmConv;
	}

	public void setIeUmConv(Float ieUmConv) {
		this.ieUmConv = ieUmConv;
	}

	public String getMonthlyUsage() {
		return monthlyUsage;
	}

	public void setMonthlyUsage(String monthlyUsage) {
		this.monthlyUsage = monthlyUsage;
	}

	public boolean isAutoreplen() {
		return autoreplen;
	}

	public void setAutoreplen(boolean autoreplen) {
		this.autoreplen = autoreplen;
	}

	public boolean isAutodirect() {
		return autodirect;
	}

	public void setAutodirect(boolean autodirect) {
		this.autodirect = autodirect;
	}

	public Float getLastYrPurchYtd() {
		return lastYrPurchYtd;
	}

	public void setLastYrPurchYtd(Float lastYrPurchYtd) {
		this.lastYrPurchYtd = lastYrPurchYtd;
	}

	public Float getLastYrMfgYtd() {
		return lastYrMfgYtd;
	}

	public void setLastYrMfgYtd(Float lastYrMfgYtd) {
		this.lastYrMfgYtd = lastYrMfgYtd;
	}

	public Float getLastYrUsedYtd() {
		return lastYrUsedYtd;
	}

	public void setLastYrUsedYtd(Float lastYrUsedYtd) {
		this.lastYrUsedYtd = lastYrUsedYtd;
	}

	public Float getLastYrSoldYtd() {
		return lastYrSoldYtd;
	}

	public void setLastYrSoldYtd(Float lastYrSoldYtd) {
		this.lastYrSoldYtd = lastYrSoldYtd;
	}

	public int getOrdInLimitEuQty() {
		return ordInLimitEuQty;
	}

	public void setOrdInLimitEuQty(int ordInLimitEuQty) {
		this.ordInLimitEuQty = ordInLimitEuQty;
	}

	public int getFtLeadTime() {
		return ftLeadTime;
	}

	public void setFtLeadTime(int ftLeadTime) {
		this.ftLeadTime = ftLeadTime;
	}

	public Float getEuFactorMult() {
		return euFactorMult;
	}

	public void setEuFactorMult(Float euFactorMult) {
		this.euFactorMult = euFactorMult;
	}

	public boolean isAvailForFtInd() {
		return availForFtInd;
	}

	public void setAvailForFtInd(boolean availForFtInd) {
		this.availForFtInd = availForFtInd;
	}

	public boolean isAllowPackToBeBroken() {
		return allowPackToBeBroken;
	}

	public void setAllowPackToBeBroken(boolean allowPackToBeBroken) {
		this.allowPackToBeBroken = allowPackToBeBroken;
	}

	public int getMinCoOrdQty() {
		return minCoOrdQty;
	}

	public void setMinCoOrdQty(int minCoOrdQty) {
		this.minCoOrdQty = minCoOrdQty;
	}

	public String getDrawingNbr() {
		return drawingNbr;
	}

	public void setDrawingNbr(String drawingNbr) {
		this.drawingNbr = drawingNbr;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public Date getEcTransDate() {
		return ecTransDate;
	}

	public void setEcTransDate(Date ecTransDate) {
		this.ecTransDate = ecTransDate;
	}

	public String getPackVolumeId() {
		return packVolumeId;
	}

	public void setPackVolumeId(String packVolumeId) {
		this.packVolumeId = packVolumeId;
	}

	public String getPackTyp() {
		return packTyp;
	}

	public void setPackTyp(String packTyp) {
		this.packTyp = packTyp;
	}

	public String getProdSrcTyp() {
		return prodSrcTyp;
	}

	public void setProdSrcTyp(String prodSrcTyp) {
		this.prodSrcTyp = prodSrcTyp;
	}

	public boolean isBuyAmericanInd() {
		return buyAmericanInd;
	}

	public void setBuyAmericanInd(boolean buyAmericanInd) {
		this.buyAmericanInd = buyAmericanInd;
	}

	public String getBuyAmericanXrefProdId() {
		return buyAmericanXrefProdId;
	}

	public void setBuyAmericanXrefProdId(String buyAmericanXrefProdId) {
		this.buyAmericanXrefProdId = buyAmericanXrefProdId;
	}

	public int getBuyAmericanXrefCellId() {
		return buyAmericanXrefCellId;
	}

	public void setBuyAmericanXrefCellId(int buyAmericanXrefCellId) {
		this.buyAmericanXrefCellId = buyAmericanXrefCellId;
	}

	public boolean isEmergServAvailInd() {
		return emergServAvailInd;
	}

	public void setEmergServAvailInd(boolean emergServAvailInd) {
		this.emergServAvailInd = emergServAvailInd;
	}

	public boolean isFastTrackServAvailInd() {
		return fastTrackServAvailInd;
	}

	public void setFastTrackServAvailInd(boolean fastTrackServAvailInd) {
		this.fastTrackServAvailInd = fastTrackServAvailInd;
	}

	public boolean isEmergRepairServAvailInd() {
		return emergRepairServAvailInd;
	}

	public void setEmergRepairServAvailInd(boolean emergRepairServAvailInd) {
		this.emergRepairServAvailInd = emergRepairServAvailInd;
	}

	public String getPlannerId() {
		return plannerId;
	}

	public void setPlannerId(String plannerId) {
		this.plannerId = plannerId;
	}

	public boolean isStockedAtWhse() {
		return stockedAtWhse;
	}

	public void setStockedAtWhse(boolean stockedAtWhse) {
		this.stockedAtWhse = stockedAtWhse;
	}

	public boolean isConsignLoc() {
		return consignLoc;
	}

	public void setConsignLoc(boolean consignLoc) {
		this.consignLoc = consignLoc;
	}

	public boolean isLogifldDiv() {
		return logifldDiv;
	}

	public void setLogifldDiv(boolean logifldDiv) {
		this.logifldDiv = logifldDiv;
	}

	public Float getDecfldDiv() {
		return decfldDiv;
	}

	public void setDecfldDiv(Float decfldDiv) {
		this.decfldDiv = decfldDiv;
	}

	public int getIntfldDiv() {
		return intfldDiv;
	}

	public void setIntfldDiv(int intfldDiv) {
		this.intfldDiv = intfldDiv;
	}

	public Date getDatefldDiv() {
		return DatefldDiv;
	}

	public void setDatefldDiv(Date datefldDiv) {
		DatefldDiv = datefldDiv;
	}

	public boolean isStandardCustom() {
		return standardCustom;
	}

	public void setStandardCustom(boolean standardCustom) {
		this.standardCustom = standardCustom;
	}

	public Date getShipDt() {
		return shipDt;
	}

	public void setShipDt(Date shipDt) {
		this.shipDt = shipDt;
	}

	public int getVshipSupportSeqId() {
		return vshipSupportSeqId;
	}

	public void setVshipSupportSeqId(int vshipSupportSeqId) {
		this.vshipSupportSeqId = vshipSupportSeqId;
	}

	public String getShipAcctNbr() {
		return shipAcctNbr;
	}

	public void setShipAcctNbr(String shipAcctNbr) {
		this.shipAcctNbr = shipAcctNbr;
	}

	public String getMfgCell() {
		return mfgCell;
	}

	public void setMfgCell(String mfgCell) {
		this.mfgCell = mfgCell;
	}

	public String getZzCharfld1Div() {
		return zzCharfld1Div;
	}

	public void setZzCharfld1Div(String zzCharfld1Div) {
		this.zzCharfld1Div = zzCharfld1Div;
	}

	public String getZzCharfld2Div() {
		return zzCharfld2Div;
	}

	public void setZzCharfld2Div(String zzCharfld2Div) {
		this.zzCharfld2Div = zzCharfld2Div;
	}

	public String getZzCharfld3Div() {
		return zzCharfld3Div;
	}

	public void setZzCharfld3Div(String zzCharfld3Div) {
		this.zzCharfld3Div = zzCharfld3Div;
	}

	public int getZzIntefld1Div() {
		return zzIntefld1Div;
	}

	public void setZzIntefld1Div(int zzIntefld1Div) {
		this.zzIntefld1Div = zzIntefld1Div;
	}

	public int getZzIntefld2Div() {
		return zzIntefld2Div;
	}

	public void setZzIntefld2Div(int zzIntefld2Div) {
		this.zzIntefld2Div = zzIntefld2Div;
	}

	public int getZzIntefld3Div() {
		return zzIntefld3Div;
	}

	public void setZzIntefld3Div(int zzIntefld3Div) {
		this.zzIntefld3Div = zzIntefld3Div;
	}

	public Float getZzDecifld1Div() {
		return zzDecifld1Div;
	}

	public void setZzDecifld1Div(Float zzDecifld1Div) {
		this.zzDecifld1Div = zzDecifld1Div;
	}

	public Float getZzDecifld2Div() {
		return zzDecifld2Div;
	}

	public void setZzDecifld2Div(Float zzDecifld2Div) {
		this.zzDecifld2Div = zzDecifld2Div;
	}

	public Float getZzDecifld3Div() {
		return zzDecifld3Div;
	}

	public void setZzDecifld3Div(Float zzDecifld3Div) {
		this.zzDecifld3Div = zzDecifld3Div;
	}

	public boolean isZzLogifld1Div() {
		return zzLogifld1Div;
	}

	public void setZzLogifld1Div(boolean zzLogifld1Div) {
		this.zzLogifld1Div = zzLogifld1Div;
	}

	public boolean isZzLogifld2Div() {
		return zzLogifld2Div;
	}

	public void setZzLogifld2Div(boolean zzLogifld2Div) {
		this.zzLogifld2Div = zzLogifld2Div;
	}

	public boolean isZzLogifld3Div() {
		return zzLogifld3Div;
	}

	public void setZzLogifld3Div(boolean zzLogifld3Div) {
		this.zzLogifld3Div = zzLogifld3Div;
	}

	public Date getZzDatefld1Div() {
		return zzDatefld1Div;
	}

	public void setZzDatefld1Div(Date zzDatefld1Div) {
		this.zzDatefld1Div = zzDatefld1Div;
	}

	public Date getZzDatefld2Div() {
		return zzDatefld2Div;
	}

	public void setZzDatefld2Div(Date zzDatefld2Div) {
		this.zzDatefld2Div = zzDatefld2Div;
	}

	public Date getZzDatefld3Div() {
		return zzDatefld3Div;
	}

	public void setZzDatefld3Div(Date zzDatefld3Div) {
		this.zzDatefld3Div = zzDatefld3Div;
	}

	public boolean isBackflushFromConsign() {
		return backflushFromConsign;
	}

	public void setBackflushFromConsign(boolean backflushFromConsign) {
		this.backflushFromConsign = backflushFromConsign;
	}

	public Float getDailyUsage() {
		return dailyUsage;
	}

	public void setDailyUsage(Float dailyUsage) {
		this.dailyUsage = dailyUsage;
	}

	public boolean isKbStopRel() {
		return kbStopRel;
	}

	public void setKbStopRel(boolean kbStopRel) {
		this.kbStopRel = kbStopRel;
	}

	public String getKbStopBy() {
		return kbStopBy;
	}

	public void setKbStopBy(String kbStopBy) {
		this.kbStopBy = kbStopBy;
	}

	public boolean isKbOverrideQty() {
		return kbOverrideQty;
	}

	public void setKbOverrideQty(boolean kbOverrideQty) {
		this.kbOverrideQty = kbOverrideQty;
	}

	public String getKbOverrideBy() {
		return kbOverrideBy;
	}

	public void setKbOverrideBy(String kbOverrideBy) {
		this.kbOverrideBy = kbOverrideBy;
	}

	public Date getKbStopDate() {
		return kbStopDate;
	}

	public void setKbStopDate(Date kbStopDate) {
		this.kbStopDate = kbStopDate;
	}

	public Date getKbOverrideDate() {
		return kbOverrideDate;
	}

	public void setKbOverrideDate(Date kbOverrideDate) {
		this.kbOverrideDate = kbOverrideDate;
	}

	public boolean isVmiItem() {
		return vmiItem;
	}

	public void setVmiItem(boolean vmiItem) {
		this.vmiItem = vmiItem;
	}

	public boolean isBtoItem() {
		return btoItem;
	}

	public void setBtoItem(boolean btoItem) {
		this.btoItem = btoItem;
	}

	public boolean isSerialNoReqInd() {
		return serialNoReqInd;
	}

	public void setSerialNoReqInd(boolean serialNoReqInd) {
		this.serialNoReqInd = serialNoReqInd;
	}

	public boolean isHazardousMaterialInd() {
		return hazardousMaterialInd;
	}

	public void setHazardousMaterialInd(boolean hazardousMaterialInd) {
		this.hazardousMaterialInd = hazardousMaterialInd;
	}

	public boolean isAvailSdsItemInd() {
		return availSdsItemInd;
	}

	public void setAvailSdsItemInd(boolean availSdsItemInd) {
		this.availSdsItemInd = availSdsItemInd;
	}

	public boolean isSkidInd() {
		return skidInd;
	}

	public void setSkidInd(boolean skidInd) {
		this.skidInd = skidInd;
	}

	public Float getOrderUpToUnits() {
		return orderUpToUnits;
	}

	public void setOrderUpToUnits(Float orderUpToUnits) {
		this.orderUpToUnits = orderUpToUnits;
	}

	public boolean isSingleSrcInd() {
		return singleSrcInd;
	}

	public void setSingleSrcInd(boolean singleSrcInd) {
		this.singleSrcInd = singleSrcInd;
	}

	public String getSingleSrcCategory() {
		return singleSrcCategory;
	}

	public void setSingleSrcCategory(String singleSrcCategory) {
		this.singleSrcCategory = singleSrcCategory;
	}

	public int getMinSsQty() {
		return minSsQty;
	}

	public void setMinSsQty(int minSsQty) {
		this.minSsQty = minSsQty;
	}

	public int getReOrderPt() {
		return reOrderPt;
	}

	public void setReOrderPt(int reOrderPt) {
		this.reOrderPt = reOrderPt;
	}

	public int getOrderUpToQty() {
		return orderUpToQty;
	}

	public void setOrderUpToQty(int orderUpToQty) {
		this.orderUpToQty = orderUpToQty;
	}

	public int getModelQty() {
		return modelQty;
	}

	public void setModelQty(int modelQty) {
		this.modelQty = modelQty;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getPareto() {
		return pareto;
	}

	public void setPareto(String pareto) {
		this.pareto = pareto;
	}

	public boolean isOptimizaStockInd() {
		return optimizaStockInd;
	}

	public void setOptimizaStockInd(boolean optimizaStockInd) {
		this.optimizaStockInd = optimizaStockInd;
	}

	public int getCriticality() {
		return criticality;
	}

	public void setCriticality(int criticality) {
		this.criticality = criticality;
	}

	public int getReccOrderQty() {
		return reccOrderQty;
	}

	public void setReccOrderQty(int reccOrderQty) {
		this.reccOrderQty = reccOrderQty;
	}

	public String getZzCharfld4Div() {
		return zzCharfld4Div;
	}

	public void setZzCharfld4Div(String zzCharfld4Div) {
		this.zzCharfld4Div = zzCharfld4Div;
	}

	public String getZzCharfld5Div() {
		return zzCharfld5Div;
	}

	public void setZzCharfld5Div(String zzCharfld5Div) {
		this.zzCharfld5Div = zzCharfld5Div;
	}

	public String getZzCharfld6Div() {
		return zzCharfld6Div;
	}

	public void setZzCharfld6Div(String zzCharfld6Div) {
		this.zzCharfld6Div = zzCharfld6Div;
	}

	public int getZzIntefld4Div() {
		return zzIntefld4Div;
	}

	public void setZzIntefld4Div(int zzIntefld4Div) {
		this.zzIntefld4Div = zzIntefld4Div;
	}

	public int getZzIntefld5Div() {
		return zzIntefld5Div;
	}

	public void setZzIntefld5Div(int zzIntefld5Div) {
		this.zzIntefld5Div = zzIntefld5Div;
	}

	public int getZzIntefld6Div() {
		return zzIntefld6Div;
	}

	public void setZzIntefld6Div(int zzIntefld6Div) {
		this.zzIntefld6Div = zzIntefld6Div;
	}

	public Float getZzDecifld4Div() {
		return zzDecifld4Div;
	}

	public void setZzDecifld4Div(Float zzDecifld4Div) {
		this.zzDecifld4Div = zzDecifld4Div;
	}

	public Float getZzDecifld5Div() {
		return zzDecifld5Div;
	}

	public void setZzDecifld5Div(Float zzDecifld5Div) {
		this.zzDecifld5Div = zzDecifld5Div;
	}

	public Float getZzDecifld6Div() {
		return zzDecifld6Div;
	}

	public void setZzDecifld6Div(Float zzDecifld6Div) {
		this.zzDecifld6Div = zzDecifld6Div;
	}

	public boolean isZzLogifld4Div() {
		return zzLogifld4Div;
	}

	public void setZzLogifld4Div(boolean zzLogifld4Div) {
		this.zzLogifld4Div = zzLogifld4Div;
	}

	public boolean isZzLogifld5Div() {
		return zzLogifld5Div;
	}

	public void setZzLogifld5Div(boolean zzLogifld5Div) {
		this.zzLogifld5Div = zzLogifld5Div;
	}

	public boolean isZzLogifld6Div() {
		return zzLogifld6Div;
	}

	public void setZzLogifld6Div(boolean zzLogifld6Div) {
		this.zzLogifld6Div = zzLogifld6Div;
	}

	public Date getZzDatefld4Div() {
		return zzDatefld4Div;
	}

	public void setZzDatefld4Div(Date zzDatefld4Div) {
		this.zzDatefld4Div = zzDatefld4Div;
	}

	public Date getZzDatefld5Div() {
		return zzDatefld5Div;
	}

	public void setZzDatefld5Div(Date zzDatefld5Div) {
		this.zzDatefld5Div = zzDatefld5Div;
	}

	public Date getZzDatefld6Div() {
		return zzDatefld6Div;
	}

	public void setZzDatefld6Div(Date zzDatefld6Div) {
		this.zzDatefld6Div = zzDatefld6Div;
	}

	public Item getItemKey() {
		return itemKey;
	}

	public void setItemKey(Item itemKey) {
		this.itemKey = itemKey;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getShipSupportSeqId() {
		return shipSupportSeqId;
	}

	public void setShipSupportSeqId(int shipSupportSeqId) {
		this.shipSupportSeqId = shipSupportSeqId;
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
		ItemDiv other = (ItemDiv) obj;
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
		return "ItemDiv [id=" + id + ", itemKey=" + itemKey + ", updated=" + updated + ", item=" + item + ", prodCode="
				+ prodCode + ", commCode=" + commCode + ", mroItem=" + mroItem + ", itemStat=" + itemStat
				+ ", DateAdded=" + DateAdded + ", yearUsage=" + yearUsage + ", yearForecast=" + yearForecast
				+ ", dutyClass=" + dutyClass + ", highTech=" + highTech + ", resaleInd=" + resaleInd + ", userId="
				+ userId + ", Country=" + Country + ", buyerUid=" + buyerUid + ", lastUpDate=" + lastUpDate
				+ ", zzAvailDate2=" + zzAvailDate2 + ", DateMaintained=" + DateMaintained + ", dutyCur=" + dutyCur
				+ ", dutyStd=" + dutyStd + ", lastInvBal=" + lastInvBal + ", zzAvailInt1=" + zzAvailInt1
				+ ", zzAvailInt2=" + zzAvailInt2 + ", zzAvailInt3=" + zzAvailInt3 + ", otoProduct=" + otoProduct
				+ ", transactOhInvInd=" + transactOhInvInd + ", Nafta=" + Nafta + ", codeNumber=" + codeNumber
				+ ", ieItemType=" + ieItemType + ", priorYtdUsage=" + priorYtdUsage + ", ieCamClass=" + ieCamClass
				+ ", ieImSuffix=" + ieImSuffix + ", ieEmSuffix=" + ieEmSuffix + ", ieIaSuffix=" + ieIaSuffix
				+ ", ieEaSuffix=" + ieEaSuffix + ", mainShipPlant=" + mainShipPlant + ", oePlanTmFence=" + oePlanTmFence
				+ ", packQty=" + packQty + ", packVolume=" + packVolume + ", factoryApproval=" + factoryApproval
				+ ", countryOrigin=" + countryOrigin + ", salesLeadTime=" + salesLeadTime + ", ieUm=" + ieUm
				+ ", ieUmConv=" + ieUmConv + ", monthlyUsage=" + monthlyUsage + ", autoreplen=" + autoreplen
				+ ", autodirect=" + autodirect + ", lastYrPurchYtd=" + lastYrPurchYtd + ", lastYrMfgYtd=" + lastYrMfgYtd
				+ ", lastYrUsedYtd=" + lastYrUsedYtd + ", lastYrSoldYtd=" + lastYrSoldYtd + ", ordInLimitEuQty="
				+ ordInLimitEuQty + ", ftLeadTime=" + ftLeadTime + ", euFactorMult=" + euFactorMult + ", availForFtInd="
				+ availForFtInd + ", allowPackToBeBroken=" + allowPackToBeBroken + ", minCoOrdQty=" + minCoOrdQty
				+ ", drawingNbr=" + drawingNbr + ", revision=" + revision + ", ecTransDate=" + ecTransDate
				+ ", packVolumeId=" + packVolumeId + ", packTyp=" + packTyp + ", prodSrcTyp=" + prodSrcTyp
				+ ", buyAmericanInd=" + buyAmericanInd + ", buyAmericanXrefProdId=" + buyAmericanXrefProdId
				+ ", buyAmericanXrefCellId=" + buyAmericanXrefCellId + ", emergServAvailInd=" + emergServAvailInd
				+ ", fastTrackServAvailInd=" + fastTrackServAvailInd + ", emergRepairServAvailInd="
				+ emergRepairServAvailInd + ", plannerId=" + plannerId + ", stockedAtWhse=" + stockedAtWhse
				+ ", consignLoc=" + consignLoc + ", logifldDiv=" + logifldDiv + ", decfldDiv=" + decfldDiv
				+ ", intfldDiv=" + intfldDiv + ", DatefldDiv=" + DatefldDiv + ", standardCustom=" + standardCustom
				+ ", shipDt=" + shipDt + ", vshipSupportSeqId=" + vshipSupportSeqId + ", shipAcctNbr=" + shipAcctNbr
				+ ", mfgCell=" + mfgCell + ", zzCharfld1Div=" + zzCharfld1Div + ", zzCharfld2Div=" + zzCharfld2Div
				+ ", zzCharfld3Div=" + zzCharfld3Div + ", zzIntefld1Div=" + zzIntefld1Div + ", zzIntefld2Div="
				+ zzIntefld2Div + ", zzIntefld3Div=" + zzIntefld3Div + ", zzDecifld1Div=" + zzDecifld1Div
				+ ", zzDecifld2Div=" + zzDecifld2Div + ", zzDecifld3Div=" + zzDecifld3Div + ", zzLogifld1Div="
				+ zzLogifld1Div + ", zzLogifld2Div=" + zzLogifld2Div + ", zzLogifld3Div=" + zzLogifld3Div
				+ ", zzDatefld1Div=" + zzDatefld1Div + ", zzDatefld2Div=" + zzDatefld2Div + ", zzDatefld3Div="
				+ zzDatefld3Div + ", backflushFromConsign=" + backflushFromConsign + ", dailyUsage=" + dailyUsage
				+ ", kbStopRel=" + kbStopRel + ", kbStopBy=" + kbStopBy + ", kbOverrideQty=" + kbOverrideQty
				+ ", kbOverrideBy=" + kbOverrideBy + ", kbStopDate=" + kbStopDate + ", kbOverrideDate=" + kbOverrideDate
				+ ", vmiItem=" + vmiItem + ", btoItem=" + btoItem + ", serialNoReqInd=" + serialNoReqInd
				+ ", hazardousMaterialInd=" + hazardousMaterialInd + ", availSdsItemInd=" + availSdsItemInd
				+ ", skidInd=" + skidInd + ", orderUpToUnits=" + orderUpToUnits + ", singleSrcInd=" + singleSrcInd
				+ ", singleSrcCategory=" + singleSrcCategory + ", minSsQty=" + minSsQty + ", reOrderPt=" + reOrderPt
				+ ", orderUpToQty=" + orderUpToQty + ", modelQty=" + modelQty + ", behavior=" + behavior + ", pareto="
				+ pareto + ", optimizaStockInd=" + optimizaStockInd + ", criticality=" + criticality + ", reccOrderQty="
				+ reccOrderQty + ", zzCharfld4Div=" + zzCharfld4Div + ", zzCharfld5Div=" + zzCharfld5Div
				+ ", zzCharfld6Div=" + zzCharfld6Div + ", zzIntefld4Div=" + zzIntefld4Div + ", zzIntefld5Div="
				+ zzIntefld5Div + ", zzIntefld6Div=" + zzIntefld6Div + ", zzDecifld4Div=" + zzDecifld4Div
				+ ", zzDecifld5Div=" + zzDecifld5Div + ", zzDecifld6Div=" + zzDecifld6Div + ", zzLogifld4Div="
				+ zzLogifld4Div + ", zzLogifld5Div=" + zzLogifld5Div + ", zzLogifld6Div=" + zzLogifld6Div
				+ ", zzDatefld4Div=" + zzDatefld4Div + ", zzDatefld5Div=" + zzDatefld5Div + ", zzDatefld6Div="
				+ zzDatefld6Div + ", shipSupportSeqId=" + shipSupportSeqId + "]";
	}

	
}
