package es.upm.miw.pd.composite.expression;

public class Dividir extends Operacion {

	public Expresion expresionDividir1;
	public Expresion expresionDividir2;

	public Dividir(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);

		this.expresionDividir1 = expresion1;
		this.expresionDividir2 = expresion2;

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
