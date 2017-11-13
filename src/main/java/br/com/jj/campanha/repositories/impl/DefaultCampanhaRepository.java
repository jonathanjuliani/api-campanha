package br.com.jj.campanha.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.jj.campanha.models.Campanha;
import br.com.jj.campanha.repositories.CampanhaRepository;

@Repository
public class DefaultCampanhaRepository implements CampanhaRepository {
	
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void doInclude(Campanha campanha) {
		
		String sql = "INSERT INTO person(first_name, last_name, age, place) VALUES(?,?,?,?)";
		int result = jdbc.update(sql, campanha.getNome());
		
	}

	@Override
	public List<Campanha> doList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doUpdate(Campanha campanha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doDelete(Campanha campanha) {
		// TODO Auto-generated method stub
		
	}

}
