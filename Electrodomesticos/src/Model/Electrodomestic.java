package Model;

//@author;    Marcelo Correa
//@param;     Clase padre, tipo electrodomesticos,  es abstracta, no instanciable

public abstract class Electrodomestic implements Color,Consumption {

    public float _basePrice;
    
    public String _color;
    
    public char _consumption;
    
    public float _weight;
    
    final String _DEFAULT_COLOR = Color._WHITE;
    
    final char _DEFAULT_CONSUMPTION = Consumption._F;

	final int _DEFAULT_WEIGHT = 5;
	
	final float _DEFAULT_PRICE = 100000;

	public Electrodomestic() {
		super();
		this._color=_DEFAULT_COLOR;
		this._consumption=_DEFAULT_CONSUMPTION;
		this._weight=_DEFAULT_WEIGHT;
		this._basePrice=_DEFAULT_PRICE;
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
	
	/**
	 * @return the _basePrice
	 */
	public float get_basePrice() {
		return _basePrice;
	}

	/**
	 * @return the _color
	 */
	public String get_color() {
		return _color;
	}

	/**
	 * @return the _consumption
	 */
	public char get_consumption() {
		return _consumption;
	}

	/**
	 * @return the _weight
	 */
	public float get_weight() {
		return _weight;
	}

//	@author;    Marcelo Correa
//	@param;     este método recibe un char el cual lo compara recorriendo los char entre A y F, si no lo encuentra asigna el DEFAULT
//	@return;    retorna un boolean de respuesta por si acaso (Declarando si el char ingresado existia en el universo o false si asigna el por default)

	
	protected boolean _checkConsumption(char letter) {
		if ((letter >= 'A' && letter <= 'F')) {
            return true;
        }else{
        	this._consumption=_DEFAULT_CONSUMPTION;
        	return false;
        }
	}
	
//	@author;    Marcelo Correa
//	@param;     este método recibe un string el cual lo compara con un switch, entre los colores disponibles, si no lo encuentra asigna el DEFAULT
//	@return;    retorna un boolean de respuesta por si acaso (Declarando si el color ingresado existia en el universo o false si asigna el por default)
	
	protected boolean _checkColor(String color) {
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
	        	this._color=_DEFAULT_COLOR;
	        	return false;
			}
	}
	
//	@author;    Marcelo Correa
//	@param;     este método toma el precio base, con un switch revisa cual es y incrementa el valor. despues con if anidados tambien compra segun int de precio y suma en incremento el valor
//	@return;    retorna un float con el precio final modificado por su consumo y peso
	
	public float _finalPrice() {
		float finalPrice=_basePrice;
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
	        default:
	        	break;
	    }
	
	    if(_weight>=0 && _weight<19){
	    	increaseValue+=10;
		    }else if(_weight>=20 && _weight<49){
		    	increaseValue+=50;
			    }else if(_weight>=50 && _weight<=79){
			    	increaseValue+=80;
				    }else if(_weight>=80){
				    	increaseValue+=100;
	    }
		
	    finalPrice+=increaseValue;
		return finalPrice;
	}
	
	
}