package Observer;

import java.util.ArrayList;

public class Subject {

	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer o){
		observers.add(o);
	}
	
	public void notifyObservers(){
		for(Observer o:observers){
			o.update();
		}
	}
}
