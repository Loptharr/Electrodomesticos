package Model;

public class WashingMachine extends Electrodomestic {
	
	public int _load;
	
	final int _LOAD = 5;

	/**
	 * 
	 */
	public WashingMachine() {
		super();
		this._load = _LOAD;
	}

	/**
	 * @param _load
	 */
	public WashingMachine(float weight, float basePrice) {
		super();
		this._load = _LOAD;
		this._weight=weight;
		this._basePrice=basePrice;
	}

	/**
	 * @param _load
	 */
	public WashingMachine(int load, float basePrice, String color, char consumption, float weight) {
		super();
		this._load = load;
		this._basePrice = basePrice;
		this._color = color;
		this._consumption = consumption;
		this._weight = weight;
		this._checkConsumption(consumption);
		this._checkColor(color);
	}

	/**
	 * @return the _load
	 */
	public int get_load() {
		return _load;
	}

	@Override
	public float _finalPrice() {
		float finalPrice = super._finalPrice();
		float increaseValue = 0;
		
		if (_load>=30) {
			increaseValue+=50;			
		}
		finalPrice+=increaseValue;
		return finalPrice;
	} 
	
	
	
}
	