package Decorator;

public class DefensiveShip extends PowerfulShip{


	PowerfulShip p;
	public DefensiveShip(PowerfulShip ship) {
		super(ship);
		p=ship;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void PowerUP() {
		p.PowerUP();
		System.out.println("Activating Shields.");
	}

}
