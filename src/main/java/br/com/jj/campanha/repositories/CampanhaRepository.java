package br.com.jj.campanha.repositories;

import java.util.List;

import br.com.jj.campanha.models.Campanha;

public interface CampanhaRepository {
	
	void doInclude(Campanha campanha);

	List<Campanha> doList();

	void doUpdate(Campanha campanha);

	void doDelete(Campanha campanha);
}
