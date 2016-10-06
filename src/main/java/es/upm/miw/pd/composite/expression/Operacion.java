package es.upm.miw.pd.composite.expression;

public abstract class Operacion extends Expresion {

	protected Expresion expression1;
	protected Expresion expression2;

	public Operacion(Expresion expression1, Expresion expression2) {
		this.expression1 = expression1;
		this.expression2 = expression1;

	}

	public abstract int operar();

}
