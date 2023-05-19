package br.com.fiap.resource;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioTO {

	private int idUsuario;
	private int idFase;
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private String confirmaSenha;


	
	//CONSTRUCTOR
	public UsuarioTO() {
		super();
	}
	public UsuarioTO(int idUsuario, int idFase, String nome, String cpf, String email, String senha, String confirmaSenha) {
		super();
		this.idUsuario = idUsuario;
		this.idFase = idFase;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.confirmaSenha = confirmaSenha;

	}
	
	//GET e SET
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public int getIdFase() {
		return idFase;
	}
	public void setIdFase(int idFase) {
		this.idFase = idFase;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}
	public void setConfirmaSenha(String confirmarSenha) {
		this.confirmaSenha = confirmarSenha;
	}
}
