package com.jci.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "E2_OPEN")
public class E2Open implements Serializable {

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
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
	
	//E2Open
	@Column(name = "data_source",length = 30)
    private String dataSource;
	 
	
	//0: Order Number	VARCHAR(64)
	@Column(name = "Order_Number",length = 64)
    private String orderNumber;
	
	//1: Order Creation Date	Date
	@Column(name = "Order_Creation_Date")
    private Date orderCreationDate;
	
	//2: Order Status	VARCHAR(64)
	@Column(name = "Order_Status",length = 64)
    private String orderStatus;
	
	//3: Order Priority	VARCHAR(64)
	@Column(name = "Order_Priority",length = 64)
    private String orderPriority;
	
	//4: Customer ID	VARCHAR(255)
	@Column(name = "Customer_ID",length = 255)
    private String customerID;
	
	//5: Customer Description	VARCHAR(255)
	@Column(name = "Customer_Description",length = 255)
    private String customerDescription;
	
	//6:Customer DUNS	VARCHAR(64)
	@Column(name = "Customer_DUNS",length = 64)
    private String customerDUNS;
	
	//7:Customer DUNS+4	VARCHAR(64)
	@Column(name = "Customer_DUNS4",length = 64)
    private String customerDUNS4;
	
	//8:Customer Tax Number	VARCHAR(128)
	@Column(name = "Customer_Tax_Number",length = 128)
    private String customerTaxNumber;
	
	//9:Customer Address - Descriptor	VARCHAR(64)
	@Column(name = "Customer_Address_Descriptor",length = 64)
    private String customerAddressDescriptor;
	
	//10:Customer Address 1	VARCHAR(256)
	@Column(name = "Customer_Address1",length = 256)
    private String customerAddress1;
	
	//11:Customer Address 2	VARCHAR(256)
	@Column(name = "Customer_Address2",length = 256)
    private String customerAddress2;
	
	//12:Customer Address 3	VARCHAR(256)
	@Column(name = "Customer_Address3",length = 256)
    private String customerAddress3;
	
	//13:Customer Address 4	VARCHAR(256)
	@Column(name = "Customer_Address4",length = 256)
    private String customerAddress4;
	
	//14:Customer Address 5	VARCHAR(256)
	@Column(name = "Customer_Address5",length = 256)
    private String customerAddress5;
	
	//15:Customer City	VARCHAR(64)
	@Column(name = "Customer_City",length = 64)
    private String customerCity;
	
	//16: Customer County	VARCHAR(64)
	@Column(name = "Customer_County",length = 64)
    private String customerCounty;
	
	//17: Customer State	VARCHAR(64)
	@Column(name = "Customer_State",length = 64)
    private String customerState;
	
	//18: Customer Country	VARCHAR(64)
	@Column(name = "Customer_Country",length = 64)
    private String  customerCountry;
	
	//19: Customer Zip	VARCHAR(64)
	@Column(name = "Customer_Zip",length = 64)
    private String customerZip;
	
	//20: Supplier ID	VARCHAR(255)
	@Column(name = "Supplier_ID",length = 256)
    private String supplierID;
	
	//21: Supplier Description	VARCHAR(255)
	@Column(name = "Supplier_Description",length = 256)
    private String supplierDescription;
	
	//22: Supplier DUNS	VARCHAR(64)
	@Column(name = "Supplier_DUNS",length = 64)
    private String supplierDUNS;
	
	//23: Supplier DUNS+4	VARCHAR(64)
	@Column(name = "Supplier_DUNS4",length = 64)
    private String supplierDUNS4;
	
	//24: Supplier Address - Descriptor	VARCHAR(64)
	@Column(name = "Supplier_Address_Descriptor",length = 64)
    private String supplierAddressDescriptor;
	
	//25: Supplier Address 1	VARCHAR(256)
	@Column(name = "Supplier_Address1",length = 256)
    private String supplierAddress1;
	
	//26: Supplier Address 2	VARCHAR(256)
	@Column(name = "Supplier_Address2",length = 256)
    private String supplierAddress2;
	
	//27: Supplier Address 3	VARCHAR(256)
	@Column(name = "Supplier_Address3",length = 256)
    private String supplierAddress3;
	
	//28: Supplier Address 4	VARCHAR(256)
	@Column(name = "Supplier_Address4",length = 256)
    private String supplierAddress4;
	
	//29: Supplier Address 5	VARCHAR(256)
	@Column(name = " Supplier_Address5",length = 256)
    private String  supplierAddress5;
	
	//30: Supplier City	VARCHAR(64)
	@Column(name = "Supplier_City",length = 64)
    private String supplierCity;
	
	//31: Supplier County	VARCHAR(64)
	@Column(name = " Supplier_County",length = 64)
    private String  supplierCounty;
	
	//32: Supplier State	VARCHAR(64)
	@Column(name = "Supplier_State",length = 64)
    private String supplierState;
	
	//33: Supplier Country	VARCHAR(64)
	@Column(name = "Supplier_Country",length = 64)
    private String supplierCountry;
	
	//34: Supplier Zip	VARCHAR(64)
	@Column(name = "Supplier_Zip",length = 64)
    private String supplierZip;
	
	//35: Buyer Code	VARCHAR(64)
	@Column(name = "Buyer_Code",length = 64)
    private String buyerCode;
	
	//36: Buyer Contact	VARCHAR(64)
	@Column(name = "Buyer_Contact",length = 64)
    private String buyerContact;
	
	//37: Buyer Name	VARCHAR(64)
	@Column(name = "Buyer_Name",length = 64)
    private String buyerName;
	
	//38: Buyer Email	VARCHAR(128)
	@Column(name = " Buyer_Email",length = 128)
    private String  buyerEmail;
	
	//39: Supplier Email	VARCHAR(128)
	@Column(name = "Supplier_Email",length = 128)
    private String supplierEmail;
	
	//40: Delivery Term	VARCHAR(64)
	@Column(name = "Delivery_Term",length = 64)
    private String deliveryTerm;
	
	//41: Payment Terms	VARCHAR(255)
	@Column(name = "Payment_Terms",length = 256)
    private String paymentTerms;
	
	//42: Total Order Amount	Float
	@Column(name = "Total_Order_Amount")
    private Float totalOrderAmount;
	
	//43: InCo Terms	VARCHAR(64)
	@Column(name = "Inco_Terms",length = 64)
    private String incoTerms;
	
	//44: Customer Order Notes	VARCHAR(4000)
	@Column(name = "Customer_Order_Notes",length = 4000)
    private String customerOrderNotes;
	
	//45: Supplier Order Notes	VARCHAR(4000)
	@Column(name = "Supplier_Order_Notes",length = 4000)
    private String supplierOrderNotes;
	
	//46: Bill To	VARCHAR(255)
	@Column(name = "Bill_To",length = 255)
    private String billTo;
	
	//47: Bill To Address - Descriptor	VARCHAR(255)
	@Column(name = "Bill_To_Address",length = 255)
    private String billToAddress;
	
	//48: Bill To Address 1	VARCHAR(255)
	@Column(name = "Bill_To_Address1",length = 255)
    private String billToAddress1;
	
	//49: Bill To Address 2	VARCHAR(255)
	@Column(name = "Bill_To_Address2",length = 255)
    private String billToAddress2;
	
	//50: 	Bill To Address 3	VARCHAR(255)
	@Column(name = "Bill_To_Address3",length = 255)
    private String billToAddress3;
	
	//51: Bill To Address 4	VARCHAR(255)
	@Column(name = "Bill_To_Address4",length = 255)
    private String billToAddress4;
	
	//52: Bill To Address 5	VARCHAR(255)
	@Column(name = "Bill_To_Address5",length = 255)
    private String billToAddress5;
	
	//53: Bill To City	VARCHAR(128)
	@Column(name = "Bill_To_City",length = 128)
    private String billToCity;
	
	//54: Bill To County	VARCHAR(128)
	@Column(name = "Bill_To_County",length = 128)
    private String billToCounty;
	
	//55: Bill To State	VARCHAR(128)
	@Column(name = "Bill_To_State",length = 128)
    private String billToState;
	
	//56: Bill To Country	VARCHAR(128)
	@Column(name = "Bill_To_Country",length = 128)
    private String billToCountry;
	
	//57: Bill To Zip	VARCHAR(128)
	@Column(name = "Bill_To_Zip")
    private String billToZip;
	
	//58: Remit To Address - Descriptor	VARCHAR(64)
	@Column(name = "Remit_To_Address_Descriptor",length = 64)
    private String remitToAddressDescriptor;
	
	//59: Remit To Address 1	VARCHAR(256)
	@Column(name = "Remit_To_Address1",length = 256)
    private String remitToAddress1;
	
	//60: Remit To Address 2	VARCHAR(256)
	@Column(name = " Remit_To_Address2",length = 256)
    private String  remitToAddress2;
	
	//61: Remit To Address 3	VARCHAR(256)
	@Column(name = " Remit_To_Address3",length = 256)
    private String  remitToAddress3;
	
	//62: Remit To Address 4	VARCHAR(256)
	@Column(name = "Remit_To_Address4",length = 256)
    private String remitToAddress4;
	
	//63: Remit To Address 5	VARCHAR(256)
	@Column(name = "Remit_To_Address5",length = 256)
    private String remitToAddress5;
	
	//64: Remit To City	VARCHAR(64)
	@Column(name = "Remit_To_City",length = 64)
    private String remitToCity;
	
	//65: Remit To County	VARCHAR(64)
	@Column(name = "Remit_To_County",length = 64)
    private String remitToCounty;
	
	//66: Remit To State	VARCHAR(64)
	@Column(name = "Remit_To_State",length = 64)
    private String remitToState;
	
	//67: Remit To Country	VARCHAR(64)
	@Column(name = " Remit_To_Country",length = 64)
    private String  remitToCountry;
	
	//68: Remit To Zip	VARCHAR(64)
	@Column(name = "Remit_To_Zip",length = 64)
    private String remitToZip;
	
	//69: Buyer Contact - Phone	VARCHAR(255)
	@Column(name = "Buyer_Contact_Phone",length = 255)
    private String buyerContactPhone;
	
	//70: Buyer Contact - Fax	VARCHAR(255)
	@Column(name = "Buyer_Contact_Fax",length = 255)
    private String buyerContactFax;
	
	//71: Order Type	VARCHAR(255)
	@Column(name = "Order_Type",length = 256)
    private String orderType;
	
	//72: Flex String PO Header 4	VARCHAR(128)
	@Column(name = "Flex_String_PO_Header4",length = 128)
    private String flexStringPOHeader4;
	
	//73: 	Flex String PO Header 5	VARCHAR(128)
	@Column(name = "Flex_String_PO_Header5",length = 128)
    private String flexStringPOHeader5;
	
	//74: Flex String PO Header 6	VARCHAR(128)
	@Column(name = "Flex_String_PO_Header6",length = 128)
    private String flexStringPOHeader6;
	
	//75: Flex String PO Header 7	VARCHAR(64)
	@Column(name = "Flex_String_PO_Header7",length = 64)
    private String flexStringPOHeader7;
	
	//76: Flex String PO Header 8	VARCHAR(64)
	@Column(name = "Flex_String_POHeader8",length = 64)
    private String flexStringPOHeader8;
	
	//77: 	Flex String PO Header 9	VARCHAR(64)
	@Column(name = "Flex_String_PO_Header9",length = 64)
    private String flexStringPOHeader9;
	
	//78: 	Flex Int PO Header 1	NUMBER
	@Column(name = "Flex_Int_PO_Header1")
    private int flexIntPOHeader1;
	
	//79: 	Flex Int PO Header 2	NUMBER
	@Column(name = "Flex_Int_PO_Header2")
    private int flexIntPOHeader2;
	
	//80: 	Flex Int PO Header 3	NUMBER
	@Column(name = "Flex_Int_PO_Header3")
    private int flexIntPOHeader3;
	
	//81: Flex Int PO Header 4	NUMBER
	@Column(name = "Flex_Int_PO_Header4")
    private int flexIntPOHeader4;
	
	//82: Flex Int PO Header 5	NUMBER
	@Column(name = "Flex_Int_PO_Header5")
    private int flexIntPOHeader5;
	
	//83: Flex Float PO Header 1	Float
	@Column(name = " Flex_Float_PO_Header1")
    private Float  flexFloatPOHeader1;
	
	//84: Flex Float PO Header 2	Float
	@Column(name = "Flex_Float_PO_Header2")
    private Float flexFloatPOHeader2;
	
	//85: Flex Float PO Header 3	Float
	@Column(name = "Flex_Float_PO_Header3")
    private Float flexFloatPOHeader3;
	
	//86: Flex Float PO Header 4	Float
	@Column(name = "Flex_Float_PO_Header4")
    private Float flexFloatPOHeader4;
	
	//87: Flex Float PO Header 5	Float
	@Column(name = "Flex_Float_PO_Header5")
    private Float flexFloatPOHeader5;
	
	//88: Flex Date PO Header 1	Date
	@Column(name = "Flex_Date_PO_Header1")
    private Date flexDatePOHeader1;
	
	//89: 	Flex Date PO Header 2	Date
	@Column(name = "Flex_Date_PO_Header2")
    private Date flexDatePOHeader2;
	
	//90: Flex Date PO Header 3	Date
	@Column(name = "Flex_Date_PO_Header3")
    private Date flexDatePOHeader3;
	
	//91: Flex Date PO Header 4	Date
	@Column(name = "Flex_Date_PO_Header4")
    private Date flexDatePOHeader4;
	
	//92: Flex Date PO Header 5	Date
	@Column(name = "Flex_Date_PO_Header5")
    private Date flexDatePOHeader5;
	
	//93: Line ID	NUMBER
	@Column(name = " Line_ID")
    private int  lineID;
	
	//94: Line Status	VARCHAR(64)
	@Column(name = "Line_Status",length = 64)
    private String lineStatus;
	
	//95: Customer Item ID	VARCHAR(64)
	@Column(name = "Customer_Item_ID",length = 64)
    private String customerItemID;
	
	//96: Customer Item Description	VARCHAR(255)
	@Column(name = "Customer_Item_Description",length = 255)
    private String customerItemDescription;
	
	//97: Supplier Item ID	VARCHAR(64)
	@Column(name = "Supplier_Item_ID",length = 64)
    private String supplierItemID;
	
	//98: Supplier Item Description	VARCHAR(255)
	@Column(name = "Supplier_Item_Description",length = 255)
    private String  supplierItemDescription;
	
	//99: Unit Price	Float
	@Column(name = "Unit_Price")
    private Float unitPrice;
	
	//100: Price Basis	VARCHAR(64)
	@Column(name = "Price_Basis",length = 64)
    private String priceBasis;
	
	

	//101: Payment Currency	VARCHAR(64)
	@Column(name = "Payment_Currency",length = 64)
    private String paymentCurrency;
	
	//102: Total Line Amount	Float
	@Column(name = "Total_Line_Amount")
    private Float totalLineAmount; 
	
	
	//103: UOM	VARCHAR(64)
	@Column(name = "UOM",length = 64)
    private String UOM;
	
	
	//104: Customer Order Line Notes	VARCHAR(4000)
	@Column(name = "Customer_Order_Line_Notes",length = 4000)
    private String customerOrderLineNotes;
	
	//105: Supplier Order Line Notes	VARCHAR(4000)
	@Column(name = "Supplier_Order_Line_Notes",length = 4000)
    private String supplierOrderLineNotes;
	
	//106: Drawing Version	VARCHAR(255)
	@Column(name = "Drawing_Version",length = 255)
    private String drawingVersion;
	
	//107: 	Drawing Number	VARCHAR(255)
	@Column(name = "Drawing_Number",length = 255)
    private String drawingNumber;
	
	//108: Item Category	VARCHAR(255)
	@Column(name = "Item_Category",length = 255)
    private String itemCategory;
	
	//109: Ship To Location	VARCHAR(128)
	@Column(name = "Ship_To_Location",length = 128)
    private String shipToLocation;
	
	//110: Flex String PO Line 5	VARCHAR(128)
	@Column(name = "Flex_String_PO_Line5",length = 128)
    private String flexStringPOLine5;
	
	//111: Flex String PO Line 6	VARCHAR(128)
	@Column(name = "Flex_String_PO_Line6",length = 128)
    private String flexStringPOLine6;
	
	//112: Flex String PO Line 7	VARCHAR(64)
	@Column(name = "Flex_String_PO_Line7",length = 64)
    private String flexStringPOLine7;
	
	//113: Flex String PO Line 8	VARCHAR(64)
	@Column(name = "Flex_String_PO_Line8",length = 64)
    private String flexStringPOLine8;
	
	//114: Flex String PO Line 9	VARCHAR(64)
	@Column(name = "Flex_String_PO_Line_9",length = 64)
    private String flexStringPOLine9;
	
	//115: Free Item Flag	NUMBER
	@Column(name = "Free_Item_Flag")
    private int freeItemFlag;
	
	
	//116: Flex Int PO Line 2	NUMBER
	@Column(name = "Flex_Int_PO_Line2")
    private int flexIntPOLine2;
	
	//117: Flex Int PO Line 3	NUMBER
	@Column(name = "Flex_Int_PO_Line3")
    private int flexIntPOLine3;
	
	//118: Flex Int PO Line 4	NUMBER
	@Column(name = "Flex_Int_PO_Line4")
    private int flexIntPOLine4;
	
	
	//119: Flex Int PO Line 5	NUMBER
	@Column(name = "Flex_Int_PO_Line5")
    private int flexIntPOLine5;
	
	//120: Flex Float PO Line 1	Float
	@Column(name = "Flex_Float_PO_Line1")
    private Float flexFloatPOLine1;
	
	//121: Flex Float PO Line 2	Float
	@Column(name = "Flex_Float_PO_Line2")
    private Float flexFloatPOLine2;
	
	//122: Flex Float PO Line 3	Float
	@Column(name = "Flex_Float_PO_Line3")
    private Float flexFloatPOLine3;
	
	//123: Flex Float PO Line 4	Float
	@Column(name = "Flex_Float_PO_Line4")
    private Float flexFloatPOLine4;
	
	//124: Flex Float PO Line 5	Float
	@Column(name = "Flex_Float_PO_Line5")
    private Float flexFloatPOLine5;
	
	//125: Flex Date PO Line 1	Date
	@Column(name = "Flex_Date_PO_Line1")
    private Date flexDatePOLine1;
	
	//126: Flex Date PO Line 2	Date
	@Column(name = "Flex_Date_PO_Line2")
    private Date flexDatePOLine2;
	
	//127: Flex Date PO Line 3	Date
	@Column(name = "Flex_Date_PO_Line3")
    private Date flexDatePOLine3;
	
	//128: Flex Date PO Line 4	Date
	@Column(name = "Flex_Date_PO_Line4")
    private Date flexDatePOLine4;
	
	//129: Flex Date PO Line 5	Date
	@Column(name = "Flex_Date_PO_Line5")
    private Date flexDatePOLine5;
	
	//130: Request ID	NUMBER
	@Column(name = "Request_ID")
    private int requestID;
	
	//131: Request Status	VARCHAR(64)
	@Column(name = "Request_Status",length = 64)
    private String requestStatus;
	
	//132: Action	VARCHAR(64)
	@Column(name = "Action",length = 64)
    private String action;
	
	//133: Request Qty	Float
	@Column(name = "Request_Qty")
    private Float requestQty;
	
	
	//134: Request Date	Date
	@Column(name = "Request_Date")
    private Date requestDate;
	
	//135: Requested Ship Date	Date
	@Column(name = "Requested_Ship_Date")
    private Date requestedShipDate;
	
	
	//136: Carrier	VARCHAR(64)
	@Column(name = "Carrier",length = 64)
    private String carrier;
	
	//137: Customer Site	VARCHAR(64)
	@Column(name = "Customer_Site",length = 64)
    private String customerSite;
	
	
	//138: Ship To Address - Descriptor	VARCHAR(64)
	@Column(name = "Ship_To_Address_Descriptor",length = 64)
    private String shipToAddressDescriptor;
	
	//139: Ship To Address 1	VARCHAR(256)
	@Column(name = "Ship_To_Address1",length = 256)
    private String shipToAddress1;
	
	//140: Ship To Address 2	VARCHAR(256)
	@Column(name = "Ship_To_Address2",length = 256)
    private String shipToAddress2;
	
	//141: Ship To Address 3	VARCHAR(256)
	@Column(name = "Ship_To_Address3",length = 256)
    private String shipToAddress3;
	
	//142: Ship To Address 4	VARCHAR(256)
	@Column(name = "Ship_To_Address4",length = 256)
    private String shipToAddress4;
	
	//143: Ship To Address 5	VARCHAR(256)
	@Column(name = "Ship_To_Address5",length = 256)
    private String shipToAddress5;
	
	//144: Ship To City	VARCHAR(64)
	@Column(name = "Ship_To_City",length = 64)
    private String shipToCity;
	
	//145: Ship To County	VARCHAR(64)
	@Column(name = "Ship_To_County",length = 64)
    private String shipToCounty;
	
	//146: Ship To State	VARCHAR(64)
	@Column(name = "Ship_To_State",length = 64)
    private String shipToState;
	
	//147: Ship To Country	VARCHAR(64)
	@Column(name = "Ship_To_Country",length = 64)
    private String shipToCountry;
	
	//148: Ship To Zip	VARCHAR(64)
	@Column(name = "Ship_To_Zip",length = 64)
    private String shipToZip;
	
	//149: Ref Order Type	VARCHAR(64)
	@Column(name = "Ref_Order_Type",length = 64)
    private String refOrderType;
	
	//150: Ref Order ID	VARCHAR(64)
	@Column(name = "Ref_Order_ID",length = 64)
    private String refOrderID;
	
	//151: Ref Order Line ID	VARCHAR(64)
	@Column(name = "Ref_Order_Line_ID",length = 64)
    private String refOrderLineID;
	
	//152: Ref Order Request ID	VARCHAR(64)
	@Column(name = "Ref_Order_Request_ID",length = 64)
    private String refOrderRequestID;
	
	//153: Ref Customer ID	VARCHAR(64)
	@Column(name = "Ref_Customer_ID",length = 64)
    private String refCustomerID;
	
	//154: Ref Supplier ID	VARCHAR(64)
	@Column(name = "Ref_Supplier_ID",length = 64)
    private String refSupplierID;
	
	//155: Flex String PO Request 1	VARCHAR(255)
	@Column(name = "Flex_String_PO_Request1",length = 255)
    private String flexStringPORequest1;
	
	//156: Flex String PO Request 2	VARCHAR(255)
	@Column(name = "Flex_String_PO_Request2",length = 255)
    private String flexStringPORequest2;
	
	//157: Flex String PO Request 3	VARCHAR(255)
	@Column(name = "Flex_String_PO_Request3",length = 255)
    private String flexStringPORequest3;
	
	//158: Flex String PO Request 4	VARCHAR(128)
	@Column(name = "Flex_String_PO_Request4",length = 128)
    private String flexStringPORequest4;
	
	//159: Flex String PO Request 5	VARCHAR(128)
	@Column(name = "Flex_String_PO_Request5",length = 128)
    private String flexStringPORequest5;
	
	//160: Flex String PO Request 6	VARCHAR(128)
	@Column(name = "Flex_String_PO_Request6",length = 128)
    private String flexStringPORequest6;
	
	//161: Flex String PO Request 7	VARCHAR(64)
	@Column(name = "Flex_String_PO_Request7",length = 64)
    private String flexStringPORequest7;
	
	//162: Flex String PO Request 8	VARCHAR(64)
	@Column(name = "Flex_String_PO_Request8",length = 64)
    private String flexStringPORequest8;
	
	//163: Flex String PO Request 9	VARCHAR(64)
	@Column(name = "Flex_String_PO_Request9",length = 64)
    private String flexStringPORequest9;
	
	//164: Flex Int PO Request 1	NUMBER
	@Column(name = "Flex_Int_PO_Request1")
    private int flexIntPORequest1;
	
	//165: Flex Int PO Request 2	NUMBER
	@Column(name = "Flex_Int_PO_Request2")
    private int flexIntPORequest2;
	
	//166: Flex Int PO Request 3	NUMBER
	@Column(name = "Flex_Int_PO_Request3")
    private int flexIntPORequest3;
	
	//167: Flex Int PO Request 4	NUMBER
	@Column(name = "Flex_Int_PO_Request4")
    private int flexIntPORequest4;
	
	//168: Flex Int PO Request 5	NUMBER
	@Column(name = "Flex_Int_PO_Request5")
    private int flexIntPORequest5;
	
	//169: Flex Float PO Request 1	Float
	@Column(name = "Flex_Float_PO_Request1")
    private Float flexFloatPORequest1;
	
	//170: Flex Float PO Request 2	Float
	@Column(name = "Flex_Float_PO_Request2")
    private Float flexFloatPORequest2;
	
	//171: Flex Float PO Request 3	Float
	@Column(name = "Flex_Float_PO_Request3")
    private Float flexFloatPORequest3;
	
	//172: Flex Float PO Request 4	Float
	@Column(name = "Flex_Float_PO_Request4")
    private Float flexFloatPORequest4;
	
	//173: Flex Float PO Request 5	Float
	@Column(name = "Flex_Float_PO_Request5")
    private Float flexFloatPORequest5;
	
	//174: Flex Date PO Request 1	Date
	@Column(name = "Flex_Date_PO_Request1")
    private Date flexDatePORequest1;
	
	//175: Flex Date PO Request 2	Date
	@Column(name = "Flex_Date_PO_Request2")
    private Date flexDatePORequest2;
	
	//176: Flex Date PO Request 3	Date
	@Column(name = "Flex_Date_PO_Request3")
    private Date flexDatePORequest3;
	
	//177: Flex Date PO Request 4	Date
	@Column(name = "Flex_Date_PO_Request4")
    private Date flexDatePORequest4;
	
	//178: Flex Date PO Request 5	Date
	@Column(name = "Flex_Date_PO_Request5")
    private Date flexDatePORequest5;
	
	//179: Promise ID	NUMBER
	@Column(name = "Promise_ID")
    private int  promiseID;
	
	//180: Promise Qty	Float
	@Column(name = "Promise_Qty")
    private Float promiseQty;
	
	
	//181: Promise Date	Date
	@Column(name = "Promise_Date")
    private Date promiseDate;
	
	
	//182: Promised Ship Date	Date
	@Column(name = "Promised_Ship_Date")
    private Date promisedShipDate;
	
	
	//183: Supplier Site	VARCHAR(64)
	@Column(name = "Supplier_Site",length = 64)
    private String supplierSite;
	
	//184: Ship From Address - Descriptor	VARCHAR(64)
	@Column(name = "Ship_From_Address_Descriptor",length = 64)
    private String shipFromAddressDescriptor;
	
	//185: Ship From Address 1	VARCHAR(256)
	@Column(name = "Ship_From_Address1",length = 256)
    private String shipFromAddress1;
	
	//186: Ship From Address 2	VARCHAR(256)
	@Column(name = "Ship_From_Address2",length = 256)
    private String shipFromAddress2;
	
	//187: Ship From Address 3	VARCHAR(256)
	@Column(name = "Ship_From_Address3",length = 256)
    private String shipFromAddress3;
	
	//188: Ship From Address 4	VARCHAR(256)
	@Column(name = "Ship_From_Address4",length = 256)
    private String shipFromAddress4;
	
	//189: Ship From Address 5	VARCHAR(256)
	@Column(name = "Ship_From_Address5",length = 256)
    private String shipFromAddress5;
	
	//190: Ship From City	VARCHAR(64)
	@Column(name = "Ship_From_City",length = 64)
    private String shipFromCity;
	
	//191: Ship From County	VARCHAR(64)
	@Column(name = "Ship_From_County",length = 64)
    private String shipFromCounty;
	
	//192: Ship From State	VARCHAR(64)
	@Column(name = "Ship_From_State",length = 64)
    private String shipFromState;
	
	//193: Ship From Country	VARCHAR(64)
	@Column(name = "Ship_From_Country",length = 64)
    private String shipFromCountry;
	
	//194: Ship From Zip	VARCHAR(64)
	@Column(name = "Ship_From_Zip",length = 64)
    private String shipFromZip;
	
	//195: Flex String PO Promise 1	VARCHAR(255)
	@Column(name = "Flex_String_PO_Promise1",length = 255)
    private String flexStringPOPromise1;
	
	//196: Flex String PO Promise 2	VARCHAR(255)
	@Column(name = "Flex_String_PO_Promise2",length = 255)
    private String flexStringPOPromise2;
	
	//197: Flex String PO Promise 3	VARCHAR(255)
	@Column(name = "Flex_String_PO_Promise3",length = 255)
    private String flexStringPOPromise3;
	
	//198: Flex String PO Promise 4	VARCHAR(128)
	@Column(name = "Flex_String_PO_Promise4",length = 128)
    private String flexStringPOPromise4;
	
	//199: Flex String PO Promise 5	VARCHAR(128)
	@Column(name = "Flex_String_PO_Promise5",length = 128)
    private String flexStringPOPromise5;
	
	//200: Flex String PO Promise 6	VARCHAR(128)
	@Column(name = "Flex_String_PO_Promise6",length = 128)
    private String flexStringPOPromise6;
	
	//201: Flex String PO Promise 7	VARCHAR(64)
	@Column(name = "Flex_String_PO_Promise7",length = 64)
    private String flexStringPOPromise7;
	
	//202: Flex String PO Promise 8	VARCHAR(64)
	@Column(name = "Flex_String_PO_Promise8",length = 64)
    private String flexStringPOPromise8;
	
	//203: Flex String PO Promise 9	VARCHAR(64)
	@Column(name = "Flex_String_PO_Promise9",length = 64)
    private String flexStringPOPromise9;
	
	
	
	//204: Flex Int PO Promise 1	NUMBER
	@Column(name = "Flex_Int_PO_Promise1")
    private int FlexIntPOPromise1;
	
	//205: Flex Int PO Promise 2	NUMBER
	@Column(name = "Flex_Int_PO_Promise2")
    private int FlexIntPOPromise2;
	
	//206: Flex Int PO Promise 3	NUMBER
	@Column(name = "Flex_Int_PO_Promise3")
    private int flexIntPOPromise3;
	
	//207: Flex Int PO Promise 4	NUMBER
	@Column(name = "Flex_Int_PO_Promise4")
    private int flexIntPOPromise4;
	
	//208: Flex Int PO Promise 5	NUMBER
	@Column(name = "Flex_Int_PO_Promise5")
    private int flexIntPOPromise5;
	
	//209: Flex Float PO Promise 1	Float
	@Column(name = "Flex_Float_PO_Promise1")
    private Float flex_Float_PO_Promise1;
	
	//210: Flex Float PO Promise 2	Float
	@Column(name = "Flex_Float_PO_Promise2")
    private Float flexFloatPOPromise2;
	
	//211: Flex Float PO Promise 3	Float
	@Column(name = "Flex_Float_PO_Promise3")
    private Float flexFloatPOPromise3;
	
	//212: Flex Float PO Promise 4	Float
	@Column(name = "Flex_Float_PO_Promise4	")
    private Float flexFloatPOPromise4	;
	
	//213: Flex Float PO Promise 5	Float
	@Column(name = "Flex_Float_PO_Promise5")
    private Float flexFloatPOPromise5;
	
	//214: Flex Date PO Promise 1	Date
	@Column(name = "Flex_Date_PO_Promise1")
    private Date flexDatePOPromise1;
	
	//215: Flex Date PO Promise 2	Date
	@Column(name = "Flex_Date_PO_Promise2")
    private Date flexDatePOPromise2;
	
	//216: Flex Date PO Promise 3	Date
	@Column(name = "Flex_Date_PO_Promise3")
    private Date flexDatePOPromise3;
	
	//217: Flex Date PO Promise 4	Date
	@Column(name = "Flex_Date_PO_Promise4")
    private Date flexDatePOPromise4;
	
	//218: Flex Date PO Promise 5	Date
	@Column(name = "Flex_Date_PO_Promise5")
    private Date flexDatePOPromise5;
	
	//219: Rev #	VARCHAR(64)
	@Column(name = "Rev",length = 64)
    private String rev;
	
	//220: Ship To Customer ID	VARCHAR(64)
	@Column(name = "Ship_To_Customer_ID",length = 64)
    private String shipToCustomerID;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderCreationDate() {
		return orderCreationDate;
	}

	public void setOrderCreationDate(Date orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderPriority() {
		return orderPriority;
	}

	public void setOrderPriority(String orderPriority) {
		this.orderPriority = orderPriority;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

	public String getCustomerDUNS() {
		return customerDUNS;
	}

	public void setCustomerDUNS(String customerDUNS) {
		this.customerDUNS = customerDUNS;
	}

	public String getCustomerDUNS4() {
		return customerDUNS4;
	}

	public void setCustomerDUNS4(String customerDUNS4) {
		this.customerDUNS4 = customerDUNS4;
	}

	public String getCustomerTaxNumber() {
		return customerTaxNumber;
	}

	public void setCustomerTaxNumber(String customerTaxNumber) {
		this.customerTaxNumber = customerTaxNumber;
	}

	public String getCustomerAddressDescriptor() {
		return customerAddressDescriptor;
	}

	public void setCustomerAddressDescriptor(String customerAddressDescriptor) {
		this.customerAddressDescriptor = customerAddressDescriptor;
	}

	public String getCustomerAddress1() {
		return customerAddress1;
	}

	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}

	public String getCustomerAddress2() {
		return customerAddress2;
	}

	public void setCustomerAddress2(String customerAddress2) {
		this.customerAddress2 = customerAddress2;
	}




	public String getCustomerAddress3() {
		return customerAddress3;
	}

	public void setCustomerAddress3(String customerAddress3) {
		this.customerAddress3 = customerAddress3;
	}

	public String getCustomerAddress4() {
		return customerAddress4;
	}

	public void setCustomerAddress4(String customerAddress4) {
		this.customerAddress4 = customerAddress4;
	}

	public String getCustomerAddress5() {
		return customerAddress5;
	}

	public void setCustomerAddress5(String customerAddress5) {
		this.customerAddress5 = customerAddress5;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerCounty() {
		return customerCounty;
	}

	public void setCustomerCounty(String customerCounty) {
		this.customerCounty = customerCounty;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getCustomerZip() {
		return customerZip;
	}

	public void setCustomerZip(String customerZip) {
		this.customerZip = customerZip;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierDescription() {
		return supplierDescription;
	}

	public void setSupplierDescription(String supplierDescription) {
		this.supplierDescription = supplierDescription;
	}

	public String getSupplierDUNS() {
		return supplierDUNS;
	}

	public void setSupplierDUNS(String supplierDUNS) {
		this.supplierDUNS = supplierDUNS;
	}

	public String getSupplierDUNS4() {
		return supplierDUNS4;
	}

	public void setSupplierDUNS4(String supplierDUNS4) {
		this.supplierDUNS4 = supplierDUNS4;
	}

	public String getSupplierAddressDescriptor() {
		return supplierAddressDescriptor;
	}

	public void setSupplierAddressDescriptor(String supplierAddressDescriptor) {
		this.supplierAddressDescriptor = supplierAddressDescriptor;
	}

	public String getSupplierAddress1() {
		return supplierAddress1;
	}

	public void setSupplierAddress1(String supplierAddress1) {
		this.supplierAddress1 = supplierAddress1;
	}

	public String getSupplierAddress2() {
		return supplierAddress2;
	}

	public void setSupplierAddress2(String supplierAddress2) {
		this.supplierAddress2 = supplierAddress2;
	}

	public String getSupplierAddress3() {
		return supplierAddress3;
	}

	public void setSupplierAddress3(String supplierAddress3) {
		this.supplierAddress3 = supplierAddress3;
	}

	public String getSupplierAddress4() {
		return supplierAddress4;
	}

	public void setSupplierAddress4(String supplierAddress4) {
		this.supplierAddress4 = supplierAddress4;
	}

	public String getSupplierAddress5() {
		return supplierAddress5;
	}

	public void setSupplierAddress5(String supplierAddress5) {
		this.supplierAddress5 = supplierAddress5;
	}

	public String getSupplierCity() {
		return supplierCity;
	}

	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}

	public String getSupplierCounty() {
		return supplierCounty;
	}

	public void setSupplierCounty(String supplierCounty) {
		this.supplierCounty = supplierCounty;
	}

	public String getSupplierState() {
		return supplierState;
	}

	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}

	public String getSupplierCountry() {
		return supplierCountry;
	}

	public void setSupplierCountry(String supplierCountry) {
		this.supplierCountry = supplierCountry;
	}

	public String getSupplierZip() {
		return supplierZip;
	}

	public void setSupplierZip(String supplierZip) {
		this.supplierZip = supplierZip;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getBuyerContact() {
		return buyerContact;
	}

	public void setBuyerContact(String buyerContact) {
		this.buyerContact = buyerContact;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}

	public String getDeliveryTerm() {
		return deliveryTerm;
	}

	public void setDeliveryTerm(String deliveryTerm) {
		this.deliveryTerm = deliveryTerm;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public Float getTotalOrderAmount() {
		return totalOrderAmount;
	}

	public void setTotalOrderAmount(Float totalOrderAmount) {
		this.totalOrderAmount = totalOrderAmount;
	}


	public String getIncoTerms() {
		return incoTerms;
	}

	public void setIncoTerms(String incoTerms) {
		this.incoTerms = incoTerms;
	}

	public String getCustomerOrderNotes() {
		return customerOrderNotes;
	}

	public void setCustomerOrderNotes(String customerOrderNotes) {
		this.customerOrderNotes = customerOrderNotes;
	}

	public String getSupplierOrderNotes() {
		return supplierOrderNotes;
	}

	public void setSupplierOrderNotes(String supplierOrderNotes) {
		this.supplierOrderNotes = supplierOrderNotes;
	}

	public String getBillTo() {
		return billTo;
	}

	public void setBillTo(String billTo) {
		this.billTo = billTo;
	}

	public String getBillToAddress() {
		return billToAddress;
	}

	public void setBillToAddress(String billToAddress) {
		this.billToAddress = billToAddress;
	}

	public String getBillToAddress1() {
		return billToAddress1;
	}

	public void setBillToAddress1(String billToAddress1) {
		this.billToAddress1 = billToAddress1;
	}

	public String getBillToAddress2() {
		return billToAddress2;
	}

	public void setBillToAddress2(String billToAddress2) {
		this.billToAddress2 = billToAddress2;
	}

	public String getBillToAddress3() {
		return billToAddress3;
	}

	public void setBillToAddress3(String billToAddress3) {
		this.billToAddress3 = billToAddress3;
	}

	public String getBillToAddress4() {
		return billToAddress4;
	}

	public void setBillToAddress4(String billToAddress4) {
		this.billToAddress4 = billToAddress4;
	}

	public String getBillToAddress5() {
		return billToAddress5;
	}

	public void setBillToAddress5(String billToAddress5) {
		this.billToAddress5 = billToAddress5;
	}

	public String getBillToCity() {
		return billToCity;
	}

	public void setBillToCity(String billToCity) {
		this.billToCity = billToCity;
	}

	public String getBillToCounty() {
		return billToCounty;
	}

	public void setBillToCounty(String billToCounty) {
		this.billToCounty = billToCounty;
	}

	public String getBillToState() {
		return billToState;
	}

	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}

	public String getBillToCountry() {
		return billToCountry;
	}

	public void setBillToCountry(String billToCountry) {
		this.billToCountry = billToCountry;
	}

	public String getBillToZip() {
		return billToZip;
	}

	public void setBillToZip(String billToZip) {
		this.billToZip = billToZip;
	}

	public String getRemitToAddressDescriptor() {
		return remitToAddressDescriptor;
	}

	public void setRemitToAddressDescriptor(String remitToAddressDescriptor) {
		this.remitToAddressDescriptor = remitToAddressDescriptor;
	}

	public String getRemitToAddress1() {
		return remitToAddress1;
	}

	public void setRemitToAddress1(String remitToAddress1) {
		this.remitToAddress1 = remitToAddress1;
	}

	public String getRemitToAddress2() {
		return remitToAddress2;
	}

	public void setRemitToAddress2(String remitToAddress2) {
		this.remitToAddress2 = remitToAddress2;
	}

	public String getRemitToAddress3() {
		return remitToAddress3;
	}

	public void setRemitToAddress3(String remitToAddress3) {
		this.remitToAddress3 = remitToAddress3;
	}

	public String getRemitToAddress4() {
		return remitToAddress4;
	}

	public void setRemitToAddress4(String remitToAddress4) {
		this.remitToAddress4 = remitToAddress4;
	}

	public String getRemitToAddress5() {
		return remitToAddress5;
	}

	public void setRemitToAddress5(String remitToAddress5) {
		this.remitToAddress5 = remitToAddress5;
	}

	public String getRemitToCity() {
		return remitToCity;
	}

	public void setRemitToCity(String remitToCity) {
		this.remitToCity = remitToCity;
	}

	public String getRemitToCounty() {
		return remitToCounty;
	}

	public void setRemitToCounty(String remitToCounty) {
		this.remitToCounty = remitToCounty;
	}

	public String getRemitToState() {
		return remitToState;
	}

	public void setRemitToState(String remitToState) {
		this.remitToState = remitToState;
	}

	public String getRemitToCountry() {
		return remitToCountry;
	}

	public void setRemitToCountry(String remitToCountry) {
		this.remitToCountry = remitToCountry;
	}

	public String getRemitToZip() {
		return remitToZip;
	}

	public void setRemitToZip(String remitToZip) {
		this.remitToZip = remitToZip;
	}

	public String getBuyerContactPhone() {
		return buyerContactPhone;
	}

	public void setBuyerContactPhone(String buyerContactPhone) {
		this.buyerContactPhone = buyerContactPhone;
	}

	public String getBuyerContactFax() {
		return buyerContactFax;
	}

	public void setBuyerContactFax(String buyerContactFax) {
		this.buyerContactFax = buyerContactFax;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getFlexStringPOHeader4() {
		return flexStringPOHeader4;
	}

	public void setFlexStringPOHeader4(String flexStringPOHeader4) {
		this.flexStringPOHeader4 = flexStringPOHeader4;
	}

	public String getFlexStringPOHeader5() {
		return flexStringPOHeader5;
	}

	public void setFlexStringPOHeader5(String flexStringPOHeader5) {
		this.flexStringPOHeader5 = flexStringPOHeader5;
	}

	public String getFlexStringPOHeader6() {
		return flexStringPOHeader6;
	}

	public void setFlexStringPOHeader6(String flexStringPOHeader6) {
		this.flexStringPOHeader6 = flexStringPOHeader6;
	}

	public String getFlexStringPOHeader7() {
		return flexStringPOHeader7;
	}

	public void setFlexStringPOHeader7(String flexStringPOHeader7) {
		this.flexStringPOHeader7 = flexStringPOHeader7;
	}

	public String getFlexStringPOHeader8() {
		return flexStringPOHeader8;
	}

	public void setFlexStringPOHeader8(String flexStringPOHeader8) {
		this.flexStringPOHeader8 = flexStringPOHeader8;
	}

	public String getFlexStringPOHeader9() {
		return flexStringPOHeader9;
	}

	public void setFlexStringPOHeader9(String flexStringPOHeader9) {
		this.flexStringPOHeader9 = flexStringPOHeader9;
	}

	public int getFlexIntPOHeader1() {
		return flexIntPOHeader1;
	}

	public void setFlexIntPOHeader1(int flexIntPOHeader1) {
		this.flexIntPOHeader1 = flexIntPOHeader1;
	}

	public int getFlexIntPOHeader2() {
		return flexIntPOHeader2;
	}

	public void setFlexIntPOHeader2(int flexIntPOHeader2) {
		this.flexIntPOHeader2 = flexIntPOHeader2;
	}

	public int getFlexIntPOHeader3() {
		return flexIntPOHeader3;
	}

	public void setFlexIntPOHeader3(int flexIntPOHeader3) {
		this.flexIntPOHeader3 = flexIntPOHeader3;
	}

	public int getFlexIntPOHeader4() {
		return flexIntPOHeader4;
	}

	public void setFlexIntPOHeader4(int flexIntPOHeader4) {
		this.flexIntPOHeader4 = flexIntPOHeader4;
	}

	public int getFlexIntPOHeader5() {
		return flexIntPOHeader5;
	}

	public void setFlexIntPOHeader5(int flexIntPOHeader5) {
		this.flexIntPOHeader5 = flexIntPOHeader5;
	}

	public Float getFlexFloatPOHeader1() {
		return flexFloatPOHeader1;
	}

	public void setFlexFloatPOHeader1(Float flexFloatPOHeader1) {
		this.flexFloatPOHeader1 = flexFloatPOHeader1;
	}

	public Float getFlexFloatPOHeader2() {
		return flexFloatPOHeader2;
	}

	public void setFlexFloatPOHeader2(Float flexFloatPOHeader2) {
		this.flexFloatPOHeader2 = flexFloatPOHeader2;
	}

	public Float getFlexFloatPOHeader3() {
		return flexFloatPOHeader3;
	}

	public void setFlexFloatPOHeader3(Float flexFloatPOHeader3) {
		this.flexFloatPOHeader3 = flexFloatPOHeader3;
	}

	public Float getFlexFloatPOHeader4() {
		return flexFloatPOHeader4;
	}

	public void setFlexFloatPOHeader4(Float flexFloatPOHeader4) {
		this.flexFloatPOHeader4 = flexFloatPOHeader4;
	}

	public Float getFlexFloatPOHeader5() {
		return flexFloatPOHeader5;
	}

	public void setFlexFloatPOHeader5(Float flexFloatPOHeader5) {
		this.flexFloatPOHeader5 = flexFloatPOHeader5;
	}

	public Date getFlexDatePOHeader1() {
		return flexDatePOHeader1;
	}

	public void setFlexDatePOHeader1(Date flexDatePOHeader1) {
		this.flexDatePOHeader1 = flexDatePOHeader1;
	}

	public Date getFlexDatePOHeader2() {
		return flexDatePOHeader2;
	}

	public void setFlexDatePOHeader2(Date flexDatePOHeader2) {
		this.flexDatePOHeader2 = flexDatePOHeader2;
	}

	public Date getFlexDatePOHeader3() {
		return flexDatePOHeader3;
	}

	public void setFlexDatePOHeader3(Date flexDatePOHeader3) {
		this.flexDatePOHeader3 = flexDatePOHeader3;
	}

	public Date getFlexDatePOHeader4() {
		return flexDatePOHeader4;
	}

	public void setFlexDatePOHeader4(Date flexDatePOHeader4) {
		this.flexDatePOHeader4 = flexDatePOHeader4;
	}

	public Date getFlexDatePOHeader5() {
		return flexDatePOHeader5;
	}

	public void setFlexDatePOHeader5(Date flexDatePOHeader5) {
		this.flexDatePOHeader5 = flexDatePOHeader5;
	}

	public int getLineID() {
		return lineID;
	}

	public void setLineID(int lineID) {
		this.lineID = lineID;
	}

	public String getLineStatus() {
		return lineStatus;
	}

	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}

	public String getCustomerItemID() {
		return customerItemID;
	}

	public void setCustomerItemID(String customerItemID) {
		this.customerItemID = customerItemID;
	}

	public String getCustomerItemDescription() {
		return customerItemDescription;
	}

	public void setCustomerItemDescription(String customerItemDescription) {
		this.customerItemDescription = customerItemDescription;
	}

	public String getSupplierItemID() {
		return supplierItemID;
	}

	public void setSupplierItemID(String supplierItemID) {
		this.supplierItemID = supplierItemID;
	}

	public String getSupplierItemDescription() {
		return supplierItemDescription;
	}

	public void setSupplierItemDescription(String supplierItemDescription) {
		this.supplierItemDescription = supplierItemDescription;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getPriceBasis() {
		return priceBasis;
	}

	public void setPriceBasis(String priceBasis) {
		this.priceBasis = priceBasis;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}


	public Float getTotalLineAmount() {
		return totalLineAmount;
	}

	public void setTotalLineAmount(Float totalLineAmount) {
		this.totalLineAmount = totalLineAmount;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public String getCustomerOrderLineNotes() {
		return customerOrderLineNotes;
	}

	public void setCustomerOrderLineNotes(String customerOrderLineNotes) {
		this.customerOrderLineNotes = customerOrderLineNotes;
	}

	public String getSupplierOrderLineNotes() {
		return supplierOrderLineNotes;
	}

	public void setSupplierOrderLineNotes(String supplierOrderLineNotes) {
		this.supplierOrderLineNotes = supplierOrderLineNotes;
	}

	public String getDrawingVersion() {
		return drawingVersion;
	}

	public void setDrawingVersion(String drawingVersion) {
		this.drawingVersion = drawingVersion;
	}

	public String getDrawingNumber() {
		return drawingNumber;
	}

	public void setDrawingNumber(String drawingNumber) {
		this.drawingNumber = drawingNumber;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getShipToLocation() {
		return shipToLocation;
	}

	public void setShipToLocation(String shipToLocation) {
		this.shipToLocation = shipToLocation;
	}

	public String getFlexStringPOLine5() {
		return flexStringPOLine5;
	}

	public void setFlexStringPOLine5(String flexStringPOLine5) {
		this.flexStringPOLine5 = flexStringPOLine5;
	}

	public String getFlexStringPOLine6() {
		return flexStringPOLine6;
	}

	public void setFlexStringPOLine6(String flexStringPOLine6) {
		this.flexStringPOLine6 = flexStringPOLine6;
	}

	public String getFlexStringPOLine7() {
		return flexStringPOLine7;
	}

	public void setFlexStringPOLine7(String flexStringPOLine7) {
		this.flexStringPOLine7 = flexStringPOLine7;
	}

	public String getFlexStringPOLine8() {
		return flexStringPOLine8;
	}

	public void setFlexStringPOLine8(String flexStringPOLine8) {
		this.flexStringPOLine8 = flexStringPOLine8;
	}

	public String getFlexStringPOLine9() {
		return flexStringPOLine9;
	}

	public void setFlexStringPOLine9(String flexStringPOLine9) {
		this.flexStringPOLine9 = flexStringPOLine9;
	}

	public int getFreeItemFlag() {
		return freeItemFlag;
	}

	public void setFreeItemFlag(int freeItemFlag) {
		this.freeItemFlag = freeItemFlag;
	}

	public int getFlexIntPOLine2() {
		return flexIntPOLine2;
	}

	public void setFlexIntPOLine2(int flexIntPOLine2) {
		this.flexIntPOLine2 = flexIntPOLine2;
	}

	public int getFlexIntPOLine3() {
		return flexIntPOLine3;
	}

	public void setFlexIntPOLine3(int flexIntPOLine3) {
		this.flexIntPOLine3 = flexIntPOLine3;
	}

	public int getFlexIntPOLine4() {
		return flexIntPOLine4;
	}

	public void setFlexIntPOLine4(int flexIntPOLine4) {
		this.flexIntPOLine4 = flexIntPOLine4;
	}

	public int getFlexIntPOLine5() {
		return flexIntPOLine5;
	}

	public void setFlexIntPOLine5(int flexIntPOLine5) {
		this.flexIntPOLine5 = flexIntPOLine5;
	}

	public Float getFlexFloatPOLine1() {
		return flexFloatPOLine1;
	}

	public void setFlexFloatPOLine1(Float flexFloatPOLine1) {
		this.flexFloatPOLine1 = flexFloatPOLine1;
	}

	public Float getFlexFloatPOLine2() {
		return flexFloatPOLine2;
	}

	public void setFlexFloatPOLine2(Float flexFloatPOLine2) {
		this.flexFloatPOLine2 = flexFloatPOLine2;
	}

	public Float getFlexFloatPOLine3() {
		return flexFloatPOLine3;
	}

	public void setFlexFloatPOLine3(Float flexFloatPOLine3) {
		this.flexFloatPOLine3 = flexFloatPOLine3;
	}

	public Float getFlexFloatPOLine4() {
		return flexFloatPOLine4;
	}

	public void setFlexFloatPOLine4(Float flexFloatPOLine4) {
		this.flexFloatPOLine4 = flexFloatPOLine4;
	}

	public Float getFlexFloatPOLine5() {
		return flexFloatPOLine5;
	}

	public void setFlexFloatPOLine5(Float flexFloatPOLine5) {
		this.flexFloatPOLine5 = flexFloatPOLine5;
	}

	public Date getFlexDatePOLine1() {
		return flexDatePOLine1;
	}

	public void setFlexDatePOLine1(Date flexDatePOLine1) {
		this.flexDatePOLine1 = flexDatePOLine1;
	}

	public Date getFlexDatePOLine2() {
		return flexDatePOLine2;
	}

	public void setFlexDatePOLine2(Date flexDatePOLine2) {
		this.flexDatePOLine2 = flexDatePOLine2;
	}

	public Date getFlexDatePOLine3() {
		return flexDatePOLine3;
	}

	public void setFlexDatePOLine3(Date flexDatePOLine3) {
		this.flexDatePOLine3 = flexDatePOLine3;
	}

	public Date getFlexDatePOLine4() {
		return flexDatePOLine4;
	}

	public void setFlexDatePOLine4(Date flexDatePOLine4) {
		this.flexDatePOLine4 = flexDatePOLine4;
	}

	public Date getFlexDatePOLine5() {
		return flexDatePOLine5;
	}

	public void setFlexDatePOLine5(Date flexDatePOLine5) {
		this.flexDatePOLine5 = flexDatePOLine5;
	}

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Float getRequestQty() {
		return requestQty;
	}

	public void setRequestQty(Float requestQty) {
		this.requestQty = requestQty;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getRequestedShipDate() {
		return requestedShipDate;
	}

	public void setRequestedShipDate(Date requestedShipDate) {
		this.requestedShipDate = requestedShipDate;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCustomerSite() {
		return customerSite;
	}

	public void setCustomerSite(String customerSite) {
		this.customerSite = customerSite;
	}

	public String getShipToAddressDescriptor() {
		return shipToAddressDescriptor;
	}

	public void setShipToAddressDescriptor(String shipToAddressDescriptor) {
		this.shipToAddressDescriptor = shipToAddressDescriptor;
	}

	public String getShipToAddress1() {
		return shipToAddress1;
	}

	public void setShipToAddress1(String shipToAddress1) {
		this.shipToAddress1 = shipToAddress1;
	}

	public String getShipToAddress2() {
		return shipToAddress2;
	}

	public void setShipToAddress2(String shipToAddress2) {
		this.shipToAddress2 = shipToAddress2;
	}

	public String getShipToAddress3() {
		return shipToAddress3;
	}

	public void setShipToAddress3(String shipToAddress3) {
		this.shipToAddress3 = shipToAddress3;
	}

	public String getShipToAddress4() {
		return shipToAddress4;
	}

	public void setShipToAddress4(String shipToAddress4) {
		this.shipToAddress4 = shipToAddress4;
	}

	public String getShipToAddress5() {
		return shipToAddress5;
	}

	public void setShipToAddress5(String shipToAddress5) {
		this.shipToAddress5 = shipToAddress5;
	}

	public String getShipToCity() {
		return shipToCity;
	}

	public void setShipToCity(String shipToCity) {
		this.shipToCity = shipToCity;
	}

	public String getShipToCounty() {
		return shipToCounty;
	}

	public void setShipToCounty(String shipToCounty) {
		this.shipToCounty = shipToCounty;
	}

	public String getShipToState() {
		return shipToState;
	}

	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	public String getShipToCountry() {
		return shipToCountry;
	}

	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}

	public String getShipToZip() {
		return shipToZip;
	}

	public void setShipToZip(String shipToZip) {
		this.shipToZip = shipToZip;
	}

	public String getRefOrderType() {
		return refOrderType;
	}

	public void setRefOrderType(String refOrderType) {
		this.refOrderType = refOrderType;
	}

	public String getRefOrderID() {
		return refOrderID;
	}

	public void setRefOrderID(String refOrderID) {
		this.refOrderID = refOrderID;
	}

	public String getRefOrderLineID() {
		return refOrderLineID;
	}

	public void setRefOrderLineID(String refOrderLineID) {
		this.refOrderLineID = refOrderLineID;
	}

	public String getRefOrderRequestID() {
		return refOrderRequestID;
	}

	public void setRefOrderRequestID(String refOrderRequestID) {
		this.refOrderRequestID = refOrderRequestID;
	}

	public String getRefCustomerID() {
		return refCustomerID;
	}

	public void setRefCustomerID(String refCustomerID) {
		this.refCustomerID = refCustomerID;
	}

	public String getRefSupplierID() {
		return refSupplierID;
	}

	public void setRefSupplierID(String refSupplierID) {
		this.refSupplierID = refSupplierID;
	}

	public String getFlexStringPORequest1() {
		return flexStringPORequest1;
	}

	public void setFlexStringPORequest1(String flexStringPORequest1) {
		this.flexStringPORequest1 = flexStringPORequest1;
	}

	public String getFlexStringPORequest2() {
		return flexStringPORequest2;
	}

	public void setFlexStringPORequest2(String flexStringPORequest2) {
		this.flexStringPORequest2 = flexStringPORequest2;
	}

	public String getFlexStringPORequest3() {
		return flexStringPORequest3;
	}

	public void setFlexStringPORequest3(String flexStringPORequest3) {
		this.flexStringPORequest3 = flexStringPORequest3;
	}

	public String getFlexStringPORequest4() {
		return flexStringPORequest4;
	}

	public void setFlexStringPORequest4(String flexStringPORequest4) {
		this.flexStringPORequest4 = flexStringPORequest4;
	}

	public String getFlexStringPORequest5() {
		return flexStringPORequest5;
	}

	public void setFlexStringPORequest5(String flexStringPORequest5) {
		this.flexStringPORequest5 = flexStringPORequest5;
	}

	public String getFlexStringPORequest6() {
		return flexStringPORequest6;
	}

	public void setFlexStringPORequest6(String flexStringPORequest6) {
		this.flexStringPORequest6 = flexStringPORequest6;
	}

	public String getFlexStringPORequest7() {
		return flexStringPORequest7;
	}

	public void setFlexStringPORequest7(String flexStringPORequest7) {
		this.flexStringPORequest7 = flexStringPORequest7;
	}

	public String getFlexStringPORequest8() {
		return flexStringPORequest8;
	}

	public void setFlexStringPORequest8(String flexStringPORequest8) {
		this.flexStringPORequest8 = flexStringPORequest8;
	}

	public String getFlexStringPORequest9() {
		return flexStringPORequest9;
	}

	public void setFlexStringPORequest9(String flexStringPORequest9) {
		this.flexStringPORequest9 = flexStringPORequest9;
	}

	public int getFlexIntPORequest1() {
		return flexIntPORequest1;
	}

	public void setFlexIntPORequest1(int flexIntPORequest1) {
		this.flexIntPORequest1 = flexIntPORequest1;
	}

	public int getFlexIntPORequest2() {
		return flexIntPORequest2;
	}

	public void setFlexIntPORequest2(int flexIntPORequest2) {
		this.flexIntPORequest2 = flexIntPORequest2;
	}

	public int getFlexIntPORequest3() {
		return flexIntPORequest3;
	}

	public void setFlexIntPORequest3(int flexIntPORequest3) {
		this.flexIntPORequest3 = flexIntPORequest3;
	}

	public int getFlexIntPORequest4() {
		return flexIntPORequest4;
	}

	public void setFlexIntPORequest4(int flexIntPORequest4) {
		this.flexIntPORequest4 = flexIntPORequest4;
	}

	public int getFlexIntPORequest5() {
		return flexIntPORequest5;
	}

	public void setFlexIntPORequest5(int flexIntPORequest5) {
		this.flexIntPORequest5 = flexIntPORequest5;
	}

	public Float getFlexFloatPORequest1() {
		return flexFloatPORequest1;
	}

	public void setFlexFloatPORequest1(Float flexFloatPORequest1) {
		this.flexFloatPORequest1 = flexFloatPORequest1;
	}

	public Float getFlexFloatPORequest2() {
		return flexFloatPORequest2;
	}

	public void setFlexFloatPORequest2(Float flexFloatPORequest2) {
		this.flexFloatPORequest2 = flexFloatPORequest2;
	}

	public Float getFlexFloatPORequest3() {
		return flexFloatPORequest3;
	}

	public void setFlexFloatPORequest3(Float flexFloatPORequest3) {
		this.flexFloatPORequest3 = flexFloatPORequest3;
	}

	public Float getFlexFloatPORequest4() {
		return flexFloatPORequest4;
	}

	public void setFlexFloatPORequest4(Float flexFloatPORequest4) {
		this.flexFloatPORequest4 = flexFloatPORequest4;
	}

	public Float getFlexFloatPORequest5() {
		return flexFloatPORequest5;
	}

	public void setFlexFloatPORequest5(Float flexFloatPORequest5) {
		this.flexFloatPORequest5 = flexFloatPORequest5;
	}

	public Date getFlexDatePORequest1() {
		return flexDatePORequest1;
	}

	public void setFlexDatePORequest1(Date flexDatePORequest1) {
		this.flexDatePORequest1 = flexDatePORequest1;
	}

	public Date getFlexDatePORequest2() {
		return flexDatePORequest2;
	}

	public void setFlexDatePORequest2(Date flexDatePORequest2) {
		this.flexDatePORequest2 = flexDatePORequest2;
	}

	public Date getFlexDatePORequest3() {
		return flexDatePORequest3;
	}

	public void setFlexDatePORequest3(Date flexDatePORequest3) {
		this.flexDatePORequest3 = flexDatePORequest3;
	}

	public Date getFlexDatePORequest4() {
		return flexDatePORequest4;
	}

	public void setFlexDatePORequest4(Date flexDatePORequest4) {
		this.flexDatePORequest4 = flexDatePORequest4;
	}

	public Date getFlexDatePORequest5() {
		return flexDatePORequest5;
	}

	public void setFlexDatePORequest5(Date flexDatePORequest5) {
		this.flexDatePORequest5 = flexDatePORequest5;
	}

	public int getPromiseID() {
		return promiseID;
	}

	public void setPromiseID(int promiseID) {
		this.promiseID = promiseID;
	}

	public Float getPromiseQty() {
		return promiseQty;
	}

	public void setPromiseQty(Float promiseQty) {
		this.promiseQty = promiseQty;
	}

	public Date getPromiseDate() {
		return promiseDate;
	}

	public void setPromiseDate(Date promiseDate) {
		this.promiseDate = promiseDate;
	}

	public Date getPromisedShipDate() {
		return promisedShipDate;
	}

	public void setPromisedShipDate(Date promisedShipDate) {
		this.promisedShipDate = promisedShipDate;
	}

	public String getSupplierSite() {
		return supplierSite;
	}

	public void setSupplierSite(String supplierSite) {
		this.supplierSite = supplierSite;
	}

	public String getShipFromAddressDescriptor() {
		return shipFromAddressDescriptor;
	}

	public void setShipFromAddressDescriptor(String shipFromAddressDescriptor) {
		this.shipFromAddressDescriptor = shipFromAddressDescriptor;
	}

	public String getShipFromAddress1() {
		return shipFromAddress1;
	}

	public void setShipFromAddress1(String shipFromAddress1) {
		this.shipFromAddress1 = shipFromAddress1;
	}

	public String getShipFromAddress2() {
		return shipFromAddress2;
	}

	public void setShipFromAddress2(String shipFromAddress2) {
		this.shipFromAddress2 = shipFromAddress2;
	}

	public String getShipFromAddress3() {
		return shipFromAddress3;
	}

	public void setShipFromAddress3(String shipFromAddress3) {
		this.shipFromAddress3 = shipFromAddress3;
	}

	public String getShipFromAddress4() {
		return shipFromAddress4;
	}

	public void setShipFromAddress4(String shipFromAddress4) {
		this.shipFromAddress4 = shipFromAddress4;
	}

	public String getShipFromAddress5() {
		return shipFromAddress5;
	}

	public void setShipFromAddress5(String shipFromAddress5) {
		this.shipFromAddress5 = shipFromAddress5;
	}

	public String getShipFromCity() {
		return shipFromCity;
	}

	public void setShipFromCity(String shipFromCity) {
		this.shipFromCity = shipFromCity;
	}

	public String getShipFromCounty() {
		return shipFromCounty;
	}

	public void setShipFromCounty(String shipFromCounty) {
		this.shipFromCounty = shipFromCounty;
	}

	public String getShipFromState() {
		return shipFromState;
	}

	public void setShipFromState(String shipFromState) {
		this.shipFromState = shipFromState;
	}

	public String getShipFromCountry() {
		return shipFromCountry;
	}

	public void setShipFromCountry(String shipFromCountry) {
		this.shipFromCountry = shipFromCountry;
	}

	public String getShipFromZip() {
		return shipFromZip;
	}

	public void setShipFromZip(String shipFromZip) {
		this.shipFromZip = shipFromZip;
	}

	public String getFlexStringPOPromise1() {
		return flexStringPOPromise1;
	}

	public void setFlexStringPOPromise1(String flexStringPOPromise1) {
		this.flexStringPOPromise1 = flexStringPOPromise1;
	}

	public String getFlexStringPOPromise2() {
		return flexStringPOPromise2;
	}

	public void setFlexStringPOPromise2(String flexStringPOPromise2) {
		this.flexStringPOPromise2 = flexStringPOPromise2;
	}

	public String getFlexStringPOPromise3() {
		return flexStringPOPromise3;
	}

	public void setFlexStringPOPromise3(String flexStringPOPromise3) {
		this.flexStringPOPromise3 = flexStringPOPromise3;
	}

	public String getFlexStringPOPromise4() {
		return flexStringPOPromise4;
	}

	public void setFlexStringPOPromise4(String flexStringPOPromise4) {
		this.flexStringPOPromise4 = flexStringPOPromise4;
	}

	public String getFlexStringPOPromise5() {
		return flexStringPOPromise5;
	}

	public void setFlexStringPOPromise5(String flexStringPOPromise5) {
		this.flexStringPOPromise5 = flexStringPOPromise5;
	}

	public String getFlexStringPOPromise6() {
		return flexStringPOPromise6;
	}

	public void setFlexStringPOPromise6(String flexStringPOPromise6) {
		this.flexStringPOPromise6 = flexStringPOPromise6;
	}

	public String getFlexStringPOPromise7() {
		return flexStringPOPromise7;
	}

	public void setFlexStringPOPromise7(String flexStringPOPromise7) {
		this.flexStringPOPromise7 = flexStringPOPromise7;
	}

	public String getFlexStringPOPromise8() {
		return flexStringPOPromise8;
	}

	public void setFlexStringPOPromise8(String flexStringPOPromise8) {
		this.flexStringPOPromise8 = flexStringPOPromise8;
	}

	public String getFlexStringPOPromise9() {
		return flexStringPOPromise9;
	}

	public void setFlexStringPOPromise9(String flexStringPOPromise9) {
		this.flexStringPOPromise9 = flexStringPOPromise9;
	}

	public int getFlexIntPOPromise1() {
		return FlexIntPOPromise1;
	}

	public void setFlexIntPOPromise1(int flexIntPOPromise1) {
		FlexIntPOPromise1 = flexIntPOPromise1;
	}

	public int getFlexIntPOPromise2() {
		return FlexIntPOPromise2;
	}

	public void setFlexIntPOPromise2(int flexIntPOPromise2) {
		FlexIntPOPromise2 = flexIntPOPromise2;
	}

	public int getFlexIntPOPromise3() {
		return flexIntPOPromise3;
	}

	public void setFlexIntPOPromise3(int flexIntPOPromise3) {
		this.flexIntPOPromise3 = flexIntPOPromise3;
	}

	public int getFlexIntPOPromise4() {
		return flexIntPOPromise4;
	}

	public void setFlexIntPOPromise4(int flexIntPOPromise4) {
		this.flexIntPOPromise4 = flexIntPOPromise4;
	}

	public int getFlexIntPOPromise5() {
		return flexIntPOPromise5;
	}

	public void setFlexIntPOPromise5(int flexIntPOPromise5) {
		this.flexIntPOPromise5 = flexIntPOPromise5;
	}

	public Float getFlex_Float_PO_Promise1() {
		return flex_Float_PO_Promise1;
	}

	public void setFlex_Float_PO_Promise1(Float flex_Float_PO_Promise1) {
		this.flex_Float_PO_Promise1 = flex_Float_PO_Promise1;
	}

	public Float getFlexFloatPOPromise2() {
		return flexFloatPOPromise2;
	}

	public void setFlexFloatPOPromise2(Float flexFloatPOPromise2) {
		this.flexFloatPOPromise2 = flexFloatPOPromise2;
	}

	public Float getFlexFloatPOPromise3() {
		return flexFloatPOPromise3;
	}

	public void setFlexFloatPOPromise3(Float flexFloatPOPromise3) {
		this.flexFloatPOPromise3 = flexFloatPOPromise3;
	}

	public Float getFlexFloatPOPromise4() {
		return flexFloatPOPromise4;
	}

	public void setFlexFloatPOPromise4(Float flexFloatPOPromise4) {
		this.flexFloatPOPromise4 = flexFloatPOPromise4;
	}

	public Float getFlexFloatPOPromise5() {
		return flexFloatPOPromise5;
	}

	public void setFlexFloatPOPromise5(Float flexFloatPOPromise5) {
		this.flexFloatPOPromise5 = flexFloatPOPromise5;
	}

	public Date getFlexDatePOPromise1() {
		return flexDatePOPromise1;
	}

	public void setFlexDatePOPromise1(Date flexDatePOPromise1) {
		this.flexDatePOPromise1 = flexDatePOPromise1;
	}

	public Date getFlexDatePOPromise2() {
		return flexDatePOPromise2;
	}

	public void setFlexDatePOPromise2(Date flexDatePOPromise2) {
		this.flexDatePOPromise2 = flexDatePOPromise2;
	}

	public Date getFlexDatePOPromise3() {
		return flexDatePOPromise3;
	}

	public void setFlexDatePOPromise3(Date flexDatePOPromise3) {
		this.flexDatePOPromise3 = flexDatePOPromise3;
	}

	public Date getFlexDatePOPromise4() {
		return flexDatePOPromise4;
	}

	public void setFlexDatePOPromise4(Date flexDatePOPromise4) {
		this.flexDatePOPromise4 = flexDatePOPromise4;
	}

	public Date getFlexDatePOPromise5() {
		return flexDatePOPromise5;
	}

	public void setFlexDatePOPromise5(Date flexDatePOPromise5) {
		this.flexDatePOPromise5 = flexDatePOPromise5;
	}

	public String getRev() {
		return rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

	public String getShipToCustomerID() {
		return shipToCustomerID;
	}

	public void setShipToCustomerID(String shipToCustomerID) {
		this.shipToCustomerID = shipToCustomerID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
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
		E2Open other = (E2Open) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orderNumber == null) {
			if (other.orderNumber != null)
				return false;
		} else if (!orderNumber.equals(other.orderNumber))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "E2Open [id=" + id + ", created=" + created + ", updated=" + updated + ", status=" + status
				+ ", dataSource=" + dataSource + ", orderNumber=" + orderNumber + ", orderCreationDate="
				+ orderCreationDate + ", orderStatus=" + orderStatus + ", orderPriority=" + orderPriority
				+ ", customerID=" + customerID + ", customerDescription=" + customerDescription + ", customerDUNS="
				+ customerDUNS + ", customerDUNS4=" + customerDUNS4 + ", customerTaxNumber=" + customerTaxNumber
				+ ", customerAddressDescriptor=" + customerAddressDescriptor + ", customerAddress1=" + customerAddress1
				+ ", customerAddress2=" + customerAddress2 + ", customerAddress3=" + customerAddress3
				+ ", customerAddress4=" + customerAddress4 + ", customerAddress5=" + customerAddress5
				+ ", customerCity=" + customerCity + ", customerCounty=" + customerCounty + ", customerState="
				+ customerState + ", customerCountry=" + customerCountry + ", customerZip=" + customerZip
				+ ", supplierID=" + supplierID + ", supplierDescription=" + supplierDescription + ", supplierDUNS="
				+ supplierDUNS + ", supplierDUNS4=" + supplierDUNS4 + ", supplierAddressDescriptor="
				+ supplierAddressDescriptor + ", supplierAddress1=" + supplierAddress1 + ", supplierAddress2="
				+ supplierAddress2 + ", supplierAddress3=" + supplierAddress3 + ", supplierAddress4=" + supplierAddress4
				+ ", supplierAddress5=" + supplierAddress5 + ", supplierCity=" + supplierCity + ", supplierCounty="
				+ supplierCounty + ", supplierState=" + supplierState + ", supplierCountry=" + supplierCountry
				+ ", supplierZip=" + supplierZip + ", buyerCode=" + buyerCode + ", buyerContact=" + buyerContact
				+ ", buyerName=" + buyerName + ", buyerEmail=" + buyerEmail + ", supplierEmail=" + supplierEmail
				+ ", deliveryTerm=" + deliveryTerm + ", paymentTerms=" + paymentTerms + ", totalOrderAmount="
				+ totalOrderAmount + ", incoTerms=" + incoTerms + ", customerOrderNotes=" + customerOrderNotes
				+ ", supplierOrderNotes=" + supplierOrderNotes + ", billTo=" + billTo + ", billToAddress="
				+ billToAddress + ", billToAddress1=" + billToAddress1 + ", billToAddress2=" + billToAddress2
				+ ", billToAddress3=" + billToAddress3 + ", billToAddress4=" + billToAddress4 + ", billToAddress5="
				+ billToAddress5 + ", billToCity=" + billToCity + ", billToCounty=" + billToCounty + ", billToState="
				+ billToState + ", billToCountry=" + billToCountry + ", billToZip=" + billToZip
				+ ", remitToAddressDescriptor=" + remitToAddressDescriptor + ", remitToAddress1=" + remitToAddress1
				+ ", remitToAddress2=" + remitToAddress2 + ", remitToAddress3=" + remitToAddress3 + ", remitToAddress4="
				+ remitToAddress4 + ", remitToAddress5=" + remitToAddress5 + ", remitToCity=" + remitToCity
				+ ", remitToCounty=" + remitToCounty + ", remitToState=" + remitToState + ", remitToCountry="
				+ remitToCountry + ", remitToZip=" + remitToZip + ", buyerContactPhone=" + buyerContactPhone
				+ ", buyerContactFax=" + buyerContactFax + ", orderType=" + orderType + ", flexStringPOHeader4="
				+ flexStringPOHeader4 + ", flexStringPOHeader5=" + flexStringPOHeader5 + ", flexStringPOHeader6="
				+ flexStringPOHeader6 + ", flexStringPOHeader7=" + flexStringPOHeader7 + ", flexStringPOHeader8="
				+ flexStringPOHeader8 + ", flexStringPOHeader9=" + flexStringPOHeader9 + ", flexIntPOHeader1="
				+ flexIntPOHeader1 + ", flexIntPOHeader2=" + flexIntPOHeader2 + ", flexIntPOHeader3=" + flexIntPOHeader3
				+ ", flexIntPOHeader4=" + flexIntPOHeader4 + ", flexIntPOHeader5=" + flexIntPOHeader5
				+ ", flexFloatPOHeader1=" + flexFloatPOHeader1 + ", flexFloatPOHeader2=" + flexFloatPOHeader2
				+ ", flexFloatPOHeader3=" + flexFloatPOHeader3 + ", flexFloatPOHeader4=" + flexFloatPOHeader4
				+ ", flexFloatPOHeader5=" + flexFloatPOHeader5 + ", flexDatePOHeader1=" + flexDatePOHeader1
				+ ", flexDatePOHeader2=" + flexDatePOHeader2 + ", flexDatePOHeader3=" + flexDatePOHeader3
				+ ", flexDatePOHeader4=" + flexDatePOHeader4 + ", flexDatePOHeader5=" + flexDatePOHeader5 + ", lineID="
				+ lineID + ", lineStatus=" + lineStatus + ", customerItemID=" + customerItemID
				+ ", customerItemDescription=" + customerItemDescription + ", supplierItemID=" + supplierItemID
				+ ", supplierItemDescription=" + supplierItemDescription + ", unitPrice=" + unitPrice + ", priceBasis="
				+ priceBasis + ", paymentCurrency=" + paymentCurrency + ", totalLineAmount=" + totalLineAmount
				+ ", UOM=" + UOM + ", customerOrderLineNotes=" + customerOrderLineNotes + ", supplierOrderLineNotes="
				+ supplierOrderLineNotes + ", drawingVersion=" + drawingVersion + ", drawingNumber=" + drawingNumber
				+ ", itemCategory=" + itemCategory + ", shipToLocation=" + shipToLocation + ", flexStringPOLine5="
				+ flexStringPOLine5 + ", flexStringPOLine6=" + flexStringPOLine6 + ", flexStringPOLine7="
				+ flexStringPOLine7 + ", flexStringPOLine8=" + flexStringPOLine8 + ", flexStringPOLine9="
				+ flexStringPOLine9 + ", freeItemFlag=" + freeItemFlag + ", flexIntPOLine2=" + flexIntPOLine2
				+ ", flexIntPOLine3=" + flexIntPOLine3 + ", flexIntPOLine4=" + flexIntPOLine4 + ", flexIntPOLine5="
				+ flexIntPOLine5 + ", flexFloatPOLine1=" + flexFloatPOLine1 + ", flexFloatPOLine2=" + flexFloatPOLine2
				+ ", flexFloatPOLine3=" + flexFloatPOLine3 + ", flexFloatPOLine4=" + flexFloatPOLine4
				+ ", flexFloatPOLine5=" + flexFloatPOLine5 + ", flexDatePOLine1=" + flexDatePOLine1
				+ ", flexDatePOLine2=" + flexDatePOLine2 + ", flexDatePOLine3=" + flexDatePOLine3 + ", flexDatePOLine4="
				+ flexDatePOLine4 + ", flexDatePOLine5=" + flexDatePOLine5 + ", requestID=" + requestID
				+ ", requestStatus=" + requestStatus + ", action=" + action + ", requestQty=" + requestQty
				+ ", requestDate=" + requestDate + ", requestedShipDate=" + requestedShipDate + ", carrier=" + carrier
				+ ", customerSite=" + customerSite + ", shipToAddressDescriptor=" + shipToAddressDescriptor
				+ ", shipToAddress1=" + shipToAddress1 + ", shipToAddress2=" + shipToAddress2 + ", shipToAddress3="
				+ shipToAddress3 + ", shipToAddress4=" + shipToAddress4 + ", shipToAddress5=" + shipToAddress5
				+ ", shipToCity=" + shipToCity + ", shipToCounty=" + shipToCounty + ", shipToState=" + shipToState
				+ ", shipToCountry=" + shipToCountry + ", shipToZip=" + shipToZip + ", refOrderType=" + refOrderType
				+ ", refOrderID=" + refOrderID + ", refOrderLineID=" + refOrderLineID + ", refOrderRequestID="
				+ refOrderRequestID + ", refCustomerID=" + refCustomerID + ", refSupplierID=" + refSupplierID
				+ ", flexStringPORequest1=" + flexStringPORequest1 + ", flexStringPORequest2=" + flexStringPORequest2
				+ ", flexStringPORequest3=" + flexStringPORequest3 + ", flexStringPORequest4=" + flexStringPORequest4
				+ ", flexStringPORequest5=" + flexStringPORequest5 + ", flexStringPORequest6=" + flexStringPORequest6
				+ ", flexStringPORequest7=" + flexStringPORequest7 + ", flexStringPORequest8=" + flexStringPORequest8
				+ ", flexStringPORequest9=" + flexStringPORequest9 + ", flexIntPORequest1=" + flexIntPORequest1
				+ ", flexIntPORequest2=" + flexIntPORequest2 + ", flexIntPORequest3=" + flexIntPORequest3
				+ ", flexIntPORequest4=" + flexIntPORequest4 + ", flexIntPORequest5=" + flexIntPORequest5
				+ ", flexFloatPORequest1=" + flexFloatPORequest1 + ", flexFloatPORequest2=" + flexFloatPORequest2
				+ ", flexFloatPORequest3=" + flexFloatPORequest3 + ", flexFloatPORequest4=" + flexFloatPORequest4
				+ ", flexFloatPORequest5=" + flexFloatPORequest5 + ", flexDatePORequest1=" + flexDatePORequest1
				+ ", flexDatePORequest2=" + flexDatePORequest2 + ", flexDatePORequest3=" + flexDatePORequest3
				+ ", flexDatePORequest4=" + flexDatePORequest4 + ", flexDatePORequest5=" + flexDatePORequest5
				+ ", promiseID=" + promiseID + ", promiseQty=" + promiseQty + ", promiseDate=" + promiseDate
				+ ", promisedShipDate=" + promisedShipDate + ", supplierSite=" + supplierSite
				+ ", shipFromAddressDescriptor=" + shipFromAddressDescriptor + ", shipFromAddress1=" + shipFromAddress1
				+ ", shipFromAddress2=" + shipFromAddress2 + ", shipFromAddress3=" + shipFromAddress3
				+ ", shipFromAddress4=" + shipFromAddress4 + ", shipFromAddress5=" + shipFromAddress5
				+ ", shipFromCity=" + shipFromCity + ", shipFromCounty=" + shipFromCounty + ", shipFromState="
				+ shipFromState + ", shipFromCountry=" + shipFromCountry + ", shipFromZip=" + shipFromZip
				+ ", flexStringPOPromise1=" + flexStringPOPromise1 + ", flexStringPOPromise2=" + flexStringPOPromise2
				+ ", flexStringPOPromise3=" + flexStringPOPromise3 + ", flexStringPOPromise4=" + flexStringPOPromise4
				+ ", flexStringPOPromise5=" + flexStringPOPromise5 + ", flexStringPOPromise6=" + flexStringPOPromise6
				+ ", flexStringPOPromise7=" + flexStringPOPromise7 + ", flexStringPOPromise8=" + flexStringPOPromise8
				+ ", flexStringPOPromise9=" + flexStringPOPromise9 + ", FlexIntPOPromise1=" + FlexIntPOPromise1
				+ ", FlexIntPOPromise2=" + FlexIntPOPromise2 + ", flexIntPOPromise3=" + flexIntPOPromise3
				+ ", flexIntPOPromise4=" + flexIntPOPromise4 + ", flexIntPOPromise5=" + flexIntPOPromise5
				+ ", flex_Float_PO_Promise1=" + flex_Float_PO_Promise1 + ", flexFloatPOPromise2=" + flexFloatPOPromise2
				+ ", flexFloatPOPromise3=" + flexFloatPOPromise3 + ", flexFloatPOPromise4=" + flexFloatPOPromise4
				+ ", flexFloatPOPromise5=" + flexFloatPOPromise5 + ", flexDatePOPromise1=" + flexDatePOPromise1
				+ ", flexDatePOPromise2=" + flexDatePOPromise2 + ", flexDatePOPromise3=" + flexDatePOPromise3
				+ ", flexDatePOPromise4=" + flexDatePOPromise4 + ", flexDatePOPromise5=" + flexDatePOPromise5 + ", rev="
				+ rev + ", shipToCustomerID=" + shipToCustomerID + "]";
	}

}
