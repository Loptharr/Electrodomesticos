package Controller;

//@author;    Marcelo Correa
//@param;     Clase que solo sirve para contener los valores que devuelve el método _getTotalPrice de la clase View
//@return;    entrega tres float

public class TotalPrice {

	public float totalPriceTelevisions=0;
	
	public float totalPriceWashingMachines=0;
	
	public float totalPriceElectrodomestics=0;

	public TotalPrice() {
	}

	public TotalPrice(float totalPriceTelevisions, float totalPriceWashingMachines, float totalPriceElectrodomestics) {
		this.totalPriceTelevisions = totalPriceTelevisions;
		this.totalPriceWashingMachines = totalPriceWashingMachines;
		this.totalPriceElectrodomestics = totalPriceElectrodomestics;
	}
	
	
	
}
