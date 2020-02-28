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
	public Television(float _resolution, boolean _hasTdt) {
		super();
		this._resolution = _resolution;
		this._hasTdt = _hasTdt;
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

	@Override
	public float _finalPrice() {
		// TODO Auto-generated method stub
		return super._finalPrice();
	} 
	
	
	
}


