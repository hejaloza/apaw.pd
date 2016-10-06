package es.upm.miw.pd.composite.expression;

public class Multiplicar extends Operacion {

	public Expresion expresionMultiplica1;
	public Expresion expresionMultiplica2;

	public Multiplicar(Expresion expression1, Expresion expression2) {
		super(expression1, expression2);
		this.expresionMultiplica1 = expression1;
		this.expresionMultiplica2 = expression2;
	}

	@Override
	public String toString() {
		return "(" + expresionMultiplica1 + "*" + expresionMultiplica2 + ")";
	}

	@Override
	public int operar() {

		return expresionMultiplica1.operar() * expresionMultiplica2.operar();
	}

}
