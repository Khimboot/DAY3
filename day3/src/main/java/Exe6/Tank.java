package Exe6;

public class Tank {
	
	boolean filled;
	
	public void Fill() {
		filled = true;
	}
	
	public void Empty() {
		filled = false;
	}
	
	protected void finalize() {
		System.out.println("The tank is empty!");
	}

}
