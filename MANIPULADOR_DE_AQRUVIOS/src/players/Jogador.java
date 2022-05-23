package players;

public class Jogador {
	private int id;
	private String ClientUserinfoChanged;
	private int kills;
	private String old_names;
	
	public Jogador() {
		
	}
	public Jogador(int id, String nome, int kills, String old_names) {
		super();
		this.id = id;
		this.ClientUserinfoChanged = nome;
		this.kills = kills;
		this.old_names = old_names;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return ClientUserinfoChanged;
	}
	public void setNome(String nome) {
		this.ClientUserinfoChanged = nome;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public String getOld_names() {
		return old_names;
	}
	public void setOld_names(String old_names) {
		this.old_names = old_names;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("");
		builder.append("\nid: ").append(id);
		builder.append("\nnome: ").append(ClientUserinfoChanged);
		builder.append("\nkills: ").append(kills);
		builder.append("\nold_names: ").append(old_names);
		
		return builder.toString();
	}
}
