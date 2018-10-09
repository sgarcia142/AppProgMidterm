package slideQ3;
public class Player {
	private String username;
	private String password;
	private int level;
	
	public Player(String u, String p) {
		this.username = u;
		this.password = p;
	}
	
	public boolean isLevel(int number) {
		if(this.level == number)
			return true;
		return false;
	}
	
	public int getLevel() {
		return this.level; 
	}
	
	public String getUserName() {
		return this.username;
	}
}
