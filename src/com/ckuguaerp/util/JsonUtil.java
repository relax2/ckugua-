package com.ckuguaerp.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtil {

	private JsonUtil() {
		
	}
	
	
	public static String objToJson(Object o) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString(o);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "";
	}
}
