package br.com.jj.campanha.services.impl;

import java.util.List;

import br.com.jj.campanha.models.Campanha;
import br.com.jj.campanha.repositories.CampanhaRepository;
import br.com.jj.campanha.services.CampanhaService;

public class DefaultCampanhaService implements CampanhaService {

	private CampanhaRepository repository;

	public DefaultCampanhaService(CampanhaRepository repository) {
		this.repository = repository;
	}

	@Override
	public void include(Campanha campanha) {
		repository.doInclude(campanha);
	}

	@Override
	public List<Campanha> list() {
		return repository.doList();
	}

	@Override
	public void update(Campanha campanha) {
		repository.doUpdate(campanha);
	}

	@Override
	public void delete(Campanha campanha) {
		repository.doDelete(campanha);
	}

}
