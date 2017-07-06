package com.bbva.mzic.sendmoneymovements.facade.v01.impl;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bbva.mzic.sendmoneymovements.facade.v01.dto.DtoMoney;
import com.bbva.mzic.sendmoneymovements.facade.v01.dto.DtoPaymentByFlapRequest;
import com.bbva.mzic.sendmoneymovements.facade.v01.dto.DtoPaymentByFlapResponse;
import com.bbva.mzic.sendmoneymovements.facade.v01.dto.ObjectFactory;
import com.bbva.mzic.utils.RestClient;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class CreateTransactionByFlapImpl extends RestClient<DtoPaymentByFlapRequest, DtoPaymentByFlapResponse>{
	Log log = LogFactory.getLog(CreateTransactionByFlapImpl.class);

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
	protected DtoPaymentByFlapResponse buildErrorRequest(WebApplicationException ex)
			throws JsonParseException, JsonMappingException, IOException {
		
		log.error("no implementado el error-------------------------------");
		return null;
	}

}
