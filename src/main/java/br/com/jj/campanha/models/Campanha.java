package br.com.jj.campanha.models;

import java.sql.Date;

import br.com.jj.campanha.services.JsonConvertable;

public class Campanha implements JsonConvertable<Campanha> {

	private transient Long id;

	private String nome;

	private String time;

	private transient Date dataInclusao;

	private Date dataVigencia;

	private Boolean vigenciaAlterada;

	private transient Error error;

	public Campanha() {
		// TODO Auto-generated constructor stub
	}

	public Campanha(String nome, String time, Date dataVigencia) {
		this.nome = nome;
		this.time = time;
		this.dataVigencia = null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Boolean getVigenciaAlterada() {
		return vigenciaAlterada;
	}

	public void setVigenciaAlterada(Boolean vigenciaAlterada) {
		this.vigenciaAlterada = vigenciaAlterada;
	}

	public Campanha(Error error) {
		this.error = error;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Date getDataVigencia() {
		return dataVigencia;
	}

	public void setDataVigencia(Date dataVigencia) {
		this.dataVigencia = dataVigencia;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

}
