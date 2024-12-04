package model;

public class Usuario {
	// VARIAVEIS
	private int idUsuario;
	private String nome;
	private String telefone;
	private String login;
	private String senha;
	private int idPerfil;
	private Perfil perfil;
	

	// CONSTRUTORES
	public Usuario() {
		super();

	}


	public Usuario(int idUsuario, String nome, String telefone, String login, String senha, int idPerfil,
			Perfil perfil) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.telefone = telefone;
		this.login = login;
		this.senha = senha;
		this.idPerfil = idPerfil;
		this.perfil = perfil;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getIdPerfil() {
		return idPerfil;
	}


	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}


	public Perfil getPerfil() {
		return perfil;
	}


	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	
}