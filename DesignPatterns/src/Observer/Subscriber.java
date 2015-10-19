package Observer;

public class Subscriber extends Observer implements Runnable{

	Magazine myMagSub;
	int myMags=0;
	public Subscriber(Magazine m){
		super(m);
		myMagSub = m;
	}
	
	public void startThread(){
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void update() {
		checkMag();
	}
	
	public void checkMag(){
		if(this.myMagSub.getMagazinesPublished()>this.myMags){
			System.out.println("Got a new Magazine!");
			this.myMags++;
		}
		else{
			System.out.println("Still waiting for the latest issue");
		}
	}
	@Override
	public void run() {
		while(true){
			//check for new magazine
			checkMag();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
