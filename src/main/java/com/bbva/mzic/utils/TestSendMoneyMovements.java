package com.bbva.mzic.utils;

import java.util.Collections;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

import com.bbva.mzic.sendmoneymovements.facade.v01.dto.DtoMoney;
import com.bbva.mzic.sendmoneymovements.facade.v01.dto.DtoPaymentByFlapRequest;
import com.bbva.mzic.sendmoneymovements.facade.v01.dto.ObjectFactory;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class TestSendMoneyMovements {
	
	public static void main(String[] args) {
//		http://localhost:8080/zic/sendMoneyMovements/V03/sendTransactionFlap?_wadl
		try {
			ObjectFactory objectFactory = new ObjectFactory();
			DtoPaymentByFlapRequest request = objectFactory.createDtoPaymentByFlapRequest();
			request.setAccountNumber("1");
			DtoMoney money = objectFactory.createDtoMoney();
			money.setAmount(12l);
			
			request.setAmount(money);
			request.setDestinationTelephoneNumber("123456");
			request.setMessage("meee");
			request.setMovementId("123456");
			request.setMovementReferenceNumber("123456");
			request.setOriginTelephoneNumber("1234567");
			request.setStatusMovement("1");
			
			String authorizationHeader = "Basic "
					+ "TXVsdGlwYWdvc0FQUDpzYmZQTnF1UFRVRjE1azNCbG1tRzNFMDN3R1hoMTBBM0k1dXpLdHA2";
			
			WebClient client = WebClient
					.create("http://localhost:8080/", Collections.singletonList(new JacksonJsonProvider()))
//					.header("Authorization", authorizationHeader)
					.path("zic/sendMoneyMovements/V03/sendTransactionFlap")
					.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON);
			Response res = client.post(request);
			
			System.out.println(res.getStatus());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


}
