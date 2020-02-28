package Model;

public class WashingMachine extends Electrodomestic {
	
	public int _load;
	
	final int _LOAD = 5;

	/**
	 * 
	 */
	public WashingMachine() {
		super();
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
	public WashingMachine(int load) {
		super();
		this._load = load;
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
	