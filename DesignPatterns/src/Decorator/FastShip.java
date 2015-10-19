package Decorator;

public class FastShip extends PowerfulShip{

	public FastShip(SpaceShip ship) {
		super(ship);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void PowerUP() {

		System.out.println("Warp Drive 100% Ready");
	}

}
