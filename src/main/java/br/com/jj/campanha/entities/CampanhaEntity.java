package br.com.jj.campanha.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CampanhaEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String nome;

	@Column
	private String nome_time;

	@Column
	private Date dt_inclusao;

	@Column
	private Date dt_vigencia;

	@Column
	private boolean vigencia_alterada;

	public CampanhaEntity() {
		// TODO Auto-generated constructor stub
	}

	public CampanhaEntity(String nome, String time, Date dataInclusao, Date dataVigencia, Boolean vigenciaAlterada) {
		this.nome = nome;
		this.nome_time = time;
		this.dt_inclusao = dataInclusao;
		this.dt_vigencia = dataVigencia;
		this.vigencia_alterada = vigenciaAlterada;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome_time() {
		return nome_time;
	}

	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}

	public Date getDt_inclusao() {
		return dt_inclusao;
	}

	public void setDt_inclusao(Date dt_inclusao) {
		this.dt_inclusao = dt_inclusao;
	}

	public Date getDt_vigencia() {
		return dt_vigencia;
	}

	public void setDt_vigencia(Date dt_vigencia) {
		this.dt_vigencia = dt_vigencia;
	}

	public boolean isVigencia_alterada() {
		return vigencia_alterada;
	}

	public void setVigencia_alterada(boolean vigencia_alterada) {
		this.vigencia_alterada = vigencia_alterada;
	}

}
