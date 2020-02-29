package Model;

public class Television extends Electrodomestic {

	public float _resolution;
	
	public boolean _hasTdt;
	
	final float _DEFAULT_RES = 20; 
	
	final boolean _DEFAULT_HAS_TDT = false;

	/**
	 * 
	 */
	public Television() {
		super();
		this._resolution = _DEFAULT_RES;
		this._hasTdt = _DEFAULT_HAS_TDT;	
	} 
	
	public Television(float basePrice) {
		super();
		this._basePrice = basePrice;
		this._resolution = _DEFAULT_RES;
		this._hasTdt = _DEFAULT_HAS_TDT;	
	}

	/**
	 * @param _resolution
	 * @param _hasTdt
	 */
	public Television(float _resolution, boolean _hasTdt,float basePrice, String color, char consumption, float weight) {
		super();
		this._resolution = _resolution;
		this._hasTdt = _hasTdt;
		this._basePrice = basePrice;
		this._color = color;
		this._consumption = consumption;
		this._weight = weight;
		this._checkConsumption(consumption);
		this._checkColor(color);
	}

	/**
	 * @return the _resolution
	 */
	public float get_resolution() {
		return _resolution;
	}

	/**
	 * @return the _hasTdt
	 */
	public boolean is_hasTdt() {
		return _hasTdt;
	}

//	@author;    Marcelo Correa
//	@param;     este método crea un precio final, aplicando el metodo de la super clase primero, y luego le agrega el valor de incremento segun la validacion de resolucion y tdt 
//	@return; 	retorna un float con el precio final incrementado
	@Override
	public float _finalPrice() {
		float finalPrice = super._finalPrice();
		float increaseValue = 0;
		
		if (_resolution>40) {
			increaseValue += (float) (finalPrice*0.3);
		}
		
		if (_hasTdt) {
			increaseValue += 50;
		}
		finalPrice+=increaseValue;
		return finalPrice;
	} 
	
	
	
}


