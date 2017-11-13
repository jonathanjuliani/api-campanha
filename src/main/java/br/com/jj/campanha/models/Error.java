package br.com.jj.campanha.models;

import br.com.jj.campanha.services.JsonConvertable;

public class Error implements JsonConvertable<Error> {
	
	private String description;
	
	public Error(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
