package Observer;

public class Magazine extends Subject {

	int numOfMagazinesPublished;
	
	public Magazine(){
		this.numOfMagazinesPublished=0;
	}
	
	public int getMagazinesPublished(){
		return this.numOfMagazinesPublished;
	}
	public void publishMagazine(){
		this.numOfMagazinesPublished++;
	}
}
