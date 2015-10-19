package Factory;

public class swordFactory {

	public static Sword makeSword(SwordType type){
		Sword sword = new Sword();
		switch(type){
		case FIRE:
			sword.color = "red";
			sword.damage = 55;
			sword.handedness =1;
			break;
			case WATER:
			sword.color = "blue";
			sword.damage = 100;
			sword.handedness =1;
			break;
		case ICE:
			sword.color = "white";
			sword.damage = 150;
			sword.handedness =2;
			break;
		default:
			 sword = null;
		}
		
		return sword;
	}
}
