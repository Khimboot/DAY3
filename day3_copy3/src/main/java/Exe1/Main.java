package Exe1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycles uni = new Unicycles();
		Cycles bi = new Bicycles();
		Cycles tri = new Tricycls();
		
		Cycles cyles = (Cycles) uni;
		uni.ride();
		Cycles cyles2 = (Cycles) bi;
		bi.ride();
		Cycles cyles3 = (Cycles) tri;
		tri.ride();
		
		

	}

}
