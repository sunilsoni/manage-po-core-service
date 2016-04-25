package com.jci.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;

import com.jci.domain.E2Open;
import com.jci.model.PoDetails;
import com.jci.model.response.PullPoDataResponse;

public class CommonUtils {

	public static Date stringToDate(String dateStr){
		
		if(StringUtils.isBlank(dateStr) || "null".equals(dateStr)){
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Date convertedCurrentDate=null;
		try {
			convertedCurrentDate = sdf.parse(dateStr);
			// String date=sdf.format(convertedCurrentDate );
		} catch (ParseException e) {
			e.printStackTrace();
		}
	   return convertedCurrentDate;
	}

	public static List<String> fixedLengthString(List<E2Open> poList){
		
		List<String> lines = new ArrayList<String>();
		StringBuilder line = null;
		
		for (E2Open po : poList) {
			line = new StringBuilder();
			
			//1: OrderNumber
			line.append(appendTab(po.getOrderNumber()));
			
			//2: OrderCreationDate
			line.append(appendTab(po.getOrderCreationDate()));
			
			//3: OrderStatus
			line.append(appendTab(po.getOrderStatus()));
			
			//4: OrderPriority
			line.append(appendTab(po.getOrderPriority()));
			
			//5: CustomerID
			line.append(appendTab(po.getCustomerID()));
			
			//6: CustomerDescription
			line.append(appendTab(po.getCustomerDescription()));
			
			//7: CustomerDUNS
			line.append(appendTab(po.getCustomerDUNS()));
			
			//8: CustomerDUNS+4
			line.append(appendTab(po.getCustomerDUNS4()));
			
			//9: CustomerTaxNumber
			line.append(appendTab(po.getCustomerTaxNumber()));
			
			//10: CustomerAddressDescriptor
			line.append(appendTab(po.getCustomerAddressDescriptor()));
			
			//11: CustomerAddress1
			line.append(appendTab(po.getCustomerAddress1()));
			
			//12: CustomerAddress2
			line.append(appendTab(po.getCustomerAddress2()));
			
			//13: CustomerAddress3
			line.append(appendTab(po.getCustomerAddress3()));
			
			//14: CustomerAddress4
			line.append(appendTab(po.getCustomerAddress4()));
			
			//15: CustomerAddress5
			line.append(appendTab(po.getCustomerAddress5()));
			
			
			//16: CustomerCity
			line.append(appendTab(po.getCustomerCity()));
			
			//17: CustomerCounty
			line.append(appendTab(po.getCustomerCounty()));
			
			//18: CustomerState
			line.append(appendTab(po.getCustomerState()));
			
			//19: CustomerCountry
			line.append(appendTab(po.getCustomerCountry()));
			
			//20: CustomerZip
			line.append(appendTab(po.getCustomerZip()));
			
			//21: SupplierID
			line.append(appendTab(po.getSupplierID()));
			
			
			//22: SupplierDescription
			line.append(appendTab(po.getSupplierDescription()));
			
			//23: SupplierDUNS
			line.append(appendTab(po.getSupplierDUNS()));
			
			//24: SupplierDUNS+4
			line.append(appendTab(po.getSupplierDUNS4()));
			

			//25: SupplierAddressDescriptor
			line.append(appendTab(po.getSupplierAddressDescriptor()));
			
			//26: SupplierAddress1
			line.append(appendTab(po.getSupplierAddress1()));
			
			//27: SupplierAddress2
			line.append(appendTab(po.getSupplierAddress2()));
			
			//28: SupplierAddress3
			line.append(appendTab(po.getSupplierAddress3()));
			
			//29: SupplierAddress4
			line.append(appendTab(po.getSupplierAddress4()));
			
			//30: SupplierAddress5
			line.append(appendTab(po.getSupplierAddress5()));
			
			//31: SupplierCity
			line.append(appendTab(po.getSupplierCity()));
			
			//32: SupplierCounty
			line.append(appendTab(po.getSupplierCounty()));
			
			//33: SupplierState
			line.append(appendTab(po.getSupplierState()));
			
			//34: SupplierCountry
			line.append(appendTab(po.getSupplierCountry()));
			
			//35: SupplierZip
			line.append(appendTab(po.getSupplierZip()));
			
			//36: BuyerCode
			line.append(appendTab("BuyerCode01"));
			
			//37: BuyerContact
			line.append(appendTab(po.getBuyerContact()));
			
			//38: BuyerName
			line.append(appendTab(po.getBuyerName()));
			
			//39: BuyerEmail
			line.append(appendTab(po.getBuyerEmail()));
			
			//40: SupplierEmail
			line.append(appendTab(po.getSupplierEmail()));
			
			//41: DeliveryTerm
			line.append(appendTab(po.getDeliveryTerm()));
			
			//42: PaymentTerms
			line.append(appendTab(po.getPaymentTerms()));
			
			//43: TotalOrderAmount
			line.append(appendTab(po.getTotalOrderAmount()));
			
			
			//44: InCoTerms
			line.append(appendTab(po.getIncoTerms()));
			
			//45: CustomerOrderNotes
			line.append(appendTab(po.getCustomerOrderNotes()));
			
			//46: SupplierOrderNotes
			line.append(appendTab(po.getSupplierOrderNotes()));
			

			//47: BillTo
			line.append(appendTab(po.getBillTo()));
			
			//48: BillToAddressDescriptor
			line.append(appendTab(po.getBillToAddress()));
			
			//49: BillToAddress1
			line.append(appendTab(po.getBillToAddress1()));
			
			//50: BillToAddress2
			line.append(appendTab(po.getBillToAddress2()));
			
			//51: BillToAddress3
			line.append(appendTab(po.getBillToAddress3()));
			
			//52: BillToAddress4
			line.append(appendTab(po.getBillToAddress4()));
			
			//53: BillToAddress5
			line.append(appendTab(po.getBillToAddress5()));
			
			//54: BillToCity
			line.append(appendTab(po.getBillToCity()));
			
			//55: BillToCounty
			line.append(appendTab(po.getBillToCounty()));
			
			//56: BillToState
			line.append(appendTab(po.getBillToState()));
			
			//57: BillToCountry
			line.append(appendTab(po.getBillToCountry()));
			
			
			//58: BillToZip
			line.append(appendTab(po.getBillToZip()));
			

			//59: RemitToAddressDescriptor
			line.append(appendTab(po.getRemitToAddressDescriptor()));
			
			//60: RemitToAddress1
			line.append(appendTab(po.getRemitToAddress1()));
			
			//61: RemitToAddress2
			line.append(appendTab(po.getRemitToAddress2()));
			
			//62: RemitToAddress3
			line.append(appendTab(po.getRemitToAddress3()));
			
			//63: RemitToAddress4
			line.append(appendTab(po.getRemitToAddress4()));
			
			//64: RemitToAddress5
			line.append(appendTab(po.getRemitToAddress5()));
			
			//65: RemitToCity
			line.append(appendTab(po.getRemitToCity()));
			
			//66: RemitToCounty
			line.append(appendTab(po.getRemitToCounty()));
			
			//67: RemitToState
			line.append(appendTab(po.getRemitToState()));
			
			//68: RemitToCountry
			line.append(appendTab(po.getRemitToCountry()));
			
			//69: RemitToZip
			line.append(appendTab(po.getRemitToZip()));
			
			//70: BuyerContactPhone
			line.append(appendTab(po.getBuyerContactPhone()));
			
			//71: BuyerContactFax
			line.append(appendTab(po.getBuyerContactFax()));
			
			//72: OrderType
			line.append(appendTab(po.getOrderType()));
			
			//73: FlexStringPOHeader4
			line.append(appendTab(po.getFlexStringPOHeader4()));
			
			//74: FlexStringPOHeader5
			line.append(appendTab(po.getFlexStringPOHeader5()));
			
			//75: FlexStringPOHeader6
			line.append(appendTab(po.getFlexStringPOHeader6()));
			
			//76: FlexStringPOHeader7
			line.append(appendTab(po.getFlexStringPOHeader7()));
			
			//77: FlexStringPOHeader8
			line.append(appendTab(po.getFlexStringPOHeader8()));
			
			//78: FlexStringPOHeader9
			line.append(appendTab(po.getFlexStringPOHeader9()));
			
			//79: FlexIntPOHeader1
			line.append(appendTab(po.getFlexIntPOHeader1()));
			
			//80: FlexIntPOHeader2
			line.append(appendTab(po.getFlexIntPOHeader2()));
			
			//81: FlexIntPOHeader3
			line.append(appendTab(po.getFlexIntPOHeader3()));
			
			//82: FlexIntPOHeader4
			line.append(appendTab(po.getFlexIntPOHeader4()));
			
			//83: FlexIntPOHeader5
			line.append(appendTab(po.getFlexIntPOHeader5()));
			
			//84: FlexFloatPOHeader1
			line.append(appendTab(po.getFlexFloatPOHeader1()));
			
			//85: FlexFloatPOHeader2
			line.append(appendTab(po.getFlexFloatPOHeader2()));
			
			//86: FlexFloatPOHeader3
			line.append(appendTab(po.getFlexFloatPOHeader3()));
			
			//87: FlexFloatPOHeader4
			line.append(appendTab(po.getFlexFloatPOHeader4()));
			
			//88: FlexFloatPOHeader5
			line.append(appendTab(po.getFlexFloatPOHeader5()));
			
			//89: FlexDatePOHeader1
			line.append(appendTab(po.getFlexDatePOHeader1()));
			
			//90: FlexDatePOHeader2
			line.append(appendTab(po.getFlexDatePOHeader2()));
			
			//91: FlexDatePOHeader3
			line.append(appendTab(po.getFlexDatePOHeader3()));
			
			//92: FlexDatePOHeader4
			line.append(appendTab(po.getFlexDatePOHeader4()));
			
			//93: FlexDatePOHeader5
			line.append(appendTab(po.getFlexDatePOHeader5()));
			
			//94: LineID
			line.append(appendTab(po.getLineID()));
			
			//95: LineStatus
			line.append(appendTab(po.getLineStatus()));
			
			//96: CustomerItemID
			line.append(appendTab(po.getCustomerItemID()));
			
			
			//97: CustomerItemDescription
			line.append(appendTab(po.getCustomerItemDescription()));
			
			//98: SupplierItemID
			line.append(appendTab(po.getSupplierItemID()));
			
			//99: SupplierItemDescription
			line.append(appendTab(po.getSupplierItemDescription()));
			
			//100:UnitPrice
			line.append(appendTab(po.getUnitPrice()));
			
			//101: PriceBasis
			line.append(appendTab(po.getPriceBasis()));
			
			//102: PaymentCurrency
			line.append(appendTab(po.getPaymentCurrency()));
			
			//103:TotalLineAmount
			line.append(appendTab(po.getTotalLineAmount()));
			
			//104: UOM
			line.append(appendTab(po.getUOM()));
			
			//105: CustomerOrderLineNotes
			line.append(appendTab(po.getCustomerOrderLineNotes()));
			
			//106: SupplierOrderLineNotes
			line.append(appendTab(po.getSupplierOrderLineNotes()));
			
			//107: DrawingVersion
			line.append(appendTab(po.getDrawingVersion()));
			
			//108: DrawingNumber
			line.append(appendTab(po.getDrawingNumber()));
			
			//109: ItemCategory
			line.append(appendTab(po.getItemCategory()));
			
			//110: ShipToLocation
			line.append(appendTab(po.getShipToLocation()));
			
			//111: FlexStringPOLine5
			line.append(appendTab(po.getFlexStringPOLine5()));
			
			//112: FlexStringPOLine6
			line.append(appendTab(po.getFlexStringPOLine6()));
			
			//113: FlexStringPOLine7
			line.append(appendTab(po.getFlexStringPOLine7()));
			
			//114: FlexStringPOLine8
			line.append(appendTab(po.getFlexStringPOLine8()));
			
			//115: FlexStringPOLine9
			line.append(appendTab(po.getFlexStringPOLine9()));
			
			//116: FreeItemFlag
			line.append(appendTab(po.getFreeItemFlag()));
			
			//117: FlexIntPOLine2
			line.append(appendTab(po.getFlexIntPOLine2()));
			
			//118: FlexIntPOLine3
			line.append(appendTab(po.getFlexIntPOLine3()));
			
			//119: FlexIntPOLine4
			line.append(appendTab(po.getFlexIntPOLine4()));
			
			//120: FlexIntPOLine5
			line.append(appendTab(po.getFlexIntPOLine5()));
			
			
			//Counting mistake from here correct this ---------
			//122: FlexFloatPOLine1
			line.append(appendTab(po.getFlexFloatPOLine1()));
			
			//123: FlexFloatPOLine2
			line.append(appendTab(po.getFlexFloatPOLine2()));
			
			//124: FlexFloatPOLine3
			line.append(appendTab(po.getFlexFloatPOLine3()));
			
			//125: FlexFloatPOLine4
			line.append(appendTab(po.getFlexFloatPOLine4()));
			
			//126: FlexFloatPOLine5
			line.append(appendTab(po.getFlexFloatPOLine5()));
			
			//127: FlexDatePOLine1
			line.append(appendTab(po.getFlexDatePOLine1()));
			
			//128: FlexDatePOLine2
			line.append(appendTab(po.getFlexDatePOLine2()));
			
			//129: FlexDatePOLine3
			line.append(appendTab(po.getFlexDatePOLine3()));
			
			//130: FlexDatePOLine4
			line.append(appendTab(po.getFlexDatePOLine4()));
			
			//131: FlexDatePOLine5
			line.append(appendTab(po.getFlexDatePOLine5()));
			
			//132: RequestID
			line.append(appendTab(po.getRequestID()));
			
			//133: RequestStatus
			line.append(appendTab(po.getRequestStatus()));
			
			//134: Action
			line.append(appendTab(po.getAction()));
			
			//135: RequestQty
			line.append(appendTab(po.getRequestQty()));
			
			//136: RequestDate
			line.append(appendTab(po.getRequestDate()));
			
			//137: RequestedShipDate
			line.append(appendTab(po.getRequestedShipDate()));
			
			//138: Carrier
			line.append(appendTab(po.getCarrier()));
			
			//139: CustomerSite
			line.append(appendTab(po.getCustomerSite()));
			
			//140: ShipToAddressDescriptor
			line.append(appendTab(po.getShipToAddressDescriptor()));
			
			//141: ShipToAddress1
			line.append(appendTab(po.getShipToAddress1()));
			
			//142: ShipToAddress2
			line.append(appendTab(po.getShipToAddress2()));
			
			//143: ShipToAddress3
			line.append(appendTab(po.getShipToAddress3()));
			
			//144: ShipToAddress4
			line.append(appendTab(po.getShipToAddress4()));
			
			//145: ShipToAddress5
			line.append(appendTab(po.getShipToAddress5()));
			
			//146: ShipToCity
			line.append(appendTab(po.getShipToCity()));
			
			
			//147: ShipToCounty
			line.append(appendTab(po.getShipToCounty()));
			
			//148: ShipToState
			line.append(appendTab(po.getShipToState()));
			
			//149: ShipToCountry
			line.append(appendTab(po.getShipToCountry()));
			
			
			//150: ShipToZip
			line.append(appendTab(po.getShipToZip()));
			
			//151: RefOrderType
			line.append(appendTab(po.getRefOrderType()));
			
			//152: RefOrderID
			line.append(appendTab(po.getRefOrderID()));
			
			//153: RefOrderLineID
			line.append(appendTab(po.getRefOrderLineID()));
			
			//154: RefOrderRequestID
			line.append(appendTab(po.getRefOrderRequestID()));
			
			
			//155: RefCustomerID
			line.append(appendTab(po.getRefCustomerID()));
			
			//156: RefSupplierID
			line.append(appendTab(po.getRefSupplierID()));
			
			//157: FlexStringPORequest1
			line.append(appendTab(po.getFlexStringPORequest1()));
			
			//158: FlexStringPORequest2
			line.append(appendTab(po.getFlexStringPORequest2()));
			
			//159: FlexStringPORequest3
			line.append(appendTab(po.getFlexStringPORequest3()));
			
			//160: FlexStringPORequest4
			line.append(appendTab(po.getFlexStringPORequest4()));
			
			//161: FlexStringPORequest5
			line.append(appendTab(po.getFlexStringPORequest5()));
			
			//162: FlexStringPORequest6
			line.append(appendTab(po.getFlexStringPORequest6()));
			
			//163: FlexStringPORequest7
			line.append(appendTab(po.getFlexStringPORequest7()));
			
			//164: FlexStringPORequest8
			line.append(appendTab(po.getFlexStringPORequest8()));
			
			//165: FlexStringPORequest9
			line.append(appendTab(po.getFlexStringPORequest9()));
			
			//166: FlexIntPORequest1
			line.append(appendTab(po.getFlexIntPORequest1()));
			
			//167: FlexIntPORequest2
			line.append(appendTab(po.getFlexIntPORequest2()));
			
			//168: FlexIntPORequest3
			line.append(appendTab(po.getFlexIntPORequest3()));
			
			
			//169: FlexIntPORequest4
			line.append(appendTab(po.getFlexIntPORequest4()));
			
			//170: 	FlexIntPORequest5
			line.append(appendTab(po.getFlexIntPORequest5()));
			
			//171: 	FlexFloatPORequest1
			line.append(appendTab(po.getFlexFloatPORequest1()));
			
			//172: 	FlexFloatPORequest2
			line.append(appendTab(po.getFlexFloatPORequest2()));
			
			//173: 	FlexFloatPORequest3
			line.append(appendTab(po.getFlexFloatPORequest3()));
			
			//174: 	FlexFloatPORequest4
			line.append(appendTab(po.getFlexFloatPORequest4()));
			
			//175: 	FlexFloatPORequest5
			line.append(appendTab(po.getFlexFloatPORequest5()));
			
			//176: 	FlexDatePORequest1
			line.append(appendTab(po.getFlexDatePORequest1()));
			
			//177: 	FlexDatePORequest2
			line.append(appendTab(po.getFlexDatePORequest2()));
			
			//178: 	FlexDatePORequest3
			line.append(appendTab(po.getFlexDatePORequest3()));
			
			//179: 	FlexDatePORequest4
			line.append(appendTab(po.getFlexDatePORequest4()));
			
			//180: 	FlexDatePORequest5
			line.append(appendTab(po.getFlexDatePORequest5()));
			
			//181: 	PromiseID
			line.append(appendTab(po.getPromiseID()));
			
			//182: 	PromiseQty
			line.append(appendTab(po.getPromiseQty()));
			
			//183: 	PromiseDate
			line.append(appendTab(po.getPromiseDate()));
			
			//184: 	PromisedShipDate
			line.append(appendTab(po.getPromisedShipDate()));
			
			//185: 	SupplierSite
			line.append(appendTab(po.getSupplierSite()));
			
			//186: 	ShipFromAddressDescriptor
			line.append(appendTab(po.getShipFromAddressDescriptor()));
			
			
			//187: 	ShipFromAddress1
			line.append(appendTab(po.getShipFromAddress1()));
			
			//188: 	ShipFromAddress2
			line.append(appendTab(po.getShipFromAddress2()));
			
			//189: 	ShipFromAddress3
			line.append(appendTab(po.getShipFromAddress3()));
			
			//190: 	ShipFromAddress4
			line.append(appendTab(po.getShipFromAddress4()));
			
			//191: 	ShipFromAddress5
			line.append(appendTab(po.getShipFromAddress5()));
			
			
			//192: 	ShipFromCity
			line.append(appendTab(po.getShipFromCity()));
			
			//193: 	ShipFromCounty
			line.append(appendTab(po.getShipFromCounty()));
			
			//194: 	ShipFromState
			line.append(appendTab(po.getShipFromState()));
			
			//195: 	ShipFromCountry
			line.append(appendTab(po.getShipFromCountry()));
			
			//196: 	ShipFromZip
			line.append(appendTab(po.getShipFromZip()));
			
			//197: 	FlexStringPOPromise1
			line.append(appendTab(po.getFlexStringPOPromise1()));
			
			//198: 	FlexStringPOPromise2
			line.append(appendTab(po.getFlexStringPOPromise2()));
			
			//199: 	FlexStringPOPromise3
			line.append(appendTab(po.getFlexStringPOPromise3()));
			
			//200: 	FlexStringPOPromise4
			line.append(appendTab(po.getFlexStringPOPromise4()));
			
			//201: 	FlexStringPOPromise5
			line.append(appendTab(po.getFlexStringPOPromise5()));
			
			//202: 		FlexStringPOPromise6
			line.append(appendTab(po.getFlexStringPOPromise6()));
			
			//203: 	FlexStringPOPromise7
			line.append(appendTab(po.getFlexStringPOPromise7()));
			
			//204: 	FlexStringPOPromise8
			line.append(appendTab(po.getFlexStringPOPromise8()));
			
			//205: 	FlexStringPOPromise9
			line.append(appendTab(po.getFlexStringPOPromise9()));
			
			//206: 	FlexIntPOPromise1
			line.append(appendTab(po.getFlexIntPOPromise1()));
			
			//207: 	FlexIntPOPromise2
			line.append(appendTab(po.getFlexIntPOPromise2()));
			
			//208: 	FlexIntPOPromise3
			line.append(appendTab(po.getFlexIntPOPromise3()));
			
			//209: 	FlexIntPOPromise4
			line.append(appendTab(po.getFlexIntPOPromise4()));
			
			//210: 	FlexIntPOPromise5
			line.append(appendTab(po.getFlexIntPOPromise5()));
			
			//211: 	FlexFloatPOPromise1
			line.append(appendTab(po.getFlex_Float_PO_Promise1()));
			
			//212: 	FlexFloatPOPromise2
			line.append(appendTab(po.getFlexFloatPOPromise2()));
			
			//213: 	FlexFloatPOPromise3
			line.append(appendTab(po.getFlexFloatPOPromise3()));
			
			//214: 	FlexFloatPOPromise4
			line.append(appendTab(po.getFlexFloatPOPromise4()));
			
			//215: 	FlexFloatPOPromise5
			line.append(appendTab(po.getFlexFloatPOPromise5()));
			
			//216: 	FlexDatePOPromise1
			line.append(appendTab(po.getFlexDatePOPromise1()));
			
			//217: 	FlexDatePOPromise2
			line.append(appendTab(po.getFlexDatePOPromise2()));
			
			//218: 	FlexDatePOPromise3
			line.append(appendTab(po.getFlexDatePOPromise3()));
			
			//219: 	FlexDatePOPromise4
			line.append(appendTab(po.getFlexDatePOPromise4()));
			
			//220: 	FlexDatePOPromise5
			line.append(appendTab(po.getFlexDatePOPromise5()));
			
			//221: 	Rev #
			line.append(appendTab(po.getRev()));
			
			//222: 	ShipToCustomerID
			if(!CommonUtils.isBlank(po.getShipToCustomerID())){
				line.append(po.getShipToCustomerID());
			}
			

			lines.add(line.toString());
		 }
		return lines;
	}
	
	public static String appendTab(Object value) {
		if(value==null || "".equals(value) || "null".equals(value)){
			return "\t";
		}else{
			return value+"\t";
		}
	    
	}
	

	/*public static String fixedLengthString(String string, int length) {
	    return String.format("%1$"+length+ "s", string);
	}*/
	
	public static String getFileName(String poNum) {
		
		StringBuilder name = new StringBuilder();
		
		name.append(poNum);
		name.append(".");
		name.append(Constants.FILE_SENDER_DUNS);
		name.append("_");
		name.append(Constants.FILE_RECEIVER_DUNS);
		name.append("_");
		name.append(Constants.FILE_MESSAGE_TYPE);
		name.append("_");
		name.append(Constants.FILE_VERSION);
		name.append("_");
		name.append(Constants.FILE_SITEID);
		name.append("_");
		
		SimpleDateFormat isoFormat = new SimpleDateFormat(Constants.FILE_DATE_FORMAT);
		isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

		String timestamp = isoFormat.format(new Date());
		
		name.append(timestamp);
		name.append(".txt");
		return name.toString();
		
	}
	
	public static PullPoDataResponse preparePullPoDataResponse(List<E2Open> poList){
		System.out.println("#### Starting preparePullPoDataResponse(core) ####");
		PullPoDataResponse res = new PullPoDataResponse();
		
		if(poList==null){
			res.setErrorMsg("Data not found !");
			return res;
		}
		
		ArrayList<PoDetails> poDetails = new ArrayList<PoDetails>() ;
		
		for (E2Open row : poList) {
			PoDetails details = new PoDetails();
			
			details.setDataSource(row.getDataSource());
			
			details.setPoDesc(row.getCustomerDescription());//Need to verify
			details.setPoId(row.getId());
			details.setPoNum(row.getOrderNumber());
			details.setStatus(row.getStatus());
			poDetails.add(details);
		}
		
		res.setPoDetails(poDetails);
		res.setErrorInDataFetch(false);
		res.setErrorInDataSave(false);
		System.out.println("#### Ending preparePullPoDataResponse(core) ####"+res);
		return res;
	}

	public Reader getReader() {
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream(Constants.CONFIG_FILE_NAME);
			return new InputStreamReader(is, "UTF-8");
		} catch (UnsupportedEncodingException  e) {
			e.printStackTrace();
			throw new IllegalStateException("Unable to read input", e);
		}
	}
	
	public static boolean isBlank(String val){
		
		if("null".equals(val)){
			return true;
		}
		
		if(StringUtils.isBlank(val)){
			return true;
		}
		return false;
	}
	
}
