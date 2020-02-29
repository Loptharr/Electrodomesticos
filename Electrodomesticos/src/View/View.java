package View;

import Controller.Control;
import Controller.TotalPrice;
import Model.Color;
import Model.Consumption;
import Model.Television;
import Model.WashingMachine;

public class View {
	//@author;    Marcelo Correa
	//@param;     Método Main, solo ejecuta los otros métodospara su vista  Y crea el control, que es la clase que contiene el arreglo.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control control = new Control();
		
		
		int _option = 1;
		_assignData(control, _option);
		_showTotalPrices(control);
		
		
	}

	//@author;    Marcelo Correa
	//@param;     Solo asigna datos a control(clase con array).

	public static void _assignData(Control n,int option) {
		
		n._artifacts[0]= new Television(70, true, 150000, Color._BLACK, Consumption._A, 145);
		n._artifacts[1]= new WashingMachine(10, 220000, Color._WHITE, Consumption._F, 50);
		n._artifacts[2]= new Television(500000);
		n._artifacts[3]= new WashingMachine(20,120000);
		n._artifacts[4]= new Television(70, true, 145000, Color._GRAY, Consumption._E, 145);
		n._artifacts[5]= new WashingMachine();
		n._artifacts[6]= new Television();
		n._artifacts[7]= new WashingMachine(35, 120000, Color._WHITE, Consumption._F, 50);
		n._artifacts[8]= new Television();
		n._artifacts[9]= new WashingMachine();
	}
	//@author;    Marcelo Correa
	//@param;     Recorre el array de control, y suma sus precios finales.
	//@return;	Retorna un objeto tipo TotalPrice, que es solo contenedor del sumador de valores finales de cada subclase electrodomestico
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
	
	//@author;    Marcelo Correa
	//@param;     Método solo para desplegar informacion obtenida en consola
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
