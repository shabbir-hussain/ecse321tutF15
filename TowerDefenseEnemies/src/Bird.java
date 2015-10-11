public class Bird extends Enemies{

	public Bird(){
		health = 50;
		speed = 30;
	}
	@Override
	public void update() {
		System.out.println("Updating a bird");
		
	}
	
}