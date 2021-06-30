package chapter03.ch16.gamelevel;

public class MainBoardPlay {

	public static void main(String[] args) {
		Player player = new Player();
		player.play();
		player.upgradeLevel(new AdvancedLevel());
		player.play();
		player.upgradeLevel(new SuperLevel());
		player.play();
		player.upgradeLevel(new UltraSuperLevel());
		player.play();
		
	}

}
