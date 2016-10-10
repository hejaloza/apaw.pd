package es.upm.miw.pd.composite.expression;

public class Sumar extends Operacion {

	public Expresion expresionSuma1;
	public Expresion expresionSuma2;

	public Sumar(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
		this.expresionSuma1 = expresion1;
		this.expresionSuma2 = expresion2;
	}

	@Override
	public String toString() {
		return "(" + expresionSuma1 + "+" + expresionSuma2 + ")";
	}

	@Override
	public int operar() {
		return this.expresionSuma1.operar() + this.expresionSuma2.operar();
	}

}
