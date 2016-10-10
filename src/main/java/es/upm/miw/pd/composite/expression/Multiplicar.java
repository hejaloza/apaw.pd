package es.upm.miw.pd.composite.expression;

public class Multiplicar extends Operacion {

	public Expresion expresionMultiplica1;
	public Expresion expresionMultiplica2;

	public Multiplicar(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
		this.expresionMultiplica1 = expresion1;
		this.expresionMultiplica2 = expresion2;
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
