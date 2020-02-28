package View;

import Controller.Control;
import Controller.TotalPrice;
import Model.Television;
import Model.WashingMachine;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control control = new Control();
		
		
		int _option = 1;
		_assignData(control, _option);
		_showTotalPrices(control);
		
		
	}

	
	public static void _assignData(Control n,int option) {
		
		n._artifacts[1]= new Television(70, true, 100, "NEGRO", 'A', 145);
		n._artifacts[2]= new WashingMachine(10, 100, "BLANCO", 'F', 50);
//		n._artifacts[3]= new Television();
//		n._artifacts[4]= new WashingMachine();
//		n._artifacts[5]= new Television();
//		n._artifacts[6]= new WashingMachine();
//		n._artifacts[7]= new Television();
//		n._artifacts[8]= new WashingMachine();
//		n._artifacts[9]= new Television();
//		n._artifacts[10]= new WashingMachine();
	}
	
	
	public static TotalPrice _getTotalPrice(Control n) {
		
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
		 TotalPrice t = new TotalPrice(totalPriceTelevisions, totalPriceWashingMachines, totalPriceElectrodomestics);
		return t;
	}
	
	
	public static void _showTotalPrices(Control control) {
		TotalPrice t = new TotalPrice();
		t =_getTotalPrice(control);
		System.out.println(" el precio de todas las televisiones es: $ " + t.totalPriceTelevisions);
        System.out.println(" el precio de todas las lavadoras es: $ " + t.totalPriceWashingMachines);
        System.out.println("----------------------------------------");
        System.out.println(" el precio de todos los electrodomesticos es: $ " + t.totalPriceElectrodomestics);
        System.out.println("----------------------------------------");
	}
}
