package com.jci.utils;

public class Constants {

	/**
	 * Query to fetch data from Symix.
	 */
	//public static final String SIMUX_QUERY ="SELECT * FROM \"po\" \"poAlias\" INNER JOIN \"poitem\" \"poitemAlias\"  ON  \"poAlias\".\"po-num\" = \"poitemAlias\".\"po-num\"  INNER JOIN \"vendor\" \"vAlias\"  ON  \"poAlias\".\"vend-num\" = \"vAlias\".\"vend-num\"  INNER JOIN \"item\" \"iAlias\"  ON  \"poitemAlias\".\"item\" = \"iAlias\".\"item\"   INNER JOIN \"shipto\" \"sAlias\"  ON  \"poitemAlias\".\"drop-ship-no\" = \"sAlias\".\"drop-ship-no\" and \"poAlias\".\"drop-ship-no\" = \"sAlias\".\"drop-ship-no\" INNER JOIN \"po-div\" \"podAlias\"  ON  \"podAlias\".\"po-num\" = \"poAlias\".\"po-num\" INNER JOIN \"vendor-div\" \"vdAlias\"  ON  \"vdAlias\".\"vend-num\" = \"vAlias\".\"vend-num\"  INNER JOIN \"item-div\" \"idAlias\"  ON  \"idAlias\".\"item\" = \"iAlias\".\"item\" WHERE \"poAlias\".\"order-date\" >=  ? ";
	public static final String SIMUX_QUERY ="SELECT * FROM \"po\" \"poAlias\" INNER JOIN \"poitem\" \"poitemAlias\"  ON  \"poAlias\".\"po-num\" = \"poitemAlias\".\"po-num\"  INNER JOIN \"vendor\" \"vAlias\"  ON  \"poAlias\".\"vend-num\" = \"vAlias\".\"vend-num\"  INNER JOIN \"item\" \"iAlias\"  ON  \"poitemAlias\".\"item\" = \"iAlias\".\"item\"   INNER JOIN \"shipto\" \"sAlias\"  ON  \"poitemAlias\".\"drop-ship-no\" = \"sAlias\".\"drop-ship-no\" and \"poAlias\".\"drop-ship-no\" = \"sAlias\".\"drop-ship-no\" INNER JOIN \"po-div\" \"podAlias\"  ON  \"podAlias\".\"po-num\" = \"poAlias\".\"po-num\" INNER JOIN \"vendor-div\" \"vdAlias\"  ON  \"vdAlias\".\"vend-num\" = \"vAlias\".\"vend-num\"  INNER JOIN \"item-div\" \"idAlias\"  ON  \"idAlias\".\"item\" = \"iAlias\".\"item\" INNER JOIN \"vendaddr\" \"vaAlias\"  ON  \"vaAlias\".\"vend-num\" = \"vAlias\".\"vend-num\"   WHERE \"poAlias\".\"order-date\" >=  ? ";
	
	/***
	 * Below are the list of PO status.
	 */
	public static final int STATUS_INTRANSIT =1;
	public static final int STATUS_TXN_COMPLETED =2;
	public static final int STATUS_ERRO_IN_PROCESS =3;
	
	
	/**
	 * Below are database source names and corresponding string values
	 */
	public static final String DATASOURCE_SYMIX ="Symix";
	
	
	/**
	 * Flat file name details 
	 * E.g. 4501700273.006092860_006092860_DiscreteOrder_1.0_5061_20160323035453001.txt
	 * First is PO No and last is Timestamp.
	 */
	public static final String FILE_SENDER_DUNS = "006092860";
	public static final String FILE_RECEIVER_DUNS = "006092860";
	public static final String FILE_MESSAGE_TYPE = "DiscreteOrder";
	public static final String FILE_VERSION = "1.0";
	public static final String FILE_SITEID = "JUA";
	public static final String FILE_DATE_FORMAT = "yyyyMMddHHmmssSSS";
	
	
	public static final String CONFIG_FILE_NAME = "config-file.csv";
	
}

