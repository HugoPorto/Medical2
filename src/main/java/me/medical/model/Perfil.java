package me.medical.model;

import java.util.Date;

public class Perfil {

	private int id;
	private String perfil;
	private Date data_criacao;
	private Date data_modificacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public Date getData_criacao() {
		return data_criacao;
	}
	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}
	public Date getData_modificacao() {
		return data_modificacao;
	}
	public void setData_modificacao(Date data_modificacao) {
		this.data_modificacao = data_modificacao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_criacao == null) ? 0 : data_criacao.hashCode());
		result = prime * result + ((data_modificacao == null) ? 0 : data_modificacao.hashCode());
		result = prime * result + id;
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (data_criacao == null) {
			if (other.data_criacao != null)
				return false;
		} else if (!data_criacao.equals(other.data_criacao))
			return false;
		if (data_modificacao == null) {
			if (other.data_modificacao != null)
				return false;
		} else if (!data_modificacao.equals(other.data_modificacao))
			return false;
		if (id != other.id)
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		return true;
	}
}
