package com.jci.utils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.jci.domain.E2Open;
import com.jci.domain.Item;
import com.jci.domain.ItemDiv;
import com.jci.domain.PO;
import com.jci.domain.PoDiv;
import com.jci.domain.PoItem;
import com.jci.domain.ShipTo;
import com.jci.domain.VendAddr;
import com.jci.domain.Vendor;
import com.jci.domain.VendorDiv;

public class PrepareQueryData {
	
	public static E2Open prepareE2OpenData(Map<String,Object> row,String[] columnNames){
		E2Open e2Open = new E2Open();
		
		
		String colName=null;
		
		colName = columnNames[1];
		
		//0: Order Number	VARCHAR(64)
		if(CommonUtils.isBlank(colName)){
			return null;
		}else if(row.containsKey(colName)){
			e2Open.setOrderNumber( String.valueOf(row.get(colName)));
		}else{
			e2Open.setOrderNumber(colName);
		}
		
		//1: Order Creation Date	Date
		colName = columnNames[2];
		
		if(!CommonUtils.isBlank(colName)){
			if(row.containsKey(colName)){
				e2Open.setOrderCreationDate(CommonUtils.stringToDate( String.valueOf( row.get(colName))));
			}else{
				e2Open.setOrderCreationDate(CommonUtils.stringToDate( String.valueOf(colName)));
			}
		}
		
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setOrderCreationDate(CommonUtils.stringToDate( String.valueOf( row.get(colName))));
		}else{
			e2Open.setOrderCreationDate(CommonUtils.stringToDate( String.valueOf(colName)));
		}}
		
		//2: Order Status
		colName = columnNames[3];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setOrderStatus(String.valueOf( row.get(colName)));
		}else{
			e2Open.setOrderStatus(String.valueOf(colName));
		}}
		
		//3: Order Priority
		colName = columnNames[4];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setOrderPriority( String.valueOf( row.get(colName)));
		}else{
			e2Open.setOrderPriority( String.valueOf(colName));
		}}
		
		//4: Customer ID
		colName = columnNames[5];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setCustomerID( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerID( String.valueOf(colName));
		}}
		
		//5: CustomerDescription
		colName = columnNames[6];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setCustomerDescription( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerDescription( String.valueOf(colName));
		}}
		
		//6:CustomerDUNS
		colName = columnNames[7];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setCustomerDUNS( String.valueOf(row.get(colName)));
		}else{
			e2Open.setCustomerDUNS( String.valueOf(colName));
		}}
		
		//7:CustomerDUNS+4
		colName = columnNames[8];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setCustomerDUNS4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerDUNS4( String.valueOf(colName));
		}}
		
		//8:CustomerTaxNumber	
		colName = columnNames[9];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setCustomerTaxNumber(String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerTaxNumber( String.valueOf(colName));
		}}
		
		//9:CustomerAddressDescriptor
		colName = columnNames[10];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerAddressDescriptor(String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerAddressDescriptor( String.valueOf(colName));
		}}
		
		//10:CustomerAddress 1	
		colName = columnNames[11];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerAddress1( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerAddress1(( String.valueOf(colName)));
		}}
		
		//11:Customer Address 2	
		colName = columnNames[12];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setCustomerAddress2( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerAddress2( String.valueOf(colName));
		}}
		
		
		//12:Customer Address 3	VARCHAR(256)
		colName = columnNames[13];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerAddress3( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerAddress3( String.valueOf(colName));
		}}
		
		//13:CustomerAddress 4	VARCHAR(256)
		colName = columnNames[14];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerAddress4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerAddress4( String.valueOf(colName));
		}}
		
		//14:Customer Address 5	VARCHAR(256)
		colName = columnNames[15];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerAddress5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerAddress5( String.valueOf(colName));
		}}
		
		//15:Customer City	VARCHAR(64)
		colName = columnNames[16];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerCity( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerCity( String.valueOf(colName));
		}}
		
		//16: Customer County	VARCHAR(64)
		colName = columnNames[17];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerCountry( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerCountry( String.valueOf(colName));
		}}
		
		//17: Customer State	VARCHAR(64)
		colName = columnNames[18];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerState( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerState( String.valueOf(colName));
		}}
		
		//18: CustomerCountry	VARCHAR(64)
		colName = columnNames[19];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerCountry( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerCountry( String.valueOf(colName));
		}}
		
		//19: CustomerZip	VARCHAR(64)
		colName = columnNames[20];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerZip( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerZip( String.valueOf(colName));
		}}
		
		//20: SupplierID	VARCHAR(255)
		colName = columnNames[21];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierID( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierID( String.valueOf(colName));
		}}
		
		//21: SupplierDescription	VARCHAR(255)
		colName = columnNames[22];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierDescription( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierDescription( String.valueOf(colName));
		}}
		
		//22: SupplierDUNS	VARCHAR(64)
		colName = columnNames[23];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierDUNS( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierDUNS( String.valueOf(colName));
		}}
		
		//23: SupplierDUNS+4	VARCHAR(64)
		colName = columnNames[24];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierDUNS4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierDUNS4( String.valueOf(colName));
		}}
		
		//24: SupplierAddress - Descriptor	VARCHAR(64)
		colName = columnNames[25];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierAddressDescriptor( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierAddressDescriptor( String.valueOf(colName));
		}}
		
		//25: Supplier Address 1	VARCHAR(256)
		colName = columnNames[26];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierAddress1( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierAddress1( String.valueOf(colName));
		}}
		
		//26: Supplier Address 2	VARCHAR(256)
		colName = columnNames[27];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierAddress2( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierAddress2( String.valueOf(colName));
		}}
		
		//27: Supplier Address 3	VARCHAR(256)
		colName = columnNames[28];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierAddress3( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierAddress3( String.valueOf(colName));
		}}
		
		//28: Supplier Address 4	VARCHAR(256)
		colName = columnNames[29];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierAddress4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierAddress4( String.valueOf(colName));
		}}
		
		//29: Supplier Address 5	VARCHAR(256)
		colName = columnNames[30];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierAddress5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierAddress5( String.valueOf(colName));
		}}
		

		//30: Supplier City	VARCHAR(64)
		colName = columnNames[31];	
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierAddress5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierAddress5( String.valueOf(colName));
		}}
		
		//31: SupplierCounty	VARCHAR(64)
		colName = columnNames[32];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setSupplierCounty( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierCounty( String.valueOf(colName));
		}}
		
		//32: SupplierState	VARCHAR(64)
		colName = columnNames[33];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierState( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierState( String.valueOf(colName));
		}}
		
		//33: SupplierCountry	VARCHAR(64)
		colName = columnNames[34];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setSupplierCountry( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierCountry( String.valueOf(colName));
		}}
		
		//34: SupplierZip	VARCHAR(64)
		colName = columnNames[35];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setSupplierZip( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierZip( String.valueOf(colName));
		}}
		
		//35: BuyerCode	VARCHAR(64)
		colName = columnNames[36];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setBuyerCode( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBuyerCode( String.valueOf(colName));
		}}
		
		//36: BuyerContact	VARCHAR(64)
		colName = columnNames[37];		
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setBuyerContact( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBuyerContact( String.valueOf(colName));
		}}
		
		//37: BuyerName	VARCHAR(64)
		colName = columnNames[38];		
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setBuyerName( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBuyerName( String.valueOf(colName));
		}}
		
		//38: BuyerEmail	VARCHAR(128)
		colName = columnNames[39];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setBuyerEmail( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBuyerEmail( String.valueOf(colName));
		}}
		
		//39: SupplierEmail	VARCHAR(128)
		colName = columnNames[40];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierEmail( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierEmail( String.valueOf(colName));
		}}
		
		//40: DeliveryTerm	VARCHAR(64)
		colName = columnNames[41];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setDeliveryTerm( String.valueOf( row.get(colName)));
		}else{
			e2Open.setDeliveryTerm( String.valueOf(colName));
		}}
		
		//41: PaymentTerms	VARCHAR(255)
		colName = columnNames[42];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setPaymentTerms( String.valueOf( row.get(colName)));
		}else{
			e2Open.setPaymentTerms( String.valueOf(colName));
		}}
		
		//42: TotalOrderAmount	Float
		colName = columnNames[43];
		System.out.println("colName--->"+colName);
		
		BigDecimal val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setTotalOrderAmount(val.floatValue());
		}
		
		
		//43: InCoTerms	VARCHAR(64)
		colName = columnNames[44];
		System.out.println("colName--->"+colName);
		
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setIncoTerms( String.valueOf( row.get(colName)));
		}else{
			e2Open.setIncoTerms( String.valueOf(colName));
		}}
		
		//44: CustomerOrderNotes	VARCHAR(4000)
		colName = columnNames[45];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setCustomerOrderNotes( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerOrderNotes( String.valueOf(colName));
		}}
		
		//45: SupplierOrderNotes	VARCHAR(4000)
		colName = columnNames[46];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierOrderNotes( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierOrderNotes( String.valueOf(colName));
		}}
		
		//46: BillTo	VARCHAR(255)
		colName = columnNames[47];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillTo( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillTo( String.valueOf(colName));
		}}
		
		//47: BillToAddressDescriptor	VARCHAR(255)   //Check
		colName = columnNames[48];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToAddress( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToAddress( String.valueOf(colName));
		}}
		
		//48: BillToAddress1	VARCHAR(255)
		colName = columnNames[49];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToAddress1( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToAddress1( String.valueOf(colName));
		}}
		
		//49: BillToAddress2	VARCHAR(255)
		colName = columnNames[50];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setBillToAddress2( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToAddress2( String.valueOf(colName));
		}}
		
		//50: 	BillToAddress3	VARCHAR(255)
		colName = columnNames[51];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToAddress3( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToAddress3( String.valueOf(colName));
		}}
		
		//51: BillToAddress4	VARCHAR(255)
		colName = columnNames[52];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToAddress4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToAddress4( String.valueOf(colName));
		}}
		
		//52: BillToAddress5	VARCHAR(255)
		colName = columnNames[53];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToAddress5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToAddress5( String.valueOf(colName));
		}}
		
		//53: BillToCity	VARCHAR(128)
		colName = columnNames[54];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToCity( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToCity( String.valueOf(colName));
		}}
		
		//54: BillToCounty	VARCHAR(128)
		colName = columnNames[55];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToCounty( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToCounty( String.valueOf(colName));
		}}

		
		//55: BillToState	VARCHAR(128)
		colName = columnNames[56];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToState( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToState( String.valueOf(colName));
		}}

		//56: BillToCountry	VARCHAR(128)
		colName = columnNames[57];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToCountry( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToCountry( String.valueOf(colName));
		}}

		//57: BillToZip	VARCHAR(128)
		colName = columnNames[58];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBillToZip( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBillToZip( String.valueOf(colName));
		}}

		//58: RemitToAddressDescriptor	VARCHAR(64)
		colName = columnNames[59];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToAddressDescriptor( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToAddressDescriptor( String.valueOf(colName));
		}}

		//59: RemitToAddress1	VARCHAR(256)
		colName = columnNames[60];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToAddress1(String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToAddress1(String.valueOf(colName));
		}}
		

		//60: RemitToAddress2	VARCHAR(256)
		colName = columnNames[61];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToAddress2( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToAddress2( String.valueOf(colName));
		}}

		//61: RemitToAddress3	VARCHAR(256)
		colName = columnNames[62];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToAddress3( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToAddress3( String.valueOf(colName));
		}}

		//62: RemitToAddress4	VARCHAR(256)
		colName = columnNames[63];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToAddress4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToAddress4( String.valueOf(colName));
		}}

		//63: RemitToAddress5	VARCHAR(256)
		colName = columnNames[64];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToAddress5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToAddress5( String.valueOf(colName));
		}}

		//64: RemitToCity	VARCHAR(64)
		colName = columnNames[65];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToCity( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToCity( String.valueOf(colName));
		}}

		//65: RemitToCounty	VARCHAR(64)
		colName = columnNames[66];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToCounty( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToCounty( String.valueOf(colName));
		}}

		//66: RemitToState	VARCHAR(64)
		colName = columnNames[67];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToState( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToState( String.valueOf(colName));
		}}

		//67: RemitToCountry	VARCHAR(64)
		colName = columnNames[68];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToCountry( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToCountry( String.valueOf(colName));
		}}

		//68: RemitToZip	VARCHAR(64)
		colName = columnNames[69];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setRemitToZip( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRemitToZip( String.valueOf(colName));
		}}

		//69: BuyerContactPhone	VARCHAR(255)
		colName = columnNames[70];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBuyerContactPhone( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBuyerContactPhone( String.valueOf(colName));
		}}
		

		//70: BuyerContactFax	VARCHAR(255)
		colName = columnNames[71];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setBuyerContactFax( String.valueOf( row.get(colName)));
		}else{
			e2Open.setBuyerContactFax( String.valueOf(colName));
		}}

		//71: OrderType	VARCHAR(255)
		colName = columnNames[72];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setOrderType( String.valueOf( row.get(colName)));
		}else{
			e2Open.setOrderType( String.valueOf(colName));
		}}

		//72: FlexStringPOHeade4	VARCHAR(128)
		colName = columnNames[73];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOHeader4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOHeader4( String.valueOf(colName));
		}}

		//73: 	FlexStringPOHeader5	VARCHAR(128)
		colName = columnNames[74];	
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOHeader5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOHeader5( String.valueOf(colName));
		}}

		//74: FlexStringPOHeader6	VARCHAR(128)
		colName = columnNames[75];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOHeader6( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOHeader6( String.valueOf(colName));
		}}

		//75: FlexStringPOHeader7	VARCHAR(64)
		colName = columnNames[76];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOHeader7( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOHeader7( String.valueOf(colName));
		}}

		//76: FlexStringPOHeader8	VARCHAR(64)
		colName = columnNames[77];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOHeader8( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOHeader8( String.valueOf(colName));
		}}

		//77: 	FlexStringPOHeader9	VARCHAR(64)
		colName = columnNames[78];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOHeader9( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOHeader9( String.valueOf(colName));
		}}

		//78: 	FlexIntPOHeader1	NUMBER
		colName = columnNames[79];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOHeader1(val.intValue());
		}
		
		//79: 	FlexIntPOHeader2	NUMBER
		colName = columnNames[80];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOHeader2(val.intValue());
		}
		
		//80: 	FlexIntPOHeader3	NUMBER
		colName = columnNames[81];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOHeader3(val.intValue());
		}
		
		//81: FlexIntPOHeader4	NUMBER
		colName = columnNames[82];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOHeader4(val.intValue());
		}
		
		
		//82: FlexIntPOHeader5	NUMBER
		colName = columnNames[83];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOHeader5(val.intValue());
		}
		

		//83: FlexFloatPOHeader1	Float
		colName = columnNames[84];
		colName = columnNames[83];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOHeader1(val.floatValue());
		}
		

		//84: FlexFloatPOHeader2	Float
		colName = columnNames[85];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOHeader2(val.floatValue());
		}
		

		//85: FlexFloatPOHeader3	Float
		colName = columnNames[86];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOHeader3(val.floatValue());
		}
		

		//86: FlexFloatPOHeader4	Float
		colName = columnNames[87];
		
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOHeader4(val.floatValue());
		}
		

		//87: FlexFloatPOHeader5	Float
		colName = columnNames[88];
		
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOHeader5(val.floatValue());
		}
		

		//88: FlexDatePOHeader1	Date
		colName = columnNames[89];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOHeader1(CommonUtils.stringToDate( String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOHeader1(CommonUtils.stringToDate( String.valueOf(colName)));
		}}

		//89: 	FlexDatePOHeader2	Date
		colName = columnNames[90];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOHeader2(CommonUtils.stringToDate( String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOHeader2(CommonUtils.stringToDate( String.valueOf(colName)));
		}}
		
		//90: FlexDatePOHeader3	Date
		colName = columnNames[91];
		if(!CommonUtils.isBlank(colName)){
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOHeader3(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOHeader3(CommonUtils.stringToDate( String.valueOf(colName)));
		}}
		
		//91: Flex Date PO Header 4	Date
		colName = columnNames[92];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOHeader4(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOHeader4(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		
		//92: Flex Date PO Header 5	Date
		
		colName = columnNames[93];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOHeader5(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOHeader5(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		
		//93: LineID	NUMBER
		colName = columnNames[94];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setLineID(val.intValue());
		}
		
		
		//94: LineStatus	VARCHAR(64)
		colName = columnNames[95];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setLineStatus( String.valueOf( row.get(colName)));
		}else{
			e2Open.setLineStatus( String.valueOf(colName));
		}}
		
		//95: Customer Item ID	VARCHAR(64)
		colName = columnNames[96];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerItemID( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerItemID( String.valueOf(colName));
		}}
		
		//96: Customer Item Description	VARCHAR(255)
		colName = columnNames[97];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerItemDescription( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerItemDescription( String.valueOf(colName));
		}}
		
		//97: Supplier Item ID	VARCHAR(64)
		colName = columnNames[98];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierItemID( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierItemID( String.valueOf(colName));
		}}
		
		//98: Supplier Item Description	VARCHAR(255)
		colName = columnNames[99];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierItemDescription( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierItemDescription( String.valueOf(colName));
		}}
		
		
		
		//Start here==============================
		//99: Unit Price	Float
		colName = columnNames[100];
		
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setUnitPrice(val.floatValue());
		}
		
		//100: PriceBasis	VARCHAR(64)
		colName = columnNames[101];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setPriceBasis( String.valueOf( row.get(colName)));
		}else{
			e2Open.setPriceBasis( String.valueOf(colName));
		}}
		
		//101: PaymentCurrency	VARCHAR(64)
		colName = columnNames[102];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setPaymentCurrency( String.valueOf( row.get(colName)));
		}else{
			e2Open.setPaymentCurrency( String.valueOf(colName));
		}}
		//102: TotalLineAmount	Float
		colName = columnNames[103];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setTotalLineAmount(val.floatValue());
		}
		
		
		
		//103: UOM	VARCHAR(64)
		colName = columnNames[104];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setUOM( String.valueOf( row.get(colName)));
		}else{
			e2Open.setUOM( String.valueOf(colName));
		}}
		//104: Customer Order Line Notes	VARCHAR(4000)
		colName = columnNames[105];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerOrderLineNotes( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerOrderLineNotes( String.valueOf(colName));
		}}
		//105: Supplier Order Line Notes	VARCHAR(4000)
		colName = columnNames[106];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierOrderLineNotes( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierOrderLineNotes( String.valueOf(colName));
		}}
		//106: Drawing Version	VARCHAR(255)
		colName = columnNames[107];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setDrawingVersion( String.valueOf( row.get(colName)));
		}else{
			e2Open.setDrawingVersion( String.valueOf(colName));
		}}
		//107: 	Drawing Number	VARCHAR(255)
		colName = columnNames[108];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setDrawingNumber( String.valueOf( row.get(colName)));
		}else{
			e2Open.setDrawingNumber( String.valueOf(colName));
		}}
		//108: Item Category	VARCHAR(255)
		colName = columnNames[109];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setItemCategory( String.valueOf( row.get(colName)));
		}else{
			e2Open.setItemCategory( String.valueOf(colName));
		}}
		//109: Ship To Location	VARCHAR(128)
		colName = columnNames[110];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToLocation( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToLocation( String.valueOf(colName));
		}}
		//110: FlexStringPOLine5	VARCHAR(128)
		colName = columnNames[111];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOLine5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOLine5( String.valueOf(colName));
		}}
		//111: FlexStringPOLine6	VARCHAR(128)
		colName = columnNames[112];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOLine6( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOLine6( String.valueOf(colName));
		}}
		//112: FlexStringPOLine7	VARCHAR(64)
		colName = columnNames[113];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOLine7( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOLine7( String.valueOf(colName));
		}}
		//113: FlexStringPOLine8	VARCHAR(64)
		colName = columnNames[114];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOLine8( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOLine8( String.valueOf(colName));
		}}
		//114: Flex String PO Line 9	VARCHAR(64)
		colName = columnNames[115];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOLine9( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOLine9( String.valueOf(colName));
		}}
		//115: Free Item Flag	NUMBER
		colName = columnNames[116];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFreeItemFlag(val.intValue());
		}
		
		
		//116: Flex Int PO Line 2	NUMBER
		colName = columnNames[117];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOLine2(val.intValue());
		}
		
		//117: Flex Int PO Line 3	NUMBER
		colName = columnNames[118];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOLine3(val.intValue());
		}
		
		//118: Flex Int PO Line 4	NUMBER
		colName = columnNames[119];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOLine4(val.intValue());
		}
		
		//119: Flex Int PO Line 5	NUMBER
		colName = columnNames[120];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOLine5(val.intValue());
		}
		
		//120: Flex Float PO Line 1	Float
		colName = columnNames[121];
		
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOLine1(val.floatValue());
		}

		//121: Flex Float PO Line 2	Float
		colName = columnNames[122];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOLine2(val.floatValue());
		}
		
		
		//122: Flex Float PO Line 3	Float
		colName = columnNames[123];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOLine3(val.floatValue());
		}
		
		//123: Flex Float PO Line 4	Float
		colName = columnNames[124];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOLine4(val.floatValue());
		}
		
		//124: Flex Float PO Line 5	Float
		colName = columnNames[125];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOLine5(val.floatValue());
		}
		
		//125: FlexDate PO Line 1	Date
		colName = columnNames[126];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOLine1(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOLine1(CommonUtils.stringToDate(String.valueOf(colName)));
		}}

		//126: FlexDate PO Line 2	Date
		colName = columnNames[127];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOLine2(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOLine2(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//127: FlexDate PO Line 3	Date
		colName = columnNames[128];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOLine3( CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOLine3(CommonUtils.stringToDate(String.valueOf(colName)));
		}}

		//128: FlexDate PO Line 4	Date
		colName = columnNames[129];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOLine1(CommonUtils.stringToDate(String.valueOf(row.get(colName))));
		}else{
			e2Open.setFlexDatePOLine1(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		
		//129: Flex Date PO Line 5	Date
		colName = columnNames[130];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOLine5(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOLine5(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//130: RequestID	NUMBER
		colName = columnNames[131];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setRequestID(val.intValue());
		}
		
		
		//131: RequestStatus	VARCHAR(64)
		colName = columnNames[132];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRequestStatus( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRequestStatus( String.valueOf(colName));
		}}
		//132: Action	VARCHAR(64)
		colName = columnNames[133];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setAction( String.valueOf( row.get(colName)));
		}else{
			e2Open.setAction( String.valueOf(colName));
		}}
		//133: RequestQty	Float
		colName = columnNames[134];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setRequestQty(val.floatValue());
		}
		
		
		//134: RequestDate	Date
		colName = columnNames[135];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRequestDate(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setRequestDate(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//135: Requested Ship Date	Date
		colName = columnNames[136];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRequestedShipDate(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setRequestedShipDate(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//136: Carrier	VARCHAR(64)
		colName = columnNames[137];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCarrier( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCarrier( String.valueOf(colName));
		}}
		//137: CustomerSite	VARCHAR(64)
		colName = columnNames[138];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setCustomerSite( String.valueOf( row.get(colName)));
		}else{
			e2Open.setCustomerSite( String.valueOf(colName));
		}}
		//138: ShipToAddress - Descriptor	VARCHAR(64)
		colName = columnNames[139];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToAddressDescriptor( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToAddressDescriptor( String.valueOf(colName));
		}}
		
		//139: Ship To Address 1	VARCHAR(256)
		colName = columnNames[140];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToAddress1( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToAddress1( String.valueOf(colName));
		}}
		//140: Ship To Address 2	VARCHAR(256)
		colName = columnNames[141];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToAddress2( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToAddress2( String.valueOf(colName));
		}}
		//141: Ship To Address 3	VARCHAR(256)
		colName = columnNames[142];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToAddress3( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToAddress3( String.valueOf(colName));
		}}
		//142: Ship To Address 4	VARCHAR(256)
		colName = columnNames[143];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToAddress4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToAddress4( String.valueOf(colName));
		}}
		//143: Ship To Address 5	VARCHAR(256)
		colName = columnNames[144];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToAddress5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToAddress5( String.valueOf(colName));
		}}
		//144: ShipToCity	VARCHAR(64)
		colName = columnNames[145];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToCity( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToCity( String.valueOf(colName));
		}}
		//145: Ship To County	VARCHAR(64)
		colName = columnNames[146];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToCounty( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToCounty( String.valueOf(colName));
		}}
		//146: Ship To State	VARCHAR(64)
		colName = columnNames[147];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToState( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToState( String.valueOf(colName));
		}}
		//147: ShipToCountry	VARCHAR(64)
		colName = columnNames[148];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToCountry( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToCountry( String.valueOf(colName));
		}}
		//148: ShipToZip	VARCHAR(64)
		colName = columnNames[149];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipToZip( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipToZip( String.valueOf(colName));
		}}
		//149: RefOrderType	VARCHAR(64)
		colName = columnNames[150];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRefOrderType( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRefOrderType( String.valueOf(colName));
		}}
		//150: RefOrderID	VARCHAR(64)
		colName = columnNames[151];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRefOrderID( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRefOrderID( String.valueOf(colName));
		}}
		//151: RefOrderLinID	VARCHAR(64)
		colName = columnNames[152];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRefOrderLineID( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRefOrderLineID( String.valueOf(colName));
		}}
		//152: RefOrderRequestID	VARCHAR(64)
		colName = columnNames[153];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRefOrderRequestID( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRefOrderRequestID( String.valueOf(colName));
		}}
		//153: RefCustomerID	VARCHAR(64)
		colName = columnNames[154];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRefCustomerID( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRefCustomerID( String.valueOf(colName));
		}}
		//154: RefSupplierID	VARCHAR(64)
		colName = columnNames[155];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRefSupplierID( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRefSupplierID( String.valueOf(colName));
		}}
		//155: FlexStringPORequest1	VARCHAR(255)
		colName = columnNames[156];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPORequest1( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPORequest1( String.valueOf(colName));
		}}
		//156: FlexString PO Request 2	VARCHAR(255)
		colName = columnNames[157];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPORequest2( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPORequest2( String.valueOf(colName));
		}}
		//157: FlexString PO Request 3	VARCHAR(255)
		colName = columnNames[158];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPORequest3( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPORequest3( String.valueOf(colName));
		}}
		//158: FlexString PO Request 4	VARCHAR(128)
		colName = columnNames[159];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPORequest4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPORequest4( String.valueOf(colName));
		}}
		//159: Flex String PO Request 5	VARCHAR(128)
		colName = columnNames[160];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPORequest5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPORequest5( String.valueOf(colName));
		}}
		
		//160: Flex String PO Request 6	VARCHAR(128)
		colName = columnNames[161];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPORequest6( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPORequest6( String.valueOf(colName));
		}}
		//161: Flex String PO Request 7	VARCHAR(64)
		colName = columnNames[162];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPORequest7( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPORequest7( String.valueOf(colName));
		}}
		//162: Flex String PO Request 8	VARCHAR(64)
		colName = columnNames[163];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPORequest8( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPORequest8( String.valueOf(colName));
		}}
		//163: Flex String PO Request 9	VARCHAR(64)
		colName = columnNames[164];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPORequest9( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPORequest9( String.valueOf(colName));
		}}
		//164: FlexIntPORequest1	NUMBER
		colName = columnNames[165];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPORequest1(val.intValue());
		}
		
		//165: Flex Int PO Request 2	NUMBER
		colName = columnNames[166];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPORequest2(val.intValue());
		}
		
		//166: Flex Int PO Request 3	NUMBER
		colName = columnNames[167];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPORequest1(val.intValue());
		}
		
		//167: Flex Int PO Request 4	NUMBER
		colName = columnNames[168];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPORequest1(val.intValue());
		}
		
		//168: FlexIntPORequest5	NUMBER
		colName = columnNames[169];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPORequest5(val.intValue());
		}
		
		//169: FlexFloatPORequest1	Float
		colName = columnNames[170];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPORequest1(val.floatValue());
		}
		
		
		//170: Flex Float PO Request 2	Float
		colName = columnNames[171];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPORequest2(val.floatValue());
		}
		
		
		//171: Flex Float PO Request 3	Float
		colName = columnNames[172];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPORequest3(val.floatValue());
		}


		//172: Flex Float PO Request 4	Float
		colName = columnNames[173];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPORequest4(val.floatValue());
		}
		
		 
		//173: Flex Float PO Request 5	Float
		colName = columnNames[174];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPORequest5(val.floatValue());
		}
		
		//174: FlexDate PO Request 1	Date
		
		colName = columnNames[175];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePORequest1(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePORequest1(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//175: FlexDate PO Request 2	Date
		colName = columnNames[176];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePORequest2(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePORequest2(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//176: FlexDate PO Request 3	Date
		colName = columnNames[177];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePORequest3(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePORequest3(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//177: Flex Date PO Request 4	Date
		colName = columnNames[178];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePORequest4(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePORequest4(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//178: Flex Date PO Request 5	Date
		colName = columnNames[179];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePORequest5(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePORequest5(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//179: PromiseID	NUMBER
		colName = columnNames[180];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setPromiseID(val.intValue());
		}
		
		
		//180: Promise Qty	Float
		colName = columnNames[181];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setPromiseQty(val.floatValue());
		}
		
		
		//181: Promise Date	Date
		colName = columnNames[182];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setPromiseDate(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setPromiseDate(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//182: Promised Ship Date	Date
		colName = columnNames[183];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setPromisedShipDate(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setPromisedShipDate(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//183: Supplier Site	VARCHAR(64)
		colName = columnNames[184];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setSupplierSite( String.valueOf( row.get(colName)));
		}else{
			e2Open.setSupplierSite( String.valueOf(colName));
		}}
		//184: Ship From Address - Descriptor	VARCHAR(64)
		colName = columnNames[185];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromAddressDescriptor( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromAddressDescriptor( String.valueOf(colName));
		}}
		//185: Ship From Address 1	VARCHAR(256)
		colName = columnNames[186];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromAddress1( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromAddress1( String.valueOf(colName));
		}}
		//186: Ship From Address 2	VARCHAR(256)
		colName = columnNames[187];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromAddress2( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromAddress2( String.valueOf(colName));
		}}
		//187: Ship From Address 3	VARCHAR(256)
		colName = columnNames[188];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromAddress3( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromAddress3( String.valueOf(colName));
		}}
		//188: Ship From Address 4	VARCHAR(256)
		colName = columnNames[189];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromAddress4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromAddress4( String.valueOf(colName));
		}}
		//189: Ship From Address 5	VARCHAR(256)
		colName = columnNames[190];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromAddress5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromAddress5( String.valueOf(colName));
		}}
		
		//190: Ship From City	VARCHAR(64)
		colName = columnNames[191];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromCity( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromCity( String.valueOf(colName));
		}}
		//191: Ship From County	VARCHAR(64)
		colName = columnNames[192];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromCounty( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromCounty( String.valueOf(colName));
		}}
		//192: Ship From State	VARCHAR(64)
		colName = columnNames[193];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromState( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromState( String.valueOf(colName));
		}}
		//193: Ship From Country	VARCHAR(64)
		colName = columnNames[194];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromCountry( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromCountry( String.valueOf(colName));
		}}
		//194: Ship From Zip	VARCHAR(64)
		colName = columnNames[195];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setShipFromZip( String.valueOf( row.get(colName)));
		}else{
			e2Open.setShipFromZip( String.valueOf(colName));
		}}
		//195: Flex String PO Promise 1	VARCHAR(255)
		colName = columnNames[196];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOPromise1( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOPromise1( String.valueOf(colName));
		}}
		//196: Flex String PO Promise 2	VARCHAR(255)
		colName = columnNames[197];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOPromise2( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOPromise2( String.valueOf(colName));
		}}
		//197: Flex String PO Promise 3	VARCHAR(255)
		colName = columnNames[198];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOPromise3( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOPromise3( String.valueOf(colName));
		}}
		//198: Flex String PO Promise 4	VARCHAR(128)
		colName = columnNames[199];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOPromise4( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOPromise4( String.valueOf(colName));
		}}
		//199: Flex String PO Promise 5	VARCHAR(128)
		colName = columnNames[200];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOPromise5( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOPromise5( String.valueOf(colName));
		}}
		//200: Flex String PO Promise 6	VARCHAR(128)
		colName = columnNames[201];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOPromise6( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOPromise6( String.valueOf(colName));
		}}
		//201: Flex String PO Promise 7	VARCHAR(64)
		colName = columnNames[202];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOPromise7( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOPromise7( String.valueOf(colName));
		}}
		//202: Flex String PO Promise 8	VARCHAR(64)
		colName = columnNames[203];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOPromise8( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOPromise8( String.valueOf(colName));
		}}
		//203: Flex String PO Promise 9	VARCHAR(64)
		colName = columnNames[204];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexStringPOPromise9( String.valueOf( row.get(colName)));
		}else{
			e2Open.setFlexStringPOPromise9( String.valueOf(colName));
		}}
		//204: Flex Int PO Promise 1	NUMBER
		colName = columnNames[205];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOPromise1(val.intValue());
		}
		
		//205: Flex Int PO Promise 2	NUMBER
		colName = columnNames[206];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOPromise2(val.intValue());
		}
		
		//206: Flex Int PO Promise 3	NUMBER
		colName = columnNames[207];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOPromise3(val.intValue());
		}
		
		//207: Flex Int PO Promise 4	NUMBER
		colName = columnNames[208];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOPromise4(val.intValue());
		}
		
		//208: Flex Int PO Promise 5	NUMBER
		colName = columnNames[209];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexIntPOPromise5(val.intValue());
		}
		
		//209: Flex Float PO Promise 1	Float
		colName = columnNames[210];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlex_Float_PO_Promise1(val.floatValue());
		}
		
		//210: Flex Float PO Promise 2	Float
		colName = columnNames[211];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setTotalOrderAmount(val.floatValue());
		}
		
		//211: Flex Float PO Promise 3	Float
		colName = columnNames[212];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOPromise3(val.floatValue());
		}
		
		//212: Flex Float PO Promise 4	Float
		colName = columnNames[213];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOPromise4(val.floatValue());
		}
		
		//213: Flex Float PO Promise 5	Float
		colName = columnNames[214];
		val = getValue(row,colName);
		
		if(val!=null){
			e2Open.setFlexFloatPOPromise5(val.floatValue());
		}
		
		//214: FlexDate PO Promise 1	Date
		colName = columnNames[215];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOPromise1(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOPromise1(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//215: Flex Date PO Promise 2	Date
		colName = columnNames[216];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOPromise2(CommonUtils.stringToDate(String.valueOf(row.get(colName))));
		}else{
			e2Open.setFlexDatePOPromise2(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//216: Flex Date PO Promise 3	Date
		colName = columnNames[217];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOPromise3(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOPromise3(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//217: Flex Date PO Promise 4	Date
		colName = columnNames[218];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOPromise4(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOPromise4(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//218: Flex Date PO Promise 5	Date
		colName = columnNames[219];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setFlexDatePOPromise4(CommonUtils.stringToDate(String.valueOf( row.get(colName))));
		}else{
			e2Open.setFlexDatePOPromise4(CommonUtils.stringToDate(String.valueOf(colName)));
		}}
		//219: Rev#	VARCHAR(64)
		colName = columnNames[220];
		if(!CommonUtils.isBlank(colName)){
			 
		if(row.containsKey(colName)){
			e2Open.setRev( String.valueOf( row.get(colName)));
		}else{
			e2Open.setRev( String.valueOf(colName));
		}}
		//220: Ship To Customer ID	VARCHAR(64)
		colName = columnNames[220];
		if(!CommonUtils.isBlank(colName)){
			 
			if(row.containsKey(colName)){
				e2Open.setShipToCustomerID( String.valueOf( row.get(colName)));
			}else{
				e2Open.setShipToCustomerID( String.valueOf(colName));
			}
		}	
		
		e2Open.setStatus(Constants.STATUS_INTRANSIT);
		e2Open.setDataSource(Constants.DATASOURCE_SYMIX);
		  
		  
		return e2Open;
	}
	
	public static PO preparePoData(Map<String,Object> row){
		
			
	  PO po = new PO();
 	  
 	  if((row.get("po-num")!=null) && ((row.get("po-num")!=null) && (! StringUtils.isBlank(String.valueOf(row.get("po-num")))))){
 		   po.setPoNum(Integer.parseInt(String.valueOf(row.get("po-num"))));
 	  }else{
 		   return null;
 	  }

 	  if((row.get("vend-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-num"))))){
		   po.setVendNum(Integer.parseInt(String.valueOf( row.get("vend-num"))));
	  }
 	  
 	  if((row.get("order-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("order-Date"))))){
		   po.setOrderDate(CommonUtils.stringToDate( String.valueOf( row.get("order-Date"))));
	  }
 	  
 	  if((row.get("buyer")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("buyer"))))){
		   po.setBuyer(String.valueOf( row.get("buyer")));
	  } 	  
	  if((row.get("po-cost")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("po-cost"))))){
		   po.setPoCost(Float.parseFloat(String.valueOf( row.get("po-cost"))));
	  }
	  if((row.get("ship-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ship-code"))))){
		   po.setShipCode(String.valueOf( row.get("ship-code")));
	  }
	  
	  if((row.get("terms-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("terms-code"))))){
		   po.setTermsCode(String.valueOf( row.get("terms-code")));
	  }
	  if((row.get("fob")!=null) && (! StringUtils.isBlank(String.valueOf(row.get("fob"))))){
		   po.setFob(String.valueOf( row.get("fob")));
	  }
	  if((row.get("print-price")!=null) && (! StringUtils.isBlank(String.valueOf(row.get("print-price"))))){
		   po.setPrintPrice(Boolean.parseBoolean(String.valueOf( row.get("print-price"))));
	  }
	  if((row.get("vend-order")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-order"))))){
		   po.setVendOrder(String.valueOf( row.get("vend-order")));
	  }
	  if((row.get("misc-charges")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("misc-charges"))))){
		   po.setMiscCharges(Float.parseFloat(String.valueOf( row.get("misc-charges"))));
	  }
	  if((row.get("sales-tax")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("sales-tax"))))){
		   po.setSalesTax(Float.parseFloat(String.valueOf( row.get("sales-tax"))));
	  }
	  if((row.get("freight")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("freight"))))){
		   po.setFreight(Float.parseFloat(String.valueOf( row.get("freight"))));
	  }
	  if((row.get("stat")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("stat"))))){
		   po.setStat(String.valueOf( row.get("stat")));
	  }
	  if((row.get("key")!=null) && (! StringUtils.isBlank(String.valueOf(row.get("key"))))){
		   po.setKey(Integer.parseInt(String.valueOf( row.get("key"))));
	  }
	  
	  if((row.get("inv-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("inv-Date"))))){
		  po.setInvDate(CommonUtils.stringToDate( String.valueOf( row.get("inv-Date"))));
	  }
	  if((row.get("inv-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("inv-num"))))){
		   po.setInvNum(String.valueOf( row.get("inv-num")));
	  }
	  if((row.get("dist-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("dist-Date"))))){
		  
		   po.setDistDate(CommonUtils.stringToDate( String.valueOf( row.get("dist-Date"))));
	  }
	  if((row.get("type")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("type"))))){
		   po.setType(String.valueOf( row.get("type")));
	  }
	  if((row.get("drop-ship-no")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("drop-ship-no"))))){
		   po.setDropShipNo(Integer.parseInt(String.valueOf( row.get("drop-ship-no"))));
	  }
	  if((row.get("drop-seq")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("drop-seq"))))){
		   po.setDropSeq(Integer.parseInt(String.valueOf( row.get("drop-seq"))));
	  }
	  if((row.get("eff-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("eff-Date"))))){
		  po.setEffDate(CommonUtils.stringToDate( String.valueOf( row.get("eff-Date"))));
	  }
	  if((row.get("exp-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("exp-Date"))))){
		  po.setExpDate( CommonUtils.stringToDate( String.valueOf( row.get("exp-Date"))));
	  }
	  if((row.get("ship-addr")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ship-addr"))))){
		   po.setShipAddr(String.valueOf( row.get("ship-addr")));
	  }
	  
	  if((row.get("m-charges-t")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("m-charges-t"))))){
		   po.setmChargesT(Float.parseFloat(String.valueOf( row.get("m-charges-t"))));
	  }
	  if((row.get("sales-tax-t")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("sales-tax-t"))))){
		   po.setSalesTaxT(Float.parseFloat(String.valueOf( row.get("sales-tax-t"))));
	  }
	  if((row.get("freight-t")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("freight-t"))))){
		   po.setFreightT(Float.parseFloat(String.valueOf( row.get("freight-t"))));
	  }
	  if((row.get("whse")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("whse"))))){
		   po.setWhse(String.valueOf( row.get("whse")));
	  }
	  
	  po.setStatus(Constants.STATUS_INTRANSIT);
	 // po.setDataSource(Constants.DATASOURCE_SYMIX);
	  
 	   return po;
	}

	public static PoItem preparePoItemData(Map<String,Object> row){
		
		PoItem poItem = new PoItem();
		if((row.get("po-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("po-num"))))){
			poItem.setPoNum(Integer.parseInt(String.valueOf( row.get("po-num"))));
	 	}
		
		if((row.get("po-line")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("po-line"))))){
			poItem.setPoLine(Integer.parseInt(String.valueOf( row.get("po-line"))));
	 	}
		if((row.get("po-release")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("po-release"))))){
			poItem.setPoRelease(Integer.parseInt(String.valueOf( row.get("po-release"))));
	 	}
		
		if((row.get("item")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("item"))))){
			poItem.setItem(String.valueOf( row.get("item")));
	 	}
		
		if((row.get("qty-ordered")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("qty-ordered"))))){
			poItem.setQtyOrdered(Float.parseFloat(String.valueOf( row.get("qty-ordered"))));
	 	}
		if((row.get("qty-received")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("qty-received"))))){
			poItem.setQtyReceived(Float.parseFloat(String.valueOf( row.get("qty-received"))));
	 	}
		if((row.get("qty-rejected")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("qty-rejected"))))){
			poItem.setQtyRejected(Float.parseFloat(String.valueOf( row.get("qty-rejected"))));
	 	}
		if((row.get("item-cost")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("item-cost"))))){
			poItem.setItemCost(Float.parseFloat(String.valueOf( row.get("item-cost"))));
	 	}
		if((row.get("ref-type")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ref-type"))))){
			poItem.setRefType(String.valueOf(row.get("ref-type")));
	 	}
		if((row.get("ref-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ref-num"))))){
			poItem.setRefNum(Integer.parseInt(String.valueOf(row.get("ref-num"))));
	 	}
		if((row.get("ref-line-suf")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ref-line-suf"))))){
			poItem.setRefLineSuf(Integer.parseInt(String.valueOf(row.get("ref-line-suf"))));
	 	}
		if((row.get("due-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("due-Date"))))){
			poItem.setDueDate(CommonUtils.stringToDate(String.valueOf(row.get("due-Date"))));
	 	}
		if((row.get("rcvd-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("rcvd-Date"))))){
			poItem.setRcvdDate(CommonUtils.stringToDate(String.valueOf(row.get("rcvd-Date"))));
	 	}
		if((row.get("vend-item")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-item"))))){
			poItem.setVendItem(String.valueOf(row.get("vend-item")));
	 	}
		if((row.get("root-job")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("root-job"))))){
			poItem.setRootJob(Integer.parseInt(String.valueOf(row.get("root-job"))));
	 	}
		if((row.get("root-suf")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("root-suf"))))){
			poItem.setRootSuf(Integer.parseInt(String.valueOf(row.get("root-suf"))));
	 	}
		if((row.get("key")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("key"))))){
			poItem.setKey(Integer.parseInt(String.valueOf(row.get("key"))));
	 	}
		if((row.get("plan-cost")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("plan-cost"))))){
			poItem.setPlanCost(Float.parseFloat(String.valueOf( row.get("plan-cost"))));
		}
		if((row.get("qty-voucher")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("qty-voucher"))))){
			poItem.setQtyVoucher(Float.parseFloat(String.valueOf( row.get("qty-voucher"))));
		}
		if((row.get("qty-returned")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("qty-returned"))))){
			poItem.setQtyReturned(Float.parseFloat(String.valueOf( row.get("qty-returned"))));
		}
		if((row.get("voucher-cost")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("voucher-cost"))))){
			poItem.setVoucherCost(Float.parseFloat(String.valueOf( row.get("voucher-cost"))));
		}
		if((row.get("non-inv-acct")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("non-inv-acct"))))){
			poItem.setNonInvAcct(String.valueOf(row.get("non-inv-acct")));
	 	}
		if((row.get("non-inv-sub")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("non-inv-sub"))))){
			poItem.setNonInvSub(String.valueOf(row.get("non-inv-sub")));
	 	}
		if((row.get("stat")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("stat"))))){
			poItem.setStat(String.valueOf(row.get("stat")));
	 	}
		if((row.get("drop-ship-no")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("drop-ship-no"))))){
			poItem.setDropShipNo(Integer.parseInt(String.valueOf(row.get("drop-ship-no"))));
	 	}
		if((row.get("drop-seq")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("drop-seq"))))){
			poItem.setDropSeq(Integer.parseInt(String.valueOf(row.get("drop-seq"))));
	 	}
		if((row.get("ship-addr")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ship-addr"))))){
			poItem.setShipAddr(String.valueOf(row.get("ship-addr")));
	 	}
		if((row.get("promise-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("promise-Date"))))){
			poItem.setPromiseDate(CommonUtils.stringToDate(String.valueOf(row.get("promise-Date"))));
	 	}
		if((row.get("release-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("release-Date"))))){
			poItem.setReleaseDate(CommonUtils.stringToDate(String.valueOf(row.get("release-Date"))));
	 	}
		if((row.get("whse")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("whse"))))){
			poItem.setWhse(String.valueOf(row.get("whse")));
	 	}
		return poItem;
	}
	
	
	public static Vendor prepareVendorData(Map<String,Object> row){
		
		Vendor vendor = new Vendor();
		if((row.get("vend-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-num"))))){
			vendor.setVendNum(Integer.parseInt(String.valueOf( row.get("vend-num"))));
	 	}
		if((row.get("curr-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("curr-code"))))){
			vendor.setCurrCode(String.valueOf( row.get("curr-code")));
	 	}
		if((row.get("contact")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("contact"))))){
			vendor.setContact(String.valueOf( row.get("contact")));
	 	}
		if((row.get("phone")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("phone"))))){
			vendor.setPhone(String.valueOf( row.get("phone")));
	 	}
		if((row.get("vend-type")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-type"))))){
			vendor.setVendType(String.valueOf( row.get("vend-type")));
	 	}
		if((row.get("terms-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("terms-code"))))){
			vendor.setTermsCode(String.valueOf( row.get("terms-code")));
	 	}
		if((row.get("ship-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ship-code"))))){
			vendor.setShipCode(String.valueOf( row.get("ship-code")));
	 	}
		if((row.get("fob")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("fob"))))){
			vendor.setFob(String.valueOf( row.get("fob")));
	 	}
		if((row.get("print-price")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("print-price"))))){
			vendor.setPrintPrice(Boolean.parseBoolean(String.valueOf( row.get("print-price"))));
	 	}
		if((row.get("stat")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("stat"))))){
			vendor.setStat(String.valueOf(row.get("stat")));
	 	}
		if((row.get("key")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("key"))))){
			vendor.setKey(Integer.parseInt(String.valueOf(row.get("key"))));
	 	}
		if((row.get("last-purch")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-purch"))))){
			vendor.setLastPurch(CommonUtils.stringToDate(String.valueOf(row.get("last-purch"))));
	 	}
		if((row.get("last-paid")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-paid"))))){
			vendor.setLastPaid(CommonUtils.stringToDate(String.valueOf(row.get("last-paid"))));
	 	}
		if((row.get("purch-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("purch-ytd"))))){
			vendor.setPurchYtd(Float.parseFloat(String.valueOf(row.get("purch-ytd"))));
	 	}
		if((row.get("purch-lst-yr")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("purch-lst-yr"))))){
			vendor.setPurchLstYr(Float.parseFloat(String.valueOf(row.get("purch-lst-yr"))));
	 	}
		if((row.get("disc-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("disc-ytd"))))){
			vendor.setDiscYtd(Float.parseFloat(String.valueOf(row.get("disc-ytd"))));
	 	}
		if((row.get("disc-lst-yr")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("disc-lst-yr"))))){
			vendor.setDiscLstYr(Float.parseFloat(String.valueOf(row.get("disc-lst-yr"))));
	 	}
		if((row.get("pay-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("pay-ytd"))))){
			vendor.setPayYtd(Float.parseFloat(String.valueOf(row.get("pay-ytd"))));
	 	}
		if((row.get("fed-id")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("fed-id"))))){
			vendor.setFedId(String.valueOf(row.get("fed-id")));
	 	}
		if((row.get("vend-remit")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-remit"))))){
			vendor.setVendRemit(Integer.parseInt(String.valueOf(row.get("vend-remit"))));
	 	}
		if((row.get("whse")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("whse"))))){
			vendor.setWhse(String.valueOf(row.get("whse")));
	 	}
		if((row.get("charfld1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("charfld1"))))){
			vendor.setCharfld1(String.valueOf(row.get("charfld1")));
	 	}
		if((row.get("charfld2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("charfld2"))))){
			vendor.setCharfld2(String.valueOf(row.get("charfld2")));
	 	}
		if((row.get("charfld3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("charfld3"))))){
			vendor.setCharfld3(String.valueOf(row.get("charfld3")));
	 	}
		if((row.get("decifld1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("decifld1"))))){
			vendor.setDecifld1(Float.parseFloat(String.valueOf(row.get("decifld1"))));
	 	}
		if((row.get("decifld2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("decifld2"))))){
			vendor.setDecifld2(Float.parseFloat(String.valueOf(row.get("decifld2"))));
	 	}
		if((row.get("decifld3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("decifld3"))))){
			vendor.setDecifld3(Float.parseFloat(String.valueOf(row.get("decifld3"))));
	 	}
		if((row.get("logifld")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("logifld"))))){
			vendor.setLogifld(Boolean.parseBoolean(String.valueOf( row.get("logifld"))));
	 	}
		if((row.get("Datefld")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("Datefld"))))){
			vendor.setDatefld(CommonUtils.stringToDate(String.valueOf( row.get("Datefld"))));
	 	}
		return vendor;
	}
	
	public static Item prepareItemData(Map<String,Object> row){
		
		Item item = new Item();
		if((row.get("item")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("item"))))){
			item.setItem(String.valueOf( row.get("item")));
	 	}
		
		if((row.get("description")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("description"))))){
			item.setDescription(String.valueOf( row.get("description")));
	 	}
		
		if((row.get("qty-allocjob")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("qty-allocjob"))))){
			item.setQtyAllocjob(Float.parseFloat(String.valueOf( row.get("qty-allocjob"))));
	 	}
		if((row.get("qty-wip")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("qty-wip"))))){
			item.setQtyWip(Float.parseFloat(String.valueOf( row.get("qty-wip"))));
	 	}
		if((row.get("u-m")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("u-m"))))){
			item.setUm(String.valueOf( row.get("u-m")));
	 	}
		if((row.get("unit-price")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("unit-price"))))){
			item.setUnitPrice(Float.parseFloat(String.valueOf( row.get("unit-price"))));
	 	}
		if((row.get("lead-time")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("lead-time"))))){
			item.setLeadTime(Integer.parseInt(String.valueOf( row.get("lead-time"))));
	 	}
		
		if((row.get("lot-size")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("lot-size"))))){
			item.setLotSize(Float.parseFloat(String.valueOf( row.get("lot-size"))));
	 	}
		if((row.get("qty-used-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("qty-used-ytd"))))){
			item.setQtyUsedYtd(Float.parseFloat(String.valueOf( row.get("qty-used-ytd"))));
	 	}
		if((row.get("qty-mfg-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("qty-mfg-ytd"))))){
			item.setQtyMfgYtd(Float.parseFloat(String.valueOf( row.get("qty-mfg-ytd"))));
	 	}
		if((row.get("abc-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("abc-code"))))){
			item.setAbcCode(String.valueOf( row.get("abc-code")));
	 	}
		if((row.get("drawing-nbr")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("drawing-nbr"))))){
			item.setDrawingNbr(String.valueOf( row.get("drawing-nbr")));
	 	}
		if((row.get("product-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("product-code"))))){
			item.setProductCode(String.valueOf( row.get("product-code")));
	 	}
		if((row.get("p-m-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("p-m-code"))))){
			item.setPmCode(Boolean.parseBoolean(String.valueOf( row.get("p-m-code"))));
	 	}
		if((row.get("cost-method")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("cost-method"))))){
			item.setCostMethod(String.valueOf( row.get("cost-method")));
	 	}
		if((row.get("lst-lot-size")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("lst-lot-size"))))){
			item.setLstLotSize(Float.parseFloat(String.valueOf( row.get("lst-lot-size"))));
	 	}
		if((row.get("unit-cost")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("unit-cost"))))){
			item.setUnitCost(Float.parseFloat(String.valueOf( row.get("unit-cost"))));
	 	}
		if((row.get("reprice")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("reprice"))))){
			item.setReprice(Boolean.parseBoolean(String.valueOf( row.get("reprice"))));
	 	}
		if((row.get("lst-u-cost")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("lst-u-cost"))))){
			item.setLstuCost(Float.parseFloat(String.valueOf( row.get("lst-u-cost"))));
	 	}
		if((row.get("avg-u-cost")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("avg-u-cost"))))){
			item.setAvguCost(Float.parseFloat(String.valueOf( row.get("avg-u-cost"))));
	 	}
		if((row.get("job")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("job"))))){
			item.setJob(Integer.parseInt(String.valueOf( row.get("job"))));
	 	}
		if((row.get("suffix")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("suffix"))))){
			item.setSuffix(Integer.parseInt(String.valueOf( row.get("suffix"))));
	 	}
		if((row.get("stocked")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("stocked"))))){
			item.setStocked(Boolean.parseBoolean(String.valueOf( row.get("stocked"))));
	 	}
		if((row.get("matl-type")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("matl-type"))))){
			item.setMatlType(String.valueOf( row.get("matl-type")));
	 	}
		if((row.get("key")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("key"))))){
			item.setKey(Integer.parseInt(String.valueOf( row.get("key"))));
	 	}
		if((row.get("low-level")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("low-level"))))){
			item.setLowLevel(Integer.parseInt(String.valueOf( row.get("low-level"))));
	 	}
		if((row.get("last-inv")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-inv"))))){
			item.setLastInv(CommonUtils.stringToDate(String.valueOf( row.get("last-inv"))));
	 	}
		if((row.get("days-supply")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("days-supply"))))){
			item.setDaysSupply(Integer.parseInt(String.valueOf( row.get("days-supply"))));
	 	}
		if((row.get("order-min")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("order-min"))))){
			item.setOrderMin(Float.parseFloat(String.valueOf( row.get("order-min"))));
	 	}
		if((row.get("order-mult")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("order-mult"))))){
			item.setOrderMult(Float.parseFloat(String.valueOf( row.get("order-mult"))));
	 	}
		if((row.get("plan-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("plan-code"))))){
			item.setPlanCode(String.valueOf( row.get("plan-code")));
	 	}
		if((row.get("mps-flag")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("mps-flag"))))){
			item.setMpsFlag(Boolean.parseBoolean(String.valueOf( row.get("mps-flag"))));
	 	}
		if((row.get("accept-req")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("accept-req"))))){
			item.setAcceptReq(Boolean.parseBoolean(String.valueOf( row.get("accept-req"))));
	 	}
		if((row.get("change-Date")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("change-Date"))))){
			item.setChangeDate(CommonUtils.stringToDate(String.valueOf( row.get("change-Date"))));
	 	}
		if((row.get("revision")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("revision"))))){
			item.setRevision(String.valueOf( row.get("revision")));
	 	}
		if((row.get("phantom-flag")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("phantom-flag"))))){
			item.setPhantomFlag(Boolean.parseBoolean(String.valueOf( row.get("phantom-flag"))));
	 	}
		if((row.get("plan-flag")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("plan-flag"))))){
			item.setPlanFlag(Boolean.parseBoolean(String.valueOf( row.get("plan-flag"))));
	 	}
		if((row.get("paper-time")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("paper-time"))))){
			item.setPaperTime(Integer.parseInt(String.valueOf( row.get("paper-time"))));
	 	}
		if((row.get("dock-time")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("dock-time"))))){
			item.setDockTime(Integer.parseInt(String.valueOf( row.get("dock-time"))));
	 	}
		if((row.get("net-change")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("net-change"))))){
			item.setNetChange(Boolean.parseBoolean(String.valueOf( row.get("net-change"))));
	 	}
		if((row.get("asm-setup")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("asm-setup"))))){
			item.setAsmSetup(Float.parseFloat(String.valueOf( row.get("asm-setup"))));
	 	}
		if((row.get("asm-run")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("asm-run"))))){
			item.setAsmRun(Float.parseFloat(String.valueOf( row.get("asm-run"))));
	 	}
		if((row.get("asm-matl")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("asm-matl"))))){
			item.setAsmMatl(Float.parseFloat(String.valueOf( row.get("asm-matl"))));
	 	}
		if((row.get("asm-tool")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("asm-tool"))))){
			item.setAsmTool(Float.parseFloat(String.valueOf( row.get("asm-tool"))));
	 	}
		if((row.get("asm-fixture")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("asm-fixture"))))){
			item.setAsmFixture(Float.parseFloat(String.valueOf( row.get("asm-fixture"))));
	 	}
		if((row.get("asm-other")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("asm-other"))))){
			item.setAsmOther(Float.parseFloat(String.valueOf( row.get("asm-other"))));
	 	}
		if((row.get("asm-fixed")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("asm-fixed"))))){
			item.setAsmFixed(Float.parseFloat(String.valueOf( row.get("asm-fixed"))));
	 	}
		if((row.get("asm-var")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("asm-var"))))){
			item.setAsmVar(Float.parseFloat(String.valueOf( row.get("asm-var"))));
	 	}
		if((row.get("asm-outside")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("asm-outside"))))){
			item.setAsmOutside(Float.parseFloat(String.valueOf( row.get("asm-outside"))));
	 	}
		if((row.get("comp-setup")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comp-setup"))))){
			item.setCompSetup(Float.parseFloat(String.valueOf( row.get("comp-setup"))));
	 	}
		if((row.get("comp-run")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comp-run"))))){
			item.setCompRun(Float.parseFloat(String.valueOf( row.get("comp-run"))));
	 	}
		if((row.get("comp-matl")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comp-matl"))))){
			item.setCompMatl(Float.parseFloat(String.valueOf( row.get("comp-matl"))));
	 	}
		if((row.get("comp-tool")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comp-tool"))))){
			item.setCompTool(Float.parseFloat(String.valueOf( row.get("comp-tool"))));
	 	}
		if((row.get("comp-fixture")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comp-fixture"))))){
			item.setCompFixture(Float.parseFloat(String.valueOf( row.get("comp-fixture"))));
	 	}
		if((row.get("comp-other")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comp-other"))))){
			item.setCompOther(Float.parseFloat(String.valueOf( row.get("comp-other"))));
	 	}
		if((row.get("comp-fixed")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comp-fixed"))))){
			item.setCompFixed(Float.parseFloat(String.valueOf( row.get("comp-fixed"))));
	 	}
		if((row.get("comp-var")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comp-var"))))){
			item.setCompVar(Float.parseFloat(String.valueOf( row.get("comp-var"))));
	 	}
		if((row.get("comp-outside")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comp-outside"))))){
			item.setCompOutside(Float.parseFloat(String.valueOf( row.get("comp-outside"))));
	 	}
		if((row.get("sub-matl")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("sub-matl"))))){
			item.setSubMatl(Float.parseFloat(String.valueOf( row.get("sub-matl"))));
	 	}
		if((row.get("shrink-fact")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("shrink-fact"))))){
			item.setShrinkFact(Float.parseFloat(String.valueOf( row.get("shrink-fact"))));
	 	}
		if((row.get("alt-item")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("alt-item"))))){
			item.setAltItem(String.valueOf( row.get("alt-item")));
	 	}
		if((row.get("unit-weight")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("unit-weight"))))){
			item.setUnitWeight(Float.parseFloat(String.valueOf( row.get("unit-weight"))));
	 	}
		if((row.get("weight-units")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("weight-units"))))){
			item.setWeightUnits(String.valueOf( row.get("weight-units")));
	 	}
		if((row.get("user-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("user-code"))))){
			item.setUserCode(String.valueOf( row.get("user-code")));
	 	}
		if((row.get("tax-flag")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("tax-flag"))))){
			item.setTaxFlag(Boolean.parseBoolean(String.valueOf( row.get("tax-flag"))));
	 	}
		if((row.get("cur-u-cost")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("cur-u-cost"))))){
			item.setCuruCost(Float.parseFloat(String.valueOf( row.get("cur-u-cost"))));
	 	}
		if((row.get("feat-type")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("feat-type"))))){
			item.setFeatType(Boolean.parseBoolean(String.valueOf( row.get("feat-type"))));
	 	}
		if((row.get("var-lead")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("var-lead"))))){
			item.setVarLead(Float.parseFloat(String.valueOf( row.get("var-lead"))));
	 	}
		if((row.get("feat-str")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("feat-str"))))){
			item.setFeatStr(String.valueOf( row.get("feat-str")));
	 	}
		if((row.get("next-config")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("next-config"))))){
			item.setNextConfig(Integer.parseInt(String.valueOf( row.get("next-config"))));
	 	}
		if((row.get("feat-templ")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("feat-templ"))))){
			item.setFeatTempl(String.valueOf( row.get("feat-templ")));
	 	}
		if((row.get("fl-stock")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("fl-stock"))))){
			item.setFlStock(Boolean.parseBoolean(String.valueOf( row.get("fl-stock"))));
	 	}
		if((row.get("charfld1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("charfld1"))))){
			item.setCharfld1(String.valueOf( row.get("charfld1")));
	 	}
		if((row.get("charfld2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("charfld2"))))){
			item.setCharfld2(String.valueOf( row.get("charfld2")));
	 	}
		if((row.get("charfld3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("charfld3"))))){
			item.setCharfld3(String.valueOf( row.get("charfld3")));
	 	}
		if((row.get("decifld1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("decifld1"))))){
			item.setDecifld1(Float.parseFloat(String.valueOf( row.get("decifld1"))));
	 	}
		if((row.get("decifld2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("decifld2"))))){
			item.setDecifld2(Float.parseFloat(String.valueOf( row.get("decifld2"))));
	 	}
		if((row.get("decifld3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("decifld3"))))){
			item.setDecifld3(Float.parseFloat(String.valueOf( row.get("decifld3"))));
	 	}
		if((row.get("logifld")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("logifld"))))){
			item.setLogifld(Boolean.parseBoolean(String.valueOf( row.get("logifld"))));
	 	}
		if((row.get("Datefld")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("Datefld"))))){
			item.setDatefld(CommonUtils.stringToDate(String.valueOf( row.get("Datefld"))));
	 	}
		if((row.get("track-ecn")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("track-ecn"))))){
			item.setTrackEcn(Boolean.parseBoolean(String.valueOf( row.get("track-ecn"))));
	 	}
		return item;
	}

	public static ShipTo prepareShipToData(Map<String,Object> row){
		
		ShipTo shipTo = new ShipTo();
		if((row.get("drop-ship-no")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("drop-ship-no"))))){
			shipTo.setDropShipNo(Integer.parseInt(String.valueOf( row.get("drop-ship-no"))));
	 	}
		
		if((row.get("drop-seq")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("drop-seq"))))){
			shipTo.setDropShipNo(Integer.parseInt(String.valueOf( row.get("drop-seq"))));
	 	}
		if((row.get("name")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("name"))))){
			shipTo.setName(String.valueOf( row.get("name")));
	 	}
		if((row.get("address-1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("address-1"))))){
			shipTo.setAddress1(String.valueOf( row.get("address-1")));
	 	}
		if((row.get("address-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("address-2"))))){
			shipTo.setAddress2(String.valueOf( row.get("address-2")));
	 	}
		if((row.get("city")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("city"))))){
			shipTo.setCity(String.valueOf( row.get("city")));
	 	}
		if((row.get("state")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("state"))))){
			shipTo.setState(String.valueOf( row.get("state")));
	 	}
		if((row.get("zip")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zip"))))){
			shipTo.setZip(String.valueOf( row.get("zip")));
	 	}
		if((row.get("county")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("county"))))){
			shipTo.setCounty(String.valueOf( row.get("county")));
	 	}
		if((row.get("country")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("country"))))){
			shipTo.setCountry(String.valueOf( row.get("country")));
	 	}
		if((row.get("contact")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("contact"))))){
			shipTo.setContact(String.valueOf( row.get("contact")));
	 	}
		if((row.get("phone")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("phone"))))){
			shipTo.setPhone(String.valueOf( row.get("phone")));
	 	}
		
		return shipTo;
	}


	public static PoDiv preparePoDivData(Map<String,Object> row){
		
		PoDiv poDiv = new PoDiv();
		if((row.get("po-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("po-num"))))){
			poDiv.setPoNum(Integer.parseInt(String.valueOf( row.get("po-num"))));
	 	}
		if((row.get("vend-num")!=null) && (! StringUtils.isBlank(String.valueOf(row.get("vend-num"))))){
			poDiv.setVendNum(Integer.parseInt(String.valueOf( row.get("vend-num"))));
	 	}
		if((row.get("inv-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("inv-num"))))){
			poDiv.setInvNum(String.valueOf( row.get("inv-num")));
	 	}
		if((row.get("mro-po")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("mro-po"))))){
			poDiv.setMroPo(Boolean.parseBoolean(String.valueOf( row.get("mro-po"))));
	 	}
		if((row.get("requestor")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("requestor"))))){
			poDiv.setRequestor(String.valueOf( row.get("requestor")));
	 	}
		if((row.get("taxable")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("taxable"))))){
			poDiv.setTaxable(Boolean.parseBoolean(String.valueOf( row.get("taxable"))));
	 	}
		if((row.get("ar-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ar-num"))))){
			poDiv.setArNum(String.valueOf( row.get("ar-num")));
	 	}
		if((row.get("zz-avail-char-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-char-2"))))){
			poDiv.setZzAvailChar2(String.valueOf( row.get("zz-avail-char-2")));
	 	}
		if((row.get("user-id")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("user-id"))))){
			poDiv.setUserId(String.valueOf( row.get("user-id")));
	 	}
		if((row.get("zz-avail-Date-1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-Date-1"))))){
			poDiv.setZzAvailDate1(CommonUtils.stringToDate(String.valueOf( row.get("zz-avail-Date-1"))));
	 	}
		if((row.get("zz-avail-Date-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-Date-2"))))){
			poDiv.setZzAvailDate2(CommonUtils.stringToDate(String.valueOf( row.get("zz-avail-Date-2"))));
	 	}
		if((row.get("Date-maintained")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("Date-maintained"))))){
			poDiv.setDateMaintained(CommonUtils.stringToDate(String.valueOf( row.get("Date-maintained"))));
	 	}
		if((row.get("zz-avail-dec-1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-dec-1"))))){
			poDiv.setZzAvailDec1(Float.parseFloat(String.valueOf( row.get("zz-avail-dec-1"))));
	 	}
		if((row.get("zz-avail-dec-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-dec-2"))))){
			poDiv.setZzAvailDec2(Float.parseFloat(String.valueOf( row.get("zz-avail-dec-2"))));
	 	}
		if((row.get("zz-avail-dec-3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-dec-3"))))){
			poDiv.setZzAvailDec3(Float.parseFloat(String.valueOf( row.get("zz-avail-dec-3"))));
	 	}
		if((row.get("zz-avail-int-1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-int-1"))))){
			poDiv.setZzAvailInt1(Integer.parseInt(String.valueOf( row.get("zz-avail-int-1"))));
	 	}
		
		if((row.get("zz-avail-int-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-int-2"))))){
			poDiv.setZzAvailInt2(Integer.parseInt(String.valueOf( row.get("zz-avail-int-2"))));
	 	}
		if((row.get("po-rel-count")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("po-rel-count"))))){
			poDiv.setPoRelCount(Integer.parseInt(String.valueOf( row.get("po-rel-count"))));
	 	}
		if((row.get("zz-avail-log-1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-log-1"))))){
			poDiv.setZzAvailLog1(Boolean.parseBoolean(String.valueOf( row.get("zz-avail-log-1"))));
	 	}
		if((row.get("zz-avail-log-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-log-2"))))){
			poDiv.setZzAvailLog2(Boolean.parseBoolean(String.valueOf( row.get("zz-avail-log-2"))));
	 	}
		if((row.get("zz-avail-log-3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-log-3"))))){
			poDiv.setZzAvailLog3(Boolean.parseBoolean(String.valueOf( row.get("zz-avail-log-3"))));
	 	}
		return poDiv;
	}


	public static VendorDiv prepareVendorDivData(Map<String,Object> row){
		
		VendorDiv vendorDiv = new VendorDiv();
		if((row.get("vend-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-num"))))){
			vendorDiv.setVendNum(Integer.parseInt(String.valueOf( row.get("vend-num"))));
	 	}
		
		if((row.get("inspect-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("inspect-code"))))){
			vendorDiv.setInspectCode(String.valueOf( row.get("inspect-code")));
	 	}
		if((row.get("skip-lot")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("skip-lot"))))){
			vendorDiv.setSkipLot(Integer.parseInt(String.valueOf( row.get("skip-lot"))));
	 	}
		if((row.get("vend-amaps")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-amaps"))))){
			vendorDiv.setVendAmaps(String.valueOf( row.get("vend-amaps")));
	 	}
		if((row.get("vend-1099")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-1099"))))){
			vendorDiv.setVend1099(Boolean.parseBoolean(String.valueOf( row.get("vend-1099"))));
	 	}
		if((row.get("report-card")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("report-card"))))){
			vendorDiv.setReportCard(Boolean.parseBoolean(String.valueOf( row.get("report-card"))));
	 	}
		if((row.get("po-media")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("po-media"))))){
			vendorDiv.setPoMedia(String.valueOf( row.get("po-media")));
	 	}
		if((row.get("rfc")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("rfc"))))){
			vendorDiv.setRfc(String.valueOf( row.get("rfc")));
	 	}
		if((row.get("edi-test-prod-ind")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("edi-test-prod-ind"))))){
			vendorDiv.setEdiTestProdInd(String.valueOf( row.get("edi-test-prod-ind")));
	 	}
		if((row.get("vendor-plant-id")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vendor-plant-id"))))){
			vendorDiv.setVendorPlantId(String.valueOf( row.get("vendor-plant-id")));
	 	}
		if((row.get("last-upDate")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-upDate"))))){
			vendorDiv.setLastUpdate(CommonUtils.stringToDate(String.valueOf( row.get("last-upDate"))));
	 	}
		if((row.get("zz-avail-Date-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-Date-2"))))){
			vendorDiv.setZzAvailDate2(CommonUtils.stringToDate(String.valueOf( row.get("zz-avail-Date-2"))));
	 	}
		if((row.get("zz-avail-Date-3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-Date-3"))))){
			vendorDiv.setZzAvailDate3(CommonUtils.stringToDate(String.valueOf( row.get("zz-avail-Date-3"))));
	 	}
		if((row.get("last-yr-purch-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-yr-purch-ytd"))))){
			vendorDiv.setLastYrPurchYtd(Float.parseFloat(String.valueOf( row.get("last-yr-purch-ytd"))));
	 	}
		if((row.get("last-yr-order-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-yr-order-ytd"))))){
			vendorDiv.setLastYrOrderYtd(Float.parseFloat(String.valueOf( row.get("last-yr-order-ytd"))));
	 	}
		if((row.get("last-yr-recv-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-yr-recv-ytd"))))){
			vendorDiv.setLastYrRecvYtd(Float.parseFloat(String.valueOf( row.get("last-yr-recv-ytd"))));
	 	}
		if((row.get("zz-avail-int-1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-int-1"))))){
			vendorDiv.setZzAvailInt1(Integer.parseInt(String.valueOf( row.get("zz-avail-int-1"))));
	 	}
		if((row.get("zz-avail-int-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-int-2"))))){
			vendorDiv.setZzAvailInt2(Integer.parseInt(String.valueOf( row.get("zz-avail-int-2"))));
	 	}
		if((row.get("zz-avail-int-3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-int-3"))))){
			vendorDiv.setZzAvailInt3(Integer.parseInt(String.valueOf( row.get("zz-avail-int-3"))));
	 	}
		if((row.get("zz-avail-log-1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-log-1"))))){
			vendorDiv.setZzAvailLog1(Boolean.parseBoolean(String.valueOf( row.get("zz-avail-log-1"))));
	 	}
		if((row.get("zz-avail-log-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-log-2"))))){
			vendorDiv.setZzAvailLog2(Boolean.parseBoolean(String.valueOf( row.get("zz-avail-log-2"))));
	 	}
		if((row.get("selected-for-sms")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("selected-for-sms"))))){
			vendorDiv.setSelectedForSms(Boolean.parseBoolean(String.valueOf( row.get("selected-for-sms"))));
	 	}
		if((row.get("edi-qualifier")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("edi-qualifier"))))){
			vendorDiv.setEdiQualifier(String.valueOf( row.get("edi-qualifier")));
	 	}
		if((row.get("edi-id-no")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("edi-id-no"))))){
			vendorDiv.setEdiIdNo(String.valueOf( row.get("edi-id-no")));
	 	}
		if((row.get("edi-test-ind")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("edi-test-ind"))))){
			vendorDiv.setEdiTestInd(String.valueOf( row.get("edi-test-ind")));
	 	}
		if((row.get("edi-standard")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("edi-standard"))))){
			vendorDiv.setEdiStandard(String.valueOf( row.get("edi-standard")));
	 	}
		if((row.get("supplier-class")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("supplier-class"))))){
			vendorDiv.setSupplierClass(String.valueOf( row.get("supplier-class")));
	 	}
		if((row.get("vend-email")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-email"))))){
			vendorDiv.setVendEmail(String.valueOf( row.get("vend-email")));
	 	}
		if((row.get("suppl_type")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("suppl_type"))))){
			vendorDiv.setSupplType(String.valueOf( row.get("suppl_type")));
	 	}
		return vendorDiv;
	}


	public static ItemDiv prepareItemDivData(Map<String,Object> row){
		
		ItemDiv itemDiv = new ItemDiv();
		if((row.get("item")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("item"))))){
			itemDiv.setItem(String.valueOf( row.get("item")));
	 	}
		
		if((row.get("prod-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("prod-code"))))){
			itemDiv.setProdCode(Integer.parseInt(String.valueOf( row.get("prod-code"))));
	 	}
		
		if((row.get("comm-code")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("comm-code"))))){
			itemDiv.setCommCode(String.valueOf( row.get("comm-code")));
	 	}
		
		if((row.get("mro-item")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("mro-item"))))){
			itemDiv.setMroItem(Boolean.parseBoolean(String.valueOf( row.get("mro-item"))));
	 	}
		if((row.get("item-stat")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("item-stat"))))){
			itemDiv.setItemStat(String.valueOf( row.get("item-stat")));
	 	}
		if((row.get("Date-added")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("Date-added"))))){
			itemDiv.setDateAdded(CommonUtils.stringToDate(String.valueOf( row.get("Date-added"))));
	 	}
		if((row.get("year-usage")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("year-usage"))))){
			itemDiv.setYearUsage((Integer.parseInt(String.valueOf( row.get("year-usage")))));
	 	}
		if((row.get("year-forecast")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("year-forecast"))))){
			itemDiv.setYearForecast(Integer.parseInt(String.valueOf( row.get("year-forecast"))));
	 	}
		if((row.get("duty-class")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("duty-class"))))){
			itemDiv.setDutyClass(String.valueOf( row.get("duty-class")));
	 	}
		if((row.get("high-tech")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("high-tech"))))){
			itemDiv.setHighTech(Boolean.parseBoolean(String.valueOf( row.get("high-tech"))));
	 	}
		if((row.get("resale-ind")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("resale-ind"))))){
			itemDiv.setResaleInd(Boolean.parseBoolean(String.valueOf( row.get("resale-ind"))));
	 	}
		if((row.get("user-id")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("user-id"))))){
			itemDiv.setUserId(String.valueOf( row.get("user-id")));
	 	}
		if((row.get("Country")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("Country"))))){
			itemDiv.setCountry(String.valueOf( row.get("Country")));
	 	}
		if((row.get("buyer-uid")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("buyer-uid"))))){
			itemDiv.setBuyerUid(String.valueOf( row.get("buyer-uid")));
	 	}
		if((row.get("last-upDate")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-upDate"))))){
			itemDiv.setLastUpDate(CommonUtils.stringToDate(String.valueOf( row.get("last-upDate"))));
	 	}
		if((row.get("zz-avail-Date-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-Date-2"))))){
			itemDiv.setZzAvailDate2(CommonUtils.stringToDate(String.valueOf( row.get("zz-avail-Date-2"))));
	 	}
		if((row.get("Date-maintained")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("Date-maintained"))))){
			itemDiv.setDateMaintained(CommonUtils.stringToDate(String.valueOf( row.get("Date-maintained"))));
	 	}
		if((row.get("duty-cur")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("duty-cur"))))){
			itemDiv.setDutyCur(Float.parseFloat(String.valueOf( row.get("duty-cur"))));
	 	}
		if((row.get("duty-std")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("duty-std"))))){
			itemDiv.setDutyStd(Float.parseFloat(String.valueOf( row.get("duty-std"))));
	 	}
		if((row.get("last-inv-bal")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-inv-bal"))))){
			itemDiv.setLastInvBal(Float.parseFloat(String.valueOf( row.get("last-inv-bal"))));
	 	}
		if((row.get("zz-avail-int-1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-int-1"))))){
			itemDiv.setZzAvailInt1(Integer.parseInt(String.valueOf( row.get("zz-avail-int-1"))));
	 	}
		if((row.get("zz-avail-int-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-int-2"))))){
			itemDiv.setZzAvailInt2(Integer.parseInt(String.valueOf( row.get("zz-avail-int-2"))));
	 	}
		if((row.get("zz-avail-int-3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-int-3"))))){
			itemDiv.setZzAvailInt3(Integer.parseInt(String.valueOf( row.get("zz-avail-int-3"))));
	 	}
		if((row.get("zz-avail-int-3")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zz-avail-int-3"))))){
			itemDiv.setZzAvailInt3(Integer.parseInt(String.valueOf( row.get("zz-avail-int-3"))));
	 	}
		if((row.get("oto-product")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("oto-product"))))){
			itemDiv.setOtoProduct(Boolean.parseBoolean(String.valueOf( row.get("oto-product"))));
	 	}
		if((row.get("transact-oh-inv-ind")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("transact-oh-inv-ind"))))){
			itemDiv.setTransactOhInvInd(Boolean.parseBoolean(String.valueOf( row.get("transact-oh-inv-ind"))));
	 	}
		if((row.get("Nafta")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("Nafta"))))){
			itemDiv.setNafta(Boolean.parseBoolean(String.valueOf( row.get("Nafta"))));
	 	}
		if((row.get("code-number")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("code-number"))))){
			itemDiv.setCodeNumber(String.valueOf( row.get("code-number")));
	 	}
		if((row.get("ie-item-type")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ie-item-type"))))){
			itemDiv.setIeItemType(String.valueOf( row.get("ie-item-type")));
	 	}
		if((row.get("prior-ytd-usage")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("prior-ytd-usage"))))){
			itemDiv.setPriorYtdUsage(Integer.parseInt(String.valueOf( row.get("prior-ytd-usage"))));
	 	}
		if((row.get("ie-cam-class")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ie-cam-class"))))){
			itemDiv.setIeCamClass(String.valueOf( row.get("ie-cam-class")));
	 	}
		if((row.get("ie-im-suffix")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ie-im-suffix"))))){
			itemDiv.setIeImSuffix(String.valueOf( row.get("ie-im-suffix")));
	 	}
		if((row.get("ie-em-suffix")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ie-em-suffix"))))){
			itemDiv.setIeEmSuffix(String.valueOf( row.get("ie-em-suffix")));
	 	}
		if((row.get("ie-ia-suffix")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ie-ia-suffix"))))){
			itemDiv.setIeIaSuffix(String.valueOf( row.get("ie-ia-suffix")));
	 	}
		if((row.get("ie-ea-suffix")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ie-ea-suffix"))))){
			itemDiv.setIeEaSuffix(String.valueOf( row.get("ie-ea-suffix")));
	 	}
		if((row.get("main-ship-plant")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("main-ship-plant"))))){
			itemDiv.setMainShipPlant(String.valueOf( row.get("main-ship-plant")));
	 	}
		if((row.get("oe-plan-tm-fence")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("oe-plan-tm-fence"))))){
			itemDiv.setOePlanTmFence(Integer.parseInt(String.valueOf( row.get("oe-plan-tm-fence"))));
	 	}
		if((row.get("pack-qty")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("pack-qty"))))){
			itemDiv.setPackQty(Integer.parseInt(String.valueOf( row.get("pack-qty"))));
	 	}
		if((row.get("pack-volume")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("pack-volume"))))){
			itemDiv.setPackVolume(Float.parseFloat(String.valueOf( row.get("pack-volume"))));
	 	}
		if((row.get("factory-approval")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("factory-approval"))))){
			itemDiv.setFactoryApproval(Boolean.parseBoolean(String.valueOf( row.get("factory-approval"))));
	 	}
		if((row.get("country-origin")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("country-origin"))))){
			itemDiv.setCountryOrigin(String.valueOf( row.get("country-origin")));
	 	}
		if((row.get("sales-lead-time")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("sales-lead-time"))))){
			itemDiv.setSalesLeadTime(Integer.parseInt(String.valueOf( row.get("sales-lead-time"))));
	 	}
		if((row.get("ie-um")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ie-um"))))){
			itemDiv.setIeUm(String.valueOf( row.get("ie-um")));
	 	}
		if((row.get("ie-um-conv")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ie-um-conv"))))){
			itemDiv.setIeUmConv(Float.parseFloat(String.valueOf( row.get("ie-um-conv"))));
	 	}
		if((row.get("monthly-usage")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("monthly-usage"))))){
			itemDiv.setMonthlyUsage(String.valueOf( row.get("monthly-usage")));
	 	}
		if((row.get("autoreplen")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("autoreplen"))))){
			itemDiv.setAutoreplen(Boolean.parseBoolean(String.valueOf( row.get("autoreplen"))));
	 	}
		if((row.get("autodirect")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("autodirect"))))){
			itemDiv.setAutodirect(Boolean.parseBoolean(String.valueOf( row.get("autodirect"))));
	 	}
		if((row.get("last-yr-purch-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-yr-purch-ytd"))))){
			itemDiv.setLastYrPurchYtd(Float.parseFloat(String.valueOf( row.get("last-yr-purch-ytd"))));
	 	}
		if((row.get("last-yr-mfg-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-yr-mfg-ytd"))))){
			itemDiv.setLastYrMfgYtd(Float.parseFloat(String.valueOf( row.get("last-yr-mfg-ytd"))));
	 	}
		if((row.get("last-yr-used-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-yr-used-ytd"))))){
			itemDiv.setLastYrUsedYtd(Float.parseFloat(String.valueOf( row.get("last-yr-used-ytd"))));
	 	}
		if((row.get("last-yr-sold-ytd")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("last-yr-sold-ytd"))))){
			itemDiv.setLastYrSoldYtd(Float.parseFloat(String.valueOf( row.get("last-yr-sold-ytd"))));
	 	}
		if((row.get("ord-in-limit-eu-qty")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ord-in-limit-eu-qty"))))){
			itemDiv.setOrdInLimitEuQty(Integer.parseInt(String.valueOf( row.get("ord-in-limit-eu-qty"))));
	 	}
		if((row.get("ft-lead-time")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("ft-lead-time"))))){
			itemDiv.setFtLeadTime(Integer.parseInt(String.valueOf( row.get("ft-lead-time"))));
	 	}
		if((row.get("eu-factor-mult")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("eu-factor-mult"))))){
			itemDiv.setEuFactorMult(Float.parseFloat(String.valueOf( row.get("eu-factor-mult"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("avail-for-ft-ind")))){
			itemDiv.setAvailForFtInd(Boolean.parseBoolean(String.valueOf( row.get("avail-for-ft-ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("allow-pack-to-be-broken")))){
			itemDiv.setAllowPackToBeBroken(Boolean.parseBoolean(String.valueOf( row.get("allow-pack-to-be-broken"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("min-co-ord-qty")))){
			itemDiv.setMinCoOrdQty(Integer.parseInt(String.valueOf( row.get("min-co-ord-qty"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("drawing-nbr")))){
			itemDiv.setDrawingNbr(String.valueOf( row.get("drawing-nbr")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("revision")))){
			itemDiv.setRevision(String.valueOf( row.get("revision")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("ec-trans-Date")))){
			itemDiv.setEcTransDate(CommonUtils.stringToDate(String.valueOf( row.get("ec-trans-Date"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("pack-volume-id")))){
			itemDiv.setPackVolumeId(String.valueOf( row.get("pack-volume-id")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("pack-typ")))){
			itemDiv.setPackTyp(String.valueOf( row.get("pack-typ")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("prod-src-typ")))){
			itemDiv.setProdSrcTyp(String.valueOf( row.get("prod-src-typ")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("buy-american-ind")))){
			itemDiv.setBuyAmericanInd(Boolean.parseBoolean(String.valueOf( row.get("buy-american-ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("buy-american-xref-prod-id")))){
			itemDiv.setBuyAmericanXrefProdId(String.valueOf( row.get("buy-american-xref-prod-id")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("buy-american-xref-cell-id")))){
			itemDiv.setBuyAmericanXrefProdId(String.valueOf( row.get("buy-american-xref-cell-id")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("buy-american-xref-cell-id")))){
			itemDiv.setBuyAmericanXrefCellId(Integer.parseInt(String.valueOf( row.get("buy-american-xref-cell-id"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("emerg-serv-avail-ind")))){
			itemDiv.setEmergServAvailInd(Boolean.parseBoolean(String.valueOf( row.get("emerg-serv-avail-ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("fast-track-serv-avail-ind")))){
			itemDiv.setFastTrackServAvailInd(Boolean.parseBoolean(String.valueOf( row.get("fast-track-serv-avail-ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("emerg-repair-serv-avail-ind")))){
			itemDiv.setEmergRepairServAvailInd(Boolean.parseBoolean(String.valueOf( row.get("emerg-repair-serv-avail-ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("planner-id")))){
			itemDiv.setPlannerId(String.valueOf( row.get("planner-id")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("stocked-at-whse")))){
			itemDiv.setStockedAtWhse(Boolean.parseBoolean(String.valueOf( row.get("stocked-at-whse"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("consign-loc")))){
			itemDiv.setConsignLoc(Boolean.parseBoolean(String.valueOf( row.get("consign-loc"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("logifld-div")))){
			itemDiv.setLogifldDiv(Boolean.parseBoolean(String.valueOf( row.get("logifld-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("decfld-div")))){
			itemDiv.setDecfldDiv(Float.parseFloat(String.valueOf( row.get("decfld-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("intfld-div")))){
			itemDiv.setIntfldDiv(Integer.parseInt(String.valueOf( row.get("intfld-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("Datefld-div")))){
			itemDiv.setDatefldDiv(CommonUtils.stringToDate(String.valueOf( row.get("Datefld-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("standard-custom")))){
			itemDiv.setStandardCustom(Boolean.parseBoolean(String.valueOf( row.get("standard-custom"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("ship_dt")))){
			itemDiv.setShipDt(CommonUtils.stringToDate(String.valueOf( row.get("ship_dt"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("ship_support_seq_id")))){
			itemDiv.setShipSupportSeqId(Integer.parseInt(String.valueOf( row.get("ship_support_seq_id"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("ship_acct_nbr")))){
			itemDiv.setShipAcctNbr(String.valueOf( row.get("ship_acct_nbr")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("mfg-cell")))){
			itemDiv.setMfgCell(String.valueOf( row.get("mfg-cell")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-charfld1-div")))){
			itemDiv.setZzCharfld1Div(String.valueOf( row.get("zz-charfld1-div")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-charfld2-div")))){
			itemDiv.setZzCharfld2Div(String.valueOf( row.get("zz-charfld2-div")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-charfld3-div")))){
			itemDiv.setZzCharfld3Div(String.valueOf( row.get("zz-charfld3-div")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-intefld1-div")))){
			itemDiv.setZzIntefld1Div(Integer.parseInt(String.valueOf( row.get("zz-intefld1-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-intefld2-div")))){
			itemDiv.setZzIntefld2Div(Integer.parseInt(String.valueOf( row.get("zz-intefld2-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-intefld3-div")))){
			itemDiv.setZzIntefld3Div(Integer.parseInt(String.valueOf( row.get("zz-intefld3-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-decifld1-div")))){
			itemDiv.setZzDecifld1Div(Float.parseFloat(String.valueOf( row.get("zz-decifld1-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-decifld2-div")))){
			itemDiv.setZzDecifld2Div(Float.parseFloat(String.valueOf( row.get("zz-decifld2-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-decifld3-div")))){
			itemDiv.setZzDecifld3Div(Float.parseFloat(String.valueOf( row.get("zz-decifld3-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-logifld1-div")))){
			itemDiv.setZzLogifld1Div(Boolean.parseBoolean(String.valueOf( row.get("zz-logifld1-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-logifld2-div")))){
			itemDiv.setZzLogifld2Div(Boolean.parseBoolean(String.valueOf( row.get("zz-logifld2-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-logifld1-div")))){
			itemDiv.setZzLogifld3Div(Boolean.parseBoolean(String.valueOf( row.get("zz-logifld3-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-Datefld1-div")))){
			itemDiv.setZzDatefld1Div(CommonUtils.stringToDate(String.valueOf( row.get("zz-Datefld1-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-Datefld2-div")))){
			itemDiv.setZzDatefld2Div(CommonUtils.stringToDate(String.valueOf( row.get("zz-Datefld2-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-Datefld3-div")))){
			itemDiv.setZzDatefld3Div(CommonUtils.stringToDate(String.valueOf( row.get("zz-Datefld3-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("backflush-from-consign")))){
			itemDiv.setBackflushFromConsign(Boolean.parseBoolean(String.valueOf( row.get("backflush-from-consign"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("daily-usage")))){
			itemDiv.setDailyUsage(Float.parseFloat(String.valueOf( row.get("daily-usage"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("kb-stop-rel")))){
			itemDiv.setKbStopRel(Boolean.parseBoolean(String.valueOf( row.get("kb-stop-rel"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("kb-stop-by")))){
			itemDiv.setKbStopBy(String.valueOf( row.get("kb-stop-by")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("kb-override-qty")))){
			itemDiv.setKbOverrideQty(Boolean.parseBoolean(String.valueOf( row.get("kb-override-qty"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("kb-override-by")))){
			itemDiv.setKbOverrideBy(String.valueOf( row.get("kb-override-by")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("kb-stop-Date")))){
			itemDiv.setKbStopDate(CommonUtils.stringToDate(String.valueOf( row.get("kb-stop-Date"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("kb-override-Date")))){
			itemDiv.setKbOverrideDate(CommonUtils.stringToDate(String.valueOf( row.get("kb-override-Date"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("vmi-item")))){
			itemDiv.setVmiItem(Boolean.parseBoolean(String.valueOf( row.get("vmi-item"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("bto-item")))){
			itemDiv.setBtoItem(Boolean.parseBoolean(String.valueOf( row.get("bto-item"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("serial-no-req-ind")))){
			itemDiv.setSerialNoReqInd(Boolean.parseBoolean(String.valueOf( row.get("serial-no-req-ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("hazardous_material_ind")))){
			itemDiv.setHazardousMaterialInd(Boolean.parseBoolean(String.valueOf( row.get("hazardous_material_ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("avail-sds-item-ind")))){
			itemDiv.setAvailSdsItemInd(Boolean.parseBoolean(String.valueOf( row.get("avail-sds-item-ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("skid_ind")))){
			itemDiv.setSkidInd(Boolean.parseBoolean(String.valueOf( row.get("skid_ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("order-up-to-units")))){
			itemDiv.setOrderUpToUnits(Float.parseFloat(String.valueOf( row.get("order-up-to-units"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("single-src-ind")))){
			itemDiv.setSingleSrcInd(Boolean.parseBoolean(String.valueOf( row.get("single-src-ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("single-src-category")))){
			itemDiv.setSingleSrcCategory(String.valueOf( row.get("single-src-category")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("min_ss_qty")))){
			itemDiv.setMinSsQty(Integer.parseInt(String.valueOf( row.get("min_ss_qty"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("re_order_pt")))){
			itemDiv.setReOrderPt(Integer.parseInt(String.valueOf( row.get("re_order_pt"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("order_up_to_qty")))){
			itemDiv.setOrderUpToQty(Integer.parseInt(String.valueOf( row.get("order_up_to_qty"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("model_qty")))){
			itemDiv.setModelQty(Integer.parseInt(String.valueOf( row.get("model_qty"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("behavior")))){
			itemDiv.setBehavior(String.valueOf( row.get("behavior")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("pareto")))){
			itemDiv.setPareto(String.valueOf( row.get("pareto")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("optimiza_stock_ind")))){
			itemDiv.setOptimizaStockInd(Boolean.parseBoolean(String.valueOf( row.get("optimiza_stock_ind"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("criticality")))){
			itemDiv.setCriticality(Integer.parseInt(String.valueOf( row.get("criticality"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("recc_order_qty")))){
			itemDiv.setReccOrderQty(Integer.parseInt(String.valueOf( row.get("recc_order_qty"))));
	 	}
			if(! StringUtils.isBlank(String.valueOf (row.get("zz-charfld4-div")))){
			itemDiv.setZzCharfld4Div(String.valueOf( row.get("zz-charfld4-div")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-charfld5-div")))){
			itemDiv.setZzCharfld5Div(String.valueOf( row.get("zz-charfld5-div")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-charfld6-div")))){
			itemDiv.setZzCharfld6Div(String.valueOf( row.get("zz-charfld6-div")));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-intefld4-div")))){
			itemDiv.setZzIntefld4Div(Integer.parseInt(String.valueOf( row.get("zz-intefld4-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-intefld5-div")))){
			itemDiv.setZzIntefld5Div(Integer.parseInt(String.valueOf( row.get("zz-intefld5-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-intefld6-div")))){
			itemDiv.setZzIntefld6Div(Integer.parseInt(String.valueOf( row.get("zz-intefld6-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-decifld4-div")))){
			itemDiv.setZzDecifld4Div(Float.parseFloat(String.valueOf( row.get("zz-decifld4-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-decifld5-div")))){
			itemDiv.setZzDecifld5Div(Float.parseFloat(String.valueOf( row.get("zz-decifld5-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-decifld6-div")))){
			itemDiv.setZzDecifld6Div(Float.parseFloat(String.valueOf( row.get("zz-decifld6-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-logifld4-div")))){
			itemDiv.setZzLogifld4Div(Boolean.parseBoolean(String.valueOf( row.get("zz-logifld4-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-logifld5-div")))){
			itemDiv.setZzLogifld5Div(Boolean.parseBoolean(String.valueOf( row.get("zz-logifld5-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-logifld6-div")))){
			itemDiv.setZzLogifld6Div(Boolean.parseBoolean(String.valueOf( row.get("zz-logifld6-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-Datefld4-div")))){
			itemDiv.setZzDatefld4Div(CommonUtils.stringToDate(String.valueOf( row.get("zz-Datefld4-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-Datefld5-div")))){
			itemDiv.setZzDatefld5Div(CommonUtils.stringToDate(String.valueOf( row.get("zz-Datefld5-div"))));
	 	}
		if(! StringUtils.isBlank(String.valueOf (row.get("zz-Datefld6-div")))){
			itemDiv.setZzDatefld6Div(CommonUtils.stringToDate(String.valueOf( row.get("zz-Datefld6-div"))));
	 	}
		return itemDiv;
	}

	
	public static VendAddr prepareVendAddrData(Map<String, Object> row) {

		VendAddr vendAddr = new VendAddr();
		if((row.get("vend-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("vend-num"))))){
			vendAddr.setVendNum(Integer.parseInt(String.valueOf( row.get("vend-num"))));
	 	}
		
		if((row.get("address-1")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("address-1"))))){
			vendAddr.setAddress1((String.valueOf( row.get("address-1"))));
	 	}
		
		if((row.get("address-2")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("address-2"))))){
			vendAddr.setAddress2((String.valueOf( row.get("address-2"))));
	 	}
		if((row.get("city")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("city"))))){
			vendAddr.setCity((String.valueOf( row.get("city"))));
	 	}
		if((row.get("country")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("country"))))){
			vendAddr.setCountry((String.valueOf( row.get("country"))));
	 	}
		if((row.get("county")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("county"))))){
			vendAddr.setCounty((String.valueOf( row.get("county"))));
	 	}
		if((row.get("fax-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("fax-num"))))){
			vendAddr.setFaxNum((String.valueOf( row.get("fax-num"))));
	 	}
		if((row.get("name")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("name"))))){
			vendAddr.setName((String.valueOf( row.get("name"))));
	 	}
		if((row.get("state")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("state"))))){
			vendAddr.setState((String.valueOf( row.get("state"))));
	 	}
		if((row.get("telex-num")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("telex-num"))))){
			vendAddr.setTelexNum((String.valueOf( row.get("telex-num"))));
	 	}
		if((row.get("zip")!=null) && (! StringUtils.isBlank(String.valueOf (row.get("zip"))))){
			vendAddr.setZip((String.valueOf( row.get("zip"))));
	 	}
		return vendAddr;
	}

	public static BigDecimal getValue(Map<String,Object> row, String colName){
		
		BigDecimal finalAmt = new BigDecimal(0);	
		int flag=-1;
		colName = StringUtils.trim(colName);
		if(!CommonUtils.isBlank(colName)){
			
			colName = StringUtils.trim(colName);
			
			if(row.containsKey(colName)){
				
				String val = String.valueOf( row.get(colName));
				
				if(!CommonUtils.isBlank(val)){
					finalAmt.add( new BigDecimal( String.valueOf(val)));
					flag=1;
				}
			}else if(colName.contains("+")){
						
				String[] newColNameSplit = colName.split("\\+");
				System.out.println("newColNameSplit--->"+Arrays.toString(newColNameSplit));
				
				String newColName=null;
				for(int j=0;j<newColNameSplit.length;j++){	
					
					newColName = StringUtils.trim(newColNameSplit[j]);
					
					if(!CommonUtils.isBlank(newColName)){
						continue;
					}
					
				    if(row.containsKey(newColName)){
						   finalAmt.add( new BigDecimal( String.valueOf( row.get(newColName))));
						   flag=1;
				    }else{
				    	finalAmt.add( new BigDecimal( String.valueOf(newColName)));
				    	flag=1;
				   }
				}
			}else{
				finalAmt.add( new BigDecimal(String.valueOf(colName)));
				flag=1;
			}
		}  
		
		if(flag==-1){
			finalAmt=null;
		}
		return finalAmt;
	}
	
}
