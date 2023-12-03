package Entites;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public Champion() {
		
	}
	
		
	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public String status() {
		if(life>0)
			return "Vivo";
		else return "Morto";
	}
	
	public void takeDamager(Champion other) {
		if(this.attack<=other.armor) 
			other.life--;
		else
			other.life= other.life-(attack-other.armor);
		
		if(other.life<0)
			other.life=0;
		
		
	}
	
	
}
