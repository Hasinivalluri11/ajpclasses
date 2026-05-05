package day7;

public class ElectricityBill {
	public static void main(String[] args) {
		int units=350;
		double bill=0;
		if(units <=100) {
			bill=units*1.50;
		}
		else if(units<=200) {
			bill = 100*1.50 + (units-100)*2.50;
		}
		else {
			bill=100*1.50 + 100*2.50 + (units-200)*4.00;
		}
		System.out.println("bill " + bill); 
	}


}
