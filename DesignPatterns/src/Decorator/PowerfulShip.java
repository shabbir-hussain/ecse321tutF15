package Decorator;

public abstract class PowerfulShip implements SpaceShip{

	SpaceShip s;
	
	public PowerfulShip(SpaceShip ship){
		s=ship;
	}

	
	@Override
	public void FireLasers() {
		s.FireLasers();
		
	}
	
	public abstract void PowerUP();

	
}
