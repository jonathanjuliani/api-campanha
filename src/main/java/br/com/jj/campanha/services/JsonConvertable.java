package br.com.jj.campanha.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.jj.campanha.constants.ConstMessages;

public interface JsonConvertable <T> {
	
	public default String toJSON() {
        Gson gson = new GsonBuilder().setDateFormat(ConstMessages.DATE_FORMAT_DD_MM_YYYY).create();
        return gson.toJson(this);
    }
	
	public default T createFromJSON(String json, Class<T> dtoClass) {
        Gson gson = new GsonBuilder().setDateFormat(ConstMessages.DATE_FORMAT_DD_MM_YYYY).create();
        return gson.fromJson(json, dtoClass);
    }
}
