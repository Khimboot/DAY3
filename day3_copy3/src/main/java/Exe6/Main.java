package Exe6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tank tank = new Tank();
		
		tank.Fill();
		System.out.println("Filled?" + tank.filled);
		System.gc();
		
		new Tank();
		
		tank.Empty();
		System.out.println("Filled?" + tank.filled);
		System.gc();

	}

}
