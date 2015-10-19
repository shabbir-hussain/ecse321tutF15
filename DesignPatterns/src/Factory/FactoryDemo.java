package Factory;

import java.util.Scanner;

public class FactoryDemo {
	
	public static void main(String[] args){
		System.out.println("Enter a number between 0 and 2");
		Scanner input = new Scanner(System.in);
		
		if(input.hasNextInt()){
			int swordType = input.nextInt();
			SwordType s = GetType(swordType);
			Sword mySword = swordFactory.makeSword(s);
			
			System.out.println(mySword.toString());
		}
	}
	
	public static SwordType GetType(int type){
		switch(type){
		case 0:
			return SwordType.FIRE;
		case 1: 
			return SwordType.WATER;
		default:
			return SwordType.ICE;
		}
	}

}
