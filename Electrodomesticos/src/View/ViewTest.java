package View;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Controller.Control;
import Controller.TotalPrice;
import Model.Color;
import Model.Consumption;
import Model.Television;
import Model.WashingMachine;

class ViewTest {

	@Test
	void test_getTotalPrice() {
		Control c = new Control();
		c._artifacts[0]= new Television(70, true, 100000, Color._BLACK, Consumption._A, 145);
		assertEquals(_getTotalPrice(c).totalPriceTelevisions, 130310);
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
	
}
