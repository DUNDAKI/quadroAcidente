package players;

import java.util.ArrayList;
import java.util.List;

public class Jogador implements java.io.Serializable {
	private static final long serialVersionUID = 638312139361412L;
	
	private int id;
	private String ClientUserinfoChanged;
	private int kills;
	private String old_names;
	private List<Games> list_game = new ArrayList<>();
	
	public Jogador() {
		
	}
	
	
	
	
	public Jogador(int id, String clientUserinfoChanged, int kills, String old_names, List<Games> list_game) {
		super();
		this.id = id;
		ClientUserinfoChanged = clientUserinfoChanged;
		this.kills = kills;
		this.old_names = old_names;
		this.list_game = list_game;
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
	
	public List<Games> getList_game() {
		return list_game;
	}
	
	public void setList_game(List<Games> list_game) {
		this.list_game = list_game;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("");
		builder.append("\nid: ").append(id);
		builder.append("\nnome: ").append(ClientUserinfoChanged);
		builder.append("\nkills: ").append(kills);
		builder.append("\nold_names: ").append(old_names);
		builder.append("\nlist_game").append(list_game);
		
		return builder.toString();
	}
}
