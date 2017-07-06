package com.bbva.mzic.utils;

import java.io.IOException;
import java.util.Collections;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.jaxrs.client.WebClient;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public abstract class RestClient<T,R> {
	
	private Log log = LogFactory.getLog(RestClient.class);
	
	/**
	 * Sirve para generar 
	 * @return Regresa Objeto salida de la implementacion */
	protected abstract T createFactory();
	
	protected abstract R buildErrorRequest( WebApplicationException ex) throws JsonParseException, JsonMappingException, IOException;
	
	
	public R petitionPost(String url, String path){
		Response res = null;
		R response = null;
		try {
			 res = executePost(createFactory(), url, path);
			 log.info("Status from Request: " + res.getStatus());	
		} catch (WebApplicationException e) {
			try {
				response = buildErrorRequest(e);	
			} catch (Exception ex) {
				ex.printStackTrace();
				log.error(ex);
			}
			
		}
		return response;
	}
	
	public R petitionPost(Class<R> clazz, String url, String path){
		R response = null;
		try {
			response = executePost(clazz, createFactory(), url, path);
			log.info("Status from Request: " + response);	
		} catch (WebApplicationException e) {
			try {
				response = buildErrorRequest(e);	
			} catch (Exception ex) {
				ex.printStackTrace();
				log.error(ex);
			}
		}
		return response;
	}
	
	private Response executePost(T request, String url, String path){
		log.info("Start executePost -> "+ url + path);
		WebClient client = WebClient.create(url,Collections.singletonList(new JacksonJsonProvider()))
				.path(path)
				.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON);
		
		return client.post(request);
	}
	
	private R executePost(Class<R> clazz, T request, String url, String path){
		log.info("Start executePost -> "+ url + path);
		WebClient client = WebClient.create(url,Collections.singletonList(new JacksonJsonProvider()))
				.path(path).accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON);
		
		return client.post(request, clazz);
	}
}
