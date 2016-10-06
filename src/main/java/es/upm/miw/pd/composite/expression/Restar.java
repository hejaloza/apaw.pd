package es.upm.miw.pd.composite.expression;

public class Restar extends Operacion {

	public Expresion expresionResta1;
	public Expresion expresionResta2;

	public Restar(Expresion expression1, Expresion expression2) {
		super(expression1, expression2);
		this.expresionResta1 = expression1;
		this.expresionResta2 = expression2;
	}

	@Override
	public String toString() {
		return "(" + expresionResta1 + "-" + expresionResta2 + ")";
	}

	@Override
	public int operar() {

		return expresionResta1.operar() - expresionResta2.operar();
	}

}
