package game;

public class Jogo {
	private int game;
	private String status;
	private int total_kills;
	private String players;
	
	public Jogo(int game, String status, int total_kills, String players) {
		super();
		this.game = game;
		this.status = status;
		this.total_kills = total_kills;
		this.players = players;
	}

	public int getGame() {
		return game;
	}

	public void setGame(int game) {
		this.game = game;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTotal_kills() {
		return total_kills;
	}

	public void setTotal_kills(int total_kills) {
		this.total_kills = total_kills;
	}

	public String getPlayers() {
		return players;
	}

	public void setPlayers(String players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Jogo [game=" + game + ", status=" + status + ", total_kills=" + total_kills + ", players=" + players
				+ "]";
	}
	
	
	
	

}
