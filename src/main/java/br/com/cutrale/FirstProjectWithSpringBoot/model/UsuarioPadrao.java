package br.com.cutrale.FirstProjectWithSpringBoot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UsuarioPadrao implements Serializable {

	private static final long serialVersionUID = -5799864051570647611L;

	@Id
	@GeneratedValue
	private Long num;
	private String us_nome;
	private Long st_codigo;
	private String us_cad;
	private Date dt_cad;
	private String email;
	private Long num_cpf;
	private String us_alt;
	private Date dt_alt;
	private Long pessoa_num;
	private String idioma_cd;
	private Long cd_tipo;

	public UsuarioPadrao(Long num, String us_nome, Long st_codigo, String us_cad, Date dt_cad, String email, Long num_cpf,
			String us_alt, Date dt_alt, Long pessoa_num, String idioma_cd, Long cd_tipo) {

		this.num = num;
		this.us_nome = us_nome;
		this.st_codigo = st_codigo;
		this.us_cad = us_cad;
		this.dt_cad = dt_cad;
		this.email = email;
		this.num_cpf = num_cpf;
		this.us_alt = us_alt;
		this.dt_alt = dt_alt;
		this.pessoa_num = pessoa_num;
		this.idioma_cd = idioma_cd;
		this.cd_tipo = cd_tipo;
		
	}

	public UsuarioPadrao() {

	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getUs_nome() {
		return us_nome;
	}

	public void setUs_nome(String us_nome) {
		this.us_nome = us_nome;
	}

	public Long getSt_codigo() {
		return st_codigo;
	}

	public void setSt_codigo(Long st_codigo) {
		this.st_codigo = st_codigo;
	}

	public String getUs_cad() {
		return us_cad;
	}

	public void setUs_cad(String us_cad) {
		this.us_cad = us_cad;
	}

	public Date getDt_cad() {
		return dt_cad;
	}

	public void setDt_cad(Date dt_cad) {
		this.dt_cad = dt_cad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getNum_cpf() {
		return num_cpf;
	}

	public void setNum_cpf(Long num_cpf) {
		this.num_cpf = num_cpf;
	}

	public String getUs_alt() {
		return us_alt;
	}

	public void setUs_alt(String us_alt) {
		this.us_alt = us_alt;
	}

	public Date getDt_alt() {
		return dt_alt;
	}

	public void setDt_alt(Date dt_alt) {
		this.dt_alt = dt_alt;
	}

	public Long getPessoa_num() {
		return pessoa_num;
	}

	public void setPessoa_num(Long pessoa_num) {
		this.pessoa_num = pessoa_num;
	}

	public String getIdioma_cd() {
		return idioma_cd;
	}

	public void setIdioma_cd(String idioma_cd) {
		this.idioma_cd = idioma_cd;
	}

	public Long getCd_tipo() {
		return cd_tipo;
	}

	public void setCd_tipo(Long cd_tipo) {
		this.cd_tipo = cd_tipo;
	}

}
