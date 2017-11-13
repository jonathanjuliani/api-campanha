package br.com.jj.campanha.services;

import java.util.List;

import br.com.jj.campanha.models.Campanha;

public interface CampanhaService {
	
	void include(Campanha campanha);
	
	List<Campanha> list();
	
	void update(Campanha campanha);
	
	void delete(Campanha campanha);

}
