package Observer;

public abstract class Observer {

	public abstract void update();
	public Observer(Subject s){
		s.addObserver(this);
	}
}
