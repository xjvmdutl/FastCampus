package chapter03.ch16.gamelevel;

public class Player{
	private PlayerLevel playerLevel;
	public Player() {
		playerLevel = new BeginnerLevel();
		playerLevel.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return playerLevel;
	}
	public void upgradeLevel(PlayerLevel playerLevel) {
		this.playerLevel = playerLevel;
		this.playerLevel.showLevelMessage();
	}
	public void play() {
		int count = 0;
		if(playerLevel instanceof BeginnerLevel) {
			count = 1;
		}else if(playerLevel instanceof AdvancedLevel) {
			count = 2;
		}else if(playerLevel instanceof SuperLevel) {
			count = 3;
		}else if(playerLevel instanceof UltraSuperLevel) {
			count = 4;
		}else {
			System.out.println("ERROR -99999");
		}
		playerLevel.go(count);
	}
}
