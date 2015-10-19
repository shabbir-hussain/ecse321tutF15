package Singleton;

public class SingletonDemo {

	public static void main (String[] args){
		GameController g1 = GameController.getInstance();
		GameController g2 = GameController.getInstance();
		
		if(g1 == g2){
			System.out.println("There is only one!");
		}
		
		System.out.println(GameController.getInstance().getMonolog());
	}
}
