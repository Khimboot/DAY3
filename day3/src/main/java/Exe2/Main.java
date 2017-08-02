package Exe2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cycles[] cycles = {(Cycles)new Unicycles(), (Cycles)new Bicycles(), (Cycles)new Tricycls()};
		
		/*for (Cycles x : cycles) {
			x.ride();
			x.balance(); // method is undefined
		}*/
		
		
		
		((Unicycles) cycles[0]).balance();
		((Bicycles) cycles[1]).balance();
		//((Tricycls) cycles[2]).balance(); // method is undefined
		

	}

}
