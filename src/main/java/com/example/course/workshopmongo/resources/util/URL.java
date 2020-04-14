package com.example.course.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

	/**
	 * @param Metodo para decodificar string na url pois o padrao JS codifica as strings passadas
	 * @return
	 */
	public static String decodeParam(String text)
	{
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
}
