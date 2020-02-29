package Controller;

import Model.Electrodomestic;
//
//@author;    Marcelo Correa
//@param;     Clase que en su constructor crea(y contiene) un array de la dimension solicitada para entregarla a la vista 

public class Control {
	public Electrodomestic[] _artifacts;
	
	public Control() {
		this._artifacts = new Electrodomestic [10];
	}

}
