package slideQ3;

public class TestPlayer {
	public static void main(String[] args) {
		Player p = new Player("Lauren", "passwd");
		System.out.println(p.getUserName());
		System.out.println(p.isLevel(0));
	}
}
