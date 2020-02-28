package Model;

public abstract class Electrodomestic implements Color,Consumption {

    public float _basePrice;
    
    public String _color;
    
    public char _consumption;
    
    public float _weight;
    
    final String _DEFAULT_COLOR = Color._WHITE;
    
    final char _DEFAULT_CONSUMPTION = Consumption._F;

	final int _DEFAULT_WEIGHT = 5;

	public Electrodomestic() {
		super();
		this._color=_DEFAULT_COLOR;
		this._consumption=_DEFAULT_CONSUMPTION;
		this._weight=_DEFAULT_WEIGHT;
	}
	
	public Electrodomestic(float weight, float basePrice) {
		super();
		this._color=_DEFAULT_COLOR;
		this._consumption=_DEFAULT_CONSUMPTION;
	}

	public Electrodomestic(float basePrice, String color, char consumption, float weight) {
		super();
		this._basePrice = basePrice;
		this._color = color;
		this._consumption = consumption;
		this._weight = weight;
		this._checkConsumption(consumption);
		this._checkColor(color);
	}
	
	private boolean _checkConsumption(char letter) {
		if ((letter >= 'A' && letter <= 'F')) {
            return true;
        }else{
        	this._consumption=Consumption._F;
        	return false;
        }
	}
	
	private boolean _checkColor(String color) {
		switch (color.toUpperCase()) {
	        case "WHITE":
	        	return true;
	        case "BLACK":
	        	return true;
	        case "RED":
	        	return true;
	        case "BLUE":
	        	return true;
	        case "GRAY":
	        	return true;
	        default:
	        	this._color=Color._WHITE;
	        	return false;
			}
	}
	
	public float _finalPrice() {
		float finalPrice=this._finalPrice();
		float increaseValue = 0;
		
		switch(this._consumption){
	        case 'A':
	        	increaseValue+=100;
	            break;
	        case 'B':
	        	increaseValue+=80;
	            break;
	        case 'C':
	        	increaseValue+=60;
	            break;
	        case 'D':
	        	increaseValue+=50;
	            break;
	        case 'E':
	        	increaseValue+=30;
	            break;
	        case 'F':
	        	increaseValue+=10;
	            break;
	    }
	
	    if(this._weight>=0 && this._weight<19){
	    	increaseValue+=10;
		    }else if(this._weight>=20 && this._weight<49){
		    	increaseValue+=50;
			    }else if(this._weight>=50 && this._weight<=79){
			    	increaseValue+=80;
				    }else if(this._weight>=80){
				    	increaseValue+=100;
	    }
		
	    finalPrice+=increaseValue;
		return finalPrice;
	}
	
	
}