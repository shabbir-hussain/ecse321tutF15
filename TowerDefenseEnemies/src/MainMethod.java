import java.util.ArrayList;
import java.util.Random;


public class MainMethod {

	public static void main(String args[]){
		//DynamicDispatch();
		//BrokenRuntime();
		FixedRuntime();
	}
	
	//Dynamic method dispatch example
	public static void DynamicDispatch(){
		//update all enemies
		ArrayList<Enemies> eList = new ArrayList<Enemies>();
		eList.add(new Spider());
		eList.add(new Bird());
		
		for(Enemies enemy : eList){
			enemy.update();
		}
	}
	
	//runtime vs compiletime
	public static void BrokenRuntime(){
		Enemies e;
		Random r = new Random(System.currentTimeMillis());
		e = r.nextBoolean()? new Spider() : new Bird();
		
		e.update();
		Spider s = (Spider) e;
		s.update();
	}
	
	public static void FixedRuntime(){
		Enemies e;
		Random r = new Random(System.currentTimeMillis());
		e = r.nextBoolean()? new Spider() : new Bird();
				
		if(e instanceof Spider){
			Spider s = (Spider) e;
			s.update();
		}else if(e instanceof Bird){
			Bird b = (Bird) e;
			b.update();
		}
	}
		
}
