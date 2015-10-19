package Singleton;

public class GameController {

	private String  monologue;
	
	//step 1
	private static GameController gc = new GameController();
	
	//step 2
	private GameController(){
		monologue = "I am a strong independant singleton class with private attributes and public methods.\nI am no mere Static Class!";
	}
	
	//step 3
	public static GameController getInstance(){
		return gc;
	}
	
	public String getMonolog(){
		return monologue;
	}
}
