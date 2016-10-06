package es.upm.miw.pd.composite.expression;

public class Sumar extends Operacion {

	public Expresion expresionSuma1;
	public Expresion expresionSuma2;

	public Sumar(Expresion expression1, Expresion expression2) {
		super(expression1, expression2);
		this.expresionSuma1 = expression1;
		this.expresionSuma2 = expression2;
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
