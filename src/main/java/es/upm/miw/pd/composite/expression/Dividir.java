package es.upm.miw.pd.composite.expression;

public class Dividir extends Operacion {

	public Expresion expresionDividir1;
	public Expresion expresionDividir2;

	public Dividir(Expresion expression1, Expresion expression2) {
		super(expression1, expression2);

		this.expresionDividir1 = expression1;
		this.expresionDividir2 = expression2;

	}

	@Override
	public String toString() {
		return "(" + expresionDividir1 + "/" + expresionDividir2 + ")";
	}

	@Override
	public int operar() {

		return expresionDividir1.operar() / expresionDividir2.operar();
	}

}
