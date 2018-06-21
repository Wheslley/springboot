package br.com.cutrale.FirstProjectWithSpringBoot.model;

public class ObjFramework {
	
	private String obj_nome;
	private int versao;

	public ObjFramework() {

	}

	public ObjFramework(String obj_nome, int versao) {
		super();
		this.obj_nome = obj_nome;
		this.versao = versao;
	}

	public String getObj_nome() {
		return obj_nome;
	}

	public void setObj_nome(String obj_nome) {
		this.obj_nome = obj_nome;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

}
