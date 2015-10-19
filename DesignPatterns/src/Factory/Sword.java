package Factory;

public class Sword {
	public int handedness;
	public int damage;
	public String color;
	
	public String toString(){
		return "Slashing the "+handedness+" handed "+color+" sword to inflict "+damage+" damage!";
	}
}
