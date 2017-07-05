package com.bbva.mzic.sendmoneymovements.facade.v01.impl;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;

import com.bbva.mzic.sendmoneymovements.facade.v01.dto.DtoMoney;
import com.bbva.mzic.sendmoneymovements.facade.v01.dto.DtoPaymentByFlapRequest;
import com.bbva.mzic.sendmoneymovements.facade.v01.dto.ObjectFactory;
import com.bbva.mzic.utils.NotResponse;
import com.bbva.mzic.utils.RestClient;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class SendMoneyMovementsImpl extends RestClient<DtoPaymentByFlapRequest, NotResponse>{

	@Override
	protected DtoPaymentByFlapRequest createFactory() {
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
		
		return request;
	}

	@Override
	protected NotResponse buildErrorRequest(WebApplicationException ex)
			throws JsonParseException, JsonMappingException, IOException {
		NotResponse msj = new NotResponse();
		msj.setMessage("Ocurrio un Error : " + msj);
		return msj;
	}
	
	public static void main(String[] args) {
		SendMoneyMovementsImpl test = new SendMoneyMovementsImpl();
		
		NotResponse res = test.petitionPost("http://localhost:8080/", "zic/sendMoneyMovements/V03/sendTransactionFlap");
		System.out.println(res);
	}

}
