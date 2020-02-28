package View;

import Controller.Control;
import Model.Television;
import Model.WashingMachine;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control control = new Control();
		
		
		int _option = 1;
		_assignData(control, _option);
		_getTotalPrice(control);
		
	}

	
	public static void _assignData(Control n,int option) {
		
		n._artifacts[1]= new Television();
		n._artifacts[2]= new WashingMachine();
		n._artifacts[3]= new Television();
		n._artifacts[4]= new WashingMachine();
		n._artifacts[5]= new Television();
		n._artifacts[6]= new WashingMachine();
		n._artifacts[7]= new Television();
		n._artifacts[8]= new WashingMachine();
		n._artifacts[9]= new Television();
		n._artifacts[10]= new WashingMachine();
	}
	
	
	public static void _getTotalPrice(Control n) {
		
		float totalPriceTelevisions=0;
		float totalPriceWashingMachines=0;
		
		 for(int i=0;i<n._artifacts.length;i++){
			 if (n._artifacts[i] instanceof Television ) {	
				 totalPriceTelevisions+=n._artifacts[i]._finalPrice();
			} else {
				if (n._artifacts[i] instanceof WashingMachine) {
					totalPriceWashingMachines+=n._artifacts[i]._finalPrice();
				} 
			}
		 }
		 
		 float totalPriceElectrodomestics=totalPriceTelevisions+totalPriceWashingMachines;
	}
	
}
