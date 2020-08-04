package br.com.rd.rdevs.moduloweb.model;

import java.util.Date;

public class Modulo {
	
	private String dsNome;
	private String dsInstrutorTitular;
	private String dsInstrutorAuxiliar;
	private Date dtInicio;
	
	public Modulo() {		
	}	

	public Modulo(String dsNome, String dsInstrutorTitular, String dsInstrutorAuxiliar, Date dtInicio) {
		super();
		this.dsNome = dsNome;
		this.dsInstrutorTitular = dsInstrutorTitular;
		this.dsInstrutorAuxiliar = dsInstrutorAuxiliar;
		this.dtInicio = dtInicio;
	}



	public String getDsNome() {
		return dsNome;
	}

	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}

	public String getDsInstrutorTitular() {
		return dsInstrutorTitular;
	}

	public void setDsInstrutorTitular(String dsInstrutorTitular) {
		this.dsInstrutorTitular = dsInstrutorTitular;
	}

	public String getDsInstrutorAuxiliar() {
		return dsInstrutorAuxiliar;
	}

	public void setDsInstrutorAuxiliar(String dsInstrutorAuxiliar) {
		this.dsInstrutorAuxiliar = dsInstrutorAuxiliar;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}


	
}
