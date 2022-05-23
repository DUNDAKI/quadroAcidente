package MODEL;
import java.util.Objects;

public class Usuarios {
	private int id;
	private String nome;
	private String usuario;
	private String email;
	private String senha;
	
	
	public Usuarios(int id, String nome, String usuario, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
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


	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nome=" + nome + ", usuario=" + usuario + ", email=" + email + ", senha="
				+ senha + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return id == other.id;
	}
	
	
	
	
	
	
}
